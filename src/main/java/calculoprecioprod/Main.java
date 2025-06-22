package calculoprecioprod;

public class Main {
    public static void main(String[] args) {
        var p1 = new Producto(30, new CalculadorPrecioLibro());
        var p2 = new Producto(330, new CalculadorPrecioMedicina());
        var p3 = new Producto(130, new CalculadorPrecioAlimento());
        var p4 = new Producto(130, new CalculadorPrecioOtro());

        System.out.println("Libro (precio 30): " + p1.precioFinal());
        System.out.println("Medicina (precio 330): " + p2.precioFinal());
        System.out.println("Alimento (precio 130): " + p3.precioFinal());
        System.out.println("Otro (precio 130): " + p4.precioFinal());
    }
}