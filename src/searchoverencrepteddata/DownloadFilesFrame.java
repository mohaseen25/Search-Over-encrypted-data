/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchoverencrepteddata;

import CurrentTime.CurrentTime;
import FileReadandWrite.TextFileReader;
import FileReadandWrite.FileWriter;
import Cloud.TokenForDownload;
import DataBase.Catalog;
import DataBase.DownloadHistory;
import DataBase.UploadHistory;
import DataBase.downloadcatalog;
import Decryption.Decrypt;
import Encryption.Block;
import com.dropbox.core.DbxException;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static searchoverencrepteddata.FileChoose.Token;
import static searchoverencrepteddata.Operation.uname;
import static searchoverencrepteddata.ShowUploadHistoryFrame.str;
import static searchoverencrepteddata.ShowUploadHistoryFrame.username;

/**
 *
 * @author USER
 */
public class DownloadFilesFrame extends javax.swing.JFrame {
public static String ar[][];
public static String uname;

 
    /**
     * Creates new form ShowDownloadedFilesFrame
     */
    public DownloadFilesFrame() {
        super("Download Files");
      
        initComponents();
        
        String arr[][]=new String[ar.length][1];
        int ct=0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                if(j==1)
                {
                    arr[ct++][0]=ar[i][j];
                }
            }
        }
       
        String ar1[]={"Files Name"};
     
        jTable1.setModel(new javax.swing.table.DefaultTableModel(arr,ar1));
     
       
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(null);

        jTable1.setBackground(new java.awt.Color(153, 204, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(21, 52, 196, 90);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(349, 53, 163, 20);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Download");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(348, 161, 110, 20);

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel1.setText("Text File");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(253, 52, 80, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(380, 120, 530, 300);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searchoverencrepteddata/cloud2.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-270, -10, 4190, 650);

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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int ct=0;
        String arr[][]=new String[ar.length][1];
         for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                if(j==1)
                {
                    arr[ct++][0]=ar[i][j];
                }
            }
        }
        int index=jTable1.getSelectedRow();
        String x=arr[index][0];
       
      jTextField1.setText(x);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  
        String fname=jTextField1.getText();
       String fname1="Encrypted_"+fname;
        String token=Token;
       
        TokenForDownload dw=new TokenForDownload();
    try {
        dw.AccessTokenforDownload(fname1, token);
    } catch (DbxException ex) {
        Logger.getLogger(DownloadFilesFrame.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(DownloadFilesFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
     downloadcatalog ct=new downloadcatalog();
    String path="F:\\java data\\java\\SearchOED\\"+fname1;
    String path1="F:\\java data\\java\\SearchOED\\"+fname;
    TextFileReader fr=new TextFileReader();
    String EncFile= fr.getContent(path);
    File ff=new File(path);
    ff.delete();
    Decrypt de=new Decrypt();
    String DecFile=de.getDecrypt(EncFile);
     ArrayList al1=new ArrayList();
      
        al1=new Block().getDev(DecFile);
        String finString=de.getStr(al1);
        
        FileWriter fw=new FileWriter();
        fw.createFile(finString, path1);
        
            String time=new CurrentTime().getDate();
            boolean flag=ct.InsertTiming(uname, fname, time);
            if(flag)
            {
    JOptionPane.showMessageDialog(null,"FILE DOWNLOADED SUCCESSFULLY");
       this.dispose();

                Operation op=new Operation();
                op.setVisible(true);
                Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
                op.setSize(d);
              op.setName(uname);
                Operation.uname=uname;
                UpdateFrame.uname=uname;
 
            }
            else
            {
                 JOptionPane.showMessageDialog(null,"ERROR IN DOWNLOADING");
            }
         
     
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DownloadFilesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DownloadFilesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DownloadFilesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DownloadFilesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DownloadFilesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}