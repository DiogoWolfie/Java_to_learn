package cap3;

public class Cliente extends Pessoa{
    private String email;

    //contrutor
    public Cliente(String nome, String cpf, String email){
        super(nome, cpf); // método super que chama o contrutor da classe pai
        this.email = email;
    }

    // @Override: indica que estamos SOBRESCREVENDO o método da superclasse
    @Override
    public String apresentar(){
        // super.apresentar() chama a versão do método da classe pai
        return super.apresentar() + " e meu email e " + email;
    }

    public String getEmail(){
        return email;
    }
}