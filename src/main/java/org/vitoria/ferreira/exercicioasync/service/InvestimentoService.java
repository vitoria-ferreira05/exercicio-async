package org.vitoria.ferreira.exercicioasync.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.vitoria.ferreira.exercicioasync.dto.CadastroProdutoDto;
import org.vitoria.ferreira.exercicioasync.model.Investimento;
import org.vitoria.ferreira.exercicioasync.repository.InvestimentoRespository;
import org.vitoria.ferreira.exercicioasync.validations.ValidacaoCadastroLote;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class InvestimentoService {
    @Autowired
    private InvestimentoRespository investimentoRespository;

    @Autowired
    private ValidacaoCadastroLote validacao;


    @Async
    public CompletableFuture<String> cadastrarProdutosEmLote(List<CadastroProdutoDto> produtos) {
        produtos.parallelStream().forEach(this::cadastrarProduto);
        return CompletableFuture.completedFuture(null);
    }

    public void cadastrarProduto(CadastroProdutoDto cadastroProdutoDto) {
        Investimento produto = new Investimento();
        produto.setNomeProduto(cadastroProdutoDto.nomeProduto());
        produto.setClasseInvestimento(cadastroProdutoDto.classeInvestimento());
        validacao.validarCadastro(cadastroProdutoDto);
        investimentoRespository.save(produto);
    }
}
