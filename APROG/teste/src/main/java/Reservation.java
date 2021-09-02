public class Reservation {
    private int code;
    private Client client;
    private Destination destination;
    private Hotel hotel;
    private int numberPersons;
    private String dateReservation;
    private String dateDeparture;
    private String dateArrival;
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_RESET = "\u001B[0m";
    //private Voo_ASK voo;

    public Reservation(int code, Client client, Destination destination, Hotel hotel, int numberPersons, String dateReservation, String dateDeparture, String dateArrival) {
        this.code = code;
        this.client = client;
        this.destination = destination;
        this.hotel = hotel;
        this.numberPersons = numberPersons;
        this.dateReservation = dateReservation;
        this.dateDeparture = dateDeparture;
        this.dateArrival = dateArrival;
    }

    public void getDataReservation(Reservation reservation) {
        System.out.println(ANSI_GREEN_BACKGROUND + "| Reserva ✈️ |" + ANSI_RESET + "\n" + "Codigo da Reserva - " + reservation.code + "\nNumber of Persons - " + reservation.numberPersons +
                        "\nDate Reservation - " + reservation.dateReservation + "\nDate Departure - " + reservation.dateDeparture + "\nDate Arrival - " + reservation.dateArrival +
                        "\n\n" + ANSI_GREEN_BACKGROUND + "| CLIENT 🤺 |"+ ANSI_RESET + reservation.client.getAllInfo(client) +
                        "\n\n" + ANSI_GREEN_BACKGROUND  + "| DESTINATION 🗺 |" + ANSI_RESET + reservation.destination.getAllInformation(destination) +
                        "\n\n" + ANSI_GREEN_BACKGROUND  + "| Hotel 🏨 |" + ANSI_RESET + reservation.hotel.getAllInformation(hotel) +
                        "\n-----------------------\n"
                );
    }
}
