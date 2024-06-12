@echo off

REM Limpar e construir o projeto Maven ignorando os testes
call mvnw.cmd clean package -DskipTests

REM Construir a imagem Docker
docker build -t football-score-api .

REM Iniciar os contêineres com Docker Compose
docker-compose up --build
