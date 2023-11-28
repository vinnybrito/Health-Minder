# Health Minder API

Bem-vindo à documentação da **Helath Minder**! Esta API fornece informações de usuarios. Abaixo, você encontrará detalhes sobre as principais classes e endpoints disponíveis.

## Descrição do projeto


O HealthMinder é um aplicativo imersivo que combina tecnologia, gamificação e recursos de RV e RA para ajudar as pessoas a cuidarem melhor de sua saúde. Ele oferece um ambiente envolvente e motivador que torna o autocuidado e a promoção da saúde mais acessíveis e atraentes. Através de uma abordagem personalizada e interativa, o aplicativo pode inspirar os usuários a adotarem um estilo de vida mais saudável e a se preocuparem mais com sua saúde.

## Escopo do produto

## Classes

### `Usuario`

A classe `Usuario` contém informações detalhadas sobre os usuario da plataforma.

**Atributos:**

- `id`: O identificador único do usuario.

- `cpf`: O CPF do usuario.

- `nome`: O nome do usuario.

- `sexo`: O sexo do usuario.

- `altura`: A altura do usuario.

- `peso`: O peso do usuario.

### `plano`

A classe `PlanoRefeicao` contém informações sobre os planos da plataforma.

**Atributos:**

- `id`: O identificador único do plano.

- `descricaoplano`: A descrição do plano.

### `RegistroSaude`

A classe `RegistroSaude` contém informações sobre os registros de saude do usuario na plataforma.

**Atributos:**

- `id`: O identificador único do registro de saude.

- `usuario`: O relacionamento único entre a classe usuario e RegistroSaude.

- `objetivosSaude`: Os objetivos de saude do usuario.

- `restricoesAlimentares`: As restrições alimentares do usuario.

- `historicoMedico`: O  histórico médico do usuario.

# Endpoints

## Métodos GET

- `GET /usuario`: Retorna uma lista de todos os usuario.
  
- `GET /usuario/{id}`: Retorna detalhes sobre um usuario específico com base no ID.

- `GET /registrosaude`: Retorna uma lista de todos os registros de saude.
  
- `GET /registrosaude/{id}`: Retorna detalhes sobre um registros de saude específico com base no ID.

- `GET /plano`: Retorna uma lista de todos os planos.
  
- `GET /plano/{id}`: Retorna detalhes sobre um plano específico com base no ID.

## Métodos Post
  
- `POST /usuario`: Cria um novo usuario com base nos dados fornecidos.

- `POST /plano`: Cria um novo plano com base nos dados fornecidos.

- `POST /registrosaude`: Cria um novo registro de saude com base nos dados fornecidos.

## Métodos PUT
  
- `PUT /usuario/{id}`: Atualiza os detalhes de um usuario existente com base no ID.

- `PUT plano/{id}`: Atualiza os detalhes de um plano existente com base no ID.

- `PUT registrosaude/{id}`: Atualiza os detalhes de um registro de saude existente com base no ID.

## Métodos DELETE
  
- `DELETE /usuario/{id}`: Exclui um usuario com base no ID.

- `DELETE /PlanoRefeicao/{id}`: Exclui um Plano com base no ID.

- `DELETE /registrosaude/{id}`: Exclui um registro de saude com base no ID.

Lembre-se de incluir os parâmetros necessários na sua solicitação para obter os resultados desejados.

## Exemplo JSON

Aqui está um exemplo da estrutura JSON representando as informações do `usuario`:

```json
{
    "id": "Long",
    "cpf": "String",
    "nome": "String",
    "sexo": "String",
    "altura": "double ",
    "peso": "double ",
}
```

Aqui está um exemplo da estrutura JSON representando as informações do `PlanoRefeicao`:

```json
{
    "id": "Long",
    "usuario": "Usuario",
    "nomeRefeicao": "String"
}
```

Aqui está um exemplo da estrutura JSON representando as informações do `RegistroSaude`:

```json
{
    "id": "Long",
    "usuario": "Usuario",
    "objetivosSaude": "String",
    "restricoesAlimentares": "String",
    "historicoMedico": "String"
}
```

## Códigos de retorno(usuario, RegistroSaude e PlanoRefeicao)

- 200: Conexão e resposta bem-sucedidas.
- 201: Registrado com sucesso.
- 400: Dados inválidos ou ausentes fornecidos.
- 404: Página ou recurso não encontrado.
- 405: Acesso restrito ao recurso.
- 500: Erro interno do servidor.
