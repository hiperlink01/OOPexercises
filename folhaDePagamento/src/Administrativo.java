public class Administrativo extends Funcionario {

    public Administrativo(String nome, String cpf){
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.salario = calculaSalario();
    }

    public double calculaSalario()
    { return SALARIO_MINIMO; }

    public String getNome(){ return nome; }

}