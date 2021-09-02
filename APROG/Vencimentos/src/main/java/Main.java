import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        TrabalhadorPeca tp1 = new TrabalhadorPeca("Jorge Silva", 53, 62);
        TrabalhadorComissao tc1 = new TrabalhadorComissao("Susana Ferreira", 650.00f, 2731.50f, 4.25f);
        TrabalhadorHora th1 = new TrabalhadorHora("Carlos Miguel", 168, 4.50f);

        Trabalhador[] container = new Trabalhador[10];

        container[0] = tp1;
        container[1] = tc1;
        container[2] = th1;

        for(int i = 0; i < container.length; i++){
            if(container[i] != null){
                System.out.println("\n" + container[i].getname());
            }
        }


        System.out.println("---------------------" + "\n" + "👷 Trabalhadores a HORA" + "\n" + "---------------------");

        for(int i = 0; i < container.length; i++){
            if(container[i] instanceof TrabalhadorHora){
                System.out.println(container[i].getname());
            }
        }

        System.out.println("-----------------------------------------" + "\n" + "🤑 Trabalhadores com respetivo Vencimento" + "\n" + "-----------------------------------------");


        for(int i = 0; i < container.length; i++){
            if(container[i] instanceof TrabalhadorHora){
                System.out.println(container[i].toString());
            }
        }
    }
}
