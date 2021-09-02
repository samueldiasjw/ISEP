import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        int contar = 0,contarAlg = 0, alg;
        double maior = 0;
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        if(num > 0){
            for(int i = 0; i < num; i++){
                int number = scan.nextInt();
                int temp = number;

                while(temp != 0){
                    alg = temp % 10;

                    if(alg != 0){
                        if(number % alg == 0){
                            contar++;
                        }
                    }

                    contarAlg++;
                    temp = temp / 10;
                }

                double result = (contar) * 100.00 / (contarAlg);
                System.out.printf("%.2f%%\n", result);

                if(result > maior){
                    maior = result;
                }

                contarAlg = 0;
                contar = 0;
            }
            System.out.printf("(%.2f%%)\n", maior);
        }
    }
}
