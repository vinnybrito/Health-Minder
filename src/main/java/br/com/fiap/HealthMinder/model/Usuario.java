package br.com.fiap.HealthMinder.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TB_USUARIO")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USUARIO")
    private long id;

    @NotBlank(message = "O CPF não pode estar em branco")
    @Column(name = "CPF_USUARIO")
    @Size(min = 11, max = 11, message = "O CPF deve ter 11 numeros")
    private String cpf;

    @NotBlank(message = "O nome não pode estar em branco")
    @Column(name = "NM_USUARIO")
    private String nome;

    @NotBlank(message = "O sexo não pode estar em branco")
    @Column(name = "SEXO_USUARIO")
    private String sexo;

    @NotNull(message = "A altura não pode estar em branco")
    @Column(name = "ALTURA_USUARIO")
    private double altura;

    @NotNull(message = "O peso não pode estar em branco")
    @Column(name = "PESO_USUARIO")
    private double peso;

    @ManyToOne
    @JoinColumn(name = "PLANO_REFEICAO")
    private PlanoRefeicao planoRefeicao;

    @ManyToOne
    @JoinColumn(name = "REGISTRO_SAUDE")
    private RegistroSaude registroSaude;

}
