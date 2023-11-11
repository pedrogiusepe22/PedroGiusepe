package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roupas")
public class RoupaController {
    private final RoupaRepository roupaRepository;

    @Autowired
    public RoupaController(RoupaRepository roupaRepository) {
        this.roupaRepository = roupaRepository;
    }

    @GetMapping
    public List<Roupa> listarRoupas() {
        return roupaRepository.listarRoupas();
    }

    @PostMapping
    public Roupa cadastrarRoupa(@RequestBody Roupa roupa) {
        return roupaRepository.cadastrarRoupa(roupa);
    }

    @DeleteMapping
    public void removerRoupa(@RequestParam String nome) {
        roupaRepository.removerRoupa(nome);
    }
}