package soslkescola;

import Alunos.Alunos;
import Alunos.Alunos.ValidacaoResultado;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Meio extends javax.swing.JFrame {

    private final Border bordaPadrao = new JTextField().getBorder(); //Configuração da borda padrão.
    private final Border bordaErro = BorderFactory.createLineBorder(Color.RED, 3); //Configuração para a borda vermelha de 3 pixels, caso tenha erro.

    public Meio() {
        initComponents();
        setLocationRelativeTo(null); //Centralizar a tela
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        txtmatricula = new javax.swing.JTextField();
        txtn1prova = new javax.swing.JTextField();
        txtn2prova = new javax.swing.JTextField();
        txtntrabalho = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnsair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(8, 8, 90));
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 120, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 25)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(8, 8, 90));
        jLabel7.setText("Matricula:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 160, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 25)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(8, 8, 90));
        jLabel8.setText("Nota da Prova 01:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 270, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 25)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setText("Nota da Prova 02:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 240, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 25)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(8, 8, 90));
        jLabel10.setText("Nota do Trabalho:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 420, 250, 40));

        txtnome.setPreferredSize(new java.awt.Dimension(100, 40));
        txtnome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnomeFocusLost(evt);
            }
        });
        getContentPane().add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 1030, 50));

        txtmatricula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtmatriculaFocusLost(evt);
            }
        });
        txtmatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmatriculaActionPerformed(evt);
            }
        });
        getContentPane().add(txtmatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 480, 50));

        txtn1prova.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtn1provaFocusLost(evt);
            }
        });
        txtn1prova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtn1provaActionPerformed(evt);
            }
        });
        getContentPane().add(txtn1prova, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 230, 50));

        txtn2prova.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtn2provaFocusLost(evt);
            }
        });
        getContentPane().add(txtn2prova, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, 240, 50));

        txtntrabalho.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtntrabalhoFocusLost(evt);
            }
        });
        getContentPane().add(txtntrabalho, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 460, 240, 50));

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 25)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 102));
        jButton1.setText("EXIBIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 640, 150, -1));

        btnsair.setFont(new java.awt.Font("Segoe UI Black", 1, 25)); // NOI18N
        btnsair.setForeground(new java.awt.Color(0, 51, 102));
        btnsair.setText("SAIR");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });
        getContentPane().add(btnsair, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 640, 150, -1));

        jLabel4.setText("OBS: Utilize o ponto no lugar da virgula.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 230, 20));

        jLabel3.setText("OBS: A matricula deve ter 9 digitos.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 190, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\laila\\Downloads\\MEIO.jpeg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1620, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnomeFocusLost

    }//GEN-LAST:event_txtnomeFocusLost

    private void txtmatriculaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmatriculaFocusLost
//Era pra eu ter colocado as validações dentro do focuslost
    }//GEN-LAST:event_txtmatriculaFocusLost

    private void txtmatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmatriculaActionPerformed

    }//GEN-LAST:event_txtmatriculaActionPerformed

    private void txtn1provaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtn1provaFocusLost

    }//GEN-LAST:event_txtn1provaFocusLost

    private void txtn1provaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtn1provaActionPerformed

    }//GEN-LAST:event_txtn1provaActionPerformed

    private void txtn2provaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtn2provaFocusLost

    }//GEN-LAST:event_txtn2provaFocusLost

    private void txtntrabalhoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtntrabalhoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtntrabalhoFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Resetar bordas configuradas para a padrão
        txtnome.setBorder(bordaPadrao);
        txtmatricula.setBorder(bordaPadrao);
        txtn1prova.setBorder(bordaPadrao);
        txtn2prova.setBorder(bordaPadrao);
        txtntrabalho.setBorder(bordaPadrao);

        Alunos aluno = new Alunos(); //Cria um novo objeto Alunos para armazenar e validar os dados.

        //Valida o campo nome.
        ValidacaoResultado resultado = aluno.setNome(txtnome.getText().trim()); //Verifica se o nome não está vazio e não contém números.
        if (!resultado.isSucesso()) { //Verifica se a validação do nome foi bem-sucedida.
            JOptionPane.showMessageDialog(this, resultado.getMensagem(), "Erro", JOptionPane.ERROR_MESSAGE); //Exibe a mensagem de erro em uma caixa de diálogo.
            txtnome.setBorder(bordaErro); //Aplica borda vermelha ao campo com erro.
            txtnome.requestFocus(); //Retorna o foco ao campo de texto.
            return; //Interrompe o método, garantindo que os outros campos não sejam validados até que o nome esteja correto.
        }

        //Valida o campo matrícula.
        try {
            String matricula = txtmatricula.getText().trim(); //O trim() remove espaços em branco, e isEmpty() verifica se a string está vazia.
            if (matricula.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Informe a matrícula.", "Erro", JOptionPane.ERROR_MESSAGE);//Exibe a mensagem de erro em uma caixa de diálogo.
                txtmatricula.setBorder(bordaErro);//Aplica borda vermelha ao campo com erro.
                txtmatricula.requestFocus();//Retorna o foco ao campo de texto.
                return;
            }
            if (!matricula.matches("\\d+")) { //Verifica se a matrícula contém apenas dígitos.
                JOptionPane.showMessageDialog(this, "Matrícula deve conter apenas números positivos.", "Erro", JOptionPane.ERROR_MESSAGE);//Exibe a mensagem de erro em uma caixa de diálogo.
                txtmatricula.setBorder(bordaErro);
                txtmatricula.requestFocus();
                return;
            }
            resultado = aluno.setMatricula(Integer.parseInt(matricula)); //Valida se a matrícula é maior que zero.
            if (!resultado.isSucesso()) {
                JOptionPane.showMessageDialog(this, resultado.getMensagem(), "Erro", JOptionPane.ERROR_MESSAGE);//Exibe a mensagem de erro em uma caixa de diálogo.
                txtmatricula.setBorder(bordaErro);
                txtmatricula.requestFocus();
                return;
            }
        } catch (NumberFormatException ex) { //Captura erro de conversão para número inteiro.
            JOptionPane.showMessageDialog(this, "Matrícula deve ser um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);//Exibe a mensagem de erro em uma caixa de diálogo.
            txtmatricula.setBorder(bordaErro);
            txtmatricula.requestFocus();
            return;
        }

        //Valida a nota da prova 1.
        try {
            if (txtn1prova.getText().trim().isEmpty()) { //Verifica se a nota da prova 1 não está vazia, removendo espaços em branco.
                JOptionPane.showMessageDialog(this, "Informe a nota da 1ª prova.", "Erro", JOptionPane.ERROR_MESSAGE);//Exibe a mensagem de erro em uma caixa de diálogo.
                txtn1prova.setBorder(bordaErro);//Aplica borda vermelha ao campo com erro.
                txtn1prova.requestFocus();//Retorna o foco ao campo de texto.
                return;
            }
            resultado = aluno.setNprova1(Double.parseDouble(txtn1prova.getText().trim())); //Valida se a nota está entre 0 e 10.
            if (!resultado.isSucesso()) {
                JOptionPane.showMessageDialog(this, resultado.getMensagem(), "Erro", JOptionPane.ERROR_MESSAGE);//Exibe a mensagem de erro em uma caixa de diálogo.
                txtn1prova.setBorder(bordaErro);
                txtn1prova.requestFocus();
                return;
            }
        } catch (NumberFormatException ex) { //Captura erro de conversão para número decimal.
            JOptionPane.showMessageDialog(this, "Nota da Prova 1 deve ser um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);//Exibe a mensagem de erro em uma caixa de diálogo.
            txtn1prova.setBorder(bordaErro);
            txtn1prova.requestFocus();
            return;
        }

        //Valida a nota da prova 2.
        try {
            if (txtn2prova.getText().trim().isEmpty()) { //Verifica se a nota da prova 2 não está vazia, removendo espaços em branco.
                JOptionPane.showMessageDialog(this, "Informe a nota da 2ª prova.", "Erro", JOptionPane.ERROR_MESSAGE);//Exibe a mensagem de erro em uma caixa de diálogo.
                txtn2prova.setBorder(bordaErro);//Aplica borda vermelha ao campo com erro.
                txtn2prova.requestFocus();//Retorna o foco ao campo de texto.
                return;
            }
            resultado = aluno.setNprova2(Double.parseDouble(txtn2prova.getText().trim()));//Valida se a nota está entre 0 e 10.
            if (!resultado.isSucesso()) {
                JOptionPane.showMessageDialog(this, resultado.getMensagem(), "Erro", JOptionPane.ERROR_MESSAGE);//Exibe a mensagem de erro em uma caixa de diálogo.
                txtn2prova.setBorder(bordaErro);
                txtn2prova.requestFocus();
                return;
            }
        } catch (NumberFormatException ex) {//Captura erro de conversão para número decimal.
            JOptionPane.showMessageDialog(this, "Nota da Prova 2 deve ser um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);//Exibe a mensagem de erro em uma caixa de diálogo.
            txtn2prova.setBorder(bordaErro);//Aplica borda vermelha ao campo com erro.
            txtn2prova.requestFocus();
            return;
        }

        //Valida a nota do trabalho.
        try {
            if (txtntrabalho.getText().trim().isEmpty()) {//Verifica se a nota do trabalho não está vazia, removendo espaços em branco.
                JOptionPane.showMessageDialog(this, "Informe a nota do trabalho.", "Erro", JOptionPane.ERROR_MESSAGE);//Exibe a mensagem de erro em uma caixa de diálogo.
                txtntrabalho.setBorder(bordaErro);
                txtntrabalho.requestFocus();//Retorna o foco ao campo de texto.
                return;
            }
            resultado = aluno.setNtrabalho(Double.parseDouble(txtntrabalho.getText().trim())); //Valida se a nota está entre 0 e 10.
            if (!resultado.isSucesso()) {
                JOptionPane.showMessageDialog(this, resultado.getMensagem(), "Erro", JOptionPane.ERROR_MESSAGE);//Exibe a mensagem de erro em uma caixa de diálogo.
                txtntrabalho.setBorder(bordaErro);
                txtntrabalho.requestFocus();
                return;
            }
        } catch (NumberFormatException ex) { //Captura erro de conversão para número decimal.
            JOptionPane.showMessageDialog(this, "Nota do Trabalho deve ser um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);//Exibe a mensagem de erro em uma caixa de diálogo.
            txtntrabalho.setBorder(bordaErro);
            txtntrabalho.requestFocus();
            return;
        }
        new Finale(aluno).setVisible(true); //Abre a janela Finale com os dados do aluno.
        this.dispose(); //Fechar a tela atual.
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        System.exit(0); //Encerra a aplicação.
    }//GEN-LAST:event_btnsairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Meio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Meio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Meio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Meio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Meio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsair;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtmatricula;
    private javax.swing.JTextField txtn1prova;
    private javax.swing.JTextField txtn2prova;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtntrabalho;
    // End of variables declaration//GEN-END:variables
}
