package Tugas2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class KonversiSuhu extends javax.swing.JFrame {

    /**
     * Creates new form TugasKonversiSuhu
     */
    public KonversiSuhu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grub1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtangka = new javax.swing.JTextField();
        radio2 = new javax.swing.JRadioButton();
        radio1 = new javax.swing.JRadioButton();
        radio = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txthasil = new javax.swing.JTextField();
        masukkan = new javax.swing.JButton();
        reset1 = new javax.swing.JButton();
        keluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(51, 255, 51));

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setForeground(new java.awt.Color(0, 0, 102));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("KONVERSI SUHU");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(154, 154, 154))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Reamur");

        txtangka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtangkaActionPerformed(evt);
            }
        });

        radio2.setBackground(new java.awt.Color(0, 0, 102));
        grub1.add(radio2);
        radio2.setForeground(new java.awt.Color(204, 204, 255));
        radio2.setText("Farenheit");
        radio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio2ActionPerformed(evt);
            }
        });

        radio1.setBackground(new java.awt.Color(0, 0, 102));
        grub1.add(radio1);
        radio1.setForeground(new java.awt.Color(204, 204, 255));
        radio1.setText("Kelvin");
        radio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio1MouseClicked(evt);
            }
        });
        radio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio1ActionPerformed(evt);
            }
        });

        radio.setBackground(new java.awt.Color(0, 0, 102));
        grub1.add(radio);
        radio.setForeground(new java.awt.Color(204, 204, 255));
        radio.setText("Celcius");
        radio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioMouseClicked(evt);
            }
        });
        radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Hasil");

        txthasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthasilActionPerformed(evt);
            }
        });

        masukkan.setText("Konversikan");
        masukkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masukkanActionPerformed(evt);
            }
        });

        reset1.setText("reset");
        reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset1ActionPerformed(evt);
            }
        });

        keluar.setText("keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(txtangka, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(radio2)
                                .addGap(42, 42, 42)
                                .addComponent(radio)
                                .addGap(48, 48, 48)
                                .addComponent(radio1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txthasil, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(masukkan)
                        .addGap(57, 57, 57)
                        .addComponent(reset1)
                        .addGap(56, 56, 56)
                        .addComponent(keluar)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtangka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio2)
                    .addComponent(radio)
                    .addComponent(radio1))
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txthasil)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(masukkan)
                    .addComponent(reset1)
                    .addComponent(keluar))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txthasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthasilActionPerformed

    private void txtangkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtangkaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtangkaActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    private void reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset1ActionPerformed
        // TODO add your handling code here:
        txtangka.setText("");
        txthasil.setText("");
    }//GEN-LAST:event_reset1ActionPerformed

    private void radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioActionPerformed

    private void radioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioMouseClicked
        // TODO add your handling code here:
        radio1.setSelected(false);
        radio2.setSelected(false);
    }//GEN-LAST:event_radioMouseClicked

    private void radio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio1MouseClicked
        // TODO add your handling code here:
        radio.setSelected(false);
        radio2.setSelected(false);
    }//GEN-LAST:event_radio1MouseClicked

    private void masukkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masukkanActionPerformed
        // TODO add your handling code here:
        double reamur,hasil = 0;
        
        reamur =Double.parseDouble(txtangka.getText());
        
        if(radio2.isSelected())
        {
            hasil = (9/4*reamur)+32;
        }
        else
        if(radio1.isSelected())
        {
            hasil = (5/4*reamur)+273;
        }
        else
        if(radio.isSelected())
        {
            hasil = (1.25)*reamur;
        }
        
        txthasil.setText(String.valueOf(hasil));
        
    }//GEN-LAST:event_masukkanActionPerformed

    private void radio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio2ActionPerformed

    private void radio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio1ActionPerformed

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
            java.util.logging.Logger.getLogger(TugasKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TugasKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TugasKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TugasKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grub1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton keluar;
    private javax.swing.JButton masukkan;
    private javax.swing.JRadioButton radio;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JButton reset1;
    private javax.swing.JTextField txtangka;
    private javax.swing.JTextField txthasil;
    // End of variables declaration//GEN-END:variables
}
