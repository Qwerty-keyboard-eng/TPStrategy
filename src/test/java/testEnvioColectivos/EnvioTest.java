

import enviocolectivos.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnvioTest {

    @Test
    void testColectivosSurCapitalFederalBajoPeso() {
        CarritoDeCompras carrito = new CarritoDeCompras("Capital Federal");
        carrito.agregarProducto(new Producto("Laptop", 20000, 2));
        carrito.agregarProducto(new Producto("Mouse", 500, 0.1));

        carrito.setEstrategiaEnvio(new EnvioColectivosSur());

        assertEquals(21500, carrito.calcularCostoTotal(), 0.001);
    }

    @Test
    void testCorreoArgentinoOtroDestinoConDistancia() {
        ServicioDistanciaWeb mockServicioDistancia = new ServicioDistanciaWeb();
        CarritoDeCompras carrito = new CarritoDeCompras("Rosario");
        carrito.agregarProducto(new Producto("Teclado", 3000, 1));

        carrito.setEstrategiaEnvio(new EnvioCorreoArgentino(mockServicioDistancia));

        assertEquals(5300, carrito.calcularCostoTotal(), 0.001);
    }
}