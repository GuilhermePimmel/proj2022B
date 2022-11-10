
package Aula4;

public class FrameContas extends javax.swing.JFrame {

    Conta objConta1;
    Conta objConta2;
    
    public FrameContas() {
        initComponents();
    
    
    objConta1 = new Conta();
   
    objConta1.setNomeTitular("vô");
    objConta1.setNumero(1);
    objConta1.setSaldo(1000);
    objConta1.setChequeEspecial(0);
        
    Conta objConta2 = new Conta();
        
    objConta2.setNomeTitular("pai");
    objConta2.setNumero(2);
    objConta2.setSaldo(1000);
    objConta2.setChequeEspecial(0.0);
    
    //Relação dos objetos
    lblNomeConta1.setText("Nome: " + objConta1.getNomeTitular());
    lblSaldoConta1.setText("Saldo: " + objConta1.getSaldo());
    lblNumConta1.setText("Conta: " + objConta1.getNumero());
    
    lblNomeConta2.setText("Nome: " + objConta2.getNomeTitular());
    lblSaldoConta2.setText("Saldo: " + objConta2.getSaldo());
    lblNumConta2.setText("Conta: " + objConta2.getNumero());
    
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnSacarConta1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnDepositarConta1 = new javax.swing.JButton();
        btnTransferir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblNomeConta1 = new javax.swing.JLabel();
        lblSaldoConta1 = new javax.swing.JLabel();
        lblNumConta1 = new javax.swing.JLabel();
        lblNumConta2 = new javax.swing.JLabel();
        lblSaldoConta2 = new javax.swing.JLabel();
        lblNomeConta2 = new javax.swing.JLabel();
        txtValorGeral = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnSacarConta3 = new javax.swing.JButton();
        btnDepositarConta2 = new javax.swing.JButton();
        btnTransferir1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Conta 1");
        jLabel1.setToolTipText("");

        btnSacarConta1.setText("Sacar");
        btnSacarConta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSacarConta1MousePressed(evt);
            }
        });
        btnSacarConta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarConta1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Conta 2");

        btnDepositarConta1.setText("Depositar");
        btnDepositarConta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDepositarConta1MousePressed(evt);
            }
        });
        btnDepositarConta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarConta1ActionPerformed(evt);
            }
        });

        btnTransferir.setText("Transferir");
        btnTransferir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTransferirMousePressed(evt);
            }
        });
        btnTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirActionPerformed(evt);
            }
        });

        lblNomeConta1.setText("Nome:");

        lblSaldoConta1.setText("Saldo:");

        lblNumConta1.setText("Conta:");

        lblNumConta2.setText("Conta:");

        lblSaldoConta2.setText("Saldo:");

        lblNomeConta2.setText("Nome:");

        txtValorGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorGeralActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aula4/Images/banco-do-brasil-01-logo.png"))); // NOI18N

        btnSacarConta3.setText("Sacar");
        btnSacarConta3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSacarConta3MousePressed(evt);
            }
        });
        btnSacarConta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarConta3ActionPerformed(evt);
            }
        });

        btnDepositarConta2.setText("Depositar");
        btnDepositarConta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDepositarConta2MousePressed(evt);
            }
        });
        btnDepositarConta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarConta2ActionPerformed(evt);
            }
        });

        btnTransferir1.setText("Transferir");
        btnTransferir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTransferir1MousePressed(evt);
            }
        });
        btnTransferir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferir1ActionPerformed(evt);
            }
        });

        jLabel5.setText("CE:");

        jLabel6.setText("CE:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(416, 416, 416)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSacarConta3)
                                    .addComponent(btnDepositarConta2)
                                    .addComponent(btnTransferir1)))
                            .addComponent(btnDepositarConta1)
                            .addComponent(btnSacarConta1)
                            .addComponent(btnTransferir)
                            .addComponent(txtValorGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumConta1)
                            .addComponent(lblNomeConta1)
                            .addComponent(lblSaldoConta1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(368, 368, 368)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNumConta2)
                                .addComponent(lblSaldoConta2)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNomeConta2)
                                .addGap(3, 3, 3))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(477, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(361, 361, 361)
                        .addComponent(jLabel3)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomeConta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSaldoConta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumConta1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(563, 563, 563)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNomeConta2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSaldoConta2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumConta2)))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(2, 2, 2)
                .addComponent(txtValorGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSacarConta1)
                    .addComponent(btnSacarConta3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDepositarConta1)
                    .addComponent(btnDepositarConta2))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTransferir)
                    .addComponent(btnTransferir1))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSacarConta1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSacarConta1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSacarConta1MousePressed

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

    private void btnDepositarConta1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepositarConta1MousePressed

        
    }//GEN-LAST:event_btnDepositarConta1MousePressed

    private void btnDepositarConta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarConta1ActionPerformed
        //Depositar na conta
        double valorDeposito = Double.parseDouble(txtValorGeral.getText());
        objConta1.Depositar(valorDeposito);
        lblSaldoConta1.setText("Saldo: R$"+objConta1.getSaldo());    }//GEN-LAST:event_btnDepositarConta1ActionPerformed

    private void btnTransferirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransferirMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTransferirMousePressed

    private void btnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirActionPerformed
        //Transferir 
        double valorTransferencia = Double.parseDouble(txtValorGeral.getText());
        objConta1.transferir(valorTransferencia, objConta2 );
    }//GEN-LAST:event_btnTransferirActionPerformed

    private void txtValorGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorGeralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorGeralActionPerformed

    private void btnSacarConta3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSacarConta3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSacarConta3MousePressed

    private void btnSacarConta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarConta3ActionPerformed
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
    }//GEN-LAST:event_btnSacarConta3ActionPerformed

    private void btnDepositarConta2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepositarConta2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDepositarConta2MousePressed

    private void btnDepositarConta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarConta2ActionPerformed
        //Depositar na conta
        double valorDeposito = Double.parseDouble(txtValorGeral.getText());
        objConta1.Depositar(valorDeposito);
        lblSaldoConta1.setText("Saldo: R$"+objConta1.getSaldo());       
    }//GEN-LAST:event_btnDepositarConta2ActionPerformed

    private void btnTransferir1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransferir1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTransferir1MousePressed

    private void btnTransferir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferir1ActionPerformed
        //Transferir 
        double valorTransferencia = Double.parseDouble(txtValorGeral.getText());
        objConta2.transferir(valorTransferencia, objConta1 );
    }//GEN-LAST:event_btnTransferir1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameContas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepositarConta1;
    private javax.swing.JButton btnDepositarConta2;
    private javax.swing.JButton btnSacarConta1;
    private javax.swing.JButton btnSacarConta3;
    private javax.swing.JButton btnTransferir;
    private javax.swing.JButton btnTransferir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblNomeConta1;
    private javax.swing.JLabel lblNomeConta2;
    private javax.swing.JLabel lblNumConta1;
    private javax.swing.JLabel lblNumConta2;
    private javax.swing.JLabel lblSaldoConta1;
    private javax.swing.JLabel lblSaldoConta2;
    private javax.swing.JTextField txtValorGeral;
    // End of variables declaration//GEN-END:variables
}
