package org.vitoria.ferreira.exercicioasync.model;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.vitoria.ferreira.exercicioasync.model.enums.ClasseInvestimento;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "investimentos")

public class Investimento {

    @Id
    private String id;
    private String nomeProduto;
    private ClasseInvestimento classeInvestimento;
}
