package cap3;

public class PagamentoCartao extends Pagamento{
    private String numeroCartao;

    public PagamentoCartao(double valor, String numero) {
        super(valor);
        this.numeroCartao = numero;
    }

    @Override
    public boolean processar(){
        // Em produção: chamaria uma API de pagamento real
        System.out.println("Processando cartao: " + numeroCartao);
        return true;
    }
}
