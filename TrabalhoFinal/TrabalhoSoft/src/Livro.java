
public class Livro {

    private int ISBN;
    private String titulo;
    private String autor;
    private String editora;

    public Livro (int ISBN, String titulo, String autor, String editora){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
    }

    public Livro(){ }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return ISBN + "- " + titulo;
    }
}
