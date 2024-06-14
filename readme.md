
# TesteTecnicoStudioSolGabrielSilveira


## Sobre o Projeto

  Uma aplicação  desenvolvida para calcular o número de combinações possíveis de pontuações em um jogo de futebol americano, com base nos critérios fornecidos.

## Tecnologias e Ferramentas Utilizadas

- **Spring Boot**: Framework para desenvolvimento de aplicações Spring com mais facilidade e rapidez.
- **Maven**: Gerenciador de dependências e ferramenta de build.
- **Docker**: Plataforma para desenvolver, enviar e executar aplicações dentro de contêineres.
- **Docker Compose**: Ferramenta para definir e gerenciar multi-contêineres Docker.

## Dependências Principais

- `spring-boot-starter-web`: Starter para construir aplicações web, incluindo RESTful, usando Spring MVC.
- `spring-boot-starter-data-jpa`: Starter para usar Spring Data JPA com Hibernate.
- `mysql-connector-java`: Driver JDBC para MySQL.
- `spring-boot-starter-test`: Starter para testar aplicações Spring Boot.

## Como Executar o Projeto

### Pré-requisitos

- JDK 17
- Maven
- Docker
- Docker Compose

### Passos para Execução

1. **Clonar o Repositório:**
    Para clonar o repositório utilize a ferramenta de sua escolha, como por exemplo o Git Bash. 
    Em caso de uso do Git Bash, abra-o e execute os seguintes comandos:
   ```sh
   git clone [https://github.com/gs10111/TesteTecnicoStudioSolGabrielSilveira.git]
   cd TesteTecnicoStudioSolGabrielSilveira
   ```

2. **Instalar e Configurar Maven**
    !!se necessario!!
    Veja este vídeo para instalar e configurar o Maven: [Configurar Maven](https://youtu.be/-ucX5w8Zm8s?si=wZOMlt_dxS31dfBx)

3. **Compilar e Construir o Projeto e Imagem Docker:**

    Execute o script `build_and_run.bat` para limpar, compilar e construir a imagem Docker da aplicação e iniciar os contêineres:
   ```sh
   ./build_and_run.bat
   ```
   Certifique-se atraves do DocekrHub que os contêineres testetecnicostudiosolgabrielsilveira e football-score-api estao em status Running

4. **Acessar a Aplicação:**
   - http://localhost:8080/verify

5. **Testando a API**

    Você pode testar a API utilizando uma ferramenta como [Postman](https://www.postman.com/) ou [curl](https://curl.se/). Aqui está um exemplo de como fazer uma requisição utilizando `postman`:

    ```Atraves do postman
     POST http://localhost:8080/verify json'
    {
    "score": "3x15"
    }'
    ```

    A resposta será algo como:
    ```json
    {
        "combinations": 4
    }
    ```

### Banco de Dados

O projeto utiliza um banco de dados MySQL configurado no `docker-compose.yml`. Certifique-se de que as variáveis de ambiente estão configuradas corretamente:
!!banco em nuuvem!!
```yaml
    environment:
      - SPRING_DATASOURCE_URL=jdbc:mysql://arfo8ynm6olw6vpn.cbetxkdyhwsb.us-east-1.rds.amazonaws.com:3306/ws7a44bs27asklgs
      - SPRING_DATASOURCE_USERNAME=ia0wc0ah6hnmwatb
      - SPRING_DATASOURCE_PASSWORD=qvdevqd4ttf4l42s
      - SPRING_JPA_HIBERNATE_DDL_AUTO=update
      - SPRING_JPA_SHOW_SQL=true
      - SPRING_JPA_PROPERTIES_HIBERNATE_DIALECT=org.hibernate.dialect.MySQL8Dialect
```

### Configurações e Informações Adicionais

- **Arquivo de Configuração**:
  - Localizado em `src/main/resources/application.properties`.
  - Contém configurações do banco de dados, parâmetros de inicialização e outras configurações específicas do Spring.

### Parando os Contêineres

Para parar e remover os contêineres Docker, utilize o comando abaixo:

```sh
docker-compose down
```

### Executando Testes

Para executar os testes da aplicação, utilize o comando:

```sh
mvn test
```

## Problemas Comuns

### Porta 3306 Ocupada

Se você encontrar um erro indicando que a porta 3306 já está em uso, certifique-se de que não há outra instância do MySQL rodando na sua máquina. Você pode alterar a porta no arquivo `docker-compose.yml` se necessário.

### Variáveis de Ambiente

Certifique-se de que as variáveis de ambiente para o banco de dados estão configuradas corretamente no `docker-compose.yml`.

### Erros de Compilação

Certifique-se de que as variáveis de ambiente estao configuradas em seu computador.

## Contato

- **Email**: gsilveira551@gmail.com
