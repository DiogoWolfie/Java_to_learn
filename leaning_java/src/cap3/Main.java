//Usando a classe - criando OBJETOS (instâncias)
package cap3;
public class Main {
    public static void exibirApresentacao(Pessoa p){
        // Java decide em tempo de execução qual 'apresentar()' chamar
        // Se p é um Cliente, chama o apresentar() de Cliente
        // Se p é um Funcionario, chama o apresentar() de Funcionario
        // Damos a isso o nome de polimorfismo
        System.out.println(p.apresentar());
    }

    public static void main(String[] args){
        Produto teclado = new Produto(1L, "Teclado Mecanico", 299.90, 50);
        Produto mouse = new Produto(2L, "Mouse Gamer", 159.90, 0);

        // Cada objeto tem seus próprios valores
        System.out.println(teclado.getNome() + " em estoque: " + teclado.temEstoque());
        System.out.println(mouse.getNome() + " em estoque: " + mouse.temEstoque());
        teclado.aplicarDesconto(10); // aplica 10% de desconto
        System.out.println("Preco com desconto: R$ " + teclado.getPreço());

        // Criando e usando objetos
        Pessoa p = new Pessoa("Jose", "111.222.333-44");
        Cliente c = new Cliente("Ana", "555.666.777-88", "ana@email.com");
        System.out.println(p.apresentar()); // Ola, meu nome e Jose
        System.out.println(c.apresentar()); // Ola, meu nome e Ana e meu email e ana@email.com

        //exemplo de polimorfismo - perceba que o exibirApresentação espera como parâmetro um objeto pessoa
        Cliente c2 = new Cliente("Paula", "123.456.789-00", "Paula@email.com");
        Funcionario f = new Funcionario("Carlos", "987.654.321-00", "Dev", 8000.0);
        exibirApresentacao(c2); // chama o apresentar() de Cliente
        exibirApresentacao(f); // chama o apresentar() de Funcionario 

        // Usando polimorfismo + abstração juntos:
        Pagamento pag1 = new PagamentoCartao(150.0, "93848 19384 33 1234");
        Pagamento pag2 = new PagamentoPix(75.0, "email@banco.com");
        pag1.processar(); // processa como cartão
        pag2.processar(); // processa como pix
        pag1.exibirRecibo(); // método compartilhado da classe pai

    }


}