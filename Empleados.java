public class Empleados {
    private String nombre;
    private int dni;
    private Producto productoAsignado;

    public Empleados(String nombreEmpleado, int dniEmpleado, Producto nombreProducto) {
        nombre = nombreEmpleado;
        dni = dniEmpleado;
        productoAsignado = nombreProducto;
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

        public String getNombreProducto(){
        return productoAsignado.getNombre() + " y cuesta " + productoAsignado.getPrecio();
    }

    public void imprimirDetallesEmpleado(){
        System.out.println("El nombre del empleado es " + nombre + ", su DNI es " + dni + " y vende " + productoAsignado.getNombre() + " que cuesta " + productoAsignado.getPrecio() + "€");
    }
}
