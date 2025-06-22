package calculoprecioprod;

public class CalculadorPrecioAlimento implements CalculadorDePrecio {
    @Override
    public double calcularPrecioFinal(double precioBase) {
        double impuestos = 0.05;
        double descuentos = 0;
        boolean envioGratis = false;

        if (precioBase > 100) {
            descuentos = 0.15;
        }
        if (precioBase > 200) {
            envioGratis = true;
        }

        double total = precioBase * (1 + impuestos) * (1 - descuentos);
        if (envioGratis) {
            total -= 10;
        }
        return total;
    }
}