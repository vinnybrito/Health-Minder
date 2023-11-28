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
@Table(name = "TB_PLANO_SAUDE")
public class RegistroSaude {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PLANO_SAUDE")
    private Long id;

    @NotBlank(message = "O objetivo não pode estar em branco")
    @Column(name = "OBJ_PLANO_SAUDE")
    private String objetivosSaude;

    @NotBlank(message = "As restrições alimentares não podem estar em branco")
    @Column(name = "RESTRICAO_ALIMENTAR")
    private String restricoesAlimentares;

    @NotBlank(message = "O histórico médico não pode estar em branco")
    @Column(name = "HISTORICO_MEDICO")
    private String historicoMedico;

}
