public class Empleados {
    private String nombre;
    private int dni;
    private Producto productoAsignado;

    public Empleados(String nombreEmpleado, int dniEmpleado, String nombreProducto, int precioProducto) {
        nombre = nombreEmpleado;
        dni = dniEmpleado;
        productoAsignado = new Producto(nombreProducto,precioProducto);
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPrecio(int dni){
        this.dni = dni;
    }

    public void setProducto(String nombre, int precio){
        productoAsignado = new Producto(nombre, precio);
    }

    public int getDni(){
        return dni;
    }

    public String getNombre(){
        return nombre;
    }

    public Producto getProducto(){
        return productoAsignado;
    }

    public void imprimirDetallesEmpleado(){
        System.out.println("El nombre del empleado es " + nombre + ", su DNI es " + dni + " y vende " + productoAsignado.getNombre() + " que cuesta " + productoAsignado.getPrecio() + "€");
    }
}
