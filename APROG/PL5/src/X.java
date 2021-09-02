import java.util.Scanner;

public class X {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);

        num = scan.nextInt();
        scan.close();

        switch (num){
            case 1:
                System.out.println("Tag Heuer");
                break;
            case 2:
                System.out.println("Rolex");
                break;
            case 3:
                System.out.println("Omega");
                break;
            case 4:
                System.out.println("Cartier");
                break;
            case 5:
                System.out.println("Bvlgari");
                break;
            case 6:
                System.out.println("Raymond Weil");
                break;
            default:
                System.out.println("Marca invalida");
        }
    }
}
