package com.hotelGeneration.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository; //api con muchas paqueterías

import com.hotelGeneration.demo.Entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

	Optional<Producto> findByNombre(String nombre);
}
