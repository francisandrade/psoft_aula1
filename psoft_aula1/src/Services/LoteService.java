package Services;

import Repositories.LoteRepository;
import models.Lote;
import models.Produto;

public class LoteService {
    private LoteRepository loteRep;

    public LoteService() {
        this.loteRep = new LoteRepository();
    }

    public void criarLote(Produto prod, int qtd, String dataValidade) {
        Lote lote = new Lote(prod, qtd, dataValidade);
        loteRep.addLote(lote);
    }
}
