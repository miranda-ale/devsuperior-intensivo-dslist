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
            application-dev.properties
            application-prod.properties
            application-test.properties
            application.properties
            import.sql
test/
    java/
target/
    classes/
        src/main/resources/application-dev.properties
        src/main/resources/application-prod.properties
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

A aplicação utiliza H2 Database para testes e PostgreSQL para produção. As configurações do banco de dados podem ser encontradas nos arquivos `application-dev.properties`, `application-prod.properties`, `application-test.properties` e `application.properties` em `src/main/resources`.

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
- `POST /lists/{listId}/replacement`: Move um jogo dentro de uma lista.

## Estrutura do Código

### Controllers

- [`GameController`](src/main/java/br/com/example/dslist/controllers/GameController.java): Controlador para operações relacionadas a jogos.
- [`GameListController`](src/main/java/br/com/example/dslist/controllers/GameListController.java): Controlador para operações relacionadas a listas de jogos.

### DTOs

- [`GameDTO`](src/main/java/br/com/example/dslist/dto/GameDTO.java): Data Transfer Object para detalhes de jogos.
- [`GameMinDTO`](src/main/java/br/com/example/dslist/dto/GameMinDTO.java): Data Transfer Object para informações mínimas de jogos.
- [`GameListDTO`](src/main/java/br/com/example/dslist/dto/GameListDTO.java): Data Transfer Object para listas de jogos.
- [`ReplacementeDTO`](src/main/java/br/com/example/dslist/dto/ReplacementeDTO.java): Data Transfer Object para movimentação de jogos dentro de uma lista.

### Entities

- [`Game`](src/main/java/br/com/example/dslist/entities/Game.java): Entidade representando um jogo.
- [`GameList`](src/main/java/br/com/example/dslist/entities/GameList.java): Entidade representando uma lista de jogos.
- [`Belonging`](src/main/java/br/com/example/dslist/entities/Belonging.java): Entidade representando a relação entre jogos e listas.
- [`BelongingPK`](src/main/java/br/com/example/dslist/entities/BelongingPK.java): Chave primária composta para a entidade Belonging.

### Services

- [`GameService`](src/main/java/br/com/example/dslist/services/GameService.java): Serviço para operações relacionadas a jogos.
- [`GameListService`](src/main/java/br/com/example/dslist/services/GameListService.java): Serviço para operações relacionadas a listas de jogos.

### Repositories

- [`GameRepository`](src/main/java/br/com/example/dslist/repositories/GameRepository.java): Repositório para a entidade Game.
- [`GameListRepository`](src/main/java/br/com/example/dslist/repositories/GameListRepository.java): Repositório para a entidade GameList.

### Projections

- [`GameMinProjection`](src/main/java/br/com/example/dslist/projections/GameMinProjection.java): Projeção para informações mínimas de jogos.