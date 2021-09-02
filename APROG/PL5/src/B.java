import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        int alg,sum = 0,num;
        boolean repetir = true;
        Scanner scan = new Scanner(System.in);

        do {
            num = scan.nextInt();

            if(num > 0){
                while (num != 0){
                    alg = num % 10;

                    if(alg % 2 == 0){
                        sum = sum + alg;
                    }

                    num = num/10;
                }
                System.out.println(sum);

                sum = 0;
            }else{
                repetir = false;
            }
        }
        while (repetir);

        scan.close();
    }
}
