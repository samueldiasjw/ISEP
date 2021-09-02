public class Hotel {
    private int code;
    private String acro; //Sigla
    private String category;
    private String locality;

    public Hotel(int code, String acro, String category, String locality) {
        this.code = code;
        this.acro = acro;
        this.category = category;
        this.locality = locality;
    }

    public String getAllInformation(Hotel hotel ) {
        return "\nCode - " +  hotel.code + "\nAcronym - " + hotel.acro + "\nCategory - " + hotel.category + "\nLocality - " + hotel.locality;
    }
}
