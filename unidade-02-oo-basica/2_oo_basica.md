# ☕👩🏽‍💻 Unidade Temática #2: Orientação a objetos básica  

>> 📅 Quarta-feira, 30/4/2025

## Criação de um tipo

>> Quando definimos uma classe, com atributos e métodos, dizemos que definimos um tipo de dados derivado. 

## O exemplo de Porta

> 👩🏽‍💻[Código-fonte disponível aqui!](https://github.com/prof-jpontes/2025_1_orientacao_objetos/tree/main/unidade-02-oo-basica/src-java/porta) Baixe o projeto e importe-o no seu IDE favorito (recomendo o Eclipse). 

🎯**Objetivo:**
 Abstrair o conceito de porta e criar o tipo que o represente esse tipo de objeto.

**Crie uma porta. Para isso, responda as questões:** 
- Quais são os atributos necessário para a criação dessa classe?
- Quais são os métodos necessários para a criação dessa classe?
- Modele, em UML, essa classe.
- Com base no modelo apresentado acima, implemente em Java a classe Porta. 

**Atributos ou características da classe Porta:**

É fácil perceber que uma porta, independentemente do seu tipo, tem atributos como largura, altura e espessura, do tipo numérico; cor e material, do tipo textual (String). Ainda, podemos considerar um atributo para fechadura, também do tipo textual. Por último, atributos para indicar os estados da porta, ou seja, fechada ou aberta e trancada ou destrancada, podem ser levantados. Nesse caso, o tipo lógico (boolean) é o mais indicado. Obviamente, outros atributos podem ser levantados para uma porta, mas assumiremos esse nível de abstração.

É fácil perceber que abrir, fechar, trancar e destrancar são operações feitas em uma porta, ou seja, são seus métodos (consideramos aqui o fechar como encostar uma porta, sem trancá-la). Para que seja possível trancar ou destrancar uma porta, é necessário usar a chave adequada para isso; portanto, os métodos que representam essas ações exigem têm chave como parâmetro (vamos abstrair a chave como um texto). Os métodos fechar e abrir não exigem parâmetros. Por fim, os quatro métodos devem retornar um valor lógico indicando se foi possível realizá-lo ou não. 

A classe em UML está apresentada na imagem abaixo:

![Image](https://github.com/user-attachments/assets/4f5d9d49-224f-4875-b18c-a5c2c2492231)


**Criação da classe em Java:**

A classe Porta pode ser criada em uma linguagem de programação, como em Java, e representará um tipo derivado de dados. Assim como outro tipo derivado, como Scanner ou String, Porta tem atributos e métodos — esses foram definidos na criação da classe. 

Diferentemente das classes usadas na unidade anterior (sintaxe Java), a classe Porta não contém (e não deve conter) o método main. Isso se dá em razão do fato de Porta ser uma classe "modelo", ou seja, especifica um tipo, um conjunto de similaridades de portas reais.

Para que seja possível o uso de Porta, ou seja, a criação de instâncias que representem as portas reais (que são os objetos de fato), faz-se necessário criar outra classe, esta com o método main. Essa classe, de fato, será responsável pela criação, manipulação e uso de instâncias de Porta. Para fins de teste, ela também terá como responsabilidade a interação do usuário com o programa. 

>> 📅 Sexta-feira, 2/5/2025

- Implemente uma classe clamada **Aplicacao** no mesmo projeto de Porta;
- Dentro do método main de Aplicacao, crie uma variável do tipo Porta;
- Faça esse atributo receber a instância que represente um objeto de Porta;
- Defina valores para os atributos da instância de porta criada;
- Chame ações (métodos) de uma porta;
- Mostre informações da porta criada.

```java
Porta porta1; //Cria uma variável do tipo porta

new Porta(); 
/*Cria uma nova instância, ou seja, a representação de um novo objeto de Porta.
Essa abordagem, entretanto não guarda a referência à porta criada*/

porta1 = new Porta(); //Cria uma nova porta e faz porta1 apontar para essa porta criada

Porta porta1 = new Porta(); //Mais usual criar: cria uma variável e uma instância de Porta e faz a variável guardar o endereço da instância.

porta1.cor = "Preta" //Define o valor do atributo cor da porta criada

porta1.fechar(); //Invoca o método fechar da instância de porta

System.out.println(porta1.largura); //Mostra a largura da porta
```
**Alocação de memória:**

Quando um programador declara uma variável, como int, double ou char, é reservado um espaço na memória para aquela variável, na área de alocação estática (ou stack, pilha). Por outro lado, quando uma variável de um tipo de referência é declarada, por exemplo porta1 (do tipo Porta), é criada na stack essa variável, com o valor padrão _null_. Quando é atribuído a essa variável um valor que se refere a uma instância de Porta — por exemplo, quando se faz _porta1 = new Porta();_ —, uma nova área de memória é reservada para a instância de Porta criada, essa na área de alocação dinâmica (ou heap), e porta1 passa a ter o valor do endereço dessa referência. A imagem abaixo ilustra a situação descrita. 

![Image](https://github.com/user-attachments/assets/da626d6d-24da-4b78-97d5-ce0d61b3059e)

> Por isso, variáveis que apontam para instâncias de objetos diferentes, mesmo que ambos os objetos tenham o mesmo estado, são diferentes. Teste criar dois objetos, porta1 e porta2, com os mesmos valores para seus atributos e depois comparece se porta1 == porta2. O resultado dessa comparação será _false_, pois as duas variáveis apontam para endereços de memória na área de heap distintas.

**Implementação dos métodos de Porta e teste de execução:**

O modelo apresentado no diagrama de classes contém quatro métodos: abrir, fechar, destrancar e trancar. Os dois primeiros sem parâmetro, ao passo que os dois últimos têm uma chave, do tipo String, como parâmetro. Os quatro métodos retornam um valor lógico (boolean).

- **Método abrir**: esse método verifica se a porta está destrancada e, em caso afirmativo, altera o valor da variável _estaFechada_ para falso e retornar verdadeiro. Caso contrário, retorna falso. Nesse exemplo, não se verifica se a porta já está aberta ou não mo momento da chamado do método — o que importa é o resultado final: a porta deve estar aberta, desde que não esteja trancada. O código é apresentado a seguir:
```java
	public boolean abrir() {
		if(!estaTrancado) {
			estaFechado = false;
			return true;
		}
		return false;
	}
```
- **Método fechar**: tem como responsabilidade definir o valor da variável _estaFechada_, como verdade. Não realiza nenhuma verificação adicional, nem há a possibilidade de retornar outro valor (ou seja, falso). Por esse motivo, o tipo de retorno foi alterado de _boolean_ para _void_. O código é o seguinte:
```java
	public void fechar() {
		estaFechado = true;
	}
```

- **Método destrancar**: esse método recebe uma chave como parâmetro e a compara com o valor da chave da porta, que é assumido como sendo "1234" (do tipo String). Caso a chave esteja correta, a porta é destrancada (variável _estaTrancada_ recebe o valor false) e o método retorna true. Também retorna true se a porta já estiver destrancada. O código é apresentado abaixo:
```java
	public boolean destrancar(String chave) {
		if (chave.equals("1234") || !estaTrancado ) {
			estaTrancado = false;
			return true;
		}
		return false;
	}
```

- **Método trancar**: recebe uma chave como parâmetro, que é comparada ao valor "1234". Em caso positivo, o método fechar() é invocado e a variável _estaTrancado_ recebe o valor true. Retorna true se a chave for correta; caso contrário, retorna false. Veja o código:
```java
	public boolean trancar(String chave) {
		if(chave.equals("1234")) {
			fechar();
			estaTrancado = true;
			return true;
		}
		return false;
	}	
```

- **Método de relatório**: tem como finalidade retornar uma representação textual de todos os atributos do objeto, no formato String, conforme mostrado a seguir:
```java
	public String getRelatorio() {
		String relatorio = "Altura: " + altura;
		relatorio += "\nLargura: " + largura;
		relatorio += "\nEspessura: " + espessura;
		relatorio += "\nMaterial: " + material;
		relatorio += "\nCor: " + cor;
		relatorio += "\nFechadura: " + fechadura;
		return relatorio;
	}
```

>> 📅 Quarta-feira, 7/5/2025

É notável que o atributo fechadura, inicialmente definido como do tipo String, não tem muita função no sistema. Um fechadura, obviamente, não pode ser encarado como um simples texto, contendo, por exemplo, sua descrição. Assim, fechadura é um forte candidato a ser um tipo de dados, ou seja, uma classe. Ademais, Porta não tem, em sua especificação, um atributo chave, mas os métodos trancar e destrancar recebem, cada um, uma chave, e a comparação é com um valor textual definido no próprio corpo do método, o que não faz muito sentido no mundo real (todas as portas teriam a mesma chave) nem em programação. Para suprir essas dificuldades, chave pode ser um atributo da classe Fechadura.

É fácil perceber um relacionamento forte entre as classes Porta e Fechadura. Veremos um pouco sobre os tipos de relacionamento, tomando como base os diagramas de classe em UML. 

## UML: relacionamento entre classes

No diagrama de classes UML, as relações entre classes são fundamentais para representar como os objetos interagem e se organizam em um sistema. Três dos relacionamentos mais importantes são: associação, agregação e composição. 

**Associação**: é o relacionamento mais genérico entre classes. Ela indica que uma classe está conectada a outra, ou seja, objetos de uma classe podem referenciar objetos de outra.
- É representada por uma linha simples entre as classes.
- Pode ter multiplicidade (como 1, 0..1, \*, etc.) para indicar quantas instâncias estão envolvidas.
- Também pode incluir um nome e o papel de cada classe.

![Image](https://github.com/user-attachments/assets/37bf1b92-318f-48a4-a757-263b4eee5a94)

➡ Um aluno pode estar matriculado em várias turmas, e cada turma pode ter vários alunos.


**Agregação**: é um tipo especial de associação que indica uma relação "todo/parte". Nesse caso, o todo é formado por partes, mas as partes podem existir independentemente do todo.
- Representada por uma linha com um losango branco na extremidade da classe que representa o "todo".

![Image](https://github.com/user-attachments/assets/cd2b915b-a5b9-4927-b176-97e18f7139a1)

➡ Um departamento pode ter zero ou mais professores vinculados a ele e um professor está vinculado a um departamento, mas um professor mesmo fora de um departamento (por isso não é composição). 

**Composição**: representa uma relação "todo/parte", mas mais forte. Aqui, as partes não podem existir sem o todo — elas são criadas e destruídas junto com o todo.
- Representada por uma linha com um losango preto na extremidade do "todo".

![Image](https://github.com/user-attachments/assets/3aea29f3-0ac8-40f9-8e78-64fa0d147270)

➡ Uma casa é composta por cômodos, e esses cômodos só existem enquanto a casa existir. Se a casa for destruída, os cômodos também desaparecem.


---

O relacionamento entre as classes Fechadura e Porta é de composição porque: 
- Porta é o objeto principal, que pode abrir e fechar; e
- Fechadura é o mecanismo que pertence à porta, usado para trancar/destrancar.

➡ A fechadura não faz sentido existir isoladamente no sistema — ela está intrinsecamente ligada à porta. Quando uma porta é destruída, sua fechadura também é. Isso caracteriza uma composição: uma relação "parte/todo" forte, com dependência de vida. Esse modelo assume que a fechadura é construída junto com a porta e não é reutilizada em outra porta.

> Representamos ainda com um atributo do tipo Fechadura na classe Porta. A figura abaixo ilustra essa composição. 

![Image](https://github.com/user-attachments/assets/c6e5cb8f-bb5f-4648-b909-9fbba6136dde)



## Sistema bancário/criação de contas

🎯**Objetivo:**
 Abstrair o conceito de conta bancária e criar o tipo que o represente.

**Mapeamento de:**
- Atributos (quais os seus tipos?)
- Métodos (quais os seus tipos?)

**UML:**
- Produzir o diagrama de classe, com atributos e métodos.

**Codificação:**
- Criar um projeto chamado banco e um classe de modelo que represente as contas;
- Criação de instâncias de objetos conta e referências as essas instâncias;
- Atribuição e recuperação valores de atributos;
- Invocação de métodos.

📝**Exercícios:**
- Implementar um sistema de biblioteca, com as classes Livro, Autor e Editora;
- Definir os atributos e métodos das classes;
- Modelar as classes em UML;
- Implementar a classe em Java.

