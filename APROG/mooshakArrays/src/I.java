import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] moradores = new String[3][4];

        moradoresCond(moradores,scan);
        String pesquisa = scan.nextLine();

        search(moradores,pesquisa);
    }

    public static void moradoresCond(String[][] moradores, Scanner scan){
        for(int i = 0; i < moradores.length; i++){
            for(int j = 0; j < moradores[i].length; j++){
                moradores[i][j] = scan.nextLine();
            }
        }
    }

    public static void search(String[][] moradores, String pesquisa){
        boolean flag = false;

        for(int i = 0; i < moradores.length; i++){
            for(int j = 0; j < moradores[i].length; j++){
                if(moradores[i][j].compareTo(pesquisa) == 0){
                    System.out.println("nome=" + moradores[i][j]);
                    System.out.println("entrada=" + i);
                    System.out.println("piso=" + j);

                    flag = true;
                }
            }
        }

        if(flag == false){
            System.out.println("Nao mora no predio");
        }
    }
}
