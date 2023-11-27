import java.util.*;

public class Main {

    private static Scanner s = new Scanner(System.in);
    private static Sistema sistema = new Sistema();

    public static void main(String[] args) {
        int opcao = -1;


        while(opcao != 0){
            menu();
            opcao = s.nextInt();
            switch (opcao){
                case 0: break;
                case 1: cadastrarUsuario(); break;
                case 2: if(login()){
                    opcoesUsuario();
                } break;
            }
        }
    }

    public static void menu(){ // Tela principal
        System.out.println("***** Escolha uma opção *****");
        System.out.println("0 - Sair");
        System.out.println("1 - Cadastrar um novo usuário");
        System.out.println("2 - Fazer Login");
    }

    public static void opcoesUsuario(){
        int opUsu = -1;

        while (opUsu != 0){
            menuUsuario();
            opUsu = s.nextInt();
            switch (opUsu) {
                case 0: sistema.realizarLogout(); break;
                case 1: listarLivros(); break;
                case 2: cadastrarLivro(); break;
                case 3: livrosFavoritos(); break;
                case 4: listarLivrosFavoritos(); break;
            }
        }
    }

    public static void menuUsuario(){ // Tela de apresentação do usuário logado
        System.out.println("*****Escolha uma opção*****");
        System.out.println("0 - Logout");
        System.out.println("1 - Listar livros lidos");
        System.out.println("2 - Cadastrar livro lido");
        System.out.println("3 - Favoritar livros");
        System.out.println("4 - Listar livros favoritos");
    }

    public static Usuario novoUsuario() {
        System.out.print("Nome: ");
        String nome = s.nextLine();
        nome = s.nextLine();

        System.out.print("Email: ");
        String email = s.nextLine();

        System.out.print("Senha: ");
        String senha = s.nextLine();

        while(senha.length() < 8){
            System.out.println("A senha deve ter no mínimo 8 caracteres");

            System.out.print("Senha: ");
            senha = s.nextLine();
        }

        System.out.print("Nickname: ");
        String nickname = s.nextLine();

        Usuario u = new Usuario();

        u.setNome(nome);
        u.setEmail(email);
        u.setSenha(senha);
        u.setNickname(nickname);

        return u;
    }

    public static void cadastrarUsuario(){
        sistema.cadastrarUsuario(novoUsuario());
    }

    public static boolean login(){
        System.out.println("***LOGIN***");

        System.out.print("Email: ");
        String email = s.nextLine();
        email = s.nextLine();

        System.out.print("Senha: ");
        String senha = s.nextLine();

        if(sistema.realizarLogin(email, senha)){
            Usuario u = sistema.getLogado();
            System.out.println("\nOlá "+ u);
            return true;
        }
        else{
            System.out.println("Login não foi realizado!");
            return false;
        }
    }

    public static Livro novoLivro() {
        System.out.println("*****Inserir livro*****");

        System.out.print("ISBN: ");
        Integer isbn = s.nextInt();

        System.out.print("Titulo: ");
        String titulo = s.nextLine();
        titulo = s.nextLine();

        System.out.print("Autor: ");
        String autor = s.nextLine();

        System.out.print("Editora: ");
        String editora = s.nextLine();

        Livro l = new Livro();

        l.setISBN(isbn);
        l.setTitulo(titulo);
        l.setAutor(autor);
        l.setEditora(editora);

        return l;
    }

    public static void cadastrarLivro(){
        sistema.cadastrarLivro(novoLivro());
    }

    public static void listarLivros(){
        int i = 0;
        System.out.println("*****Livros lidos*****");
        System.out.println("ISBM - titulo");
        for(Livro l: sistema.listarLivrosLidos()){
            System.out.println(l);
            i++;
        }
    }

    public static void livrosFavoritos(){

        System.out.println("Escolha um livro para favoritar: ");
        listarLivros();

        System.out.print("ISBN: ");
        int isbn = s.nextInt();

        for(Livro l: sistema.listarLivrosLidos()){
            if(isbn == l.getISBN()){
                sistema.cadastrarFavoritos(l);
            }
        }
    }

    public static void listarLivrosFavoritos(){
        int i = 0;
        System.out.println("*****Livros Favoritos*****");
        System.out.println("ISBM - titulo");
        for(Livro l: sistema.listarLivrosFav()){
            System.out.println(l);
            i++;
        }
    }

}