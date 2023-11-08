package projeto;

public class Bibliotecario {
    // Atributos Fixos
    private static String usuario = "admin";
    private static String senha = "012345678";

    // Construtor
    public Bibliotecario() {
    }
    
    // Getters e Setters
    public static String getUsuario() {
        return usuario;
    }
    public static void setUsuario(String usuario) {
        Bibliotecario.usuario = usuario;
    }
    public static String getSenha() {
        return senha;
    }
    public static void setSenha(String senha) {
        Bibliotecario.senha = senha;
    }
}
