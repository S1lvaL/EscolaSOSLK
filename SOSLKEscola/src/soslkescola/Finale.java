package soslkescola;

import Alunos.Alunos;

public class Finale extends javax.swing.JFrame {

    public Finale(Alunos aluno) {
        initComponents();
        setLocationRelativeTo(null); //Centralizar a tela

        double media = aluno.calcularmedia(); //Cria uma variavel para retorna o valor no metodo calcularmedia().
        String status = aluno.aprovacao() ? "Aprovado" : "Reprovado"; //Atribui a variavel, "Aprovado" se aluno.aprovacao() retornar true, ou "Reprovado" se retornar false

        //Atualizar os labels com os dados do aluno.
        lblnome.setText(aluno.getNome()); //Exibir o dado nome.
        lblmatricula.setText(String.valueOf(aluno.getMatricula())); //Converte int em string.
        lblmedia.setText(String.format("%.2f", media)); // Formatar para duas casas decimais.
        lblstatus.setText(status); //Exibir o status se foi aprovado ou não.

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblnome = new javax.swing.JLabel();
        lblmatricula = new javax.swing.JLabel();
        lblstatus = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblmedia = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblnome.setFont(new java.awt.Font("Serif", 0, 25)); // NOI18N
        getContentPane().add(lblnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 550, 30));

        lblmatricula.setFont(new java.awt.Font("Serif", 0, 25)); // NOI18N
        getContentPane().add(lblmatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 270, 30));

        lblstatus.setFont(new java.awt.Font("Serif", 0, 30)); // NOI18N
        getContentPane().add(lblstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 490, 230, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 130, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Matricula:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 170, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Média:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 120, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Status:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 130, 40));

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 25)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 102));
        jButton1.setText("SAIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 610, 110, 40));

        lblmedia.setFont(new java.awt.Font("Serif", 0, 25)); // NOI18N
        getContentPane().add(lblmedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 416, 220, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\laila\\Downloads\\FINAL.jpeg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);//Encerra a aplicação.
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Finale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Finale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Finale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Finale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Alunos aluno = new Alunos();
                new Finale(aluno).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblmatricula;
    private javax.swing.JLabel lblmedia;
    private javax.swing.JLabel lblnome;
    private javax.swing.JLabel lblstatus;
    // End of variables declaration//GEN-END:variables
}
