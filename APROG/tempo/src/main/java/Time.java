import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
    private int seconds = 0;
    private int minutes = 0;
    private int hours = 0;

    public Time(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public void getTime() throws ParseException {
        String pattern = "hh:mm:ss";
        DateFormat simpleDateFormat = new SimpleDateFormat(pattern);


        Date date = simpleDateFormat.parse(hours + ":" + minutes + ":" + seconds);

        System.out.println(simpleDateFormat.format(date));
    }

    public void addSecond(){
        if(this.seconds < 60){
            this.seconds = this.seconds + 1;
        } else {
            this.seconds = 0;

            if(this.minutes < 60){
                this.minutes = this.minutes + 1;
            } else {
                this.minutes = 0;

                if (this.hours < 24){
                    this.hours = this.hours + 1;
                } else {
                    this.seconds = 0;
                    this.minutes = 0;
                    this.hours = 0;
                }
            }
        }
    }

    public void diferenceBetweenDates(String Time) throws ParseException {
        String pattern = "hh:mm:ss";
        DateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        Date d1 = simpleDateFormat.parse(hours + ":" + minutes + ":" + seconds);

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date d2 = sdf.parse(Time);
        long differenceInMilliSeconds = Math.abs(d1.getTime() - d2.getTime());
        long differenceInSeconds = (differenceInMilliSeconds / 1000);
        System.out.println(differenceInSeconds + " seconds");
    }
}
