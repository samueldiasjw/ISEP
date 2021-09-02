import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inserirNumeros = scan.nextInt();
        int [] array = new int[inserirNumeros];

        lerNumeros(array,inserirNumeros, scan);
        System.out.println("sempre crescente = " + verificarCrescente(array, inserirNumeros));
    }

    public static void lerNumeros(int [] array, int inserirNumeros, Scanner scan){
        for(int i = 0; i < inserirNumeros; i++){
            array[i] = scan.nextInt();
        }
    }

    public static boolean verificarCrescente(int [] array, int inserirNumeros){
        for(int i = 0; i < inserirNumeros - 1; i++){
            if(array[i] >= array[i + 1]){
                return false;
            }
        }
        return true;
    }
}
