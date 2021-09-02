public class Main {
    public static void main(String[] args) {
        Reformado r1 = new Reformado("Reformado1","Morada1" ,10000, 15000);
        Reformado r2 = new Reformado("Reformado2","Morada2" ,40000, 15000);

        TrabalhadorCOutrem to1 = new TrabalhadorCOutrem("TrabalhadorCOutrem1","Morada1" ,50000, 20000);
        TrabalhadorCOutrem to2 = new TrabalhadorCOutrem("TrabalhadorCOutrem2","Morada2" ,30000, 200000);

        TrabalhadorCPropria tp1 = new TrabalhadorCPropria("TrabalhadorCPropria1","Morada1" ,10000, 50000);
        TrabalhadorCPropria tp2 = new TrabalhadorCPropria("TrabalhadorCPropria2","Morada2" , 80000, 10000);

        Desempregado d1 = new Desempregado("Desempregado1","Morada1" ,70000, 10000);
        Desempregado d2 = new Desempregado("Desempregado2","Morada2" ,10000, 70000);

        Contribuinte[] contribuintes = new Contribuinte[10];

        contribuintes[0] = r1;
        contribuintes[1] = r2;
        contribuintes[2] = to1;
        contribuintes[3] = to2;
        contribuintes[4] = tp1;
        contribuintes[5] = tp2;
        contribuintes[6] = d1;
        contribuintes[7] = d2;

        for(int i = 0; i < contribuintes.length; i++){
            if(contribuintes[i] != null){
                System.out.println("\n" + contribuintes[i].calcularImposto());
            }
        }

        for(int i = 0; i < contribuintes.length; i++){
            if(contribuintes[i] != null){
                System.out.println("\n" + contribuintes[i].getNome() + " " + contribuintes[i].calcularImposto());
            }
        }

        Desempregado.setTaxaOr(10);

        for(int i = 0; i < contribuintes.length; i++){
            if(contribuintes[i] != null){
                System.out.println("\n" + contribuintes[i].getNome() + " " + contribuintes[i].calcularImposto());
            }
        }
    }
}
