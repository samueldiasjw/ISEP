import java.util.Scanner;

public class Y2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numberOne,numberTwo;

        numberOne = lerValorInteiroPositivo(s);
        numberTwo = lerValorInteiroPositivo(s);
        mostrarTabuadasDoIntervalo(numberOne, numberTwo);
    }

    public static int lerValorInteiroPositivo(Scanner s){
        int number;

        do{
            number = s.nextInt();
        }while(number <= 0);

        return number;
    }

    public static void mostrarTabuadasDoIntervalo(int numberOne, int numberTwo){
        if(numberOne > numberTwo){
            int t = numberOne;
            numberOne = numberTwo;
            numberTwo = t;
        }
        mostrarTabuadaDoNumero(numberOne,numberTwo);
    }

    public static void mostrarTabuadaDoNumero(int numberOne, int numberTwo){
        for(int i = numberOne; i <= numberTwo; i++){
            System.out.println("Tabuada de " + i);
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}