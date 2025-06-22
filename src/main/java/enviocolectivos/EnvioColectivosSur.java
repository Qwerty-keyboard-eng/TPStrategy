package org.example;

public class EnvioColectivosSur implements EstrategiaDeEnvio {
    @Override
    public double calcularCosto(CarritoDeCompras carrito, String destino, double pesoTotal) {
        double costoFijo;
        if ("Capital Federal".equalsIgnoreCase(destino)) {
            costoFijo = 1000;
        } else if ("Gran Buenos Aires".equalsIgnoreCase(destino)) {
            costoFijo = 1500;
        } else {
            costoFijo = 3000;
        }

        double adicionalPorPeso = 0;
        if (pesoTotal > 5 && pesoTotal <= 30) {
            adicionalPorPeso = 500;
        } else if (pesoTotal > 30) {
            adicionalPorPeso = 2000;
        }
        return costoFijo + adicionalPorPeso;
    }
}