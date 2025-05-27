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
    
    //Validar em vez de lançar excerções. Exibir mensagens caso a validação dos erros for mal sucedida.
    public enum ValidacaoResultado {  //Enum define constantes para validação e facilitar manutenção.
        SUCESSO(null), //Indica validação bem-sucedida, sem mensagem de erro.
        NOME_VAZIO("O nome não pode ser vazio."), //Indica que o campo de nome está vazio, com uma mensagem descritiva.
        NOME_COM_NUMEROS("O nome não pode conter números."), //NOME_COM_NUMEROS é uma constante no enum que está associado a uma mensagem.
        MATRICULA_INVALIDA("Número de matrícula inválido."), //MATRICULA_INVALIDA é uma constante no enum que está associado a uma mensagem.
        NOTA_PROVA1_INVALIDA("Nota da Prova 1 inválida! Insira um valor entre 0 e 10."),//NOTA_PROVA1_INVALIDA é uma constante no enum que está associado a uma mensagem.
        NOTA_PROVA2_INVALIDA("Nota da Prova 2 inválida! Insira um valor entre 0 e 10."),//NOTA_PROVA2_INVALIDA é uma constante no enum que está associado a uma mensagem.
        NOTA_TRABALHO_INVALIDA("Nota do Trabalho inválida! Insira um valor entre 0 e 10.");//NOTA_TRABALHO_INVALIDA é uma constante no enum que está associado a uma mensagem.

        private final String mensagem; //Cada constante de enum armazena uma mensagem nesse atributo imutável.

        ValidacaoResultado(String mensagem) {
            this.mensagem = mensagem;//Associa cada mensagem à constante do enum.
        }

        public String getMensagem() {
            return mensagem; //Retorna a mensagem associada à constante, usada para exibir erros.
        }

        public boolean isSucesso() {//Verifica se a constante é SUCESSO, facilitando o tratamento de validações.
            return this == SUCESSO;
        }
    }

    public String getNome() {
        return nome;
    }

    public ValidacaoResultado setNome(String nome) { //Validar o dado inserido no campo nome.
        if (nome == null || nome.trim().isEmpty()) {
            return ValidacaoResultado.NOME_VAZIO; //etorna a constante com a mensagem de erro
        }
        if (nome.matches(".*\\d.*")) {
            return ValidacaoResultado.NOME_COM_NUMEROS; //etorna a constante com a mensagem de erro
        }
        this.nome = nome;
        return ValidacaoResultado.SUCESSO; //Retorna a constante indicando validação bem-sucedida.

    }

    public int getMatricula() {
        return matricula;
    }

    public ValidacaoResultado setMatricula(int matricula) {
        if (matricula <= 0) {
            return ValidacaoResultado.MATRICULA_INVALIDA; //etorna a constante com a mensagem de erro
        }
        this.matricula = matricula;
        return ValidacaoResultado.SUCESSO; //Retorna a constante indicando validação bem-sucedida.
    }

    public double getNprova1() {
        return nprova1;
    }

    public ValidacaoResultado setNprova1(double nprova1) {
        if (nprova1 < 0 || nprova1 > 10) {
            return ValidacaoResultado.NOTA_PROVA1_INVALIDA; //etorna a constante com a mensagem de erro
        }
        this.nprova1 = nprova1;
        return ValidacaoResultado.SUCESSO; //Retorna a constante indicando validação bem-sucedida. 
    }

    public double getNprova2() {
        return nprova2;
    }

    public ValidacaoResultado setNprova2(double nprova2) {
        if (nprova2 < 0 || nprova2 > 10) {
            return ValidacaoResultado.NOTA_PROVA2_INVALIDA; //etorna a constante com a mensagem de erro
        }
        this.nprova2 = nprova2;
        return ValidacaoResultado.SUCESSO; //Retorna a constante indicando validação bem-sucedida.
    }

    public double getNtrabalho() {
        return ntrabalho;
    }

    public ValidacaoResultado setNtrabalho(double ntrabalho) {
        if (ntrabalho < 0 || ntrabalho > 10) {
            return ValidacaoResultado.NOTA_TRABALHO_INVALIDA; //etorna a constante com a mensagem de erro
        }
        this.ntrabalho = ntrabalho;
        return ValidacaoResultado.SUCESSO; //Retorna a constante indicando validação bem-sucedida. 
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
