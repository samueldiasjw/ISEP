import java.util.Scanner;

public class C2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int a = myObj.nextInt();
        int b = myObj.nextInt();
        int c = myObj.nextInt();

        System.out.println(calcAng(a,b,c));
    }

    public static double calcAng(int a, int b, int c){
        return Math.acos((a*a + b*b - c*c) / (2*a*b));
    }
}
