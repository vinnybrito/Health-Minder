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
import jakarta.validation.constraints.Pattern;
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

    @NotBlank(message = "O nome não pode estar em branco")
    @Column(name = "NM_USUARIO")
    private String nome;

    @NotNull(message = "A idade não pode estar em branco")
    @Column(name = "IDADE_USUARIO")
    private int idade;

    @NotBlank(message = "O sexo não pode estar em branco")
    @Column(name = "SEXO_USUARIO")
    private String sexo;

    @NotNull(message = "A altura não pode estar em branco")
    @Column(name = "ALTURA_USUARIO")
    private double altura;

    @NotNull(message = "O peso não pode estar em branco")
    @Column(name = "PESO_USUARIO")
    private double peso;

    @NotNull(message = "O tipo sanguineo não pode estar em branco")
    @Column(name = "TP_SANGUINEO_USUARIO")
    private String tipoSanguineo;

    @Size(min = 8, max = 12, message = "O número de contato deve ter entre 8 e 12 digitos")
    @Column(name = "NM_CT_USUARIO")
    private String numContato;

    @Pattern(regexp = "\\d{5}-\\d{3}", message = "O CEP deve estar no formato XXXXX-XXX")
    @Column(name = "CEP_USUARIO")
    private String cep;

    @Column(name = "ESTADO_USUARIO")
    private String estado;

    @Column(name = "CIDADE_USUARIO")
    private String cidade;

    @ManyToOne
    @JoinColumn(name = "PLANO_REFEICAO")
    private PlanoRefeicao planoRefeicao;

    @ManyToOne
    @JoinColumn(name = "REGISTRO_SAUDE")
    private RegistroSaude registroSaude;

    // -------- Métodos -------- //

    public Usuario withCpf(Long id) {
        this.id = id;
        return this;
    }

    public Usuario withNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Usuario withIdade(int idade) {
        this.idade = idade;
        return this;
    }

    public Usuario withSexo(String sexo) {
        this.sexo = sexo;
        return this;
    }

    public Usuario withAltura(double altura) {
        this.altura = altura;
        return this;
    }

    public Usuario withPeso(double peso) {
        this.peso = peso;
        return this;
    }

    public Usuario withTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
        return this;
    }

    public Usuario withNumContato(String numContato) {
        this.numContato = numContato;
        return this;
    }

    public Usuario withCep(String cep) {
        this.cep = cep;
        return this;
    }

    public Usuario withEstado(String estado) {
        this.estado = estado;
        return this;
    }

    public Usuario withCidade(String cidade) {
        this.cidade = cidade;
        return this;
    }

    public Usuario withPlanoRefeicao(PlanoRefeicao planoRefeicao) {
        this.planoRefeicao = planoRefeicao;
        return this;
    }

    public Usuario withRegistroSaude(RegistroSaude registroSaude) {
        this.registroSaude = registroSaude;
        return this;
    }

}
