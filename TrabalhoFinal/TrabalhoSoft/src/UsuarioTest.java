import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;


public class UsuarioTest {

    @Test
     public void testCadastroUsuario() {
        // Criação de um novo usuário
        Usuario usuario = new Usuario("Giovana", "123456", "gio@gmail.com", "gio");

        // Verificação dos dados do usuário
        assertEquals("Giovana", usuario.getNome());
        assertEquals("12345678", usuario.getSenha());
        assertEquals("gio@gmail.com", usuario.getEmail());
        assertEquals("gio", usuario.getNickname());

        // Verificação inicial de listas de livros
        assertTrue(usuario.livros().isEmpty());
        assertTrue(usuario.getLivrosFavoritos().isEmpty());
    }


    @Test
    public void testAdicionarLivro() {
        Usuario usuario = new Usuario("Giovana", "12345678", "gio@gmail.com", "gio");
        Livro livro = new Livro(123458, "Amores Verdadeiros", "Taylor Jenkins Reid", "Paralela");
        usuario.adicionarLivro(livro);

        assertTrue(usuario.livros().contains(livro));
    }

    @Test
    public void testAdicionarLivroFavorito() {
        Usuario usuario = new Usuario("Giovana", "12345678", "gio@gmail.com", "gio");
        Livro livro = new Livro(123458, "Amores Verdadeiros", "Taylor Jenkins Reid", "Paralela");
        usuario.adicionarLivroFavorito(livro);

        assertTrue(usuario.getLivrosFavoritos().contains(livro));
    }
    

    @Test
    public void testVisualizarListaLivros() {
        Sistema sistema = new Sistema();
        Usuario usuario = new Usuario("Giovana", "12345678", "gio@gmail.com", "gio");

        Livro livro1 = new Livro(5631, "Livro 1", "Autor 1", "Editora 1");
        Livro livro2 = new Livro(23652, "Livro 2", "Autor 2", "Editora 2");

        sistema.cadastrarUsuario(usuario);
        sistema.realizarLogin("gio@gmail.com", "12345678");

        // Adicionar livros à lista de livros lidos e favoritos
        usuario.adicionarLivro(livro1);
        usuario.adicionarLivroFavorito(livro2);

        // Visualizar lista de livros lidos
        List<Livro> livrosLidos = sistema.listarLivrosLidos();

        // Verificar se o livro1 está na lista de livros lidos
        assertTrue(livrosLidos.contains(livro1));

        // Visualizar lista de livros favoritos
        List<Livro> livrosFavoritos = sistema.listarLivrosFav();

        // Verificar se o livro2 está na lista de livros favoritos
        assertTrue(livrosFavoritos.contains(livro2));
    }
       

    // @Test
    // public void testNotEquals() {
    //     Usuario usuario1 = new Usuario("Giovana", "12345678", "gio@gmail.com", "gio");
    //     usuario1.setEmail("teste1@teste.com");

    //     Usuario usuario2 = new Usuario("Giovana", "12345678", "gio@gmail.com", "gio");
    //     usuario2.setEmail("teste2@teste.com");

    //     assertFalse(usuario1.equals(usuario2));
    // }
}
