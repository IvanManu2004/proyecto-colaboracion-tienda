public class Producto {

    private String nombre;
    private int precio;

    public Producto (String nombreProducto, int precioProducto) {
        nombre = nombreProducto;
        precio = precioProducto;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }

    public int getPrecio(){
        return precio;
    }

    public String getNombre(){
        return nombre;
    }

    public void imprimirDetallesProducto(){
        System.out.println("El nombre del producto es " + nombre + ", y su precio es " + precio + "€");
    }
}