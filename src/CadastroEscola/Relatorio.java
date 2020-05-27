package CadastroEscola;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class Relatorio extends javax.swing.JInternalFrame {
        

    public Relatorio() {
        initComponents();
        
        PreencherTable();
    }

    private void PreencherTable(){

        DefaultTableModel model = (DefaultTableModel) this.jTableRelatorio.getModel();
        model.setRowCount(0);

        for (DadosBaseRelatorio DadosBaseRelatorios : BaseRelatorio.listRelatorio) {

            Object[] objeto = {DadosBaseRelatorios.getNome(), DadosBaseRelatorios.getTelefone(),
                DadosBaseRelatorios.getCpf(), DadosBaseRelatorios.getEmail(), DadosBaseRelatorios.getSenha()};
            
            model.addRow(objeto);
        }
        this.jTableRelatorio.setModel(model);
        //descobrir como dar o refresh aqui
    
    
    //evento onshow on focus do relatorio
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRelatorio = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jTableRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "E-mail", "CPF", "Senha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableRelatorio.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableRelatorio);
        if (jTableRelatorio.getColumnModel().getColumnCount() > 0) {
            jTableRelatorio.getColumnModel().getColumn(0).setResizable(false);
            jTableRelatorio.getColumnModel().getColumn(1).setResizable(false);
            jTableRelatorio.getColumnModel().getColumn(2).setResizable(false);
            jTableRelatorio.getColumnModel().getColumn(3).setResizable(false);
            jTableRelatorio.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JTable jTableRelatorio;
    // End of variables declaration//GEN-END:variables

  


}
