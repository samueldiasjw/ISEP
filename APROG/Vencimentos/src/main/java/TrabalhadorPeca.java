public class TrabalhadorPeca extends Trabalhador {
    private int partsType1;
    private int partsType2;
    private static float payPartsType1 = 6.5f;
    private static float payPartsType2 = 9.5f;

    private static final int NUMERO_PECAS_TIPO1_POR_OMISSAO = 0;
    private static final int NUMERO_PECAS_TIPO2_POR_OMISSAO = 0;

    public TrabalhadorPeca(String nome, int partsType1, int partsType2) {
        super(nome);
        this.partsType1 = partsType1;
        this.partsType2 = partsType2;
    }

    public TrabalhadorPeca(String nome) {
        super(nome);
        partsType1 = NUMERO_PECAS_TIPO1_POR_OMISSAO;
        partsType2 = NUMERO_PECAS_TIPO2_POR_OMISSAO;
    }

    public TrabalhadorPeca() {
        super();
        partsType1 = NUMERO_PECAS_TIPO1_POR_OMISSAO;
        partsType2 = NUMERO_PECAS_TIPO2_POR_OMISSAO;
    }

    public int getpartsType1() {
        return partsType1;
    }

    public int getpartsType2() {
        return partsType2;
    }


    public void setpartsType1(int partsType1) {
        this.partsType1 = partsType1;
    }


    public void setpartsType2(int partsType2) {
        this.partsType2 = partsType2;
    }


    @Override
    public String toString() {
        return String.format("Trabalhador à Peça: %s %nNº de Peças do Tipo 1: "
                        + "%d %nNº de Peças do Tipo 2: %d",
                super.toString(), partsType1, partsType2);
    }

    @Override
    public float calcularVencimento() {
        return partsType1 * payPartsType1 + partsType2 * payPartsType2;
    }

    public static float getpayPartsType1() {
        return payPartsType1;
    }


    public static float getPagamentoPeca2() {
        return payPartsType2;
    }

    public static void setpayPartsType1(float payPartsType1) {
        TrabalhadorPeca.payPartsType1 = payPartsType1;
    }

    public static void setPagamentoPeca2(float payPartsType2) {
        TrabalhadorPeca.payPartsType2 = payPartsType2;
    }
}

