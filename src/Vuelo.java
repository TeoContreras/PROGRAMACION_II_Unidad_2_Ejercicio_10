import java.util.ArrayList;

public class Vuelo {
    private String codigo;
    private ArrayList<Asiento> asientos;

    public Vuelo(String codigo) {
        this.codigo = codigo;
        asientos = new ArrayList<Asiento>();
    }

    public void agregarAsiento(Asiento asiento) { asientos.add(asiento); }

    public boolean reservarAsiento(String numeroAsiento) {
        for (Asiento asiento : asientos) {
            if (asiento.getNumero().equalsIgnoreCase(numeroAsiento)) {
                if (!asiento.estaOcupado()) {
                    asiento.ocupar();
                    System.out.println("Reserva confirmada en vuelo " + codigo + ", asiento " + numeroAsiento);
                    return true;
                }
                System.out.println("Reserva rechazada: asiento ocupado.");
                return false;
            }
        }
        System.out.println("Reserva rechazada: el asiento no existe.");
        return false;
    }
}
