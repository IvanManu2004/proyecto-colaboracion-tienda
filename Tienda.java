public class Tienda {
    private String nombre;
    private int horasAbierto;
    private Empleados empleado;

    public Tienda (String nombre, int horasAbierto, Empleados nombreEmpleado) {
        this.nombre = nombre;
        this.horasAbierto = horasAbierto;
        this.empleado = nombreEmpleado;
    }
}