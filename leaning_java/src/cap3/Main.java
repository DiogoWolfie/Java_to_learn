//Usando a classe - criando OBJETOS (instâncias)
package cap3;
public class Main {
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

    }
}