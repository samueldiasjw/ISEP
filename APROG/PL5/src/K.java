import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        int count = 0;
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    count++;
                }
            }

            if(count == 2){
                System.out.println(i);
            }

            count = 0;
        }


    }
}
