package org.vitoria.ferreira.exercicioasync.validations;

import org.springframework.stereotype.Component;
import org.vitoria.ferreira.exercicioasync.dto.CadastroProdutoDto;
import org.vitoria.ferreira.exercicioasync.exception.InvestimentoException;

@Component
public class ValidacaoCadastroProduto implements ValidacaoCadastroLote {
    @Override
    public void validarCadastro(CadastroProdutoDto cadastroProdutoDto) {
        if (cadastroProdutoDto.nomeProduto() == null || cadastroProdutoDto.nomeProduto().trim().isEmpty()) {
            throw new InvestimentoException("O nome do produto nao pode ser nulo ou vazio.");
        } else if (cadastroProdutoDto.classeInvestimento() == null) {
            throw new InvestimentoException("Classe investimento invalida");
        }
    }
}
