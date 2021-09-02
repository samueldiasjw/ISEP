import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int seqNumbers = scan.nextInt();
        int[] juros = new int[seqNumbers];

        revOrder(juros, scan);
    }

    public static void revOrder(int[] revOrder, Scanner scan){
        for(int i = 0; i < revOrder.length; i++){
            revOrder[i] = scan.nextInt();
        }

        for(int i = revOrder.length - 1; i >= 0; i--){
            System.out.println(revOrder[i]);
        }
    }
}
