import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        int num,p = 0,dec=0;
        boolean flag = true;
        Scanner scan = new Scanner(System.in);

        do {
            num = scan.nextInt();

            if(num >= 0){
                while(num != 0){
                    int temp = num % 10;
                    dec += temp * Math.pow(8, p);
                    num = num/10;
                    p++;
                }
                System.out.println(dec);

                dec=0;
                p=0;
            }else{
                flag = false;
            }
        }
        while (flag);

        scan.close();


    }
}
