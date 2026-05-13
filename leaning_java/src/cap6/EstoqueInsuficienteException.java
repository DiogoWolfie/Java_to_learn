package cap6;
//Exceção customizada: herda de RuntimeException (unchecked)
public class EstoqueInsuficienteException extends RuntimeException{
    private final int disponivel;
    private final int solicitado;

    public EstoqueInsuficienteException(int disponivel, int solicitado){
        super(String.format(
            "Estoque insuficiente. Disponível: %d, Solicitado: %d ",
            disponivel, solicitado));
            this.disponivel = disponivel;
            this.solicitado = solicitado;
    }
    public int getDisponivel(){return disponivel;}
    public int getSolicitado(){return solicitado;}

}
