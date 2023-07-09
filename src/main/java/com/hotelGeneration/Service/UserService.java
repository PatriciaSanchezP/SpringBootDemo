package com.hotelGeneration.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hotelGeneration.Entity.User; //importación de la librería de Spring

/*
 * Recuerda que la capa de servicios, se encarga de definir la lógica de negocio del lado de Java (aquí es donde vamos a definir los métodos enfocados a las operaciones del CRUD que serán "disparados" por los métodos HTTP que se encontrarán en el controller.
 */

//Anotaciones son instrucciones que le damos a JAVA par que sepa hacer algo (@Test, @Override)

@Service //Usamos la anotación @service para decirle a Java que esta clase es un servicio

public class UserService {
	
	//Emular una pequeña base de datos usando un ArrayList (lista de usuarios)
	public List<User> listaDeUsuarios = new ArrayList<User>();
	
	//Creo un metodo llamado UserService que me permita agregar informacion a mi lista
	public UserService() {
		//Instancias de las personas
		listaDeUsuarios.add(new User ("Felipe", "Maqueda", "felipe@mail.com", "5552342433"));
		listaDeUsuarios.add(new User ("Mariana", "Valladolid", "mariana@gmail.com", "3312343245"));
		listaDeUsuarios.add(new User ("Naruto", "Uzumaki","naruto@mail.com", "5523149506"));
	}
	
	//Métodods CRUD para poder iterar sobre esos usuarios
	
	//Método para traer a todos los usuarios
	public List<User> readUsuarios(){
		return listaDeUsuarios;
	}
	
	
	
	
	//Método para agregar usuarios
	
	//Método para borrar usuarios
	
	//Método para modificar usuarios
	
	//Método para leer usuarios

}
