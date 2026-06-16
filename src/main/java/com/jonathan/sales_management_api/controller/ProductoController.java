package com.jonathan.sales_management_api.controller;

import com.jonathan.sales_management_api.entity.Producto;
import com.jonathan.sales_management_api.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/productos")

public class ProductoController {
    @Autowired
    private ProductoRepository repository;

    @GetMapping
    public ResponseEntity<List<Producto>> listar(){

        List<Producto> productos = repository.findAll();
        return ResponseEntity.ok(productos);
    }

    @PostMapping
    public ResponseEntity<Producto>guardar(@RequestBody Producto producto){
        Producto nuevoProducto = repository.save(producto);
        return ResponseEntity.ok(nuevoProducto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto>buscarPorId(@PathVariable Long id){
        Producto producto = repository.findById(id).orElse(null);
        if (producto != null){
            return ResponseEntity.ok(producto);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Producto>actualizar(@PathVariable Long id, @RequestBody Producto productoActualizado){
        Producto producto = repository.findById(id).orElse(null);
        if(producto != null){
            producto.setNombre(productoActualizado.getNombre());
            producto.setPrecio(productoActualizado.getPrecio());
            producto.setStock(productoActualizado.getStock());

            return ResponseEntity.ok(repository.save(producto));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> borrar(@PathVariable Long id){
       Producto producto = repository.findById(id).orElse(null);
       if(producto != null){
           repository.deleteById(id);
           return ResponseEntity.ok("Producto eliminado correctamente");
       }
       return ResponseEntity.notFound().build();
    }


}
