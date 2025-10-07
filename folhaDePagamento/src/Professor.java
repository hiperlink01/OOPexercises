public class Professor extends Funcionario {

    String areaDeFormacao;
    int horasAula;

    public Professor(String nome, String cpf, String areaDeFormacao, int horasAula){
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.salario = calculaSalario();

        this.areaDeFormacao = areaDeFormacao;
        this.horasAula = horasAula;
    }

    public double calculaSalario()
    { return (50.00 * horasAula); }

    public String getNome(){ return nome; }

}
