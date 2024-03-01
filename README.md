<h1 align="center">
 api-management-cars
</h1>
<p align="center">
<img src="https://img.shields.io/badge/Java11-red"> <img src="https://img.shields.io/badge/SpringBoot-blue">
</p>

### Tópicos 
:small_blue_diamond: [Descrição do projeto](#descrição-do-projeto)

:small_blue_diamond: [Funcionalidades](#funcionalidades)

:small_blue_diamond: [Deploy da Aplicação](#deploy-da-aplicação-dash)

:small_blue_diamond: [Pré-requisitos](#pré-requisitos)

:small_blue_diamond: [Como rodar a aplicação](#como-rodar-a-aplicação-arrow_forward)

## Descrição do projeto
<p align="justify">
Contrução uma API em <i>JAVA 11</i> para gerenciar carros. para que assim se tenha controle de novos veiculos em aquisicao.
</p>

## Funcionalidades

:heavy_check_mark: Construção de uma API 

:heavy_check_mark: Gerenciamento de carros

:heavy_check_mark: listagem de carros 

:heavy_check_mark: cadastro de carros

:heavy_check_mark: Troca de Status

:heavy_check_mark: Detalhes dos veiculos

:heavy_check_mark: Deleçao logica

## Pré-requisitos

:warning: [Java11](https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html)

:warning: [JDK](https://jdk.java.net/11/)

:warning: [IDE IntelliJ](https://www.jetbrains.com/idea/download/)

:warning: [Insominia](https://insomnia.rest/download)

:warning: [Docker](https://www.docker.com/products/docker-desktop/)


## Como rodar a aplicação :arrow_forward:

No terminal, clone o projeto: 

```
https://github.com/bielmoita/api-management-cars
```

Abra o Docker em seu computador.
Aponte para a pasta do projeto clonado

Acesse o diretorio criado, busque pelo arquivo: 
```
Dockerfile
```
pressione para rodar o projeto no Docker

Devera subir os status de LOGs do Spring.

Agora acesse a pasta de Collections e abra o Insominia em seu computador.
```
Collection-API-CAR.json
```

Use as collections sempre enviando para o endereco da aplicação
```
http://localhost:8080
```
Agora basta usar as collections e cadastrar quantos carros voce desejar, ver informações, excluir e etc.


Não se preocupe, quando você encerrar a aplicação o Banco de dados será <i>Resetado</i>, pois o mesmo estará rodando em sua memória. 

## Desenvolvedor :octocat:
[<img src="https://avatars2.githubusercontent.com/u/49874403?s=400&u=732c2387f6b14597528e693927cd5af874c144d4&v=4" width=115><br><sub>Gabriel Fernando</sub>](https://www.linkedin.com/in/gabriel-fernando-mcsilva/) 
