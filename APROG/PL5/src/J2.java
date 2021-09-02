import java.util.Scanner;

public class J2 {
    public static void main(String[] args) {
        int number = 0,rep, sum = 0;
        boolean flag = false;
        Scanner s = new Scanner(System.in);

        number = s.nextInt();

        for(int i = 0; i < 30; i++){
            System.out.println();
        }

        game(number, s);
    }

    public static void game(int number, Scanner s){
        int player2 = 0;
        int count = 0;

        do{
            player2 = s.nextInt();

            if(player2 > number){
                System.out.println("Tente menor");
            }

            if(player2 < number){
                System.out.println("Tente maior");
            }

            count++;
        }while(player2 != number);

        System.out.println("Acertou");
        System.out.println(count);
    }
}
