import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        int mmc = 0, aux;
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        for (int i = 1; i <= num2; i++) {
            aux = num1 * i;

            if ((aux % num2) == 0) {
                mmc = aux;
                i = num2 + 1;
            }
        }
        System.out.println(mmc);
    }
}
