package escolasoslk;
//Se não consegui fazr com o JFrame vai ser esse
import Alunos.Alunos;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Alunos aluno = new Alunos();
        String nome;
        double nprova1, nprova2, ntrabalho;
        int matricula;

        nome = JOptionPane.showInputDialog("Informe o nome do Aluno(a):");
        aluno.setNome(nome);
        matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe a matricula do Aluno(a) " + nome + ":"));
        aluno.setMatricula(matricula); //Atribuem valores aos atributos da classe
        nprova1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da 1° prova do Aluno(a) " + nome + ":"));
        aluno.setNprova1(nprova1);
        nprova2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da 2° prova do Aluno(a) " + nome + ":"));
        aluno.setNprova2(nprova2);
        ntrabalho = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do trabalho do Aluno(a) " + nome + ":"));
        aluno.setNtrabalho(ntrabalho);

        //Chamar os metodos 
        double media = aluno.calcularmedia();
        String status = aluno.aprovacao() ? "Aprovado" : "Reprovado";

        JOptionPane.showMessageDialog(null,
            "Aluno: " + aluno.getNome() + "\n" +
            "Matrícula: " + aluno.getMatricula() + "\n" +
            "Média: " + media + "\n" +
            "Status: " + status,
            "Resultado Final", JOptionPane.INFORMATION_MESSAGE
        );

    }
}