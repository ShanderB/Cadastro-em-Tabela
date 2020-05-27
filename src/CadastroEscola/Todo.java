/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadastroEscola;

import javax.swing.JOptionPane;

public class Todo extends javax.swing.JFrame {

    Professor professor;
    Relatorio Relatorio;

    public Todo() {
        initComponents();

        this.setExtendedState(MAXIMIZED_BOTH);  //ele vai iniciar maximizado
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane3 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jmCadastrarP = new javax.swing.JMenuItem();
        jmRelatorioP = new javax.swing.JMenuItem();
        jmCadastrarA = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 334, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        jMenu3.setText("Coordenador");

        jmCadastrarP.setText("Cadastar Professor");
        jmCadastrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastrarPActionPerformed(evt);
            }
        });
        jMenu3.add(jmCadastrarP);

        jmRelatorioP.setText("Relatorio Professores");
        jmRelatorioP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRelatorioPActionPerformed(evt);
            }
        });
        jMenu3.add(jmRelatorioP);

        jmCadastrarA.setText("Disciplica");
        jMenu3.add(jmCadastrarA);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmCadastrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastrarPActionPerformed
    
        
        if (professor != null) {
            professor.setVisible(false); //Isso é para saber se a janela já está aberta.
            professor.dispose();
        }

        professor = new Professor();

        professor.setVisible(true);  //seta como visível
        jDesktopPane3.add(professor);  //vai abrir a classe
        professor.toFront();  //vai jogar para frente.



    }//GEN-LAST:event_jmCadastrarPActionPerformed

    private void jmRelatorioPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRelatorioPActionPerformed
       if (Relatorio != null) {
            Relatorio.setVisible(false); //Isso é para saber se a janela já está aberta.
            Relatorio.dispose();
        }

        Relatorio = new Relatorio();

        Relatorio.setVisible(true);  //seta como visível
        jDesktopPane3.add(Relatorio);  //vai abrir a classe
        Relatorio.toFront();  //vai jogar para frente.

    }//GEN-LAST:event_jmRelatorioPActionPerformed

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
            java.util.logging.Logger.getLogger(Todo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Todo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Todo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Todo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Todo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmCadastrarA;
    private javax.swing.JMenuItem jmCadastrarP;
    private javax.swing.JMenuItem jmRelatorioP;
    // End of variables declaration//GEN-END:variables
}
