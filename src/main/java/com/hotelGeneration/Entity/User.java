package com.hotelGeneration.Entity;

public class User {
	
	/*
	 * Utilizamos el atributo static para el id, ya que será convertido en una variable de instancia. Esto significa que la variable le pertenece a la clase y no al objeto que la instancia. Esto nos ayuda a tener un mejor control del contador y que independientemente de la instaancia, este valor siempre lo otorga la clase, así evitamos id repetidos o saltados.
	 * 
	 */
	
	//Propiedades o atributos
	private static Long id = 0L; //clase wrapper
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	
	/*
	 * Utilizamos un contador id++ dentro del constructos para poder emular el atributi autoincrementable de nuestra columna id de la BD. Cuando conectemos la BD, ya no necesitaremos este dato en el constructor.
	 * 
	 */

	
	//Constructor
	
	public User(String nombre, String apellido, String email, String telefono) {
		id++; //contador para emular el autoincrementable de los usuarios
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
	}


	
	//Getters y setters
	public long getId() {
		return id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	

}
