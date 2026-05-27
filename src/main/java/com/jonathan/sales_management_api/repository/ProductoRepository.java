package com.jonathan.sales_management_api.repository;

import com.jonathan.sales_management_api.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
