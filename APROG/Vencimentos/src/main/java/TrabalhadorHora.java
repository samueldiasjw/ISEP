public class TrabalhadorHora extends Trabalhador {
    private int numberOfHours;
    private float hourPayement;

    private static final int NUMERO_HORAS_POR_OMISSAO = 0;
    private static final float PAGAMENTO_HORA_POR_OMISSAO = 10.0f;

    public TrabalhadorHora(String nome, int numberOfHours, float hourPayement) {
        super(nome);
        this.numberOfHours = numberOfHours;
        this.hourPayement = hourPayement;
    }

    public TrabalhadorHora(String nome) {
        super(nome);
        numberOfHours = NUMERO_HORAS_POR_OMISSAO;
        hourPayement = PAGAMENTO_HORA_POR_OMISSAO;
    }

    public TrabalhadorHora() {
        super();
        numberOfHours = NUMERO_HORAS_POR_OMISSAO;
        hourPayement = PAGAMENTO_HORA_POR_OMISSAO;
    }

    public int getnumberOfHours() {
        return numberOfHours;
    }

    public float gethourPayement() {
        return hourPayement;
    }

    public void setnumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public void sethourPayement(float hourPayement) {
        this.hourPayement = hourPayement;
    }

    @Override
    public String toString() {
        return String.format("Trabalhador à Hora: %s %nNº de Horas de Trabalho: "
                        + "%d %nPagamento por Hora: %.2f €",
                super.toString(), numberOfHours, hourPayement);
    }

    @Override
    public float calcularVencimento() {
        return numberOfHours * hourPayement;
    }
}
