/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchoverencrepteddata;

import CurrentTime.CurrentTime;
import FileReadandWrite.TextFileReader;
import FileReadandWrite.FileWriter;
import DataBase.Catalog;
import DataBase.DownloadHistory;
import DataBase.UploadHistory;
import Encryption.Block;
import Bucket.Bucket;
import Encryption.Encry;
import Encryption.Encryption;
import Bucket.Hashing;
import PreProcessing.PrePro;
import PreProcessing.SpecialSymb;
import PreProcessing.Steaming;
import PreProcessing.StopWord;
import cloud.AccessToken;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import javafx.stage.FileChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static searchoverencrepteddata.UpdateFrame.uname;

/**
 *
 * @author USER
 */
public class FileChoose extends javax.swing.JFrame {
public static String Token;
    /**
     * Creates new form FileChoose
     */
    public FileChoose() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 3, 1, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        jLabel1.setText("Choose File");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("UPLOAD FILE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jButton2)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(49, 49, 49)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(460, 160, 478, 252);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(232, 95, 0, 0);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searchoverencrepteddata/cryp4.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-280, -30, 1780, 1160);

        jMenu2.setText("Manage Profile");

        jMenuItem1.setText("Edit Profile");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu8.setText("Upload Data");

        jMenuItem2.setText("Upload File");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem2);

        jMenuItem3.setText("View Upload History");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem3);

        jMenuBar1.add(jMenu8);

        jMenu9.setText("Download");

        jMenuItem4.setText("Download File");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem4);

        jMenuItem5.setText("Download History");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem5);

        jMenuBar1.add(jMenu9);

        jMenu10.setText("Search");

        jMenuItem7.setText("Search File");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem7);

        jMenuBar1.add(jMenu10);

        jMenu3.setText("Logout");

        jMenuItem6.setText("Logout");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser fc=new JFileChooser();
        fc.showOpenDialog(fc);
        File f=fc.getSelectedFile();
        String path=f.getAbsolutePath();
        jTextField1.setText(path);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   
        String path = jTextField1.getText();
        if (path.isEmpty()) {
            JOptionPane.showMessageDialog(null, "PLEASE CHOOSE FILE FIRST");
        } else {
            String File = getFile();
            String Prepro = new PrePro().getPrePro(File);
            String EncFile = new Encryption().getEncryptedFile(Prepro);
            String FeatureFile = new Bucket().getBucket(Prepro);
            CreateFile(EncFile,FeatureFile);
            UploadFile();
            this.dispose();
            Operation op = new Operation();
            op.setVisible(true);
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            op.setSize(d);

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.dispose();

        UpdateFrame up=new UpdateFrame();
        up.setVisible(true);
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        up.setSize(d);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        this.dispose();

        FileChoose fc=new FileChoose();
        fc.setVisible(true);
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        fc.setSize(d);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        this.dispose();

        UploadHistory up=new UploadHistory();
        ArrayList al= up.getUploadHistory(uname);
        String str1[][]=new String[(al.size()/3)][3];

        int ct=0;
        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str1[0].length; j++) {
                str1[i][j]=(String)al.get(ct++);
            }

        }

        ShowUploadHistoryFrame.str=str1;
        ShowUploadHistoryFrame.username=uname;
        ShowUploadHistoryFrame sh=new ShowUploadHistoryFrame();
        sh.setVisible(true);
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        sh.setSize(d);

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        this.dispose();

        UploadHistory up=new UploadHistory();
        ArrayList al= up.getUploadHistory(uname);
        String str1[][]=new String[(al.size()/3)][3];

        int ct=0;
        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str1[0].length; j++) {
                str1[i][j]=(String)al.get(ct++);
            }

        }

        DownloadFilesFrame.ar=str1;
        DownloadFilesFrame.uname=uname;
        DownloadFilesFrame dh=new DownloadFilesFrame();
        dh.setVisible(true);
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        dh.setSize(d);

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        this.dispose();

        DownloadHistory up=new DownloadHistory();
        ArrayList al= up.getDownloadHistory(uname);
        String str1[][]=new String[(al.size()/3)][3];

        int ct=0;
        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str1[0].length; j++) {
                str1[i][j]=(String)al.get(ct++);
            }

        }

        ShowDownloadHistoryFrame.str1=str1;

        ShowDownloadHistoryFrame sh=new ShowDownloadHistoryFrame();
        sh.setVisible(true);
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        sh.setSize(d);

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        this.dispose();
        SearchFrame sf=new SearchFrame();
        sf.setVisible(true);
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        sf.setSize(d);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        this.dispose();
        LoginFrame lf=new LoginFrame();
        lf.setVisible(true);
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        lf.setSize(d);
    }//GEN-LAST:event_jMenuItem6ActionPerformed
    public String getFile()
    {
        String path = jTextField1.getText();
          TextFileReader fr = new TextFileReader();
            File ff = new File(path);
            String name = ff.getName();
             String File = fr.getContent(path);
             return File;
    }
public void CreateFile(String Encription,String Feature)
{
    String path = jTextField1.getText();
    File ff = new File(path);
            String name = ff.getName();
    String path1 = "F:\\java data\\java\\SearchOED\\Encrypted_" + name;
            String path2 = "F:\\java data\\java\\SearchOED\\Featured_" + name;
            FileWriter fw = new FileWriter();
            fw.createFile(Encription, path1);
          
         
            fw.createFile(Feature,path2);
}
public void UploadFile()
{
     String path = jTextField1.getText();
    File ff = new File(path);
            String name = ff.getName();
     String token = Token;
      String path1 = "F:\\java data\\java\\SearchOED\\Encrypted_" + name;
            String path2 = "F:\\java data\\java\\SearchOED\\Featured_" + name;
            AccessToken at = new AccessToken();
            at.AccessToken(token, path1);
            at.AccessToken(token, path2);
            Catalog ct = new Catalog();
            String time = new CurrentTime().getDate();
            boolean flag = ct.InsertTiming(uname, name, time);
            if (flag) {
                JOptionPane.showMessageDialog(null, "FILE " + name + " SUCCESSFULLU UPLOADED ON CLOUD");
            }
            File f1 = new File(path1);
            File f2 = new File(path2);
            f1.delete();
            f2.delete();
}
    
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
            java.util.logging.Logger.getLogger(FileChoose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FileChoose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FileChoose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FileChoose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FileChoose().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
