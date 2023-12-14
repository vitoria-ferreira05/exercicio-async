package org.vitoria.ferreira.exercicioasync.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.vitoria.ferreira.exercicioasync.dto.CadastroProdutoDto;
import org.vitoria.ferreira.exercicioasync.exception.InvestimentoException;
import org.vitoria.ferreira.exercicioasync.service.InvestimentoService;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/investimento")
public class InvestimentoController {
    @Autowired
    private InvestimentoService investimentoService;

    @PostMapping
    public CompletableFuture<String> cadastrarProdutos(@RequestBody @Valid List<CadastroProdutoDto> produtos) throws InvestimentoException {
        return investimentoService.cadastrarProdutosEmLote(produtos);
    }

}
