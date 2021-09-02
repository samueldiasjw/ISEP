import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] juros = new double[6];

        lerJuros(juros, scan);
        double depositoInicial = scan.nextDouble();

        mostrar(juros,depositoInicial);
    }

    public static void lerJuros(double[] juros, Scanner scan){
        for(int i = 0; i < juros.length; i++){
            juros[i] = scan.nextDouble();
        }
    }

    public static void mostrar(double[] juros, double depositoInicial){
        double valorFinal = depositoInicial;

        for(int i = 0; i < juros.length; i++){
            valorFinal = valorFinal * juros[i] + valorFinal;
        }

        System.out.printf("valor final=%.2f\n",valorFinal);
    }
}
