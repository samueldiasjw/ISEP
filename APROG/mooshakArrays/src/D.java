import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inserirNumeros = scan.nextInt();
        int [] array = new int[inserirNumeros];

        lerNumeros(array,inserirNumeros, scan);
        frequencias(array,inserirNumeros);
    }

    public static void lerNumeros(int [] array, int inserirNumeros, Scanner scan){
        for(int i = 0; i < inserirNumeros; i++){
            array[i] = scan.nextInt();
        }
    }

    public static void frequencias(int [] array, int inserirNumeros){
        int count = 0;

        for(int i = 0; i <= 20; i++){
            for(int j = 0; j < inserirNumeros; j++){
                if (i == array[j]) {
                    count++;
                }
            }
            System.out.println( i + " " + count);
            count = 0;
        }
    }
}
