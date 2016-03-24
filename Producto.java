package ProyectTests.Tests;

public class Producto {

	private String nombre;
	private double precio;
	private String cantidad; // por ahora
	private Campesino publicador;
	
	public Producto(String nNombre, double nPrecio, String nCantidad, Campesino nPublicador)
	{
		this.nombre = nNombre;
		this.precio = nPrecio;
		this.cantidad = nCantidad;
		this.publicador = nPublicador;
	}
}
