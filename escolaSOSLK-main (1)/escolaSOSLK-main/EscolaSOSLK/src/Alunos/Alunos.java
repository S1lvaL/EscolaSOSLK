package Alunos;

import javax.swing.JOptionPane;

public class Alunos {
    //Atributos
    private String nome;
    private int matricula;
    private double nprova1;
    private double nprova2;
    private double ntrabalho;
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        if (nome == null || nome.trim().isEmpty()) {  //Verifica se o nome está vazio
            JOptionPane.showMessageDialog(null, "O campo não pode estar vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if (nome.matches(".*\\d.*")) {  //Verifica se o nome contém números
            JOptionPane.showMessageDialog(null, "O nome não pode conter números.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            this.nome = nome;
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if (matricula <= 0) { //Matricula deve ser positiva
            JOptionPane.showMessageDialog(null, "Número de matrícula inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            this.matricula = matricula;
        }
    }

    public double getNprova1() {
        return nprova1;
    }

    public void setNprova1(double nprova1) {
        if (nprova1 < 0 || nprova1 > 10) {
            JOptionPane.showMessageDialog(null, "Nota inválida! Insira um valor entre 0 e 10.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            this.nprova1 = nprova1;
        }
    }

    public double getNprova2() {
        return nprova2;
    }

    public void setNprova2(double nprova2) {
        if (nprova2 < 0 || nprova2 > 10) {
            JOptionPane.showMessageDialog(null, "Nota inválida! Insira um valor entre 0 e 10.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            this.nprova2 = nprova2;
        }
    }

    public double getNtrabalho() {
        return ntrabalho;
    }

    public void setNtrabalho(double ntrabalho) {
        if (ntrabalho < 0 || ntrabalho > 10) { //PQ não validar no metodo? Ao validar nos setters, evitamos que dados errados cheguem a outras partes do código.
            JOptionPane.showMessageDialog(null, "Nota inválida! Insira um valor entre 0 e 10.");
        } else {
            this.ntrabalho = ntrabalho;
        }
    }
    
    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }    
    //Métodos
    public double calcularmedia() { //Ele só precisa ser usado dentro da classe, pois aprovacao() já o chama internamente.
        float pesop = 2.5f;
        float pesot = 2f;
        media = (float) (((pesop * nprova1) + (pesop * nprova2) + (pesot * ntrabalho)) / ((pesop * 2) + pesot));
        return media;
    }

    public boolean aprovacao() {
        return calcularmedia() >= 6; //Toda vez que aprovacao() for chamado, a média será recalculada antes da verificação.

    }
}
