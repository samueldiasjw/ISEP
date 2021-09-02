import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        int num,contador = 0;
        Scanner scan = new Scanner(System.in);

        num = scan.nextInt();
        scan.close();

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                contador++;
            }
        }

        if(contador == 2){
            System.out.println("primo");
        }else{
            System.out.println("nao e primo");
        }
    }
}