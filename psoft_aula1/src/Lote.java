import java.util.Date;

public class Lote {
    private int qtd;
    private Date dataValidade;
    private Produto prod;

    public Lote(int qtd, Date dataValidade, Produto prod) {
        this.qtd = qtd;
        this.dataValidade = dataValidade;
        this.prod = prod;
    }
}
