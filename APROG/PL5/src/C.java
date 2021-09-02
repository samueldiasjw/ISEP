import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        int alg,prod=1;
        boolean flag = false;
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        scan.close();

        while(num != 0){
            alg = num % 10;

            if(alg % 2 != 0){
                prod = prod * alg;
                flag = true;
            }

            num= num/10;
        }

        if(flag){
            System.out.println(prod);
        }else{
            System.out.println("nao ha algarismos impares");
        }
    }
}
