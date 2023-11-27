import java.util.ArrayList;
import java.util.List;

public class Sistema {

    private List<Usuario> usuarios = new ArrayList<>();
    private Usuario logado;

    public Sistema(){

    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void cadastrarLivro(Livro livro){
        logado.adicionarLivro(livro);
    }

    public void cadastrarFavoritos(Livro livro){
        logado.adicionarLivroFavorito(livro);
    }

    public boolean realizarLogin(String emailString, String senhaString) {
        for (Usuario i : usuarios) {
            if (emailString.equals(i.getEmail()) && senhaString.equals(i.getSenha())) {
                logado = i;
                return true;
            }
        }
        return false;
    }

    public List<Livro> listarLivrosLidos() {
        return logado.livros();
    }

    public List<Livro> listarLivrosFav() {
        return logado.getLivrosFavoritos();
    }

    public void realizarLogout() {
        logado = null;
    }

    public Usuario getLogado() {
        return logado;
    }

}
