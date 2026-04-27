package cap3;

public class Funcionario extends Pessoa{
    public String cargo;
    public double salario;

    public Funcionario (String nome, String cpf, String cargo, double salario){
        super(nome, cpf);
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public String apresentar(){
        return super.apresentar() + " atuante no cargo de " + cargo + " e com salário de " + salario;
    }
    public String getCargo(){
        return cargo;
    }

    public double getSalario(){
        return salario;
    }
}
