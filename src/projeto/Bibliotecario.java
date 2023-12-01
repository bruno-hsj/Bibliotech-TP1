package projeto;

/**
 * A classe gerenciadora do sistema. 
 * Possui usuário e senha pré definido.
 * @author netol
 */
public abstract class Bibliotecario {
    private static String usuario = "admin";
    private static String senha = "012345678";
    
    
    /**
     * Compara duas Strings dadas com usuário e senha do bibliotecário. 
     * Caso sejam iguais, retorna true, e retorna false caso contrário.
     * @param usuario String à ser comparada com o usuário do bibliotecário.
     * @param senha String à ser comparada com a senha do bibliotecário.
     * @return Retorna a validade da comparação entre usuários e senhas.
     */
    public static boolean comparaDados(String usuario, String senha){
        return usuario.equals(Bibliotecario.usuario) && senha.equals(Bibliotecario.senha);
    }
}
