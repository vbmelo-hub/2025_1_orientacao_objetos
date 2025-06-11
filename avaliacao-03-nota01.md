# Disciplina: Orientação a Objetos

**Prof: Me. Jonas Pontes**

**Terceira avaliação da Nota 1**

# 📚 Trabalho Prático

## Objetivo

Desenvolver uma aplicação Java orientada a objetos para **gerenciar uma biblioteca**, utilizando todos os conceitos abordados em sala até este momento na disciplina:

- Sintaxe da linguagem Java
- Modelagem orientada a objetos
- Abstração, classes, atributos e métodos
- Diagrama de classes (UML)
- Encapsulamento e métodos acessores e modificadores
- Construtores e sobrecarga
- Atributos e métodos estáticos
- Organização por pacotes
- Armazenamento simulados com `Map`
- Casos de uso implementados em classes de serviço

---

## Funcionalidades obrigatórias

### 📖 Gerenciamento de Livros

- Cadastrar livro (título, autor, ISBN, ano, editora e quantidade de exemplares. Outros atributos podem ser adicionados);
- Consultar livro por ISBN;
- Listar todos os livros;
- Remover livro;
- Buscar livros por autor;

### 👤 Gerenciamento de Usuários (Leitores)

- Cadastrar usuário (nome, CPF, e-mail);
- Consultar usuário por CPF;
- Listar todos os usuários;
- Remover usuário;

### 🔄 Empréstimos

- Realizar empréstimo de um livro para um usuário;
  - Não permitir empréstimo se o livro tiver somente um exemplar disponível na biblioteca;
- Registrar devolução de um livro;
- Listar todos os livros emprestados;
- Verificar quais livros estão disponíveis;
- Guardar o histórico de empréstimo.

---

## Estrutura de Pacotes

Organize seu projeto da seguinte forma:

    biblioteca/
      ├── aplicacao/ -> Classe principal com interação por texto com o usuário (tem o método main);
      ├── modelo/ -> Classes como Livro, Usuario, Emprestimo;
      ├── repositorio/ -> Classes com Map simulando o banco de dados;
      ├── servico/ -> Casos de uso (CadastrarLivro, RealizarEmprestimo etc.).


---

## Regras Técnicas

- Utilize **encapsulamento** adequadamente: atributos privados + getters/setters;
- Crie **construtores** e use **sobrecarga** onde fizer sentido;
- Utilize **atributos ou métodos estáticos** quando apropriado (ex: contadores);
- Projete e apresente um **diagrama de classes UML**;
- Separe corretamente as responsabilidades entre pacotes;

---

## Entregáveis

- Código-fonte completo do projeto;
- Arquivo com o diagrama UML ou imagem exportada.

---

## Prazo de Entrega

> 4/6/2025

## Forma de entrega
> O trabalho deve ser entregue, em dupla, pelo Sigaa. Apenas um membro da dupla deve entregar. 

---

## 📝 Dica Final

- Evite colocar a lógica na classe `main`;
- Faça a impressão do menu de opções em um método estático da classe `main`;
- Use os pacotes corretamente e distribua responsabilidades entre modelo, serviço, repositório e aplicação;
- Assuma que as entradas do usuário serão sempre corretas (por exemplo, para um valor inteiro, a entrada será sempre inteira), ou seja, você não precisa tratar os dados de entrada;
- Mostre que você **entendeu como projetar sistemas orientados a objetos de forma limpa e organizada**.