# ☕♨ Roteiro de aula — Unidade Temática #1: Linguagem de Programação Java  

## 📑 Sumário

- [Iniciar](#️-iniciar)
  - [⚙️ Configuração do ambiente de desenvolvimento](#️-configuração-do-ambiente-de-desenvolvimento)
  - [👩🏻‍💻 Primeiro programa em Java](#-primeiro-programa-em-java)
- [Estrutura Sequencial](#estrutura-sequencial)
- [☕ 1. Introdução à sintaxe Java](#-1-introdução-à-sintaxe-java)
  - [🎯 Objetivo](#-objetivo)
  - [Estrutura Básica](#estrutura-básica)
  - [Variáveis e Tipos de Dados](#variáveis-e-tipos-de-dados)
  - [Exemplo Prático](#exemplo-prático)
- [2. Entrada e saída em Java](#2-entrada-e-saída-em-java)
  - [🎯 Objetivo](#-objetivo-1)
  - [Entrada: classe Scanner](#entrada-classe-scanner-e-variável-in-da-classe-system)
  - [Saída: System.out e System.err](#saída-variáveis-out-e-err-da-classe-system)
- [3. Operadores Aritméticos](#3-operadores-aritméticos)
  - [🎯Objetivo](#objetivo)
  - [Operadores Disponíveis](#operadores-disponíveis)
  - [Exemplos Práticos](#exemplos-práticos)
- [4. Casting de Dados](#4-casting-de-dados)
  - [O que é Casting?](#o-que-é-casting)
  - [Exemplos de Conversão Implícita](#exemplos-de-conversão-implícita)
  - [Conversão Explícita (Casting Manual)](#conversão-explícita-casting-manual)
  - [Tabela de Castings Possíveis](#tabela-de-castings-possíveis)
- [📝 5. Exercícios de Fixação](#-5-exercícios-de-fixação)

---


>> 📅 Terça-feira, 8/4/2025 

# ▶️ Iniciar

## ⚙️ Configuração do ambiente de desenvolvimento

> *Faça o download do Java Development Kit (JDK)* — 🔗 [Download do JDK](https://www.oracle.com/java/technologies/downloads);

> *Descompacte o arquivo que contenha o diretório do JDK em um local de sua preferência (recomenda-se em C:\Program Files\Java*

> *Configure as variáveis de ambiente*

```plaintext
1. Clique com o botão direito em "Este Computador" e vá em "Propriedades".
2. Clique em "Configurações Avançadas do Sistema".
3. Clique em "Variáveis de Ambiente".
4. Em "Variáveis do Sistema", clique em "Novo".
5. Nome: JAVA_HOME | Valor: C:\Program Files\Java\jdk-XX
6. Clique em OK.
7. Em "Variáveis de Ambiente", abra a variável Path e acrescente o caminho "%JAVA_HOME\bin%".
8. Clique em OK.
```

> *Faça o download da IDE Eclipse* — 🔗 [Download do Eclipe](https://eclipseide.org);

> *Descompacte o Eclipse em um local de sua preferência*

> *Abra a ferramenta e configure a workspace*

#### Você tem um ambiente de desenvolvimento Java configurado 

---

## 👩🏻‍💻 Primeiro programa em Java

> *Crie um arquivo com a extensão .java com o nome HelloWord e coloque este conteúdo:*
```java
class MeuPrograma {
    public static void main(String[] args) {
        System.out.println("Minha primeira aplicação Java!");
    }
}
```

> *Experimente mudar o conteúdo da mensagem. Também, troque println por print e por printf.* 

---
---


# Estrutura Sequencial

## ☕ 1. Introdução à sintaxe Java

**🎯 Objetivo:** 
  Apresentar a estrutura básica de um programa Java e os conceitos fundamentais.

### Estrutura Básica
- Declaração de classes e métodos.
- Método `main` como ponto de entrada.
- Saída em Java com System.out.println.


### Variáveis e Tipos de Dados
- Tipos primitivos: `int`, `double`, `char`, `boolean`.
- Tabela de tipos, tamanho do dado (em bits) e intervalo numérico.

| Tipo     | Tamanho (bits) | Valor Mínimo                  | Valor Máximo                   |
|----------|----------------|-------------------------------|--------------------------------|
| `byte`   | 8              | -128                          | 127                            |
| `short`  | 16             | -32.768                       | 32.767                         |
| `int`    | 32             | -2.147.483.648                | 2.147.483.647                  |
| `long`   | 64             | -9.223.372.036.854.775.808    | 9.223.372.036.854.775.807      |
| `float`  | 32             | ~1.4 x 10⁻⁴⁵                  | ~3.4 x 10³⁸                    |
| `double` | 64             | ~4.9 x 10⁻³²⁴                 | ~1.8 x 10³⁰⁸                   |
| `char`   | 16             | 0 (caractere Unicode)         | 65.535                         |
| `boolean`| 1 (não especificado) | `false`                   | `true` |

- Declaração e inicialização de variáveis.

### Exemplo Prático
- Escrever um programa simples que declare variáveis de diferentes tipos.

---

## 2. Entrada e saída em Java
>> 📅 Terça-feira, 8/4/2025 

**🎯 Objetivo:**
Ensinar como interagir com o usuário, receber dados e exibir informações.

### Entrada: classe Scanner e variável estática in da classe System
- Importar e utilizar a classe `Scanner` para obter entrada do usuário.

### Saída: variáveis estáticas out e err da classe System
- System.out.println.
- System.out.print.
- System.out.printf.
- System.err.println.

⚠️ *Com System.out.printf, o uso da vírgula ou do ponto para indicar casas decimais depende da configuração de região do computador. É possível alterar isso diretamente no código com a classe Locale.*

---

## 3. Operadores Aritméticos

**🎯 Objetivo:**  
Apresentar os operadores aritméticos básicos da linguagem Java e como utilizá-los em expressões matemáticas.

### Operadores Disponíveis

| Operador | Descrição        | Exemplo (Java)       | Resultado |
|----------|------------------|----------------------|-----------|
| `+`      | Adição            | `5 + 3`              | `8`       |
| `-`      | Subtração         | `5 - 3`              | `2`       |
| `*`      | Multiplicação     | `5 * 3`              | `15`      |
| `/`      | Divisão           | `6 / 3`              | `2`       |
| `%`      | Módulo (resto)    | `5 % 2`              | `1`       |

> ⚠️ A divisão entre inteiros retorna apenas a parte inteira do resultado.

---

### Exemplos Práticos  
- Criar um programa que solicita dois números ao usuário, realiza a soma e exibe o resultado.

- Criar um programa que calcula e mostre o resultado das quatro operações básicas entre duas variáveis declaradas e inicializadas com valores lidos do teclado.

- Escreva um programa que solicita um número inteiro e mostra:

  - O dobro desse número.

  - A metade (utilizando divisão inteira).

  - O quadrado do número.

- Modifique o programa para que ele aceite números double e observe as diferenças nos resultados das divisões.

---


## 4. Casting de Dados

### O que é Casting?
Casting ou conversão de tipo é o processo de transformar um tipo de dado em outro. Em Java, essa conversão pode ser:

> **Implícita (automática):** Quando não há perda de dados.

> **Explícita (manual):** Quando há possibilidade de perda de dados ou quando se converte de um tipo maior para um tipo menor.

#### Exemplos de Conversão implícita
```java
int numeroInteiro = 10;
double numeroDecimal = numeroInteiro; // Conversão implícita de int para double
System.out.println(numeroDecimal); // Saída: 10.0
```
Casting implícitos são automáticos, sem a necessidade do programador fazê-lo, como no exemplo acima. 


#### Conversão Explícita (Casting Manual)

> Escrever um programa em Java que leia quatro números inteiros, calcule e mostra a média entre eles, sem casting explícito.

> Adicionar casting explícito. 

> Tente atribuir um *double* a uma variável inteira e a uma variável *float*, sem casting explícito. Isso resultará em erro.

> Observe o exemplo a seguir:

```java
double valorDecimal = 9.7;
int valorInteiro = (int) valorDecimal; // Casting explícito
System.out.println(valorInteiro); // Saída: 9 (parte decimal é descartada)
```
Em casting explícito, um valor não é arredondado; ele é "truncado".

> ⚠️ *Atenção:* Ao converter de double para int, a parte fracionária é perdida!


#### Tabela de castings possíveis

| De ⬇️ Para ➡️ | byte     | short   | char   | int   | long   | float   | double  |
|----------|----------|--------|--------|-------|--------|---------|---------|
| byte     | -        | impl.  | (char) | impl. | impl.  | impl.   | impl.   |
| short     | (byte)   | -      | (char) | impl. | impl.  | impl.   | impl.   |
| char     | (byte)   | (short) | -      | impl. | impl.  | impl.   | impl.   |
| int      | (byte)   | (short) | (char) | -     | impl.  | impl.   | impl.   |
| long     | (byte)   | (short) | (char) | (int) | -      | impl.   | impl.   |
| float    | (byte)   | (short) | (char) | (int) | (long) | -       | impl.   |
| double   | (byte)   | (short) | (char) | (int) | (long) | (float) | -    |


---
## 📝 5. Exercícios de Fixação

> Exercícios sobre estrutura sequencial: entrada, processamento e saída.

### Exercício 00
  
Escrever um programa que mostre o nome de uma pessoa e sua idade em 31 de dezembro de um determinado ano. Para isso, leia o nome da pessoa, seu ano de nascimento e o ano para o qual deseje calcular a idade.

### Exercício 01

Desenvolver um programa que peça a base e altura de um triângulo e calcula a sua área.


### Exercício 02

Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.

**Exemplos:**

Entrada:
```
10  
30
```

Saída:
```
SOMA = 40
```

### Exercício 03

Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com **quatro casas decimais** conforme exemplos.

**Fórmula da área:** `area = π * raio²`  
**Considere:** `π = 3.14159`

**Exemplo:**

Entrada:
```
2.00
```

Saída:
```
A=12.5664
```

### Exercício 04

Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula:  
`DIFERENCA = (A * B - C * D)`

**Exemplo:**

Entrada:
```
5  
6  
7  
8
```

Saída:
```
DIFERENCA = -26
```

### Exercício 05

Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcule o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com **duas casas decimais**.

**Exemplo:**

Entrada:
```
25  
100  
5.50
```

Saída:
```
NUMBER = 25  
SALARY = U$ 550.00
```

### Exercício 06

Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

**Exemplo:**

Entrada:
```
12 1 5.30  
16 2 5.10
```

Saída:
```
VALOR A PAGAR: R$ 15.50
```


### Exercício 07

Fazer um programa que leia três valores com ponto flutuante de dupla precisão: `A`, `B` e `C`. Em seguida, calcule e mostre:

- a) a área do triângulo retângulo que tem A por base e C por altura.
- b) a área do círculo de raio C. (π = 3.14159)
- c) a área do trapézio que tem A e B por bases e C por altura.
- d) a área do quadrado que tem lado B.
- e) a área do retângulo que tem lados A e B.

**Exemplo:**

Entrada:
```
3.0 4.0 5.2
```

Saída:
```
TRIANGULO: 7.800  
CIRCULO: 84.949  
TRAPEZIO: 18.200  
QUADRADO: 16.000  
RETANGULO: 12.000
```

## Exercício 08 

Problema **Divisão do Tesouro (OBI)**:  
  [https://olimpiada.ic.unicamp.br/pratique/pj/2020/f1/tesouro/](https://olimpiada.ic.unicamp.br/pratique/pj/2020/f1/tesouro/).

## Exercício 09
Problema **Piso da escola (OBI)**:  
  [https://olimpiada.ic.unicamp.br/pratique/p2/2018/f1/piso/](https://olimpiada.ic.unicamp.br/pratique/p2/2018/f1/piso/).

---

# 🔀 Desvios Condicionais

**🎯 Objetivo:**
Apresentar as estruturas de decisão da linguagem Java, permitindo que o programa tome diferentes caminhos com base em condições lógicas.


## 🧱 1. Estrutura do `if`, `else if` e `else`

```java
if (condição) {
    // bloco executado se condição for verdadeira
} else if (outraCondição) {
    // bloco executado se a outraCondição for verdadeira
} else {
    // bloco executado se nenhuma das condições for verdadeira
}
```
### Exemplo

```java
int idade = 18;

if (idade < 18) {
    System.out.println("Menor de idade");
} else if (idade == 18) {
    System.out.println("Tem exatamente 18 anos");
} else {
    System.out.println("Maior de idade");
}
```

### Operadores Relacionais

| Operador | Significado      | Exemplo (a = 5, b = 10)| 
|----------|------------------|------------------------|
| `==`     | Igual a          | `a == b` → false       |
| `!=`     | Diferente de     | `a != b` → true        |
| `>`      | Maior que        | `b > a`  → true        |
| `<`      | Menor que        | `a < b`  → true        |
| `>=`     | Maior ou igual a | `a >= b` → false       |
| `<=`     | Menor ou igual a | `a <= b` → true 


### 🔁 Encadeamento de condições

> É possível encadear várias condições usando os **operadores lógicos**:

- && (E lógico)

- || (OU lógico)

- ! (NÃO lógico)

```java
if (idade >= 18 && idade <= 65) {
    System.out.println("Adulto em idade ativa");
}
```

---

## 📦 2. Estrutura switch

Boa alternativa ao if-else quando temos várias comparações simples com o mesmo valor. É necessário que o resultado da comparação não seja um intervalo, mas sim em um valor específico. 

### Exemplo
```java
int dia = 3;

switch (dia) {
    case 1:
        System.out.println("Domingo");
        break;
    case 2:
        System.out.println("Segunda-feira");
        break;
    case 3:
        System.out.println("Terça-feira");
        break;
    case 4:
        System.out.println("Quarta-feira");
        break;
    case 5:
        System.out.println("Quinta-feira");
        break;
    case 6:
        System.out.println("Sexta-feira");
        break;
    case 7:
        System.out.println("Sábado-feira");
        break;
    default:
        System.out.println("Dia inválido");
}
```

---

## 📝 3. Exercícios de Fixação

- Ler a idade de uma pessoa e exibir:

  - "Menor de idade" se for menor que 18;

  - "Maior de idade" caso contrário.

- Receber um número de 1 a 7 e imprimir o dia da semana correspondente utilizando switch.

- Escrever um programa que lê dois números inteiros e imprime o maior entre eles.

- Criar um programa que recebe três notas, calcula a média e imprime:

 - "Aprovado" se média ≥ 7,

 - "Recuperação" se média entre 5 e 7,

 - "Reprovado" caso contrário.

 ---

 # 🔁 Laços de Repetição

 **🎯 Objetivo:**
Apresentar as estruturas de repetição em Java: `while`, `do/while` e `for`, explicando sua sintaxe, funcionamento e diferenças, com exemplos práticos.


### 🔄 1. Laço `while`

O laço `while` executa um bloco de código **enquanto** uma condição for verdadeira. A **verificação ocorre antes da execução**.

#### Sintaxe:
```java
while (condição) {
    // bloco de código
}
```

### Exemplo

```java
int contador = 1;

while (contador <= 5) {
    System.out.println("Contando: " + contador);
    contador++;
}
```
>> 📌 O bloco será executado enquanto contador <= 5 for verdadeiro.

>> 🛑 Se a condição for falsa no início, o laço não será executado nenhuma vez.

### Prática
> Escreva um programa em Java que leia uma quantidade indeterminada pesos de bois de uma fazenda. Quando for lido o valor 0 (zero), a leitura deve ser encerrada e os valores do boi mais pesado, mais leve e a média de massa dos dois devem ser apresentados.

---

## 🔁 2. Laço do/while

O laço do/while executa o bloco de código pelo menos uma vez, e verifica a condição depois. 

#### Sintaxe:
```java
do {
    // bloco de código
} while (condição);
```

### Exemplo

```java
for (int contador = 1; contador <= 5; contador++) {
    System.out.println("Contando: " + contador);
}
```
>> ✅ O laço sempre executa ao menos uma vez, mesmo que a condição seja falsa logo após a primeira execução.

### Prática
> Escrever um programa em Java que leia uma quantidade indefinida de números inteiros. Para cada número lido, indicar o dia da semana correspondente, se houver. Senão, indicar isso através de uma mensagem de valor inválido. Caso o usuário digite 0, a aplicação será encerrada. Usar o labelled loop. 

---

### 🔄 3. Laço `for`

O laço for é usado quando sabemos exatamente quantas vezes queremos repetir algo. É muito comum para contagens e percursos em sequências.

#### Sintaxe:
```java
for (inicialização; condição; atualização) {
    // bloco de código
}
```

**Exemplo**

```java
for (int contador = 1; contador <= 5; contador++) {
    System.out.println("Contando: " + contador);
}
```
>> 📌 Útil para quando o número de repetições é conhecido de antemão.

### Prática
> Escrever um programa em Java que mostre os números pares entre 0 e 100.
> Modifique o programa anterior para interromper a execução quando encontrar um número múltiplo de 19.
> Modifique o programa para mostrar os números pares, desde que não sejam múltiplos de 7. 

---

📝 4. Exercícios Práticos
- Imprimir os números de 1 a 10 usando while, do/while e for.

- Ler um número inteiro n e imprimir todos os números pares de 1 até n.

- Criar um programa que peça ao usuário para digitar senhas até que a senha correta seja informada.

- Fazer um programa que leia 5 números inteiros e calcule a média deles usando um laço.

---

# 🧮 Estruturas de Dados: Vetores, Listas e Mapas

**🎯 Objetivo:**
Apresentar as principais estruturas de dados em Java: vetores, listas (`ArrayList`) e mapas (`HashMap`), além de introduzir o laço `for-each` como forma prática de percorrê-las.

## 📦 1. Vetores (Arrays)

Um **vetor** é uma estrutura fixa de dados do mesmo tipo. Em Java, deve-se declarar o tamanho ao criar o vetor.

#### Declaração e uso:
```java
int[] numeros = new int[5]; // vetor com 5 posições

numeros[0] = 10;
numeros[1] = 20;
numeros[2] = 30;
numeros[3] = 40;
numeros[4] = 50;

for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
```
**Usando for-each:**
```java
for (int numero : numeros) {
    System.out.println(numero);
}
```
>> 📌 O for-each é útil para percorrer todos os elementos, mas não permite modificar valores diretamente pelo índice.

---

## 📋 2. Listas: ArrayList
Ao contrário dos vetores, as listas (como ArrayList) crescem dinamicamente. Estão disponíveis na biblioteca java.util.

### Exemplo com ArrayList<String>:
```java
import java.util.ArrayList;

ArrayList<String> nomes = new ArrayList<>();

nomes.add("Ana");
nomes.add("Carlos");
nomes.add("João");

for (String nome : nomes) {
    System.out.println(nome);
}
```

### Opções comuns
- nomes.get(x);           // Mostra o valor do elemento do índice x
- nomes.size();           // Mostra o tamanho da lista
- nomes.contains("Ana");  // Verifica se a lista contém o nome Ana
- nomes.remove(2);        // Remove o elemento que está no índice 2, se houver
- nomes.add(Maria);       // Adiciona Maria na última posição
- nomes.add(0, "Pedro");  // Adiciona Pedro ao índice 0 e faz os outros elementos pularesm uma casa. 
- nomes.set(1, "Sávio");  // Substitui o valor do índice 1 por Sávio
- nomes.clear()           // Limpa a lista


---
## 🗂️ 3. Mapas: HashMap
Um mapa armazena pares chave → valor. Usado quando queremos associar identificadores únicos a valores.

#### Declaração e uso:
```java
import java.util.HashMap;

HashMap<String, Integer> idades = new HashMap<>();

idades.put("Ana", 25);
idades.put("Carlos", 30);
idades.put("João", 28);

System.out.println("Idade de Ana: " + idades.get("Ana"));

```
🔒 As chaves são únicas. Se usar put com uma chave já existente, o valor anterior será substituído.


**Usando for-each (chaves):**
```java
for (String i : idades.keySet()) {
    System.out.println(i + " → " + entrada.get(i));
}

```

**Usando for-each (valores):**
```java
for (int i : idades.values()) {
    System.out.println(i);
}

```
### Opções comuns
- idades.put("Pedro", 50);           // Define o valor 50 para a chave Pedro
- idades.get("Ana");                 // Mostra o valor contido na chave Ana
- idades.remove("Ana");              // Remove a chave (e o valor) contido em Ana
- idades.clear();                    // Limpa o mapa
- idades.size();                     // Mostra o tamanho atual do mapa
- idades.

---
### 📝 4. Exercícios Práticos
- Criar um vetor de inteiros com 10 posições e preencher com valores digitados pelo usuário. Mostrar a média dos valores.

- Criar uma lista de nomes de alunos. Adicionar nomes, exibir todos com for-each e verificar se um nome existe usando .contains().

- Criar um mapa nome → idade, permitindo cadastrar e exibir os pares inseridos.

- Modifique o exemplo do HashMap para que o usuário digite os dados via teclado.