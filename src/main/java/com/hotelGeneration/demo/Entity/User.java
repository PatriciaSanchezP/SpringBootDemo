package com.hotelGeneration.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Anotación para decirle a Java que esta es una clase mapeada a una tabla de una BD

@Entity
@Table (name = "usuario") //me dice a qué table de la BD voy a conectar esta clase POJO 

public class User {
	
	/*
	 * Utilizamos el atributo static para el id, ya que será convertido en una variable de instancia. Esto significa que la variable le pertenece a la clase y no al objeto que la instancia. Esto nos ayuda a tener un mejor control del contador y que independientemente de la instaancia, este valor siempre lo otorga la clase, así evitamos id repetidos o saltados.
	 * 
	 */
	
	//Propiedades o atributos
	//private static Long id = 0L; id antes de la coneción a la BD //clase wrapper
	
	@Id //Decimos que la PK de nuetsra tabla es el atributo Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//Para generar valores automáticamente de forma autoincremental, en el campo id que es nuestra PK de la BD
	
	@Column(name="id", unique=true, nullable=false)
	
	private Long id; //id después de la conexión
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	
	/*
	 * Utilizamos un contador id++ dentro del constructos para poder emular el atributi autoincrementable de nuestra columna id de la BD. Cuando conectemos la BD, ya no necesitaremos este dato en el constructor.
	 * 
	 */

//Modificamos el constructor para agregar el id como parámetro, ya que ahora sí pertenece al objeto y se tiene que construir con el
	
	//Constructor
	
	public User(Long id, String nombre, String apellido, String email, String telefono) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
	}
	
	
	//Construcctor vacío
	public User() {
		
	}//Constructor vacío


	
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
