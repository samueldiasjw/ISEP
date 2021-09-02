import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        int nAlunos, nDisciplinas;

        Scanner myObj = new Scanner(System.in);
        nAlunos = myObj.nextInt();
        nDisciplinas = myObj.nextInt();

        if(nAlunos > 0 && nDisciplinas > 0){
            classificacoes(nAlunos,nDisciplinas, myObj);
        }

    }

    public static void classificacoes(int nAlunos, int nDisciplinas, Scanner myObj){
        for(int i = 0; i < nDisciplinas; i++){
            String disciplina = myObj.next();
            int positivas = myObj.nextInt();

            System.out.println("Disciplina: " + disciplina);
            System.out.print("- Positivas: ");
            asteriscos(positivas);

            System.out.println();

            System.out.print("- Negativas: ");
            asteriscos(nAlunos - positivas);

            System.out.println();
        }
    }

    public static void asteriscos(int max){
        for(int t = 0; t < max; t++){
            System.out.print("*");
        }
    }
}