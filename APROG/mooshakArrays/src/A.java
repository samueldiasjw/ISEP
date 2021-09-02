import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lerNumeros = scan.nextInt();
        int [] array = new int[lerNumeros];

        for(int i = 0; i < lerNumeros; i++){
            array[i] = scan.nextInt();
        }

        average(array);
        reprovacoes(array);
    }

    public static void average(int [] array){
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }

        double media = sum * 1.0 / array.length;

        System.out.println("media=" + media);
    }

    public static void reprovacoes(int [] array){
        int count = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] < 10){
                count++;
            }
        }

        System.out.println("reprovacoes=" + count);
    }
}
