public abstract class Contribuinte {
    private String nome;
    private String morada;
    private static final String NOME_POR_OMISSAO = "sem nome";
    private static final String MORADA_POR_OMISSAO = "sem morada";

    public Contribuinte(String nome, String morada) {
        this.nome = nome;
        this.morada = morada;
    }

    public Contribuinte() {
        this.nome = NOME_POR_OMISSAO;
        this.morada = MORADA_POR_OMISSAO;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    @Override
    public String toString() {
        return nome;
    }

    public abstract float calcularImposto();
}