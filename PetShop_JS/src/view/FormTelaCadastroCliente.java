/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.placeholder.PlaceHolder;
import javax.swing.JOptionPane;
import model.Cliente;

/**
 *
 * @author cipri
 */
public class FormTelaCadastroCliente extends javax.swing.JFrame {

    PlaceHolder holder;
    public FormTelaCadastroCliente() {
        initComponents();
        holders();
        LBCadastroCliente.requestFocus();
    }

    public void holders(){
        holder = new PlaceHolder(TFNomeCliente, "Nome.Ex: Luis");
        holder = new PlaceHolder(TFCPFCliente, "CPF.Ex: 10244671630");
        holder = new PlaceHolder(TFIdadeCliente, "Idade em Anos.Ex: 30");
        holder = new PlaceHolder(TFIDCliente, "ID.Ex: 1");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LBCadastroCliente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TFNomeCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TFCPFCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TFIdadeCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TFIDCliente = new javax.swing.JTextField();
        BTLimparCliente = new javax.swing.JButton();
        BTSairCliente = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BTCadastrarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        LBCadastroCliente.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LBCadastroCliente.setText("Digite as informações nos campos abaixo para cadastrar um cliente");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("CPF");

        TFCPFCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFCPFClienteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Idade");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("ID");

        BTLimparCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/limpar.png"))); // NOI18N
        BTLimparCliente.setText("Limpar");
        BTLimparCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTLimparClienteActionPerformed(evt);
            }
        });

        BTSairCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/sair.png"))); // NOI18N
        BTSairCliente.setText("Sair");
        BTSairCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTSairClienteActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("-------------------------------------------------------------------------------");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("-------------------------------------------------------------------------------");

        BTCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/salvar.png"))); // NOI18N
        BTCadastrarCliente.setText("Cadastrar");
        BTCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTCadastrarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TFNomeCliente)
                                    .addComponent(TFCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TFIDCliente)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TFIdadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(BTLimparCliente)
                                .addGap(72, 72, 72)
                                .addComponent(BTSairCliente))))
                    .addComponent(LBCadastroCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTCadastrarCliente)
                .addGap(255, 255, 255))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(LBCadastroCliente)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TFCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TFIdadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TFIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(BTCadastrarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTLimparCliente)
                    .addComponent(BTSairCliente))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TFCPFClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFCPFClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFCPFClienteActionPerformed

    private void BTSairClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSairClienteActionPerformed
        this.dispose();
    }//GEN-LAST:event_BTSairClienteActionPerformed

    private void BTLimparClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTLimparClienteActionPerformed
        TFNomeCliente.setText("");
        TFIDCliente.setText("");
        TFCPFCliente.setText("");
        TFIdadeCliente.setText("");
        holders();
        TFNomeCliente.requestFocus();
    }//GEN-LAST:event_BTLimparClienteActionPerformed

    private void BTCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTCadastrarClienteActionPerformed
        String nome = TFNomeCliente.getText();
        String CPF = TFCPFCliente.getText();
        int idade = Integer.parseInt(TFIdadeCliente.getText());
        int ID = Integer.parseInt(TFIDCliente.getText());
        
        FormTelaPrincipal.clienteController.setCliente(new Cliente());
        
        FormTelaPrincipal.clienteController.getCliente().setNome(nome);
        FormTelaPrincipal.clienteController.getCliente().setCPF(CPF);
        FormTelaPrincipal.clienteController.getCliente().setIdade(idade);
        FormTelaPrincipal.clienteController.getCliente().setId(ID);
        
        FormTelaPrincipal.clienteController.cadastrarCliente();
        
        String mensagem = "Usuario cadastrado com sucesso!";
        JOptionPane.showMessageDialog(null, mensagem);
    }//GEN-LAST:event_BTCadastrarClienteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FormTelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTelaCadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTCadastrarCliente;
    private javax.swing.JButton BTLimparCliente;
    private javax.swing.JButton BTSairCliente;
    private javax.swing.JLabel LBCadastroCliente;
    private javax.swing.JTextField TFCPFCliente;
    private javax.swing.JTextField TFIDCliente;
    private javax.swing.JTextField TFIdadeCliente;
    private javax.swing.JTextField TFNomeCliente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
