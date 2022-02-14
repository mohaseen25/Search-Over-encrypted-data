/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchoverencrepteddata;

import Bucket.Bucket;
import Cloud.TokenForDownload;
import DataBase.DownloadHistory;
import DataBase.UploadHistory;
import FileReadandWrite.TextFileReader;
import PreProcessing.PrePro;
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

/**
 *
 * @author USER
 */
public class SearchFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public SearchFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
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

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(450, 300, 472, 179);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searchoverencrepteddata/login5.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -60, 2140, 830);

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
        String str1 = jTextField1.getText();
        if (str1.isEmpty()) {
            JOptionPane.showMessageDialog(null, "TEXTFIELD IS BLANK");
        } else {
            String pre = new PrePro().getPrePro(str1);
            String FeatureFile = new Bucket().getBucket(pre);
            String hash1[] = FeatureFile.split(" ");
            String[][] arr = str;
            if (arr.length == 0) {
                JOptionPane.showMessageDialog(null, "YOU DID NOT UPLOAD ANY FILE");
            } else {
                String unique = "";
                for (int i = 0; i < str.length; i++) {
                    if (!unique.contains(str[i][1])) {

                        unique = unique + str[i][1] + " ";
                    }
                }
                String unique1[] = unique.split(" ");
                for (int i = 0; i < unique1.length; i++) {
                    String un = (String) unique1[i];
                    String fname1 = "Featured_" + un;
                    String token = Token;

                    TokenForDownload dw = new TokenForDownload();
                    try {
                        dw.AccessTokenforDownload(fname1, token);
                    } catch (DbxException ex) {
                        Logger.getLogger(DownloadFilesFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(DownloadFilesFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                String names = "";
                for (int i = 0; i < unique1.length; i++) {
                    TextFileReader tr = new TextFileReader();
                    String path = "F:\\SearchOED\\Featured_" + unique1[i];
                    String file = tr.getContent(path);
                    String hash2[] = file.split(" ");

                    boolean flag = false;
                    for (int j = 0; j < hash1.length; j++) {
                        for (int k = 0; k < hash2.length; k++) {

                            if (hash1[j].equals(hash2[k])) {
                                flag = true;
                                break;
                            }

                        }
                    }
                    if (flag) {
                        names = names + unique1[i] + " ";
                    }

                }
                if (names.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "FILE NOT FOUND");
                } else {
                    String name1[] = names.split(" ");
                    for (int i = 0; i < unique1.length; i++) {
                        String path = "F:\\SearchOED\\Featured_" + unique1[i];
                        File ff = new File(path);
                        ff.delete();
                    }
                    String FileName[][] = new String[name1.length][1];
                    for (int i = 0; i < name1.length; i++) {
                        FileName[i][0] = name1[i];
                    }
                    String ar[] = {"File Name"};

                    jTable1.setModel(new javax.swing.table.DefaultTableModel(FileName, ar));
                }
            }
    }//GEN-LAST:event_jButton1ActionPerformed
    }
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
            java.util.logging.Logger.getLogger(SearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
