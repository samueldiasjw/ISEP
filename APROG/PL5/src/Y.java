import java.util.Scanner;

public class Y {
    public static void main(String[] args) {
        int num;
        boolean flag = false;
        Scanner scan = new Scanner(System.in);

        num = scan.nextInt();
        scan.close();

        for(int i = 1; i < num; i++){
            if(num % i == 0){
                if(i % 3 == 0){
                    System.out.println(i);
                    flag = true;
                }
            }
        }

        if(!flag){
            System.out.println("sem divisores multiplos de 3");
        }

    }
}
