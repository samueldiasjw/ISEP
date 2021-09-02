import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String biggestPair = "";
        int rep = myObj.nextInt();
        int dif = 0;

        for(int i = 0; i < rep; i++){
            int numberOne = myObj.nextInt();
            int numberTwo = myObj.nextInt();

            if(comumPositions(numberOne,numberTwo) > dif){
                biggestPair = numberOne + "/" + numberTwo;
                dif = comumPositions(numberOne,numberTwo);
            }
        }

        if(dif > 0){
            System.out.println(biggestPair);
        }else{
            System.out.println("sem resultados");
        }
    }

    public static int comumPositions(int numberOne, int numberTwo){
        int result = 0;
        int end = 0;

        if(numberOne > numberTwo){
            end = String.valueOf(numberTwo).length();
        } else{
            end = String.valueOf(numberOne).length();
        }

        for(int i = 0; i < end; i++){
            if(String.valueOf(numberOne).charAt(i) == String.valueOf(numberTwo).charAt(i)){
                result++;
            }
        }

        return result;
    }
}
