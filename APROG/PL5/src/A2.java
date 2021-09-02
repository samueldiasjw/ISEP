import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        String word;
        int contador = 0;

        Scanner myObj = new Scanner(System.in);

        do{
            word = myObj.nextLine();
            contador++;
        }while(palindromo(word));

        System.out.println(contador - 1);
    }

    public static boolean palindromo(String word){
        String reverseWord = "";

        for(int i = word.length() - 1; i >= 0; i--){
            reverseWord = reverseWord + word.charAt(i);
        }

        if(word.compareTo(reverseWord) == 0){
            return false;
        }

        return true;
    }
}
