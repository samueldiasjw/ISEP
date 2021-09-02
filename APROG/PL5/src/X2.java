import java.util.Scanner;

public class X2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int maxDigits = s.nextInt();

        System.out.printf("%.2f\n",average(s,maxDigits));
    }

    public static double average(Scanner s, int maxDigits){
        int number = 0, sum = 0, count = 0;
        boolean flag = true;

        while(flag && count < 5){
            number = s.nextInt();

            if(countAlg(number) < maxDigits){
                sum = sum + number;
                count++;
            }else{
                flag = false;
            }
        }

        double average = sum * 1.00 / count;
        return average;
    }

    public static int countAlg(int number){
        int count = 0;

        while(number != 0){
            count++;

            number = number / 10;
        }

        return count;
    }}
