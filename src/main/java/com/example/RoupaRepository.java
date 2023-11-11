package com.example;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RoupaRepository {
    private final List<Roupa> roupas = new ArrayList<>();

    public List<Roupa> listarRoupas() {
        return roupas;
    }

    public Roupa cadastrarRoupa(Roupa roupa) {
        roupas.add(roupa);
        return roupa;
    }

    public void removerRoupa(String nome) {
        roupas.removeIf(roupa -> roupa.getNome().equals(nome));
    }
}
