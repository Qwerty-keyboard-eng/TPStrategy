package calculoprecioprod;

public class Producto {
    public double precio;

    private CalculadorDePrecio calculador;

    public Producto(double precio, CalculadorDePrecio calculador) {
        this.precio = precio;
        this.calculador = calculador;
    }

    public void setCalculador(CalculadorDePrecio calculador) {
        this.calculador = calculador;
    }

    public double precioFinal() {
        if (calculador == null) {
            throw new IllegalStateException("No se ha configurado un calculador de precio para el producto.");
        }
        return calculador.calcularPrecioFinal(this.precio);
    }
}