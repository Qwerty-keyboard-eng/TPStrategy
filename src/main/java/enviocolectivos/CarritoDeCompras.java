package enviocolectivos;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private List<Producto> productos;
    private EstrategiaDeEnvio estrategiaEnvio;
    private String destino;

    public CarritoDeCompras(String destino) {
        this.productos = new ArrayList<>();
        this.destino = destino;
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void setEstrategiaEnvio(EstrategiaDeEnvio estrategiaEnvio) {
        this.estrategiaEnvio = estrategiaEnvio;
    }

    public double calcularCostoTotal() {
        double costoProductos = productos.stream().mapToDouble(Producto::getPrecio).sum();
        double pesoTotal = productos.stream().mapToDouble(Producto::getPesoKg).sum();

        if (estrategiaEnvio == null) {
            throw new IllegalStateException("No se ha configurado una estrategia de envío.");
        }

        double costoEnvio = estrategiaEnvio.calcularCosto(this, destino, pesoTotal);
        return costoProductos + costoEnvio;
    }

    public double getPesoTotal() {
        return productos.stream().mapToDouble(Producto::getPesoKg).sum();
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public String getDestino() {
        return destino;
    }
}