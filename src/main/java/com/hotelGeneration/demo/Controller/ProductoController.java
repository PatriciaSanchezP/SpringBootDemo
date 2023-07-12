package com.hotelGeneration.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelGeneration.demo.Entity.Producto;
import com.hotelGeneration.demo.Service.ProductoService;

@RestController //para indicar que es un controller
@RequestMapping (path="/hotelGeneration/productos")
public class ProductoController {
	
	//Inyeccion de dependencias
	
	//Constante
	
	//Modificador de acceso + constante + nombreClase + nombreDelObjeto
	public final ProductoService productoService;
	
	//Anotación
	@Autowired
	
	//Constructor
	public ProductoController(ProductoService productoService) {
		this.productoService = productoService;
	}
	
	
	//Métodos HTTP
	//Método GET para traer todos los productos
	//localhost:8080/hotelGeneration/productos
	@GetMapping 
	public List<Producto> getTodosLosProductos(){
		return productoService.leerTodosLosProductos();
	}//getTodosLosProductos
	
	//Método POST para agregar un producto
	@PostMapping
	public Producto postProducto(@RequestBody Producto producto) {
		return productoService.crearProducto(producto);
	}
	
	
	

}
