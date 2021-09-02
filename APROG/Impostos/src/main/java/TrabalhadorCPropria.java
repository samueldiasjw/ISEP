public class TrabalhadorCPropria extends Contribuinte {
    private int valorRt;
    private int valorOr;
    private static final int VALORRT_POR_OMISSAO = 0;
    private static final int VALOROR_POR_OMISSAO = 0;
    private static float taxaRt = 3;
    private static float taxaOr = 2;

    public TrabalhadorCPropria(String nome, String morada, int valorRt, int valorOr) {
        super(nome,morada);
        this.valorRt = valorRt;
        this.valorOr = valorOr;
        this.taxaOr = valorOr > 50000 ? 5 : 2;
    }

    public TrabalhadorCPropria() {
        super();
        valorRt = VALORRT_POR_OMISSAO;
        valorOr = VALOROR_POR_OMISSAO;
    }

    public int getValorRt() {
        return valorRt;
    }

    public int getValorOr() {
        return valorOr;
    }

    public void setValorRt(int valorRt) {
        this.valorRt = valorRt;
    }

    public void setValorOr(int valorOr) {
        this.valorOr = valorOr;
    }

    @Override
    public String toString() {
        return String.format("Trabalhador por Conta Propria: %s \nRendimento de Trabalho: "
                        + "%d \nOutros Rendimentos: %d",
                super.toString(), valorRt, valorOr);
    }

    @Override
    public float calcularImposto() {
        return (valorRt * (taxaRt/100)) + (valorOr * (taxaOr/100));
    }
}
