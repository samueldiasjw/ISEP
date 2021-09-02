import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        String validarInput = "";
        int [] array = new int[20];

        do{
            i++;
            validarInput = scan.nextLine();

            if(validarInput.compareTo("") != 0){
                array[i] = Integer.parseInt(validarInput);
            }else{
                break;
            }

        }while(array[i] > 0);

        if(validarInput.compareTo("") != 0){
            if(array[1] > 0){
                System.out.println("menor=" + menorElemento(array, i));
                System.out.println("ocorrencias=" + ocorrencias(array, i));
            }
        }
    }

    public static int menorElemento(int [] array, int numbers){
        int menor = array[1];

        for(int i = 1; i < numbers; i++){
            if(array[i] < menor){
                menor = array[i];
            }
        }

        return menor;
    }

    public static int ocorrencias(int [] array, int numbers){
        int count = 0;

        for(int i = 1; i < numbers; i++){
            if(array[i] == menorElemento(array, numbers)){
                count++;
            }
        }

        return count;
    }
}
