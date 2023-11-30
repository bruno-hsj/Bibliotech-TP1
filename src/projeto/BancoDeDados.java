package projeto;

import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A classe BancoDeDados trata da manipulação de dados em arquivos .txt
 */

public abstract class BancoDeDados {
    private static String caminho = System.getProperty("user.dir");
    private static String ultimoCaminho = caminho;
    
    /**
    * Cria um diretório com o nome escolhido. 
    * O diretório será criado na pasta do projeto atual.
    * @param nome O nome do diretório criado.
    * @return Retorna true se conseguir criar o diretório e false caso contrário.
    */
    public static boolean criarDiretorio(String nome){ 
        Path diretorioDados = Paths.get(caminho + "/" + nome);
        ultimoCaminho = diretorioDados.toString();
        try {
            Files.createDirectory(diretorioDados);
            return true;
        } catch (FileAlreadyExistsException e) {} catch (IOException e) {}
        return false;
    }
    
    
    /**
    * Cria um diretório com o nome escolhido.
    * O diretório será criado segundo o caminho escolhido pelo usuário.
    * @param nome O nome do diretório criado.
    * @param caminho O caminho até a pasta onde será criado o diretório.
    * @return Retorna true se conseguir criar o diretório e false caso contrário.
    */
    public static boolean criarDiretorio(String nome, String caminho){ 
        Path diretorioDados = Paths.get(caminho + "/" + nome);
        ultimoCaminho = diretorioDados.toString();
        try {
            Files.createDirectory(diretorioDados);
            return true;
        } catch (FileAlreadyExistsException e) {} catch (IOException e) {}
        return false;
    }
    
    
    /**
    * Cria um arquivo com o nome escolhido. 
    * O arquivo será originado no último diretório criado pela classe BancoDeDados, ou na pasta do projeto atual, caso nenhum diretório tenha sido criado.
    * @param nome O nome do arquivo criado.
    * @return Retorna true se conseguir criar o arquivo e false caso contrário.
    */
    public static boolean criarArquivo(String nome){
        Path novoArquivo = Paths.get(ultimoCaminho + "/" + nome + ".txt");
        try {
            Files.createFile(novoArquivo);
            return true;
        } catch (FileAlreadyExistsException e) {} catch (IOException e) {}
        return false;
    }
     
    
    /**
    * Cria um diretório com o nome escolhido.
    * O diretório será criado segundo o caminho escolhido pelo usuário.
    * @param nome O nome do arquivo criado.
    * @param caminho O caminho até a pasta onde será criado o arquivo.
    * @return Retorna true se conseguir criar o arquivo e false caso contrário.
    */
    public static boolean criarArquivo(String nome, String caminho){ 
        Path novoArquivo= Paths.get(caminho + "/" + nome + ".txt");
        try {
            Files.createFile(novoArquivo);
            return true;
        } catch (FileAlreadyExistsException e) {} catch (IOException e) {}
        return false;
    }
    
    
    /**
     * Escreve uma string em um arquivo .txt escolhido pelo usuário. 
     * @param texto A string que será escrita no arquivo.
     * @param arquivo O nome do arquivo que será escrito.
     * @param diretorio O nome do diretório que contém o arquivo à ser escrito.
     * @return Retorna true se conseguir escrever no arquivo e false caso contrário.
     */
    public static boolean escrever(String texto, String diretorio, String arquivo){
        Path caminhoArquivo = BancoDeDados.achaCaminho(diretorio, arquivo);
        if (caminhoArquivo != null){
            try (PrintWriter escritor = new PrintWriter(new FileWriter( caminhoArquivo.toString(), true))) {
                escritor.println(texto);
                return true;
            } catch (Exception e) {}
        }    
        return false;
    }
    
    
    /**
     * Lê um arquivo e retorna uma lista com todas as strings contidas nele, associando uma linha do arquivo a cada item da lista. 
     * @param arquivo O nome do arquivo que será lido.
     * @param diretorio O nome do diretório onde está o arquivo.
     * @return Retorna uma lista como todas as strings de um arquivo.
     */
    public static List<String> lerArquivo(String diretorio, String arquivo){
        Path caminhoArquivo = BancoDeDados.achaCaminho(diretorio, arquivo);
        if (caminhoArquivo != null){
            try{
                List<String> linhas = Files.readAllLines(caminhoArquivo);
                System.out.println(linhas);
                return linhas;
            } catch (IOException e){}  
        }
        return null;
    }
    
    
    /**
     * Recebe o nome de um diretório e de um arquivo, e retorna o caminho até esse arquivo.
     * @param arquivo O nome do arquivo de interesse.
     * @param diretorio O nome do diretório onde está o arquivo.
     * @return Retorna um Path, do caminho até o arquivo especificado.
     */
    private static Path achaCaminho(String diretorio, String arquivo){
        Path caminho = Paths.get(diretorio).toAbsolutePath();
        Path pathArquivo = Paths.get(caminho.toString(), arquivo + ".txt");
        try {
            Files.isHidden(pathArquivo);
            return pathArquivo;
        } catch (NoSuchFileException e) {
            System.out.println("O caminho não existe: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro de I/O: " + e.getMessage());
        }
        return null;
    }
    
    
    /**
     * Exclui um arquivo escolhido pelo usuário. Não exclui diretórios.
     * @param diretorio O nome do diretório onde está o arquivo.
     * @param arquivo O nome do arquivo que será excluído.
     * @return Retorna true se conseguir excluir e false caso contrário.
     */
    public static boolean excluiArquivo(String diretorio, String arquivo){
        Path caminhoArquivo = BancoDeDados.achaCaminho(diretorio, arquivo);
        if (caminhoArquivo != null){
            try{
                Files.delete(caminhoArquivo);
                return true;
            } catch (IOException e){}
        }    
        return false;
    }
       
    
    /**
     * Verifica se um texto dado está presente no arquivo especificado.
     * @param texto A string que será procurada.
     * @param diretorio O diretório onde está o arquivo.
     * @param arquivo O arquivo onde irá procurar a string.
     * @return Retorna true se o texto está no arquivo, e false caso contrário.
     */
    public static boolean in(String texto, String diretorio, String arquivo){
        Path caminhoArquivo = BancoDeDados.achaCaminho(diretorio, arquivo);
        if (caminhoArquivo != null){
            try{
                boolean achou = Files.lines(caminhoArquivo).anyMatch(linha -> linha.contains(texto));
                if (achou == true)
                    return true;
            } catch (IOException e){}
        }
        return false;
    }
    
    
    
    public static long index(String texto, String diretorio, String arquivo){
        Path caminhoArquivo = BancoDeDados.achaCaminho(diretorio, arquivo);
        if (caminhoArquivo != null){
            try {
                long idx = Files.lines(caminhoArquivo).takeWhile(linha -> !linha.equals(texto))
                        .count();
                return idx;
            } catch (IOException e){}
        }
        return -1;
    }
            
            
    /**
     * Exclui uma linha do arquivo, se essa for igual ao texto passado como parâmetro.
     * @param texto A string que será deletada.
     * @param diretorio O diretório onde está o arquivo.
     * @param arquivo O arquivo onde está a string à ser excluída.
     * @return Retorna true se houver excluído a linha e false caso contrário.
     */
    public static boolean excluiLinha(String texto, String diretorio, String arquivo){
        Path caminhoArquivo = BancoDeDados.achaCaminho(diretorio, arquivo);
        if (BancoDeDados.in(texto, diretorio, arquivo)){
            try{
                String novoConteudo = Files.lines(caminhoArquivo).filter(linha -> !linha.contains(texto)).collect(Collectors.joining(System.lineSeparator()));
                Files.write(caminhoArquivo, novoConteudo.getBytes());
                return true;
            } catch (IOException e){}
        }
        return false;
    }



    public static boolean editaLinha(String texto, String novoTexto, String diretorio, String arquivo){
        long idx = BancoDeDados.index(texto, diretorio, arquivo);
        int index = (int) idx; 
        Path caminhoArquivo = BancoDeDados.achaCaminho(diretorio, arquivo);
        if (idx != -1){
            try{
                System.out.println(idx);
                List<String> linhas = Files.readAllLines(caminhoArquivo);
                linhas.set(index, novoTexto);
                Files.write(caminhoArquivo, linhas);
                return true;
            } catch (Exception e){}   
        }
        return false;
    }
}