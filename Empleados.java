public class Empleados {
	private String nombre;
	private int dni;
	private Producto productoAsignado;
	
	public Empleados(String nombreEmpleado, int dniEmpleado, String nombreProducto, int precioProducto) {
		nombre = nombreEmpleado;
		dni = dniEmpleado;
		productoAsignado = new Producto(nombreProducto,precioProducto);

	}
}
