public class Pasajero {
    private String nombre;

    public Pasajero(String nombre) { this.nombre = nombre; }

    public void solicitarReserva(Vuelo vuelo, String numeroAsiento) {
        System.out.println(nombre + " solicita el asiento " + numeroAsiento + ".");
        vuelo.reservarAsiento(numeroAsiento);
    }
}
