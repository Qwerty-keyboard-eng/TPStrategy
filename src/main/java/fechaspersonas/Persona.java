package fechaspersonas;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private LocalDate fechaNacimiento;
    private FormatoFecha estrategiaFormato;

    public Persona(String nombre, LocalDate fechaNacimiento, FormatoFecha estrategiaFormato) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estrategiaFormato = estrategiaFormato;
    }

    public void setEstrategiaFormato(FormatoFecha estrategiaFormato) {
        this.estrategiaFormato = estrategiaFormato;
    }

    public String fechaNacimiento() {
        if (estrategiaFormato == null) {
            throw new IllegalStateException("No se ha configurado una estrategia de formato de fecha.");
        }
        return estrategiaFormato.formatear(fechaNacimiento);
    }

    public String getNombre() {
        return nombre;
    }
}