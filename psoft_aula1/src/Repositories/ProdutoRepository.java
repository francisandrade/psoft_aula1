package Repositories;

import models.Produto;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ProdutoRepository {

    private Map<String, Produto> produtos;

    public ProdutoRepository() {
        this.produtos = new HashMap<String, Produto>();
    }

    public Collection<Produto> getAll() {
        return produtos.values();
    }

    public void addProduto(Produto prod) {
        this.produtos.put(prod.getNome(), prod);
    }
}
