package enviocolectivos;

public interface EstrategiaDeEnvio {
    double calcularCosto(CarritoDeCompras carrito, String destino, double pesoTotal);
}