package cap3;

public class PagamentoPix extends Pagamento {
    private String chavePix;
    public PagamentoPix(double valor, String chave) {
        super(valor);
        this.chavePix = chave;
    }
    @Override
    public boolean processar() {
        //Em produção chamar uma API real para pagamento via pix
        System.out.println("Enviando PIX para: " + chavePix);
        return true;
    }

}
