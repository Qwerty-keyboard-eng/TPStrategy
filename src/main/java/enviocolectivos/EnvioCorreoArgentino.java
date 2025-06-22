package org.example;

public class EnvioCorreoArgentino implements EstrategiaDeEnvio {
    private ServicioDistanciaWeb servicioDistancia;

    public EnvioCorreoArgentino(ServicioDistanciaWeb servicioDistancia) {
        this.servicioDistancia = servicioDistancia;
    }

    @Override
    public double calcularCosto(CarritoDeCompras carrito, String destino, double pesoTotal) {
        double costoFijo;
        if ("Capital Federal".equalsIgnoreCase(destino)) {
            costoFijo = 500;
        } else {
            costoFijo = 800;
            int distanciaKm = servicioDistancia.obtenerDistanciaKm("Capital Federal", destino);
            costoFijo += 5 * distanciaKm;
        }
        return costoFijo;
    }
}