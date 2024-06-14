# TesteTecnicoStudioSolGabrielSilveira

Descrição
Este projeto é uma API web desenvolvida em Java utilizando Spring Boot. A API calcula o número de combinações possíveis de pontuações em um jogo de futebol americano, com base nos critérios fornecidos.

Pré-requisitos
Antes de começar, certifique-se de ter as seguintes ferramentas instaladas em seu ambiente de desenvolvimento:

Java 17
Maven
Docker
Docker Compose
Passo a Passo
1. Clone o Repositório
Clone o repositório do projeto para a sua máquina local usando o comando abaixo:

sh
Copy code
git clone <URL_DO_REPOSITORIO>
cd TesteTecnicoStudioSolGabrielSilveira
2. Configuração do Banco de Dados
O projeto utiliza um banco de dados MySQL. O docker-compose.yml já está configurado para iniciar um contêiner MySQL.

3. Build do Projeto
Execute o seguinte comando para limpar e construir o projeto, garantindo que todos os testes sejam executados:

sh
Copy code
mvn clean package
4. Build e Iniciar os Contêineres com Docker Compose
Execute o comando abaixo para construir a imagem Docker da aplicação e iniciar os contêineres:

sh
Copy code
docker-compose up --build
Este comando irá:

Construir a imagem Docker da aplicação.
Iniciar os contêineres para a aplicação e o banco de dados MySQL.
5. Acessar a API
Após iniciar os contêineres, a API estará disponível no seguinte endereço:

bash
Copy code
http://localhost:8080/verify
6. Testando a API
Você pode testar a API utilizando uma ferramenta como Postman ou curl. Aqui está um exemplo de como fazer uma requisição utilizando curl:

sh
Copy code
curl -X POST http://localhost:8080/verify -H "Content-Type: application/json" -d '{"score": "3x15"}'
A resposta será algo como:

json
Copy code
{
    "combinations": 4
}
7. Parando os Contêineres
Para parar e remover os contêineres Docker, utilize o comando abaixo:

sh
Copy code
docker-compose down
8. Executando Testes
Para executar os testes da aplicação, utilize o comando:

sh
Copy code
mvn test
Problemas Comuns
Porta 3306 Ocupada
Se você encontrar um erro indicando que a porta 3306 já está em uso, certifique-se de que não há outra instância do MySQL rodando na sua máquina. Você pode alterar a porta no arquivo docker-compose.yml se necessário.

Variáveis de Ambiente
Certifique-se de que as variáveis de ambiente para o banco de dados estão configuradas corretamente no docker-compose.yml:

yaml
Copy code
environment:
  MYSQL_DATABASE: your_database_name
  MYSQL_USER: your_username
  MYSQL_PASSWORD: your_password
  MYSQL_ROOT_PASSWORD: your_root_password
Erros de Compilação
Se encontrar erros de compilação, certifique-se de que todas as dependências estão corretamente definidas no pom.xml.
