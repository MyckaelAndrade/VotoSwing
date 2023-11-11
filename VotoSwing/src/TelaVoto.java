
public class TelaVoto extends javax.swing.JFrame {

    public TelaVoto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        btnCalc = new javax.swing.JButton();
        lblText = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Data de Nascimento");

        txtNum.setBackground(new java.awt.Color(255, 255, 255));
        txtNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumActionPerformed(evt);
            }
        });

        btnCalc.setBackground(new java.awt.Color(153, 153, 255));
        btnCalc.setForeground(new java.awt.Color(0, 0, 0));
        btnCalc.setText("Verificar");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        lblText.setText("Posso votar?");

        txtId.setText("Idade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId)
                    .addComponent(lblText)
                    .addComponent(btnCalc)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCalc)
                .addGap(18, 18, 18)
                .addComponent(lblText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumActionPerformed

    }//GEN-LAST:event_txtNumActionPerformed

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        int n = Integer.parseInt(txtNum.getText());
        int i = 2023 - n;
        String nVotar = "Não pode votar!";
        String oVotar = "Pode Votar mas não é obrigatório";
        String obVotar = "Voto Obrigatório";
        if (i < 16) {
            lblText.setText(nVotar);
        } else {
            if (i >= 16 && i <= 18 || i > 70) {
                lblText.setText(oVotar);
            } else {
                lblText.setText(obVotar);
            }
        }
        txtId.setText(Integer.toString(i));
    }//GEN-LAST:event_btnCalcActionPerformed
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaVoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVoto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel txtId;
    private javax.swing.JTextField txtNum;
    // End of variables declaration//GEN-END:variables
}
