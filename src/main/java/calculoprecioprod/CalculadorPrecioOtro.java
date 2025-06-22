package calculoprecioprod;

public class CalculadorPrecioOtro implements CalculadorDePrecio {
    @Override
    public double calcularPrecioFinal(double precioBase) {
        double impuestos = 0.15;
        double descuentos = 0;
        boolean envioGratis = false;

        if (precioBase > 50) {
            descuentos = 0.05;
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