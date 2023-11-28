package br.com.fiap.HealthMinder.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TB_PLANO_REFEICAO")
public class PlanoRefeicao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PLANO_REFEICAO")
    private Long id;

    @NotBlank(message = "O tipo de refeição não pode estar em branco")
    @Column(name = "NM_REFEICAO")
    private String nomeRefeicao;

}
