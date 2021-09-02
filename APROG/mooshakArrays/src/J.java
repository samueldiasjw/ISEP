import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] nomes = new String[50];
        int [] vencimento = new int[50];

        lerFuncionarios(nomes,vencimento, scan);
    }

    public static void lerFuncionarios(String [] nomes, int [] vencimento, Scanner scan){
        int i = 0;
        String texto;

        do{
            nomes[i] = scan.nextLine();

            if(nomes[i].compareTo("FIM") != 0){
                texto = scan.nextLine();
                vencimento[i] = Integer.parseInt(texto);
            }

            i++;
        }while(i < 50 && nomes[i - 1].compareTo("FIM") != 0 );

        i--;

        orderByVencimento(nomes,vencimento,i);
        orderByNomes(nomes,vencimento,i);
        topTres(nomes,vencimento);
    }

    public static void orderByVencimento(String[] nomes, int [] vencimento,int i){
        for(int k = 0; k < i; k++)
        {
            for (int j = k + 1; j < i; j++)
            {
                if(vencimento[k] < vencimento[j])
                {
                    String temp = nomes[k];
                    nomes[k] = nomes[j];
                    nomes[j] = temp;

                    int t = vencimento[k];
                    vencimento[k] = vencimento[j];
                    vencimento[j] = t;
                }
            }
        }
    }

    public static void orderByNomes(String[] nomes, int [] vencimento,int i){
        for(int k = 0; k < i; k++)
        {
            for(int j = k + 1; j < i; j++){
                if(vencimento[k] == vencimento[j]){
                    if(nomes[k].compareTo(nomes[j]) > 0)
                    {
                        String temp = nomes[k];
                        nomes[k] = nomes[j];
                        nomes[j] = temp;

                        int t = vencimento[k];
                        vencimento[k] = vencimento[j];
                        vencimento[j] = t;
                    }
                }
            }
        }
    }

    public static void topTres(String[] nomes, int [] vencimento){
        for(int j = 0; j < 3; j++){
            if(nomes[j].compareTo("FIM") != 0)
            System.out.println("#" + (j + 1) + ":"+ nomes[j] + ":" + vencimento[j]);
        }
    }
}
