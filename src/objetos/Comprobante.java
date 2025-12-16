package objetos;

import java.time.LocalDate;

public class Comprobante {
    //ATRIBUTOS
    private String dato;
    private LocalDate fecha;

    //CONSTRUCTOR COMPROBANTE
    public Comprobante(LocalDate fecha, String dato){
        this.fecha = fecha;
        this.dato = dato;
    }

    //GETTERS
    public String getDato() {
        return dato;
    }

    public LocalDate getFecha(){
        return fecha;
    }

}
