public class Destination {
    private String city;
    private String country;
    private String continent;

    public Destination(String city, String country, String continent) {
        this.city = city;
        this.country = country;
        this.continent = continent;
    }

    public String getAllInformation(Destination destination ) {
        return "\nCity - " +  destination.city + "\nCountry - " + destination.country + "\nContinent - " + destination.continent;
    }
}
