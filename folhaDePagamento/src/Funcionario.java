public abstract class Funcionario {

    protected static double SALARIO_MINIMO = 1600.00;

    protected String nome;
    protected String cpf;
    protected Double salario;

    public abstract String getNome();

    public abstract double calculaSalario();
}