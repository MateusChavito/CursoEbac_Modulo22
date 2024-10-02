# 📋 Projeto de Filtragem de Nomes e Sexos

Este projeto é uma aplicação Java que solicita ao usuário que insira os nomes e sexos de seis pessoas no formato "Nome,Sexo" e exibe a lista de mulheres. Além disso, o projeto inclui testes automatizados para garantir que a filtragem funcione corretamente.

## 🔧 Funcionalidades

- **Entrada de Dados**: Permite ao usuário inserir os nomes e sexos de até 6 pessoas.
- **Filtragem de Dados**: Utiliza Streams para filtrar e exibir apenas os nomes das mulheres.
- **Testes Automatizados**: Inclui testes JUnit para verificar se a lista de mulheres está correta.

## 📋 Tecnologias Usadas

- **Java**: Linguagem de programação utilizada para desenvolver a aplicação.
- **JUnit**: Framework de testes utilizado para garantir a qualidade do código.

## 📊 Estrutura do Projeto

- **Classe `Main`**: Contém o método principal que gerencia a entrada do usuário e a filtragem da lista de mulheres.
- **Classe `MainTest`**: Contém os testes automatizados que verificam se a filtragem de mulheres está funcionando conforme o esperado.
- **Arquivo `pom.xml`**: Configuração do Maven para gerenciar dependências e o projeto.

## 🛠️ Como Usar

1. Compile o projeto utilizando Maven.
2. Execute a classe `Main` para iniciar a coleta de dados.
3. Siga as instruções para inserir os dados no formato "Nome,Sexo".
4. O programa exibirá a lista de mulheres com base nas entradas fornecidas.
5. Para executar os testes, utilize o comando de teste do Maven.
