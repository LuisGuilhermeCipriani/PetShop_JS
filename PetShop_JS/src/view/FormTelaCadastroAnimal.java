/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.placeholder.PlaceHolder;
import controller.AnimalController;
import javax.swing.JOptionPane;
import model.Animal;
import model.Tipo;

/**
 *
 * @author cipri
 */
public class FormTelaCadastroAnimal extends javax.swing.JFrame {

    PlaceHolder holder;
    AnimalController animalController;
    public FormTelaCadastroAnimal() {
        initComponents();
        holders();
        LBCadastroAnimal.requestFocus();
        animalController = new AnimalController();
    }
    
    public void holders(){
        holder = new PlaceHolder(TFNomeAnimal, "Nome.Ex: Bart");
        holder = new PlaceHolder(TFIdadeAnimal, "Idade em Anos Humanos.Ex: 5");
        holder = new PlaceHolder(TFIDAnimal, "ID.Ex: 1");
    }

    public void selecionaTipo(){
        if(RDGato.isSelected()){
            animalController.getAnimal().setTipo(Tipo.GATO);
        }else if(RDCachorro.isSelected()){
            animalController.getAnimal().setTipo(Tipo.CACHORRO);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LBCadastroAnimal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TFNomeAnimal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TFIdadeAnimal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TFIDAnimal = new javax.swing.JTextField();
        BTLimparAnimal = new javax.swing.JButton();
        BTSairAnimal = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        RDCachorro = new javax.swing.JRadioButton();
        RDGato = new javax.swing.JRadioButton();
        BTCadastrarAnimal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        LBCadastroAnimal.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LBCadastroAnimal.setText("Digite as informações nos campos abaixo para cadastrar um animal");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Tipo");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Idade");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("ID");

        BTLimparAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/limpar.png"))); // NOI18N
        BTLimparAnimal.setText("Limpar");
        BTLimparAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTLimparAnimalActionPerformed(evt);
            }
        });

        BTSairAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/sair.png"))); // NOI18N
        BTSairAnimal.setText("Sair");
        BTSairAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTSairAnimalActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("-------------------------------------------------------------------------------");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("-------------------------------------------------------------------------------");

        RDCachorro.setText("Cachorro");
        RDCachorro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RDCachorroActionPerformed(evt);
            }
        });

        RDGato.setText("Gato");
        RDGato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RDGatoActionPerformed(evt);
            }
        });

        BTCadastrarAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/salvar.png"))); // NOI18N
        BTCadastrarAnimal.setText("Cadastrar");
        BTCadastrarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTCadastrarAnimalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(BTLimparAnimal)
                                .addGap(84, 84, 84)
                                .addComponent(BTSairAnimal))
                            .addComponent(LBCadastroAnimal)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(TFNomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TFIDAnimal)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TFIdadeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(RDCachorro)
                                .addGap(18, 18, 18)
                                .addComponent(RDGato))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(BTCadastrarAnimal)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(LBCadastroAnimal)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFNomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TFIdadeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TFIDAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(RDCachorro)
                    .addComponent(RDGato))
                .addGap(24, 24, 24)
                .addComponent(BTCadastrarAnimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTLimparAnimal)
                    .addComponent(BTSairAnimal))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTSairAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSairAnimalActionPerformed
        this.dispose();
    }//GEN-LAST:event_BTSairAnimalActionPerformed

    private void BTLimparAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTLimparAnimalActionPerformed
        TFNomeAnimal.setText("");
        TFIDAnimal.setText("");
        TFIdadeAnimal.setText("");
        RDCachorro.setSelected(false);
        RDGato.setSelected(false);
        TFNomeAnimal.requestFocus();
        holders();
        RDCachorro.setSelected(true);
    }//GEN-LAST:event_BTLimparAnimalActionPerformed

    private void RDCachorroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDCachorroActionPerformed
        RDGato.setSelected(false);
    }//GEN-LAST:event_RDCachorroActionPerformed

    private void RDGatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDGatoActionPerformed
        RDCachorro.setSelected(false);
    }//GEN-LAST:event_RDGatoActionPerformed

    private void BTCadastrarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTCadastrarAnimalActionPerformed
        String nome = TFNomeAnimal.getText();
        int idade = Integer.parseInt(TFIdadeAnimal.getText());
        int ID = Integer.parseInt(TFIDAnimal.getText());
        
        animalController.setAnimal(new Animal());
        
        animalController.getAnimal().setNome(nome);
        animalController.getAnimal().setIdade(idade);
        animalController.getAnimal().setId(ID);
        selecionaTipo();
        
        animalController.cadastroAnimal();
        
        String mensagem = "Animal cadastrado com sucesso!";
        JOptionPane.showMessageDialog(null, mensagem);
    }//GEN-LAST:event_BTCadastrarAnimalActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        RDCachorro.setSelected(true);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FormTelaCadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTelaCadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTelaCadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTelaCadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTelaCadastroAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTCadastrarAnimal;
    private javax.swing.JButton BTLimparAnimal;
    private javax.swing.JButton BTSairAnimal;
    private javax.swing.JLabel LBCadastroAnimal;
    private javax.swing.JRadioButton RDCachorro;
    private javax.swing.JRadioButton RDGato;
    private javax.swing.JTextField TFIDAnimal;
    private javax.swing.JTextField TFIdadeAnimal;
    private javax.swing.JTextField TFNomeAnimal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
