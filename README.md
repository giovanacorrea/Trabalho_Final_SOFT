## Trabalho final da disciplina Engenharia de Software

Trabalho realizado em conjunto com Débora Lawall Langner 

### Objetivo 
<p>O objetivo do trabalho é realizar testes unitários em uma aplicação que possibilite o registro de leituras
onde o usuário pode fazer o registro dos livros lidos, criação de listas de livros favoritos e também permitir a classificação dos mesmos em uma escala de 1 a 5
estrelas, além de permitir a interação entre os usuários.</p>

### Stakeholders 

- **Usuários finais:**  Leitores assíduos que desejem acompanhar suas leituras.
- **Desenvolvedores de software:** Responsáveis pelo desenvolvimento da plataforma
e manutenção da mesma continuamente.
- **Equipe de Design de Produto:** Profissionais encarregados de garantir que a interface do usuário seja intuitiva e atraente para os usuários, promovendo uma
experiência agradável de gerenciamento de leituras.
- **Editoras e Autores:** A plataforma pode ser uma boa forma de divulgar livros e
autores novos;

### Testes 
---

#### Testes da Classe `UsuarioTest`

Este arquivo contém os testes unitários desenvolvidos em **JUnit 4** para a classe `Usuario`. Os testes verificam desde a criação de usuários até a manipulação de livros e a integração com o sistema.

---

#### 📌 Resumo dos Testes

| Método de Teste              | O que verifica                                                                 | Assert utilizado                           |
|-------------------------------|-------------------------------------------------------------------------------|---------------------------------------------|
| **testCadastroUsuario**       | - Se o usuário é criado corretamente<br>- Se as listas de livros iniciam vazias | `assertEquals`, `assertTrue`               |
| **testAdicionarLivro**        | Se um livro adicionado aparece na lista de livros do usuário                  | `assertTrue`                                |
| **testAdicionarLivroFavorito**| Se um livro adicionado como favorito aparece na lista de favoritos             | `assertTrue`                                |
| **testVisualizarListaLivros** | - Integração com a classe `Sistema`<br>- Se livros lidos e favoritos são listados corretamente | `assertTrue`                                |
| **testNotEquals**             | Se dois usuários com e-mails diferentes não são considerados iguais (`equals`) | `assertFalse`                               |

---

#### 🛠️ Recursos JUnit Utilizados

- `@Test` → indica que o método é um caso de teste.  
- `assertEquals(expected, actual)` → compara dois valores esperados e obtidos.  
- `assertTrue(condition)` → verifica se a condição é verdadeira.  
- `assertFalse(condition)` → verifica se a condição é falsa.  

---
