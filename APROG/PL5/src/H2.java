import java.util.Scanner;

public class H2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int number = 0;
        boolean flag = true;
        int count = 0;

        do{
            number = myObj.nextInt();
            flag = capicua(number);
            count++;
        }while(flag && count < 5);

        if(flag){
            System.out.println("tentativas excedidas");
        }else{
            System.out.println("capicua");
        }

    }

    public static boolean capicua(int number){
        int originalNumber = number;
        int reverseNumber = 0;
        int alg;

        while(number != 0){
            alg = number % 10;

            reverseNumber = reverseNumber * 10 + alg;

            number = number / 10;
        }

        if(originalNumber == reverseNumber){
            return false;
        }

        return true;
    }
}
