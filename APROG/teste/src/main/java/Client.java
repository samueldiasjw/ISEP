import java.util.Date;

public class Client {
    private int codeId;
    private String name;
    private String birthDate;
    private int cc;
    private int nif;
    private int numberPassPort;
    private int mobile;
    private String email;

    public Client(int codeId, String name, String birthDate, int cc, int nif, int numberPassPort, int mobile, String email) {
        this.codeId = codeId;
        this.name = name;
        this.birthDate = birthDate;
        this.cc = cc;
        this.nif = nif;
        this.numberPassPort = numberPassPort;
        this.mobile = mobile;
        this.email = email;
    }

    public String getAllInfo(Client client) {
        return "\nCode Id - " + client.codeId + "\nName- " + client.name + "\nBirth Date - " + client.birthDate
                + "\nCC - " + client.cc + "\nNIF - " + client.nif + "\nPass Port - " + client.numberPassPort
                + "\nMobile - " + client.mobile + "\nEmail - " + client.email;
    }
}
