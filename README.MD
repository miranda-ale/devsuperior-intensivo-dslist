# DSList

DSList é uma aplicação Java Spring Boot para gerenciar listas de jogos.

## Estrutura do Projeto

```
.gitattributes
.gitignore
.idea/
    .gitignore
    compiler.xml
    encodings.xml
    jarRepositories.xml
    misc.xml
    vcs.xml
    workspace.xml
.mvn/
    wrapper/
        .mvn/wrapper/maven-wrapper.properties
HELP.md
mvnw
mvnw.cmd
pom.xml
src/
    main/
        java/
            br/
                com/
                    example/
                        dslist/
                            controllers/
                            dto/
                            entities/
                            projections/
                            repositories/
                            services/
        resources/
            application-test.properties
            application.properties
            import.sql
    static/
    templates/
test/
    java/
target/
    classes/
        src/main/resources/application-test.properties
        src/main/resources/application.properties
        br/
    src/main/resources/import.sql
    generated-sources/
        annotations/
    test-classes/
        br/
```

## Dependências

- Spring Boot Starter Data JPA
- Spring Boot Starter Web
- H2 Database
- PostgreSQL
- Spring Boot Starter Test

## Configuração

### Banco de Dados

A aplicação utiliza H2 Database para testes e PostgreSQL para produção. As configurações do banco de dados podem ser encontradas nos arquivos `application.properties` e `application-test.properties` em `src/main/resources`.

### Importação de Dados

O arquivo `import.sql` em `src/main/resources` contém dados iniciais para popular o banco de dados.

## Executando a Aplicação

Para executar a aplicação, utilize o Maven Wrapper:

```sh
./mvnw spring-boot:run
```

## Endpoints

### GameController

- `GET /games`: Retorna uma lista de jogos.
- `GET /games/{id}`: Retorna os detalhes de um jogo específico.

### GameListController

- `GET /lists`: Retorna uma lista de listas de jogos.
- `GET /lists/{listId}/games`: Retorna os jogos de uma lista específica.

## Estrutura do Código

### Controllers

- `GameController`: Controlador para operações relacionadas a jogos.
- `GameListController`: Controlador para operações relacionadas a listas de jogos.

### DTOs

- `GameDTO`: Data Transfer Object para detalhes de jogos.
- `GameMinDTO`: Data Transfer Object para informações mínimas de jogos.
- `GameListDTO`: Data Transfer Object para listas de jogos.

### Entities

- `Game`: Entidade representando um jogo.
- `GameList`: Entidade representando uma lista de jogos.
- `Belonging`: Entidade representando a relação entre jogos e listas.
- `BelongingPK`: Chave primária composta para a entidade Belonging.

### Services

- `GameService`: Serviço para operações relacionadas a jogos.
- `GameListService`: Serviço para operações relacionadas a listas de jogos.

### Repositories

- `GameRepository`: Repositório para a entidade Game.
- `GameListRepository`: Repositório para a entidade GameList.

### Projections

- `GameMinProjection`: Projeção para informações mínimas de jogos.