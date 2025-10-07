public class Medico extends Funcionario {

    String crm;
    int diasTrabalhados;

    public Medico(String nome, String cpf, String crm, int diasTrabalhados){
        super();

        if (diasTrabalhados > 29) { throw new IllegalArgumentException(
            "Quantidade maxima de dias trabalhados excedida"
        );}

        this.nome = nome;
        this.cpf = cpf;
        this.salario = calculaSalario();

        this.crm = crm;
        this.diasTrabalhados = diasTrabalhados;

    }

    public double calculaSalario()
    {return SALARIO_MINIMO*2.5 + diasTrabalhados*2*60.00;}

    public String getNome(){ return nome; }

}
