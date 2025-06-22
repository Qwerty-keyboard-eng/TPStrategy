package testPersona;

import fechaspersonas.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonaTest {

    @Test
    void testFechaNacimientoCorta() {
        LocalDate fecha = LocalDate.of(1986, 6, 3);
        Persona persona = new Persona("Juan", fecha, new FormatoFechaCorto());
        assertEquals("3-06-1986", persona.fechaNacimiento());
    }

    @Test
    void testFechaNacimientoLarga() {
        LocalDate fecha = LocalDate.of(1986, 6, 3);
        Persona persona = new Persona("Maria", fecha, new FormatoFechaLargo());
        assertEquals("3 de junio de 1986", persona.fechaNacimiento());

        persona.setEstrategiaFormato(new FormatoFechaCorto());
        assertEquals("3-06-1986", persona.fechaNacimiento());
    }
}