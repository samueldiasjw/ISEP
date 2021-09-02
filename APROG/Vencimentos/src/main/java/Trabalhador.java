public abstract class Trabalhador {
    private String name;
    private static final String name_POR_OMISSAO = "sem name";

    public Trabalhador(String name) {
        this.name = name;
    }

    public Trabalhador() {
        name = name_POR_OMISSAO;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public abstract float calcularVencimento();
}