package cap6;
//uma exceção é um evento que interrompe o fluxo do programa - geralmente devido a um erro
//em java, exceções são objetos 

import java.io.*;

/*
Hieraquia:
    Erro - erros graves na jvm  - nunca tratá-los no código
        OutOfMemoryError (memória insuficiente)
        StackOverflowError (recursão infinita, erro na pilha de chamada)
    Exception - situações que o código pode e deve travar
        IOException (Checked — leitura de arquivo, rede)
        SQLException (Checked — erros de banco de dados)
            (Checked = o compilador te OBRIGA a declarar ou tratar)

        RuntimeException (Unchecked — não obrigatório declarar)
        NullPointerException (acesso a referência null)
        IllegalArgumentException (argumento inválido)
        IndexOutOfBoundsException (índice fora dos limites)
        ArithmeticException (ex: divisão por zero)
*/

public class excecao {

    public static int dividir(int a, int b){
        int resultado = a / b;
        return resultado;
    }
    public static void processar(String valor){
        if(valor == null){
            throw new IllegalArgumentException("valor não pode ser nulo");
        }
        System.out.println(valor.toUpperCase());
    }
    //o recurso declarado entre parênteses é fechado automaticamente
    //A classe deve implementar a interface autocloseable
    public static String lerArquivo(String caminho) throws IOException{
        try (BufferedReader leitor = new BufferedReader(new FileReader(caminho))){
            StringBuilder conteudo = new StringBuilder();
            String linha;
            while((linha = leitor.readLine()) != null){
                conteudo.append(linha);
            }
            return conteudo.toString();
            //leitor é fechado automaticamente aqui
        }
        // Sem finally
    }

    public static void venderProduto(String produto, int quantidade){
        if (quantidade > 100){
            throw new EstoqueInsuficienteException(100, quantidade);

        }
    }
    public static void main(String[] args){

        //bloco try-catch: tenta executar, captura se der errado
        try {
            int resultado = dividir(10,0); //vai lançar exceção
            System.out.println(resultado); //nunca é exectuada
        } catch (ArithmeticException e){
            System.err.println("Erro: "+ e.getMessage());
        } finally {
            //Este bloco Sempre executa - mesmo se ouver exceção
            //usado para liberar recursos
            System.out.println("operação finalizada");
        }

        //multi -catch: captura diferentes tipos de exceção
        try{
            processar(null);
        }catch (NullPointerException | IllegalArgumentException e){
            System.err.println("Dados invalidos: " + e.getMessage());
        }

        /*
        O try-with-resources garante que o fechamento de recursos usados durante o código
        como arquivos, bancos de dados, streams de rede, aconteçam automaticamente, mesmo que ocorra uma exceção.
        */
        try {
            String conteudo = lerArquivo("./conteudo.txt");
            System.out.println(conteudo);
        } catch (IOException e) {
            System.err.println("Falha ao ler arquivo: " + e.getMessage());
        }

        try{
            venderProduto("ovo", 200);
        }catch (EstoqueInsuficienteException e){
            System.err.println(e.getMessage());
            System.out.println("Disponivel: " + e.getDisponivel());
        }
    }
    
}
