public class TrabalhadorComissao extends Trabalhador {
    private float baseSalary;
    private float sells;
    private float comission;

    private static final float SALARIO_BASE_POR_OMISSAO = 635.0f;
    private static final int sells_POR_OMISSAO = 0;
    private static final int comission_POR_OMISSAO = 0;

    public TrabalhadorComissao(String nome, float baseSalary, float sells, float comission) {
        super(nome);
        this.baseSalary = baseSalary;
        this.sells = sells;
        this.comission = comission;
    }

    public TrabalhadorComissao(String nome) {
        super(nome);
        baseSalary = SALARIO_BASE_POR_OMISSAO;
        sells = sells_POR_OMISSAO;
        comission = comission_POR_OMISSAO;
    }

    public TrabalhadorComissao() {
        super();
        baseSalary = SALARIO_BASE_POR_OMISSAO;
        sells = sells_POR_OMISSAO;
        comission = comission_POR_OMISSAO;
    }

    public float getbaseSalary() {
        return baseSalary;
    }

    public float getsells() {
        return sells;
    }

    public float getcomission() {
        return comission;
    }

    public void setbaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setsells(float sells) {
        this.sells = sells;
    }

    public void setcomission(float comission) {
        this.comission = comission;
    }

    @Override
    public String toString() {
        return String.format("Trabalhador à Comissão: %s "
                        + "%nSalário Base: %.2f Euros "
                        + "%nsells: %.2f Euros "
                        + "%nComissão: %.2f%%",
                super.toString(), baseSalary, sells, comission);
    }

    @Override
    public float calcularVencimento() {
        return baseSalary + sells * (comission / 100);
    }
}