import java.util.Scanner;

public class I2 {
    public static void main(String[] args) {
        int number = 0,rep, sum = 0;
        boolean flag = false;
        Scanner s = new Scanner(System.in);

        number = s.nextInt();
        fibonnaci(number);
    }

    public static void fibonnaci(int number){
        int F = 0;     // atual
        int ant = 0;   // anterior

        for(int j = 0; j < number; j++){
            if (j == 1) {
                F = 1;
                ant = 0;
            } else {
                if(F < number){
                    F += ant;
                    ant = F - ant;
                }
            }
        }

        if(number == F){
            System.out.println("e de Fibonacci");
        }else{
            System.out.println("nao e de Fibonacci");
        }
    }
}
