package cap3;
//superclasse ou classe pai
public class Pessoa {
    protected String nome; //protected  - acessivel também das subclasses
    protected String cpf;
    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    public String apresentar(){
        return "Olá, meu nome é  " + nome;
    }
}

