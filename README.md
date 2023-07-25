<<<<<<< Updated upstream
# t4-compila-dores
 
=======
# Trabalho 4 - Compiladores

## Alunos e RAs

- Bruno Matos de Souza - 769754
- Eduardo Minoru Takeda - 776857
- Fernando Eiji Hieda - 769768

## Sobre

O objetivo deste projeto é escrever a segunda parte de um analisador semântico, iniciado no Trabalho 3, capaz de analisar programas na linguagem LA (Linguagem Algorítmica) desenvolvida pelo prof. Jander, no âmbito do DC/UFSCar. A partir de um código fonte, o analisador detecta erros semânticos de 5 tipos adicionais, indicando a linha e o motivo de determinadas falhas. Diferentemente do analisador sintático, o programa será executado por completo, ao invés de parar imediatamente, e serão indicados todos os erros encontrados, e não apenas o primeiro.

Os novos tipos de erros semânticos a serem identificados são:
- Identificador já declarado no escopo, porém com a adição de ponteiros, registros e funções
- Identificador ainda não declarado, porém com a adição de ponteiros, registros e funções
- Incompatibilidade entre argumentos e parâmetros na chamada de um procedimento ou uma função
- Incompatibilidade entre o tipo da variável e a atribuição de seu valor, agora envolvendo ponteiros e registros
- Chamada do comando "retorne" fora do escopo


Os principais arquivos responsáveis pela conclusão do projeto são:

Alguma.g4 - contém as regras para a gramática da linguagem LA, como identificadores, constantes, operações e parâmetros, assim como a definição de início e fim de comentários, início e fim do próprio programa, e erros possíveis que podem ser encontrados, como CADEIA_NAO_FECHADA, COMENTARIO_NAO_FECHADO e SIMBOLO_NAO_IDENTIFICADO.

AlgumaSemantico.java e AlgumaSemanticoUtils.java - Realizam as checagens necessárias para identificar tanto a ocorrência, quanto o tipo de erro semântico no código analisado.

TabelaDeSimbolos.java - Responsável pela criação e manipulação de tabelas de símbolos que serão utilizadas em pilha para a identificação de erros semânticos.

Principal.java - contém a função principal do código que lê os arquivos de entrada e gera os arquivos de saída contendo as mensagens de erro para cada programa analisado.

## Pré-Requisitos

- Java 11
- ANTLR 4.11.1
- Maven 4.0.0

## Instalação de Dependências

Instalar JDK 11.0.18 de alguma fonte.

## Execução do programa

Use este comando para compilar o .jar do programa
```
mvn package
```

Para executar o programa .jar use
```
java -jar \caminho-do-diretorio\alguma-lexico\target\alguma-lexico-1.0-SNAPSHOT-jar-with-dependencies.jar \caminho_do_arquivo-de-entrada\entrada.txt \caminho_do_arquivo-de-saida\saida.txt
```

 
>>>>>>> Stashed changes
