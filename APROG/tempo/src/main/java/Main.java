import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Time time = new Time(59,59,23);

        time.getTime();
        time.addSecond();
        time.getTime();
        time.diferenceBetweenDates("10:20:10");
    }
}
