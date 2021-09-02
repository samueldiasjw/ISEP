import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String insertUser = "";
        int seqNumbers = scan.nextInt();
        int[] numeros = new int[seqNumbers];

        revOrder(numeros, scan);

        while(insertUser.compareTo("sair") != 0){
            insertUser = scan.nextLine();

            if(insertUser.compareTo("direita") == 0){
                direita(numeros);
            }
            if(insertUser.compareTo("esquerda") == 0){
                esquerda(numeros);
            }
        }
    }

    public static void revOrder(int[] numeros, Scanner scan){
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = scan.nextInt();
        }
    }

    public static void direita(int[] numeros){
        int t = numeros[numeros.length - 1];

        for(int i = numeros.length - 1; i >= 1; i--){
            numeros[i] = numeros[i - 1];
        }

        numeros[0] = t;

        for(int i = 0; i < numeros.length;i++){
            System.out.print("[" + numeros[i] + "]");
        }

        System.out.println();
    }

    public static void esquerda(int[] numeros){
        int t = numeros[0];

        for(int i = 0; i < numeros.length - 1; i++){
            numeros[i] = numeros[i + 1];
        }

        numeros[numeros.length - 1] = t;

        for(int i = 0; i < numeros.length; i++){
            System.out.print("[" + numeros[i] + "]");
        }

        System.out.println();
    }
}
