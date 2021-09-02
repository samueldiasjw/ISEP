import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] nomes = new String[20];
        double [] vencimento = new double[20];

        lerFuncionarios(nomes,vencimento, scan);
        media(nomes ,vencimento);
    }

    public static void lerFuncionarios(String [] nomes, double [] vencimento, Scanner scan){
        int i = 0;
        String texto;

        do{
            nomes[i] = scan.nextLine();

            if(nomes[i].compareTo("fim") != 0){
                texto = scan.nextLine();
                vencimento[i] = Double.parseDouble(texto);
            }

            i++;
        }while(i < 20 && nomes[i - 1].compareTo("fim") != 0 );
    }

    public static void media(String[] nomes,double [] vencimento){
        double sum = 0, numeroFuncionarios = 0;

        for(int i = 0; i < vencimento.length; i++){
            if(vencimento[i] != 0){
                numeroFuncionarios++;
            }
        }

        for(int i = 0; i < numeroFuncionarios; i++){
            sum = sum + vencimento[i];
        }

        mostrarResultados(sum,numeroFuncionarios,vencimento,nomes);
    }

    public static void mostrarResultados(double sum, double numeroFuncionarios, double [] vencimento, String[] nomes){
        double media = sum * 1.0 / numeroFuncionarios;

        System.out.println(media);

        for(int i = 0; i < numeroFuncionarios; i++){
            if(vencimento[i] < media){
                System.out.println(nomes[i]);
            }
        }
    }
}
