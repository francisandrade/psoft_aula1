package Repositories;

import models.Lote;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class LoteRepository {
    private Map<String, Lote> lotes;

    public LoteRepository() {
        this.lotes = new HashMap<String, Lote>();
    }

    public Collection<Lote> getAll() {
        return this.lotes.values();
    }

    public void addLote(Lote lote) {
        this.lotes.put(lote.getProd().getNome(), lote);
    }
}
