package fechaspersonas;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class FormatoFechaLargo implements FormatoFecha {
    @Override
    public String formatear(LocalDate fecha) {
        String dia = String.valueOf(fecha.getDayOfMonth());
        String mes = fecha.getMonth().getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
        String anio = String.valueOf(fecha.getYear());
        return dia + " de " + mes + " de " + anio;
    }
}