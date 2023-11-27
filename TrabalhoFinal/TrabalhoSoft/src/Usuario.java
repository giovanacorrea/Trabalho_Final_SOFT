import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nome;
    private String senha;
    private String email;
    private String nickname;
    private List<Livro> livrosLidos = new ArrayList<>();
    private List<Livro> livrosFavoritos = new ArrayList<>();

    public Usuario (String nome, String senha, String email, String nickname){
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.nickname = nickname;
    }

    public Usuario(){}


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void adicionarLivro(Livro livro){
        livrosLidos.add(livro);
    }

    public List<Livro> livros(){
        return livrosLidos;
    }

    public void adicionarLivroFavorito(Livro livro){
        livrosFavoritos.add(livro);
    }

    public List<Livro> getLivrosFavoritos(){
        return livrosFavoritos;
    }

    @Override
    public String toString() {
        return nickname;
    }

    public boolean equals(Object o) {
        if (o instanceof Usuario) {
            Usuario u = (Usuario) o;

            if (this.email.equals(u.getEmail())) {
                return true;
            }
        }
        return false;
    }

}
