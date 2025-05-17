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
    //Validar em vez de lançar excerções. Exibir mensagens caso a validação dos erros for mal sucedida

    public enum ValidacaoResultado {  //Enum é um tipo no qual declaramos um conjunto de valores constantes pré-definidos
        SUCESSO(null),
        NOME_VAZIO("O nome não pode ser vazio."),
        NOME_COM_NUMEROS("O nome não pode conter números."),
        MATRICULA_INVALIDA("Número de matrícula inválido."),
        NOTA_PROVA1_INVALIDA("Nota da Prova 1 inválida! Insira um valor entre 0 e 10."),
        NOTA_PROVA2_INVALIDA("Nota da Prova 2 inválida! Insira um valor entre 0 e 10."),
        NOTA_TRABALHO_INVALIDA("Nota do Trabalho inválida! Insira um valor entre 0 e 10.");

        private final String mensagem;

        ValidacaoResultado(String mensagem) {
            this.mensagem = mensagem;
        }

        public String getMensagem() {
            return mensagem;
        }

        public boolean isSucesso() {
            return this == SUCESSO;
        }
    }

    public String getNome() {
        return nome;
    }

    public ValidacaoResultado setNome(String nome) { //Validar o dado inserido no capo nome,
        if (nome == null || nome.trim().isEmpty()) {
            return ValidacaoResultado.NOME_VAZIO;
        }
        if (nome.matches(".*\\d.*")) {
            return ValidacaoResultado.NOME_COM_NUMEROS;
        }
        this.nome = nome;
        return ValidacaoResultado.SUCESSO;

    }

    public int getMatricula() {
        return matricula;
    }

    public ValidacaoResultado setMatricula(int matricula) {
        if (matricula <= 0) {
            return ValidacaoResultado.MATRICULA_INVALIDA;
        }
        this.matricula = matricula;
        return ValidacaoResultado.SUCESSO;
    }

    public double getNprova1() {
        return nprova1;
    }

    public ValidacaoResultado setNprova1(double nprova1) {
        if (nprova1 < 0 || nprova1 > 10) {
            return ValidacaoResultado.NOTA_PROVA1_INVALIDA;
        }
        this.nprova1 = nprova1;
        return ValidacaoResultado.SUCESSO;
    }

    public double getNprova2() {
        return nprova2;
    }

    public ValidacaoResultado setNprova2(double nprova2) {
        if (nprova2 < 0 || nprova2 > 10) {
            return ValidacaoResultado.NOTA_PROVA2_INVALIDA;
        }
        this.nprova2 = nprova2;
        return ValidacaoResultado.SUCESSO;
    }

    public double getNtrabalho() {
        return ntrabalho;
    }

    public ValidacaoResultado setNtrabalho(double ntrabalho) {
        if (ntrabalho < 0 || ntrabalho > 10) {
            return ValidacaoResultado.NOTA_TRABALHO_INVALIDA;
        }
        this.ntrabalho = ntrabalho;
        return ValidacaoResultado.SUCESSO;
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
