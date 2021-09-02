import java.util.Scanner;

public class G2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int maxNumber = myObj.nextInt();

        for(int i = 0; i <= maxNumber; i++){
            armstrong(i);
        }

    }

    public static void armstrong(int number){
        int originalNumber, alg;
        double sum = 0;

        originalNumber = number;

        while(countAlg(number) > 1){
            alg = number % 10;

            sum = sum + (Math.pow(alg,countAlg(originalNumber)));

            number = number / 10;
        }
        if(originalNumber != 0){
            sum = sum + (Math.pow(number,countAlg(originalNumber)));
        }

        if(sum == originalNumber){
            System.out.println(originalNumber);
        }
    }

    public static int countAlg(int number){
        int count = 0;

        while(number != 0){
            count++;

            number = number / 10;
        }

        return count;
    }
}
