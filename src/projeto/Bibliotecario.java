package projeto;

/**
 * A classe gerenciadora do sistema. 
 * Possui usu�rio e senha pr� definido.
 * @author netol
 */
public abstract class Bibliotecario {
    private static String usuario = "admin";
    private static String senha = "012345678";
    
    
    /**
     * Compara duas Strings dadas com usu�rio e senha do bibliotec�rio. 
     * Caso sejam iguais, retorna true, e retorna false caso contr�rio.
     * @param usuario String � ser comparada com o usu�rio do bibliotec�rio.
     * @param senha String � ser comparada com a senha do bibliotec�rio.
     * @return Retorna a validade da compara��o entre usu�rios e senhas.
     */
    public static boolean comparaDados(String usuario, String senha){
        return usuario.equals(Bibliotecario.usuario) && senha.equals(Bibliotecario.senha);
    }
}
