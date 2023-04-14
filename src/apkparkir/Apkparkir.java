/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apkparkir;
import java.awt.HeadlessException;
import java.security.PrivateKey;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Apkparkir extends javax.swing.JFrame {

    public Apkparkir() {
        initComponents();
        tampilData();
    }
    
    private void tampilData(){
        try{
            Connection conn=(Connection)koneksi.Koneksi.koneksi_db();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet sql=stm.executeQuery("SELECT * FROM tbparkir");
            jparkir.setModel(DbUtils.resultSetToTableModel(sql));
        }catch(SQLException | HeadlessException e){
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TDOSEN = new javax.swing.JLabel();
        TDOSEN1 = new javax.swing.JLabel();
        TDOSEN2 = new javax.swing.JLabel();
        TLAB1 = new javax.swing.JLabel();
        SIMPAN = new javax.swing.JButton();
        BARU = new javax.swing.JButton();
        KELUAR = new javax.swing.JButton();
        PLAT = new javax.swing.JTextField();
        NIM = new javax.swing.JTextField();
        JENIS = new javax.swing.JComboBox<>();
        IN = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jparkir = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel1.setText("APLIKASI PENDATAAN PARKIR");

        TDOSEN.setText("NO PLAT");

        TDOSEN1.setText("NO NIM");

        TDOSEN2.setText("JENIS KENDARAAN");

        TLAB1.setText("WAKTU MASUK");

        SIMPAN.setText("SIMPAN");
        SIMPAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIMPANActionPerformed(evt);
            }
        });

        BARU.setText("BARU");
        BARU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BARUActionPerformed(evt);
            }
        });

        KELUAR.setText("KELUAR");
        KELUAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KELUARActionPerformed(evt);
            }
        });

        PLAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLATActionPerformed(evt);
            }
        });

        NIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NIMActionPerformed(evt);
            }
        });

        JENIS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MOTOR", "MOBIL" }));

        IN.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.MINUTE));

        jparkir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jparkir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TDOSEN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PLAT, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TDOSEN1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NIM, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TDOSEN2)
                            .addComponent(TLAB1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JENIS, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IN, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SIMPAN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BARU)
                        .addGap(45, 45, 45)
                        .addComponent(KELUAR)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PLAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TDOSEN))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TDOSEN1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JENIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TDOSEN2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TLAB1)
                            .addComponent(IN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(KELUAR)
                            .addComponent(BARU)
                            .addComponent(SIMPAN)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SIMPANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIMPANActionPerformed
        try{
            String sql="INSERT INTO tbparkir(PLAT, NIM, JN_KENDARAAN, WAKTU_IN)VALUES('"+ PLAT.getText()+"','"+ NIM.getText()+"','"+ JENIS.getSelectedItem()+"','"+ IN.getValue()+"')";
            java.sql.Connection conn=(java.sql.Connection)koneksi.Koneksi.koneksi_db();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();

            tampilData();
            JOptionPane.showMessageDialog(null, "DATA TELAH DISIMPAN MANAJAJEMEN PARKIR");
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_SIMPANActionPerformed

    private void BARUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BARUActionPerformed
        PLAT.setText("");
        NIM.setText("");
    }//GEN-LAST:event_BARUActionPerformed

    private void KELUARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KELUARActionPerformed
        if(JOptionPane.showConfirmDialog(null,
            "Apakah yakin akan keluar?",
            "Konfirmasi",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);{
        System.exit(0);
        }
    }//GEN-LAST:event_KELUARActionPerformed

    private void PLATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLATActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PLATActionPerformed

    private void NIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NIMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NIMActionPerformed

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
            java.util.logging.Logger.getLogger(Apkparkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apkparkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apkparkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apkparkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apkparkir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BARU;
    private javax.swing.JSpinner IN;
    private javax.swing.JComboBox<String> JENIS;
    private javax.swing.JButton KELUAR;
    private javax.swing.JTextField NIM;
    private javax.swing.JTextField PLAT;
    private javax.swing.JButton SIMPAN;
    private javax.swing.JLabel TDOSEN;
    private javax.swing.JLabel TDOSEN1;
    private javax.swing.JLabel TDOSEN2;
    private javax.swing.JLabel TLAB1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jparkir;
    // End of variables declaration//GEN-END:variables
}
