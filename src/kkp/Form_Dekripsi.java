/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kkp;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Form_Dekripsi extends javax.swing.JFrame {

    private static int kd_file;
    ImageIcon img;
    
    public Form_Dekripsi() {
        initComponents();
        img = new ImageIcon("src/gambar/logo.jpg");
        setIconImage(img.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPilih = new javax.swing.JTextField();
        txtKunciPrivate = new javax.swing.JTextField();
        txtSave = new javax.swing.JTextField();
        btnpilihfile = new javax.swing.JButton();
        btnpilihkunci = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        btnDekrip = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Form Dekripsi");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(474, 302));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Pilih File               :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Kunci Private      :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tempat Simpan  :");

        txtPilih.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtKunciPrivate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnpilihfile.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnpilihfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/folder-yellow-explorer-icon2.png"))); // NOI18N
        btnpilihfile.setText("Pilih");
        btnpilihfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnpilihfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpilihfileActionPerformed(evt);
            }
        });

        btnpilihkunci.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnpilihkunci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/folder-yellow-explorer-icon2.png"))); // NOI18N
        btnpilihkunci.setText("Pilih");
        btnpilihkunci.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnpilihkunci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpilihkunciActionPerformed(evt);
            }
        });

        btnsimpan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/save2.png"))); // NOI18N
        btnsimpan.setText("Simpan");
        btnsimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSave)
                    .addComponent(txtPilih)
                    .addComponent(txtKunciPrivate, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnsimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnpilihkunci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnpilihfile, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPilih, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnpilihfile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKunciPrivate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnpilihkunci))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSave, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnsimpan))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 700, 140));

        btnDekrip.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDekrip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/unlock-icon2.png"))); // NOI18N
        btnDekrip.setText("Dekrip");
        btnDekrip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDekrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDekripActionPerformed(evt);
            }
        });
        jPanel1.add(btnDekrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 110, 40));

        btnHapus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/clear2.png"))); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 110, 40));

        btnKeluar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/cancel-icon2.png"))); // NOI18N
        btnKeluar.setText("Kembali");
        btnKeluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        jPanel1.add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 110, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/MAN 12 Jakarta.jpg"))); // NOI18N
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel7)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        MenuUtama menu;
        try {
            menu = new MenuUtama();
            menu.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Form_Dekripsi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
        if(!(txtPilih.getText().equals("") || txtKunciPrivate.getText().equals(""))){
          try{
              JFileChooser chooser = new JFileChooser("D:\\") {
            public void approveSelection() {
                if (getSelectedFile().isFile()) {
                    return;
                } else {
                    super.approveSelection();
                }
            }
        };
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int returnVal = chooser.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                File directory = chooser.getSelectedFile();
                txtSave.setText(directory.getAbsolutePath() );
            } catch (Exception except) {
                //msg if opening failsAT
                JOptionPane.showMessageDialog(this, "File Tidak Sesuai!","Attention", JOptionPane.ERROR_MESSAGE);
                txtSave.setText("");
            }
        }
          }catch(Exception e){
              
          }
      }else {
          JOptionPane.showMessageDialog(this, "Silahkan Isi Form Terlebih Dahulu !","Attention", JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnpilihkunciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpilihkunciActionPerformed
        // TODO add your handling code here:
         if(!(txtPilih.getText().equals(""))){
           JFileChooser dataFile = new JFileChooser("D:\\");
       
            FileNameExtensionFilter filter = new FileNameExtensionFilter("private key", "PrivateKey");
            dataFile.setFileFilter(filter);
            dataFile.setAcceptAllFileFilterUsed(false);
            int returnVal = dataFile.showOpenDialog(null);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = dataFile.getSelectedFile();
                String dir = file.getAbsolutePath();
                txtKunciPrivate.setText(dir);
            }
       }else {
            JOptionPane.showMessageDialog(null, "Silahkan Pilih File Terlebih Dahulu !","Attention", JOptionPane.ERROR_MESSAGE);
            txtPilih.requestFocus();
       }
    }//GEN-LAST:event_btnpilihkunciActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        bersih();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnpilihfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpilihfileActionPerformed
        // TODO add your handling code here:
        JFileChooser datafile = new JFileChooser("D:\\");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("File Document","doc","docx","xls","xlsx","pdf","txt");

        datafile.setFileFilter(filter);
         datafile.setAcceptAllFileFilterUsed(false);
        int returnVal = datafile.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            File file = datafile.getSelectedFile();
            String dir = file.getAbsolutePath(); 
            txtPilih.setText(dir);
        } 
    }//GEN-LAST:event_btnpilihfileActionPerformed

    private void btnDekripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDekripActionPerformed
        // TODO add your handling code here:
        dekrip();
    }//GEN-LAST:event_btnDekripActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Dekripsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Dekripsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Dekripsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Dekripsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Dekripsi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDekrip;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnpilihfile;
    private javax.swing.JButton btnpilihkunci;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtKunciPrivate;
    private javax.swing.JTextField txtPilih;
    private javax.swing.JTextField txtSave;
    // End of variables declaration//GEN-END:variables


    private void bersih(){
        txtPilih.setText("");
        txtKunciPrivate.setText("");
        txtSave.setText("");
    }
    
    private void dekrip(){
        Thread t =  new Thread(new Runnable(){
            @Override
            public void run(){
                String file1 = (txtPilih.getText());
                File file = new File (txtPilih.getText());
                String save = (txtSave.getText());
                String KunciPrivate = (txtKunciPrivate.getText());
                int dot = file1.lastIndexOf(".");
                int sep = file1.replace("\\", "/").lastIndexOf("/");
                String totalWaktu;
                long start, end;
                double ukuran = file.length()/1024;

                    Enkrip_Dekrip elgamal = new Enkrip_Dekrip();
                    koneksi koneksi = new koneksi();
                    Form_Laporan frm = new Form_Laporan();
                    
                    if (!(KunciPrivate.equals("") || file.equals("") || save.equals(""))) {
                    try {
                        btnDekrip.setEnabled(false);
                        btnHapus.setEnabled(false);
                        btnKeluar.setEnabled(false);
                        btnpilihfile.setEnabled(false);
                        btnpilihkunci.setEnabled(false);
                        btnsimpan.setEnabled(false);
                        txtKunciPrivate.setEnabled(false);
                        txtPilih.setEnabled(false);
                        txtSave.setEnabled(false);
                        start = System.currentTimeMillis();
                            elgamal.setPrivateKey(KunciPrivate);
                            elgamal.dekrip(file, save);
                        end = System.currentTimeMillis();
                        totalWaktu = String.valueOf((end-start)/1000.0);
                        JOptionPane.showMessageDialog(null, "Proses Dekripsi Sudah Selesai Dengan waktu "+totalWaktu+" Detik" 
                                ,"PESAN", JOptionPane.INFORMATION_MESSAGE);
                        
                        btnDekrip.setEnabled(true);
                        btnHapus.setEnabled(true);
                        btnKeluar.setEnabled(true);
                        btnpilihfile.setEnabled(true);
                        btnpilihkunci.setEnabled(true);
                        btnsimpan.setEnabled(true);
                        txtKunciPrivate.setEnabled(true);
                        txtPilih.setEnabled(true);
                        txtSave.setEnabled(true);
                        
                        kd_file = Session.get_row();
                        kd_file = kd_file +1;
                        String kd = String.valueOf(kd_file);
                        if(kd.length()==1)kd="F00"+kd;
                        else if (kd.length()==2)kd="F0"+kd;
                        else if (kd.length()==3)kd="F"+kd;
                        String user = Session.get_kd_user();
                        
                        
                        Connection con = koneksi.bukaKoneksi();
                        Statement st = con.createStatement();
                        st.executeUpdate("Insert into laporan values('"+kd+"','"+file.getName()+"','"+ukuran+"','Dekripsi','"+totalWaktu+"','"+user+"')");
                        System.out.println("Data Tersimpan ke Dalam Database");
                      
                        st.close();
                        bersih();
                        } catch (IOException ex) {
                        Logger.getLogger(Form_Enkripsi.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (SQLException ex) {
                        Logger.getLogger(Form_Dekripsi.class.getName()).log(Level.SEVERE, null, ex);
                    }
                  } else {
                        JOptionPane.showMessageDialog(null, "Silahkan Lengkapi Form Terlebih Dahulu", "Peringatan", JOptionPane.ERROR_MESSAGE);
                        //bersih();
                        }
                        }

                    });
                    t.start();
        }
    
}