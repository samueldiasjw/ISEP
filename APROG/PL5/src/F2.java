import java.util.Scanner;

public class F2 {
    public static void main(String[] args) {
        double altura = 0, raio = 0;
        String option = "";
        Scanner myObj = new Scanner(System.in);

        while(option.compareTo("fim") != 0){
            option = myObj.next();

            if(option.compareTo("fim") != 0){
                raio = myObj.nextDouble();
                if(option.compareTo("esfera") != 0){
                    altura = myObj.nextDouble();
                }

                switch (option){
                    case "cilindro":
                        System.out.printf("%.2f\n", cilindro(raio,altura));

                        break;
                    case "cone":
                        System.out.printf("%.2f\n", cone(raio,altura));

                        break;
                    case "esfera":
                        System.out.printf("%.2f\n", esfera(raio));

                        break;
                }
            }
        }
    }

    public static double cilindro(double raio, double altura){
        return 3.1416 * (raio * raio) * altura;
    }

    public static double cone(double raio, double altura){
        return (3.1416 * (raio * raio) * altura) / 3;
    }

    public static double esfera(double raio){
        return (4 * 3.1416 * (raio * raio * raio)) / 3;
    }
}
