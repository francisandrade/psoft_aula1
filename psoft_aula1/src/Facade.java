import Services.ProdutoService;
public class Facade {

    private ProdutoService prodService;

    public Facade(){
        this.prodService = new ProdutoService();
    }

    public void criarProduto(String nome, String fabricante, Double preco) {
        prodService.criarProduto(nome, fabricante, preco);
    }
}
