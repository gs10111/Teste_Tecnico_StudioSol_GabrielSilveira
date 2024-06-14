@echo off

REM Limpar e construir o projeto Maven com testes
call mvnw.cmd clean package

REM Construir a imagem Docker
docker build -t football-score-api .

REM Iniciar os contêineres com Docker Compose
docker-compose up --build
