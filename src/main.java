public class main {
    public static void main(String[] args) {
        Vuelo vuelo = new Vuelo("AR123");
        vuelo.agregarAsiento(new Asiento("1A", "Primera"));
        vuelo.agregarAsiento(new Asiento("2B", "Economica"));

        Pasajero pasajero = new Pasajero("Sofia");
        pasajero.solicitarReserva(vuelo, "1A");
        pasajero.solicitarReserva(vuelo, "1A");
    }
}
