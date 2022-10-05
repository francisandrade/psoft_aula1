import java.util.Date;

public class Lote {
    private Produto prod;
    private int qtd;
    private String dataValidade;

    public Lote(Produto prod, int qtd, String dataValidade) {
        this.prod = prod;
        this.qtd = qtd;
        this.dataValidade = dataValidade;
    }

    public Produto getProd() {
        return prod;
    }

    public int getQtd() {
        return qtd;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    @Override
    public String toString() {
        return "Lote{" +
                "prod=" + prod +
                ", qtd=" + qtd +
                ", dataValidade='" + dataValidade + '\'' +
                '}';
    }
}
