/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.util.LinkedList;
import models.Receita;

/**
 *
 * @author SAMSUNG
 */
public class CadastroReceita extends javax.swing.JFrame {

    /**
     * Creates new form CadastroReceita
     */
    public CadastroReceita() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        lstReceita = new LinkedList<Receita>();
        lblVTV = new javax.swing.JLabel();
        lblVRR = new javax.swing.JLabel();
        lblTV = new javax.swing.JLabel();
        txtVTV = new javax.swing.JTextField();
        txtVRR = new javax.swing.JTextField();
        txtTV = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblReceita = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        lstReceita = org.jdesktop.observablecollections.ObservableCollections.observableList(lstReceita);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Receita");

        lblVTV.setText("Valor Total Vendido:");

        lblVRR.setText("Valor Real Recebido:");

        lblTV.setText("Total de Vendas:");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblReceita, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.valorTotalVendido}"), txtVTV, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblReceita, org.jdesktop.beansbinding.ELProperty.create("${selectedElement!=null}"), txtVTV, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        txtVTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVTVActionPerformed(evt);
            }
        });

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblReceita, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.valorRealRecebido}"), txtVRR, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblReceita, org.jdesktop.beansbinding.ELProperty.create("${selectedElement!=null}"), txtVRR, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        txtVRR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVRRActionPerformed(evt);
            }
        });

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblReceita, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.totalVendas}"), txtTV, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblReceita, org.jdesktop.beansbinding.ELProperty.create("${selectedElement!=null}"), txtTV, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, lstReceita, tblReceita);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valorTotalVendido}"));
        columnBinding.setColumnName("Valor Total Vendido");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valorRealRecebido}"));
        columnBinding.setColumnName("Valor Real Recebido");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${totalVendas}"));
        columnBinding.setColumnName("Total Vendas");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane2.setViewportView(tblReceita);

        jButton1.setText("Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Remover");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVRR)
                            .addComponent(lblVTV))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTV)
                        .addGap(34, 34, 34)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtTV, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(txtVTV, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVRR, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVTV)
                            .addComponent(txtVTV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVRR)
                            .addComponent(txtVRR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTV)
                    .addComponent(txtTV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtVTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVTVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVTVActionPerformed

    private void txtVRRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVRRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVRRActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Receita r = new Receita();
        lstReceita.add(r);
        
        int nLinhas = tblReceita.getRowCount()-1;
        
        tblReceita.setRowSelectionInterval(nLinhas, nLinhas);
        
        txtVTV.requestFocus();
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
            java.util.logging.Logger.getLogger(CadastroReceita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroReceita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroReceita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroReceita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroReceita().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTV;
    private javax.swing.JLabel lblVRR;
    private javax.swing.JLabel lblVTV;
    private java.util.List<Receita> lstReceita;
    private javax.swing.JTable tblReceita;
    private javax.swing.JTextField txtTV;
    private javax.swing.JTextField txtVRR;
    private javax.swing.JTextField txtVTV;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}