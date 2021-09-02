import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        int num = 1,rep, sum = 0;
        boolean flag = false;
        Scanner s = new Scanner(System.in);

        rep = s.nextInt();

        if(rep > 0){
            for(int j = 0; j < rep; j++){
                flag = false;
                while (!flag){
                    for(int i = 1; i < num; i++)
                    {
                        if(num % i == 0)
                        {
                            sum = sum + i;
                        }
                    }

                    if(sum == num)
                    {
                        System.out.println(num);
                        flag = true;
                    }

                    sum = 0;
                    num++;
                }
            }
        }
    }
}
