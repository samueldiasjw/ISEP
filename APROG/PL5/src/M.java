import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        int num = 1,rep, sum = 0;
        boolean flag = false;
        Scanner s = new Scanner(System.in);

        rep = s.nextInt();

        int F = 0;     // atual
        int ant = 0;   // anterior

        if(rep > 0){
            for(int j = 0; j < rep; j++){
                    if (j == 1) {
                        F = 1;
                        ant = 0;
                    } else {
                        F += ant;
                        ant = F - ant;
                    }
                System.out.println(F);
            }
        }
    }
}
