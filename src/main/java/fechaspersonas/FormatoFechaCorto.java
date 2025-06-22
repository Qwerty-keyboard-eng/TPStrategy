package fechaspersonas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatoFechaCorto implements FormatoFecha {
    @Override
    public String formatear(LocalDate fecha) {
        return fecha.format(DateTimeFormatter.ofPattern("d-MM-yyyy"));
    }
}