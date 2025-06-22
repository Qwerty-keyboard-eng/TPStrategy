package calculoprecioprod;

public class CalculadorPrecioMedicina implements CalculadorDePrecio {
    @Override
    public double calcularPrecioFinal(double precioBase) {
        double impuestos = 0;
        double descuentos = 0;
        boolean envioGratis = false;

        if (precioBase > 50) {
            descuentos = 0.1;
        }
        if (precioBase > 100) {
            envioGratis = true;
        }

        double total = precioBase * (1 + impuestos) * (1 - descuentos);
        if (envioGratis) {
            total -= 10;
        }
        return total;
    }
}