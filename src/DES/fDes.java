/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DES;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.swing.JOptionPane;

/**
 *
 * @author lengo
 */
public class fDes extends javax.swing.JFrame {

    /**
     * Creates new form fDes
     */
    public fDes() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtKey = new javax.swing.JTextField();
        btnHienthi = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        btnMahoa = new javax.swing.JButton();
        btnGiaima = new javax.swing.JButton();
        btnAll = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCt = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPt = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("DES");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Input Key");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Plain Text");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Cipher Text");

        btnHienthi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHienthi.setText("Hiển thị");
        btnHienthi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienthiActionPerformed(evt);
            }
        });

        btnGhi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGhi.setText("Ghi file");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        btnMahoa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMahoa.setText("Mã hóa");
        btnMahoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMahoaActionPerformed(evt);
            }
        });

        btnGiaima.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGiaima.setText("Giải mã");
        btnGiaima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaimaActionPerformed(evt);
            }
        });

        btnAll.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAll.setText("All show");

        txtCt.setColumns(20);
        txtCt.setRows(5);
        jScrollPane1.setViewportView(txtCt);

        txtPt.setColumns(20);
        txtPt.setRows(5);
        jScrollPane2.setViewportView(txtPt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(221, 221, 221)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(btnMahoa)
                                .addGap(54, 54, 54)
                                .addComponent(btnHienthi)
                                .addGap(51, 51, 51)
                                .addComponent(btnGhi))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(btnGiaima)
                                .addGap(78, 78, 78)
                                .addComponent(btnAll)))
                        .addGap(0, 85, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(39, 39, 39)
                                .addComponent(jScrollPane2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtKey)))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHienthi)
                    .addComponent(btnGhi)
                    .addComponent(btnMahoa))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGiaima)
                            .addComponent(btnAll))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private int mode;
    private static void doCopy(InputStream is, OutputStream os) throws IOException{
        byte[] bytes = new byte[64];
        int numBytes;
        while((numBytes = is.read(bytes)) != -1){
            os.write(bytes, 0, numBytes);
        }
        os.flush();
        os.close();
        is.close();
    }
    public static void encrypt(String key, InputStream is, OutputStream os) throws Throwable{
        encryptOrDecypt(key, Cipher.ENCRYPT_MODE, is, os);
    }
    
    public static void decrypt(String key, InputStream is, OutputStream os) throws Throwable{
        encryptOrDecypt(key, Cipher.DECRYPT_MODE, is, os);
    }
    
    
    public static void encryptOrDecypt(String key, int mode, InputStream is, OutputStream os) throws Throwable{
        DESKeySpec dks = new DESKeySpec(key.getBytes());
        SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
        SecretKey desKey = skf.generateSecret(dks);
        Cipher cipher = Cipher.getInstance("DES");
        
        if(mode == Cipher.ENCRYPT_MODE){
            cipher.init(Cipher.ENCRYPT_MODE, desKey);
            CipherInputStream cis = new CipherInputStream(is, cipher);
            doCopy(cis, os);
        }else if(mode == Cipher.DECRYPT_MODE){
            cipher.init(Cipher.DECRYPT_MODE, desKey);
            CipherOutputStream cos = new CipherOutputStream(os, cipher);
            doCopy(is, cos);
        }
    }
    
    
    private void btnMahoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMahoaActionPerformed
        
        try{
            String key = txtKey.getText();
            
            FileInputStream fis = new FileInputStream("D:\\Des.txt");
            FileOutputStream fos = new FileOutputStream("D:\\EnDes.txt");
            encrypt(key, fis, fos);
            JOptionPane.showMessageDialog(null, "Đã mã hóa văn bản!!");
        }catch(Throwable e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnMahoaActionPerformed

    private void btnGiaimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaimaActionPerformed
        // TODO add your handling code here:
        FileInputStream fis2 = null;
        try{
            String key = txtKey.getText();
            fis2 = new FileInputStream("D:\\EnDes.txt");
            FileOutputStream fos2 = new FileOutputStream("D:\\DeDes.txt");
            decrypt(key, fis2, fos2);
            BufferedReader br = null;
            
            br = new BufferedReader(new FileReader("D:\\DeDes.txt"));
            StringBuffer sb = new StringBuffer();
            JOptionPane.showMessageDialog(null, "Đã giải mã!!!");
            char[] ca = new char[5];
            while(br.ready()){
                int len = br.read(ca);
                sb.append(ca, 0, len);
            }
            br.close();
            String chuoi = sb.toString();
            System.out.println("Du lieu la: " + chuoi);
            txtPt.setText(chuoi);
        }catch(Throwable ex){
            Logger.getLogger(fDes.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try{
                fis2.close();
            }catch(IOException ex){
                Logger.getLogger(fDes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnGiaimaActionPerformed
    
    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed
        // TODO add your handling code here:
        try{
            BufferedWriter bw = null;
            String fileName = "D:\\Des.txt";
            String s = txtPt.getText();
            bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(s);
            bw.close();
            JOptionPane.showMessageDialog(null, "Da ghi file!!!");
            txtCt.setText(s);
        }catch(IOException ex){
            Logger.getLogger(fDes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGhiActionPerformed

    private void btnHienthiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienthiActionPerformed

        try{
                BufferedReader br = null;
                String fileName = "D:\\EnDes.txt";
                br = new BufferedReader(new FileReader(fileName));
                StringBuffer sb = new StringBuffer();
                JOptionPane.showMessageDialog(null, "Da mo file!!!");
                char[] ca = new char[5];
                while(br.ready()){
                    int len = br.read(ca);
                    sb.append(ca, 0, len);
                }
                br.close();
                String chuoi = sb.toString();
                System.out.println("Du lieu la: " + chuoi);
                txtCt.setText(chuoi);
        }catch(IOException ex){
            Logger.getLogger(fDes.class.getName()). log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHienthiActionPerformed

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
            java.util.logging.Logger.getLogger(fDes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fDes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fDes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fDes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fDes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAll;
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnGiaima;
    private javax.swing.JButton btnHienthi;
    private javax.swing.JButton btnMahoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtCt;
    private javax.swing.JTextField txtKey;
    private javax.swing.JTextArea txtPt;
    // End of variables declaration//GEN-END:variables
}
