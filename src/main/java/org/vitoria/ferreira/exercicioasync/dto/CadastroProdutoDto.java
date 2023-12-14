package org.vitoria.ferreira.exercicioasync.dto;

import org.vitoria.ferreira.exercicioasync.model.enums.ClasseInvestimento;

public record CadastroProdutoDto(String nomeProduto, ClasseInvestimento classeInvestimento) {

}
