package com.hotelGeneration.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelGeneration.demo.Entity.User;
import com.hotelGeneration.demo.Service.UserService;

/*
 * El controller es quien lleva todo el peso referente a las solicitudes HTTP (es el mesero de nuestro restaurante).
 * Aquí sucede la manipulación de los métodos HTTP (GET, POST, PUT, DELETE).
 * 
 * Para poder decirle a Java que esta clase es un controller, necesitamos usar la anotación @RestController. Esto nos ayudará a poder manejar solicitudes HTTP, y además con esta anotacion podremos manejar el fetch que tengamos en nuestro front.
 */

@RequestMapping(path = "/hotelGeneration/users") //Construí la ruta de nuestra API

@RestController //Usamos esta anotación para decirle que es una API del tipo REST (trabaja con métodos HTTP)
public class UserController {
	
	//Creo una instancia de la clase UserService para que el controlador sepa la información del servicio
	
	private final UserService userService;
	
	@Autowired
	
	//Creo un constructor para mi UserController, tomará como argumento la instancia del userService
	public UserController(UserService userService) {
		this.userService = userService;
	} //constructor que utiliza la instancia del Service como parámetro
	
	/*
	 * Ya que mi controller depende de mi Service (con la instancia de UserService dentro de UserController), podré establecer los métodos HTTP que disparan las operaciones del CRUD (Controller - Service)
	 * 
	 */
	
	
	//Métodos HTTP
	
	/*
	 * Método GET que toma la lista de usuarios creada en el userService, y que se muestra cuando se activa el método
	 */
	@GetMapping
	public List<User> getUsuarios(){
		return userService.readUsuarios();
		
	}

}
