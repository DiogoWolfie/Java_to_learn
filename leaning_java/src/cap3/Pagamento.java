package cap3;
// Abstração é o princípio de esconder os detalhes de implementação e expor apenas o essencial
// Classe abstrata: não pode ser instanciada diretamente
// Ela define o CONTRATO — nesse caso, o que toda forma de pagamento deve ter
public abstract class Pagamento {
    protected double valor;
    public Pagamento(double valor){
        this.valor = valor;

    }

    //método abstrato - sem corpo. Cada sublasse DEVE implementar sua versão
    public abstract boolean processar();

    // Método concreto: implementação compartilhada por todos
    public void exibirRecibo() {
        System.out.println("Pagamento de R$ " + valor + " realizado.");
    }
}
