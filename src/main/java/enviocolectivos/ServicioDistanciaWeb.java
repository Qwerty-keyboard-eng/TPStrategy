package enviocolectivos;

public class ServicioDistanciaWeb {
    public int obtenerDistanciaKm(String origen, String destino) {
        if ("Capital Federal".equalsIgnoreCase(origen) && "Rosario".equalsIgnoreCase(destino)) {
            return 300;
        }
        if ("Capital Federal".equalsIgnoreCase(origen) && "Cordoba".equalsIgnoreCase(destino)) {
            return 700;
        }
        return 1000;
    }
}