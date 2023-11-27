public class Tienda {
    private String nombre;
    private int horasAbierto;
    private Empleados empleado;

    public Tienda (String nombre, int horasAbierto, String nombreEmpleado, int dniEmpleado) {
        this.nombre = nombre;
        this.horasAbierto = horasAbierto;
        empleado.setNombre(nombreEmpleado);
        empleado.setDni(dniEmpleado);
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPrecio(int horasAbierto){
        this.horasAbierto = horasAbierto;
    }

    public void setEmpleado(String nombre, int dni){
        empleado.setNombre(nombre);
        empleado.setDni(dni);
    }

    public int getHorasAbierto(){
        return horasAbierto;
    }

    public String getNombre(){
        return nombre;
    }

    public String getEmpleado(){
        return "El empleado se llama " + empleado.getNombre() + " y tiene el siguiente DNI " + empleado.getDni();
    }

    public void imprimirDetallesProducto(){
        System.out.println("El nombre de la tienda es " + nombre + ", y esta abierto " + horasAbierto + "horas y su empleado del mes es " + empleado.getNombre() + " con DNI " + empleado.getDni());
    }
}