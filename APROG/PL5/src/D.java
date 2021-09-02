import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        int alg,prod = 1,num;
        boolean repetir = true, flag = false;
        Scanner scan = new Scanner(System.in);

        do {
            num = scan.nextInt();

            if(num >= 0){
                while (num != 0){
                    alg = num % 10;

                    if(alg % 2 != 0){
                        prod = prod * alg;
                        flag = true;
                    }

                    num = num/10;
                }
                if(flag){
                    System.out.println(prod);
                }else{
                    System.out.println("nao ha algarismos impares");
                }

                flag = false;
                prod = 1;
            }else{
                repetir = false;
            }
        }
        while (repetir);

        scan.close();
    }
}
