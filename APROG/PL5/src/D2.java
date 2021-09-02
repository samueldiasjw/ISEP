import java.util.Scanner;

public class D2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String m = myObj.nextLine();
        String n = myObj.nextLine();

        if(m.compareTo("") != 0 && n.compareTo("") != 0){
            int number1 = Integer.parseInt(m);
            int number2 = Integer.parseInt(n);

            if(combinacoes(number1,number2) != 0 && permotacoes(number1,number2) != 0){
                System.out.println("C(" + m + "," + n + ")=" + combinacoes(number1,number2));
                System.out.println("P(" + m + "," + n + ")=" + permotacoes(number1,number2));
            }
        }
    }

    public static int combinacoes(int m, int n){
        int result = 0;

        if(m >= n){
            result = fatorial(m) / (fatorial(n) * fatorial(m-n));
        }

        return result;
    }

    public static int permotacoes(int m, int n){
        int result = 0;

        if(m >= n){
            result = fatorial(m) / fatorial(m-n);
        }

        return result;
    }

    public static int fatorial(int number){
        int total = 1;

        for(int i = number; i > 0; i--){
            total = total * i;
        }

        return total;
    }
}
