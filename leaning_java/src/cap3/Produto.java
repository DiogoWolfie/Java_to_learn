// A Classe é o modle que define a estrutura dos objetos
package cap3;
public class Produto{
    //ATRIBUTOS - características que cada obejto terá
    //private - é só acessível dentro dessa classe (encapsulamento)

    private Long id;
    private String nome;
    private double preço;
    private int quantidadeEstoque;

    //CONSTRUTOR - método especial chamado ao criar um novo objeto
    //tem o mesmo nome da classe e não tem tipo de retorno
    //this.nome referes-e ao atributo; nome é o parâmetro
    public Produto (Long id, String nome, double preço, int estoque){
        this.id = id;
        this.nome = nome;
        this.preço = preço;
        this.quantidadeEstoque = estoque;
    }

    //MÉTODOS DE NEGÓCIO - comportamento do produto
    public boolean temEstoque(){
        return quantidadeEstoque>0;
    }

    public void aplicarDesconto(double percentual){
        if(percentual <= 0 || percentual >= 100){
            throw new IllegalArgumentException("Percentual inválido");
        }
        this.preço = preço * (1-percentual / 100);
    }

    //GETTERS - métodos para ler os atributos privados
    public String getNome() {return nome;}
    public double getPreço() {return preço;}
    public int getQuantidadeEstoque() { return quantidadeEstoque; }

}

