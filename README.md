Sales Management API

Este es un proyecto backend con Java y Spring Boot para gestionar ventas y control de productos.

Características
* Arquitectura basada en controladores, entidades y repositorios.
* Uso de ResponseEntity en los controladores para manejar las respuestas HTTP y los códigos de estado de forma correcta.
* Spring Data JPA para la conexión y manejo de la base de datos.
* Lombok para ahorrar los getters, setters y constructores en las entidades.

Tecnologías
* Java
* Spring Boot (Web y Data JPA)
* Lombok
* Maven


Endpoints principales 
* GET /productos - Lista todos los productos.
* POST /productos - Guarda un nuevo producto.
* GET /productos/{id} - Busca un producto por su ID.
* DELETE/ productos/{id} - Borrar un producto por su ID.
* PUT /productos/{id} - Modificar un producto por su ID.