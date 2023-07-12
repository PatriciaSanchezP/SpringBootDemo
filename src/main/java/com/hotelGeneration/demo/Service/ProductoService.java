package com.hotelGeneration.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelGeneration.demo.Entity.Producto;
import com.hotelGeneration.demo.Repository.ProductoRepository;

@Service //Le decimos que esta clase es un sevicio
public class ProductoService {
	
	//Para manejar la inyeccion de dependencias
	
	//Constante para el autowired
	public final ProductoRepository productoRepository;
	
	//Anotación
	@Autowired 
	
	//Constructor que utiliza la instancia

	public ProductoService(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}//constructor
	
	//Métodos del CRUD para el manejo de Productos
	
	//Método para leer todos los productos
	public List<Producto> leerTodosLosProductos(){
		return productoRepository.findAll(); //Busca todos los productos que encuentra en el repository
	}//leerTodosLosProductos
	
	//Método para crear un nuevo producto
	public Producto crearProducto(Producto producto) {
		//le pasamos la instancia de un producto como parámetro
		
		Producto prodTemporal = null; //creamos un objeto temporal para no modificar aún la BD
		//si el producto no existe
		
		//Busco dentro del repositorio un producto por nombre, este dato lo obtengo con el getter correspondiente, y también hago una segunda validación para verificar que el opcional está vacio y puedo agregar el dato
		if(productoRepository.findByNombre(producto.getNombre()).isEmpty()) {
			prodTemporal = productoRepository.save(producto);
		} else {
			 //Si el producto ya existe, imprimo mensaje de "producto ya existente"
			System.out.println("Ya existe un producto con el nombre ingresado");
		}
		
		return prodTemporal; //puede que el producto se quede null o no
		
}
}
