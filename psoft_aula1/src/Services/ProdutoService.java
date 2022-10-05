package Services;

import Repositories.ProdutoRepository;
import models.Produto;

public class ProdutoService {
    private ProdutoRepository prodRep;

    public ProdutoService() {
        this.prodRep = new ProdutoRepository();
    }

    public void criarProduto(String nome, String fabricante, double preco) {
        Produto prod =  new Produto(nome, fabricante, preco);
        prodRep.addProduto(prod);
    }
}
