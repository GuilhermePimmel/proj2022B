package Aula4;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

public class NewJFrame extends javax.swing.JFrame {
    
     Conta objConta1;
     Conta objConta2;
     DefaultComboBoxModel modelContas;
     
     
    public NewJFrame() {
        initComponents();
        
        ArrayList<Conta> listaContas = new ArrayList<>();
       
    Conta objConta = new Conta();
   
    objConta.setNomeTitular("vô");
    objConta.setNumero(1);
    objConta.setSaldo(1000);
    objConta.setChequeEspecial(1000);
        
    listaContas.add(objConta);
    
    objConta = new Conta();
   
    objConta.setNomeTitular("pai");
    objConta.setNumero(2);
    objConta.setSaldo(1000);
    objConta.setChequeEspecial(1000);
        
    listaContas.add(objConta);
    
    objConta = new Conta();
   
    objConta.setNomeTitular("filho");
    objConta.setNumero(3);
    objConta.setSaldo(1000);
    objConta.setChequeEspecial(1000);
        
    listaContas.add(objConta);
    
    objConta = new Conta();
   
    objConta.setNomeTitular("neto");
    objConta.setNumero(4);
    objConta.setSaldo(1000);
    objConta.setChequeEspecial(1000);
        
    listaContas.add(objConta);
    
    objConta = new Conta();
   
    objConta.setNomeTitular("bisneto");
    objConta.setNumero(5);
    objConta.setSaldo(1000);
    objConta.setChequeEspecial(1000);
        
    listaContas.add(objConta);

    modelContas = new DefaultComboBoxModel();
    for (Conta objeto : listaContas){
        modelContas.addElement(objeto);
    }
    cmbContas1.setModel(modelContas);
    
    modelContas = new DefaultComboBoxModel();
    for (Conta objeto : listaContas){
        modelContas.addElement(objeto);
    }
    cmbContas2.setModel(modelContas);
    
    
    //Relação dos objetos
    lblNomeConta1.setText("Nome: " + objConta1.getNomeTitular());
    lblSaldoConta1.setText("Saldo: " + objConta1.getSaldo());
    lblNumConta1.setText("Conta: " + objConta1.getNumero());
    lblCE1.setText("CE: R$" + objConta1.getChequeEspecial());
    
    lblNomeConta2.setText("Nome: " + objConta2.getNomeTitular());
    lblSaldoConta2.setText("Saldo: " + objConta2.getSaldo());
    lblNumConta2.setText("Conta: " + objConta2.getNumero());
    lblCE2.setText("CE: R$" + objConta2.getChequeEspecial());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNomeConta1 = new javax.swing.JLabel();
        lblSaldoConta1 = new javax.swing.JLabel();
        lblNumConta1 = new javax.swing.JLabel();
        lblNomeConta2 = new javax.swing.JLabel();
        lblNumConta2 = new javax.swing.JLabel();
        lblSaldoConta2 = new javax.swing.JLabel();
        btnSacarConta1 = new javax.swing.JButton();
        btnSacarConta2 = new javax.swing.JButton();
        btnDepositarConta1 = new javax.swing.JButton();
        btnDepositarConta2 = new javax.swing.JButton();
        btnTransferirConta1 = new javax.swing.JButton();
        btnTransferirConta2 = new javax.swing.JButton();
        txtValorGeral = new javax.swing.JTextField();
        lblCE1 = new javax.swing.JLabel();
        lblCE2 = new javax.swing.JLabel();
        cmbContas1 = new javax.swing.JComboBox<>();
        cmbContas2 = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNomeConta1.setText("Nome: ");

        lblSaldoConta1.setText("Saldo:");

        lblNumConta1.setText("Número:");

        lblNomeConta2.setText("Nome: ");

        lblNumConta2.setText("Número:");

        lblSaldoConta2.setText("Saldo:");

        btnSacarConta1.setText("sacar");
        btnSacarConta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarConta1ActionPerformed(evt);
            }
        });

        btnSacarConta2.setText("sacar");
        btnSacarConta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarConta2ActionPerformed(evt);
            }
        });

        btnDepositarConta1.setText("depositar");
        btnDepositarConta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarConta1ActionPerformed(evt);
            }
        });

        btnDepositarConta2.setText("depositar");
        btnDepositarConta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarConta2ActionPerformed(evt);
            }
        });

        btnTransferirConta1.setText("transferir");
        btnTransferirConta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirConta1ActionPerformed(evt);
            }
        });

        btnTransferirConta2.setText("transferir");
        btnTransferirConta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirConta2ActionPerformed(evt);
            }
        });

        txtValorGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorGeralActionPerformed(evt);
            }
        });

        lblCE1.setText("CE");

        lblCE2.setText("CE");

        cmbContas1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbContas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbContas1ActionPerformed(evt);
            }
        });

        cmbContas2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbContas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbContas2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtValorGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeConta1)
                            .addComponent(lblSaldoConta1)
                            .addComponent(lblNumConta1)
                            .addComponent(btnSacarConta1)
                            .addComponent(btnDepositarConta1)
                            .addComponent(btnTransferirConta1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeConta2)
                            .addComponent(lblNumConta2)
                            .addComponent(lblSaldoConta2)
                            .addComponent(btnSacarConta2)
                            .addComponent(btnDepositarConta2)
                            .addComponent(btnTransferirConta2))
                        .addGap(115, 115, 115))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCE1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCE2)
                        .addGap(179, 179, 179))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbContas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbContas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeConta1)
                    .addComponent(lblNomeConta2))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumConta1)
                    .addComponent(lblNumConta2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldoConta1)
                    .addComponent(lblSaldoConta2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCE1)
                    .addComponent(lblCE2))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbContas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbContas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSacarConta1)
                    .addComponent(btnSacarConta2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDepositarConta1)
                    .addComponent(btnDepositarConta2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTransferirConta1)
                    .addComponent(btnTransferirConta2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtValorGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSacarConta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarConta1ActionPerformed
        //Sacar da conta
        
        try{
             double valorSaque = Double.parseDouble(txtValorGeral.getText());
        
        if(objConta1.Sacar(valorSaque)){
            //sucesso
            lblSaldoConta1.setText("Saldo: R$"+objConta1.getSaldo());
        }else{
            System.out.println("ERRO");
        }
        }catch(NumberFormatException ex){
            System.out.println("ERRO: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnSacarConta1ActionPerformed

    private void btnSacarConta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarConta2ActionPerformed
        //sacar conta 2
        
                try{
             double valorSaque = Double.parseDouble(txtValorGeral.getText());
        
        if(objConta2.Sacar(valorSaque)){
            //sucesso
            lblSaldoConta2.setText("Saldo: R$"+objConta2.getSaldo());
        }else{
            System.out.println("ERRO");
        }
        }catch(NumberFormatException ex){
            System.out.println("ERRO: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnSacarConta2ActionPerformed

    private void btnDepositarConta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarConta1ActionPerformed
         //Depositar na conta
        double valorDeposito = Double.parseDouble(txtValorGeral.getText());
        objConta1.Depositar(valorDeposito);
        lblSaldoConta1.setText("Saldo: R$"+objConta1.getSaldo());     
    }//GEN-LAST:event_btnDepositarConta1ActionPerformed

    private void btnDepositarConta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarConta2ActionPerformed
        //Depositar na conta
        double valorDeposito = Double.parseDouble(txtValorGeral.getText());
        objConta2.Depositar(valorDeposito);
        lblSaldoConta2.setText("Saldo: R$"+objConta2.getSaldo());
        lblSaldoConta1.setText("Saldo: R$"+objConta1.getSaldo());     

    }//GEN-LAST:event_btnDepositarConta2ActionPerformed

    private void txtValorGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorGeralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorGeralActionPerformed

    private void btnTransferirConta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirConta1ActionPerformed
        //Transferir 
        double valorTransferencia = Double.parseDouble(txtValorGeral.getText());
        objConta1.transferir(valorTransferencia, objConta2 );
        lblSaldoConta2.setText("Saldo: R$"+objConta2.getSaldo());
        lblSaldoConta1.setText("Saldo: R$"+objConta1.getSaldo());     
    }//GEN-LAST:event_btnTransferirConta1ActionPerformed

    private void btnTransferirConta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirConta2ActionPerformed
         //Transferir 
        double valorTransferencia = Double.parseDouble(txtValorGeral.getText());
        objConta2.transferir(valorTransferencia, objConta1 );
        lblSaldoConta1.setText("Saldo: R$"+objConta1.getSaldo());
    }//GEN-LAST:event_btnTransferirConta2ActionPerformed

    private void cmbContas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbContas1ActionPerformed
        objConta1 = (Conta) cmbContas1.getSelectedItem();
        
        //preencher os campos na tela
        lblNomeConta1.setText("Nome: " + objConta1.getNomeTitular());
        lblNumConta1.setText("Conta: " + objConta1.getNumero());        
        lblCE1.setText("Cheque: " + objConta1.getChequeEspecial());
        lblSaldoConta1.setText("Saldo: R$ " + objConta1.getSaldo());
        txtValorGeral.setText("");
    }//GEN-LAST:event_cmbContas1ActionPerformed

    private void cmbContas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbContas2ActionPerformed
        objConta1 = (Conta) cmbContas1.getSelectedItem();
        
        //preencher os campos na tela
        lblNomeConta2.setText("Nome: " + objConta2.getNomeTitular());
        lblNumConta2.setText("Conta: " + objConta2.getNumero());        
        lblCE2.setText("Cheque: " + objConta2.getChequeEspecial());
        lblSaldoConta2.setText("Saldo: R$ " + objConta2.getSaldo());
        txtValorGeral.setText("");    }//GEN-LAST:event_cmbContas2ActionPerformed

    public static void main(String args[]) {


        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepositarConta1;
    private javax.swing.JButton btnDepositarConta2;
    private javax.swing.JButton btnSacarConta1;
    private javax.swing.JButton btnSacarConta2;
    private javax.swing.JButton btnTransferirConta1;
    private javax.swing.JButton btnTransferirConta2;
    private javax.swing.JComboBox<String> cmbContas1;
    private javax.swing.JComboBox<String> cmbContas2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCE1;
    private javax.swing.JLabel lblCE2;
    private javax.swing.JLabel lblNomeConta1;
    private javax.swing.JLabel lblNomeConta2;
    private javax.swing.JLabel lblNumConta1;
    private javax.swing.JLabel lblNumConta2;
    private javax.swing.JLabel lblSaldoConta1;
    private javax.swing.JLabel lblSaldoConta2;
    private javax.swing.JTextField txtValorGeral;
    // End of variables declaration//GEN-END:variables
}
