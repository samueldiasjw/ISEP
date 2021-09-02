import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        int num,alg,algAnterior,numeroAnterior = -1,clone;
        boolean flag = false;
        Scanner scan = new Scanner(System.in);

        do{
            num = scan.nextInt();
            clone = num;

            if(num >= 0){
                if(num > numeroAnterior && numeroAnterior >= 0){
                    algAnterior = num;

                    do {
                        alg = clone % 10;

                        if(num > 9){
                            if(!(alg < algAnterior)){
                                flag = true;
                            }
                        }

                        algAnterior = alg;
                        clone = clone / 10;

                    }while(clone != 0 && !flag);

                    if(!flag){
                        System.out.println(num);
                    }

                    flag = false;
                    algAnterior = num;
                }
            }

            numeroAnterior = num;
        }while(num >= 0);
    }
}
