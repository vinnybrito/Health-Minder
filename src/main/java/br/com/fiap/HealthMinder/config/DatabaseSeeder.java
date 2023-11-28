package br.com.fiap.HealthMinder.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.fiap.HealthMinder.model.PlanoRefeicao;
import br.com.fiap.HealthMinder.model.RegistroSaude;
import br.com.fiap.HealthMinder.model.Usuario;
import br.com.fiap.HealthMinder.repository.PlanoRefeicaoRepository;
import br.com.fiap.HealthMinder.repository.RegistroSaudeRepository;
import br.com.fiap.HealthMinder.repository.UsuarioRepository;

@Configuration
public class DatabaseSeeder implements CommandLineRunner {

    @Autowired
    UsuarioRepository usuario;

    @Autowired
    RegistroSaudeRepository registroSaude;

    @Autowired
    PlanoRefeicaoRepository planoRefeicao;

    private PlanoRefeicao pl1 = new PlanoRefeicao(null, "Janta");
    private PlanoRefeicao pl2 = new PlanoRefeicao(null, "Café da Manhã");
    private PlanoRefeicao pl3 = new PlanoRefeicao(null, "Café da Tarde");
    private PlanoRefeicao pl4 = new PlanoRefeicao(null, "Almoço");
    private PlanoRefeicao pl5 = new PlanoRefeicao(null, "janta");
    private PlanoRefeicao pl6 = new PlanoRefeicao(null, "Café da Manhã");

    private RegistroSaude rs1 = new RegistroSaude(null, "Emagrecer", "Carboidrato", "Colesterol alto");
    private RegistroSaude rs2 = new RegistroSaude(null, "Cortar açucar", "Glicose", "Diabete");
    private RegistroSaude rs3 = new RegistroSaude(null, "emagrecer", "Carboidrato", "Colesterol alto");
    private RegistroSaude rs4 = new RegistroSaude(null, "emagrecer", "Carboidrato", "Colesterol alto");
    private RegistroSaude rs5 = new RegistroSaude(null, "emagrecer", "Carboidrato", "Colesterol alto");
    private RegistroSaude rs6 = new RegistroSaude(null, "emagrecer", "Carboidrato", "Colesterol alto");

    @Override
    public void run(String... args) throws Exception {

        planoRefeicao.saveAll(
                List.of(pl1, pl2, pl3, pl4, pl5, pl6));

        registroSaude.saveAll(
                List.of(rs1, rs2, rs3, rs4, rs5, rs6));

        usuario.saveAll(
                List.of(
                    new Usuario()
                            .withNome("Vinicius")
                            .withIdade(22)
                            .withSexo("Masculino")
                            .withAltura(1.78)
                            .withPeso(98.5)
                            .withTipoSanguineo("A+")
                            .withNumContato("11981695726")
                            .withCep("08380-048")
                            .withEstado("SP")
                            .withCidade("São Paulo")
                            .withPlanoRefeicao(pl1)
                            .withRegistroSaude(rs1),
                    new Usuario()
                            .withNome("Gustavo")
                            .withIdade(18)
                            .withSexo("Masculino")
                            .withAltura(1.70)
                            .withPeso(78.0)
                            .withTipoSanguineo("B-")
                            .withNumContato("11981695726")
                            .withCep("08380-078")
                            .withEstado("SP")
                            .withCidade("Guarulhos")
                            .withPlanoRefeicao(pl2)
                            .withRegistroSaude(rs2),
                    new Usuario()
                            .withNome("Vanessa")
                            .withIdade(19)
                            .withSexo("Feminino")
                            .withAltura(1.64)
                            .withPeso(57.7)
                            .withTipoSanguineo("O+")
                            .withNumContato("11981412726")
                            .withCep("14580-023")
                            .withEstado("PR")
                            .withCidade("Maringá")
                            .withPlanoRefeicao(pl3)
                            .withRegistroSaude(rs3),
                    new Usuario()
                            .withNome("Patricia")
                            .withIdade(45)
                            .withSexo("Feminino")
                            .withAltura(1.80)
                            .withPeso(72.5)
                            .withTipoSanguineo("AB")
                            .withNumContato("11988595726")
                            .withCep("02380-158")
                            .withEstado("SP")
                            .withCidade("Santo André")
                            .withPlanoRefeicao(pl4)
                            .withRegistroSaude(rs4),
                    new Usuario()
                            .withNome("Junior")
                            .withIdade(18)
                            .withSexo("Masculino")
                            .withAltura(1.94)
                            .withPeso(121.5)
                            .withTipoSanguineo("B-")
                            .withNumContato("11981695726")
                            .withCep("02580-077")
                            .withEstado("MG")
                            .withCidade("Belo Horizonte")
                            .withPlanoRefeicao(pl5)
                            .withRegistroSaude(rs5),
                    new Usuario()
                            .withNome("Leticia")
                            .withIdade(34)
                            .withSexo("Feminina")
                            .withAltura(1.69)
                            .withPeso(62.5)
                            .withTipoSanguineo("O+")
                            .withNumContato("11981674116")
                            .withCep("07879-033")
                            .withEstado("SP")
                            .withCidade("São Paulo")
                            .withPlanoRefeicao(pl6)
                            .withRegistroSaude(rs6)

                ));
    
    }

}
