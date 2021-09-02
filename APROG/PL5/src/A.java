import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        int alg,sum=0;
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        scan.close();

        while(num != 0){
            alg = num % 10;

            if(alg % 2 == 0){
                sum = sum + alg;
            }

            num= num/10;
        }

        System.out.println(sum);
    }
}
