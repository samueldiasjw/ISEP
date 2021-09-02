import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args){
        String fileName = "src/img*.txt"; //caminho do ficheiro
        int count = 0; //contar linhas
        int dimensaoImg = 0; //dimensao da imagem que é quadrada

        try (BufferedReader br = new BufferedReader(new InputStreamReader( //ler o texto de um input Stream
                new FileInputStream(fileName), StandardCharsets.UTF_8));) {

            String line;

            while ((line = br.readLine()) != null) { //ler enquanto tiver coisas no ficheiro
                count++;

                if(count == 2){
                    dimensaoImg = Integer.parseInt(line); //na linha 2 apresenta sempre a dimensao da imagem
                    break;
                }
            }

            count = 0;
            int [][] matrixImg = new int[dimensaoImg][dimensaoImg];
            int [][] matrixFiltroImg = new int [dimensaoImg][dimensaoImg];

            while ((line = br.readLine()) != null) { //ler o resto do ficheiro que ficou no break
                for(int i = 0; i < dimensaoImg; i++){
                    matrixImg[count][i] = Integer.parseInt(String.valueOf(line.charAt(i)));
                    matrixFiltroImg[count][i] = Integer.parseInt(String.valueOf(line.charAt(i)));
                }
                count++;
            }

            System.out.println("b)");
            b(matrixImg); //chamar funcao exercicio b
            c(matrixImg, matrixFiltroImg); //chamar funcao exercicio c
            d(matrixImg, matrixFiltroImg); //chamar funcao exercicio d
            eCheckPar(matrixFiltroImg); //chamar funcao exercicio e
            f(matrixFiltroImg); //chamar funcao exercicio f
            g(matrixFiltroImg); //chamar funcao exercicio g
            h(matrixFiltroImg); //chamar funcao exercicio h
            ij(matrixFiltroImg); //chamar funcao exercicio ij que contem o exericio i e j

        }catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static void b(int [][] matrixImg){
        for (int i = 0; i < matrixImg.length; i++)
        {
            for (int j = 0; j < matrixImg[i].length; j++)
            {
                System.out.print(matrixImg[i][j]);
            }
            System.out.println();
        }
    }

    public static void c(int [][] matrixImg, int [][] matrixFiltroImg){
        int sum = 0;

        System.out.println("c)");
        for (int i = 1; i < matrixFiltroImg.length - 1; i++)
        {
            for (int j = 1; j < matrixFiltroImg[i].length - 1; j++)
            {
                sum = sum + matrixImg[i + 1][j];  //checka casa em cima
                sum = sum + matrixImg[i][j]; //checka a propria casa
                sum = sum + matrixImg[i - 1][j]; //checka casa em baixo
                sum = sum + matrixImg[i][j + 1]; //checka casa lado direito
                sum = sum + matrixImg[i][j - 1]; //checka casa lado esquerdo

                matrixFiltroImg[i][j] = (sum / 5); //sempre 5 pixeis

                sum = 0;
            }
        }

        b(matrixFiltroImg);
    }

    public static void d(int [][] matrixImg, int [][] matrixFiltroImg){
        boolean flag = true;

        System.out.println("d)");
        for (int i = 0; i < matrixImg.length; i++)
        {
            for (int j = 0; j < matrixImg[i].length; j++)
            {
                if (matrixImg[i][j] != matrixFiltroImg[i][j]) {
                    flag = false;
                    break;
                }
            }
        }

        if(flag){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }

    public static void eCheckPar(int [][] matrixImg){
        if(matrixImg.length % 2 == 0){
            e(matrixImg);
        }else{
            //transformar uma imagem de pixeis impar's em imagem de pixeis par's
            int[][] matrixImgDelCol = new int[matrixImg.length][matrixImg.length - 1];
            int metade = matrixImg.length / 2;

            //Apagar coluna do meio
            for (int i = 0; i < matrixImg.length; i++)
            {
                for (int j = 0; j < matrixImg[i].length; j++)
                {
                    if(j < metade){
                        matrixImgDelCol[i][j] = matrixImg[i][j];
                    }
                    if(j > metade){
                        matrixImgDelCol[i][j - 1] = matrixImg[i][j];
                    }
                }
            }

            //Apagar linha do meio
            int[][] matrixImgImp = new int[matrixImg.length - 1][matrixImg.length - 1];
            for (int i = 0; i < matrixImgDelCol.length; i++)
            {
                for (int j = 0; j < matrixImgDelCol[i].length; j++)
                {
                    if(i < metade){
                        matrixImgImp[i][j] = matrixImgDelCol[i][j];
                    }
                    if(i > metade){
                        matrixImgImp[i - 1][j] = matrixImgDelCol[i][j];
                    }
                }
            }

            e(matrixImgImp);
        }
    }

    public static void e(int [][] matrixImg){
        System.out.println("e)");

        int secondQuadrant = 0, firstQuadrant = 0, thirdQuadrant = 0, fourthQuadrant = 0;
        int metade = matrixImg.length/2, predominancia = 0, maior = 0;


        //Segundo e Primeiro Quadrantes
        for(int j = 0; j < matrixImg.length; j++){
            for(int i = 0; i < metade; i++){
                if(j < metade){
                    predominancia = predominancia(matrixImg,matrixImg[i][j],0,metade,0,metade);

                    if(predominancia > maior){
                        maior = predominancia;
                        secondQuadrant = matrixImg[i][j];
                    }

                    if(predominancia == maior){
                        if(matrixImg[i][j] < secondQuadrant){
                            secondQuadrant = matrixImg[i][j];
                        }
                    }
                }else{
                    if(j == metade && i == 0){
                        maior = 0;
                    }

                    predominancia = predominancia(matrixImg,matrixImg[i][j],metade, matrixImg.length, 0,metade);

                    if(predominancia > maior){
                        maior = predominancia;
                        firstQuadrant = matrixImg[i][j];
                    }

                    if(predominancia == maior){
                        if(matrixImg[i][j] < firstQuadrant){
                            firstQuadrant = matrixImg[i][j];
                        }
                    }
                }
            }
        }

        maior = 0;

        //Quarto e Terceiro Quadrantes
        for(int j = 0; j < matrixImg.length; j++){
            for(int i = metade; i < matrixImg.length; i++){
                if(j < metade){
                    predominancia = predominancia(matrixImg,matrixImg[i][j],0,metade,metade, matrixImg.length);

                    if(predominancia > maior){
                        maior = predominancia;
                        thirdQuadrant = matrixImg[i][j];
                    }

                    if(predominancia == maior){
                        if(matrixImg[i][j] < thirdQuadrant){
                            thirdQuadrant = matrixImg[i][j];
                        }
                    }
                }else{
                    if(j == metade && i == 2){
                        maior = 0;
                    }

                    predominancia = predominancia(matrixImg,matrixImg[i][j],metade, matrixImg.length, metade, matrixImg.length);

                    if(predominancia > maior){
                        maior = predominancia;
                        fourthQuadrant = matrixImg[i][j];
                    }

                    if(predominancia == maior){
                        if(matrixImg[i][j] < fourthQuadrant){
                            fourthQuadrant = matrixImg[i][j];
                        }
                    }
                }
            }
        }


        System.out.println(secondQuadrant + "" + firstQuadrant);
        System.out.println(thirdQuadrant + "" + fourthQuadrant);
    }

    public static int predominancia(int [][] matrixImg, int number, int startJ, int endJ, int startI, int endI){
        int count = 0;

        for(int j = startJ; j < endJ; j++){
            for(int i = startI; i < endI; i++){
                if(number == matrixImg[i][j]){
                    count++;
                }
            }
        }

        return count;
    }

    public static void f(int [][] matrixImg){
        int[] matrixColors = new int [10]; //intervalo de cor 0 - 9
        int count = 0;
        boolean flag = false;

        System.out.println("f)");

        for(int k = 0; k < matrixColors.length; k++){
            for (int i = 0; i < matrixImg.length; i++)
            {
                for (int j = 0; j < matrixImg[i].length; j++)
                {
                    if(matrixImg[i][j] == k){
                        matrixColors[count] = k;
                        count++;
                        flag = true;
                        break;
                    }
                }

                if(flag){
                    flag = false;
                    break;
                }
            }
        }

        //mostrar array
        for(int i = 0; i < count; i++){
            System.out.print("[" + matrixColors[i] + "]");
        }

        System.out.println();
    }

    public static void g(int[][] matrixImg){
        System.out.println("g)");

        for (int i = 0; i < matrixImg.length; i++) {
            for (int j = 0; j < matrixImg[i].length; j++) {
                if((matrixImg[i][j]) == 1){
                    matrixImg[i][j] = 5;
                }
                System.out.print(matrixImg[i][j]);
            }
            System.out.println();
        }
    }

    public static void h(int [][] matrixImg){
        System.out.println("h)");

        for (int i = 0; i < matrixImg.length; i++) {
            int inicio = 0;
            int fim = matrixImg.length - 1;
            while (inicio < fim) {
                int temp = matrixImg[i][inicio];
                matrixImg[i][inicio] = matrixImg[i][fim];
                matrixImg[i][fim] = temp;
                inicio++;
                fim--;
            }
        }

        b(matrixImg);
    }


    public static void ij(int[][] matrixImg){
        int sum = 0, line = 0, menor = 99;

        for (int i = 0; i < matrixImg.length; i++)
        {
            for (int j = 0; j < matrixImg[i].length; j++)
            {
                sum = sum + matrixImg[i][j];

            }

            if(sum <= menor){
                menor = sum;
                line = i;
            }

            sum = 0;
        }

        for(int i = 0; i < matrixImg[line].length; i++){
            matrixImg[line][i] = 9;
        }

        System.out.println("i)");
        System.out.println(line + 1);
        System.out.println("j)");
        b(matrixImg);
    }
}
