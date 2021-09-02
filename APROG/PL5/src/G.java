import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        int num,contador = 0;
        Scanner scan = new Scanner(System.in);

        num = scan.nextInt();
        scan.close();

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.println(i);
                contador++;
            }
        }
        System.out.println("(" + contador + ")");
    }
}
