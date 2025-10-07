import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        Funcionario f1 = null;
        String[] options = {"Administrativo", "Docente", "Médico", "CANCELAR"};

        int select = JOptionPane.showOptionDialog(
                null,
                "Qual a categoria do funcionário?",
                "Seleção de funcionário",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[options.length-1]
                );

        switch (options[select]){
            case "Administrativo": f1 = new Administrativo("João Carlos", "000.000.000-00");
            case "Docente": f1 = new Professor("Ana Joana", "111.111.111-01", "Engenharia Aeroespacial", 90);
            case "Medico": f1 = new Medico("Lucas Evangelista", "333.333.333-33", "algum CRM", 23);
            case "CANCELAR": JOptionPane.showMessageDialog(null, "Procedimento abortado. Encerrando."); return;
        }

        mostraSalario(f1);

    }

    public static void mostraSalario(Funcionario f){

        JOptionPane.showMessageDialog(
                null,
                "O salario do funcionario " + f.getNome() + " é de R$ " + f.calculaSalario(),
                "Salario Calculado",
                JOptionPane.INFORMATION_MESSAGE
        );

    }
}