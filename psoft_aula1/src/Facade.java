import Services.LoteService;
import Services.ProdutoService;
import models.Produto;

public class Facade {

    private ProdutoService prodService;
    private LoteService loteService;

    public Facade(){
        this.prodService = new ProdutoService();
        this.loteService = new LoteService();
    }

    public void criarProduto(String nome, String fabricante, Double preco) {
        prodService.criarProduto(nome, fabricante, preco);
    }

    public void criarLote(Produto prod, int qtd, String dataValidade) {
        loteService.criarLote(prod, qtd, dataValidade);
    }
}
