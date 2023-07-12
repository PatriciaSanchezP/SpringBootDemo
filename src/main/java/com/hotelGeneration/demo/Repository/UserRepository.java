package com.hotelGeneration.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hotelGeneration.demo.Entity.User;


@Repository //Anotación para convertir mi interface en un repositorio

public interface UserRepository extends JpaRepository<User, Long> {

	//Query personalizada
//	@Query("SELECT u FROM User WHERE u.nombre=?1")
	
//	Optional<User> encontrarPorEmail (String email);
//	

}

//T tipo de entidad - ID tipo de dato del ID

	//Clase abstracta tiene métodos abstractos y métodos concretos
	//Interface solo tiene métodos abstractos
	
	//Contrato, qué métodos si o si se tienen que implementar (abstractos)
	
	/*JPQL (Java Persistence Query Language
	 * 
	 * Es practicamento lo mismo que trabajar con SQL, solo que en lugar de trabajar con tablas y comnas, trabajamos con entidades y atributos (POJOS y repositorios)
	 * 
	 * Un Optional es una clase que se utiliza paara representar un valor que puede o no existir. Es decir, cuando se usa el Optional puede o no contener un objeto, asi tenemos la seguridad de que el obejto no sera nulo o undefined (objeto vacio). Esto evita errores en tiempo de ejecucion.
	 */
