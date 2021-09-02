import java.util.Scanner;

public class Z {
    public static void main(String[] args) {
        int num,alg,maior=0,numerosPares = 0, numerosImpares = 0, numberAlg = 0;
        Scanner scan = new Scanner(System.in);

        num = scan.nextInt();
        scan.close();

        if(num > 0){
            while(num != 0){
                alg = num % 10;
                numberAlg++;

                if(alg % 2 == 0){
                    numerosPares++;
                }

                if(alg % 2 != 0){
                    if(alg > maior){
                        numerosImpares++;
                        maior = alg;
                    }
                }

                num = num / 10;
            }
        }

        double percentagem = numerosPares * 100.00 / numberAlg;

        System.out.printf("%.2f%%\n", percentagem);

        if(numerosImpares != 0){
            System.out.println(maior);
        }else{
            System.out.println("nao ha algarismos impares");
        }
    }
}
