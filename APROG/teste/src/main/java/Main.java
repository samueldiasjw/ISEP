import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create Client
        Client c1 = new Client(9999,"Pereira","20/10/2000",111222333,444555666,123,939999999,"pereirinha@gmail.com");
        Client c2 = new Client(1,"Pereira2","20/10/2000",111222333,444555666,123,939999999,"pereirinha@gmail.com");
        Client c3 = new Client(1,"Pereira3","20/10/2000",111222333,444555666,123,939999999,"pereirinha@gmail.com");
        Client c4 = new Client(1,"Pereira4","20/10/2000",111222333,444555666,123,939999999,"pereirinha@gmail.com");

        //Create Destinations
        Destination d1 = new Destination("Porto","Portugal","Europa");
        Destination d2 = new Destination("Matosas", "America", "Asia");
        Destination d3 = new Destination("PortoMalucos", "Seila", "EUA");

        //Create Hotel
        Hotel h1 = new Hotel(1,"ABC","HOTEL", "PT");
        Hotel h2 = new Hotel(2, "DEF", "HOTEL", "GD");
        Hotel h3 = new Hotel(3, "GHF", "HOSTEL", "C");

        //Create Reservation
        Reservation r1 = new Reservation(1,c1,d1,h2,4,"10/10/2020","10/10/2020","14/10/2020");
        Reservation r2 = new Reservation(112312321,c2,d2,h3,4,"10/10/2020","10/10/2020","14/10/2020");

        r1.getDataReservation(r1);
        r2.getDataReservation(r2);
    }
}
