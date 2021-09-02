import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        int num,originalNumber=0,reverseNumber=0,alg, count=0;
        Scanner scan = new Scanner(System.in);

        originalNumber = scan.nextInt();
        scan.close();

        num = originalNumber;

        while(num != 0){
            num = num/10;

            count++;
        }
        count--;

        num = originalNumber;

        while(num != 0){
            alg = num % 10;

            reverseNumber = reverseNumber + (alg * (int) Math.pow(10, count));

            count--;
            num = num/10;
        }

        if(originalNumber == reverseNumber){
            System.out.println("capicua");
        }else{
            System.out.println("nao capicua");
        }

    }
}
