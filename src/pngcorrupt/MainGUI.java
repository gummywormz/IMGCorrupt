/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pngcorrupt;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * GUI Window
 * NOTE: You can't actually display the corrupted PNGs in Java.
 * @author Paul Alves
 */
public class MainGUI extends javax.swing.JFrame {

    
    private IMGCorrupt p;
    private File f;
    private File oFile;
    private boolean open = true;
    private String type;
    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
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

        corruptSettings = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        seedField = new javax.swing.JTextField();
        offsetField = new javax.swing.JTextField();
        byteField = new javax.swing.JTextField();
        okSaveSettings = new javax.swing.JButton();
        openOnC = new javax.swing.JCheckBox();
        openFile = new javax.swing.JFileChooser();
        err = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        closeErr = new javax.swing.JButton();
        err2 = new javax.swing.JDialog();
        err2Ok = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        err3 = new javax.swing.JDialog();
        err3OK = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        openBtn = new javax.swing.JButton();
        reloadBtn = new javax.swing.JButton();
        settingsBtn = new javax.swing.JButton();
        corruptBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fileStat = new javax.swing.JLabel();

        corruptSettings.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        corruptSettings.setTitle("IMGCorrupt Settings");
        corruptSettings.setAlwaysOnTop(true);
        corruptSettings.setResizable(false);

        jLabel1.setText(" Seed:");

        jLabel2.setText(" Offset:");

        jLabel3.setText(" Maximum Bytes:");

        seedField.setText("0");

        offsetField.setText("1500");
        offsetField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offsetFieldActionPerformed(evt);
            }
        });

        byteField.setText("1580");

        okSaveSettings.setText("Apply");
        okSaveSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okSaveSettingsActionPerformed(evt);
            }
        });

        openOnC.setSelected(true);
        openOnC.setText("Open file when corrupted:         ");
        openOnC.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout corruptSettingsLayout = new javax.swing.GroupLayout(corruptSettings.getContentPane());
        corruptSettings.getContentPane().setLayout(corruptSettingsLayout);
        corruptSettingsLayout.setHorizontalGroup(
            corruptSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corruptSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(corruptSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(corruptSettingsLayout.createSequentialGroup()
                        .addGroup(corruptSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(57, 57, 57)
                        .addGroup(corruptSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(corruptSettingsLayout.createSequentialGroup()
                                .addComponent(byteField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(80, Short.MAX_VALUE))
                            .addGroup(corruptSettingsLayout.createSequentialGroup()
                                .addGroup(corruptSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(seedField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                    .addComponent(offsetField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(openOnC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, corruptSettingsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(okSaveSettings)
                .addContainerGap())
        );
        corruptSettingsLayout.setVerticalGroup(
            corruptSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corruptSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(corruptSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(seedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(corruptSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(offsetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(corruptSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(byteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(openOnC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(okSaveSettings)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        openFile.setApproveButtonText("Open");
        openFile.setDialogTitle("PNGCorrupt - Open File");
        openFile.setFileFilter(new FileNameExtensionFilter("Images", new String[] { "PNG", "png", "jpg", "JPG", "jpeg", "JPEG", "gif","GIF" }));

        err.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        err.setTitle("PNGCorrupt - Error");
        err.setAlwaysOnTop(true);
        err.setResizable(false);

        jLabel4.setText("Invalid seed, byte range, or offset!");

        closeErr.setText("OK");
        closeErr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeErrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout errLayout = new javax.swing.GroupLayout(err.getContentPane());
        err.getContentPane().setLayout(errLayout);
        errLayout.setHorizontalGroup(
            errLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(errLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, errLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeErr)
                .addContainerGap())
        );
        errLayout.setVerticalGroup(
            errLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(errLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeErr)
                .addContainerGap())
        );

        err2.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        err2.setTitle("PNGCorrupt - Error");
        err2.setAlwaysOnTop(true);
        err2.setResizable(false);

        err2Ok.setText("OK");
        err2Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                err2OkActionPerformed(evt);
            }
        });

        jLabel5.setText("File not loaded!");

        javax.swing.GroupLayout err2Layout = new javax.swing.GroupLayout(err2.getContentPane());
        err2.getContentPane().setLayout(err2Layout);
        err2Layout.setHorizontalGroup(
            err2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, err2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(err2Ok)
                .addContainerGap())
            .addGroup(err2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        err2Layout.setVerticalGroup(
            err2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, err2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(err2Ok)
                .addContainerGap())
        );

        err3.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        err3.setTitle("PNGCorrupt - Error");
        err3.setAlwaysOnTop(true);
        err3.setResizable(false);

        err3OK.setText("OK");
        err3OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                err3OKActionPerformed(evt);
            }
        });

        jLabel6.setText("Unable to open file!");

        javax.swing.GroupLayout err3Layout = new javax.swing.GroupLayout(err3.getContentPane());
        err3.getContentPane().setLayout(err3Layout);
        err3Layout.setHorizontalGroup(
            err3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, err3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(err3OK)
                .addContainerGap())
            .addGroup(err3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        err3Layout.setVerticalGroup(
            err3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, err3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(err3OK)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IMGCorrupt");

        openBtn.setText("Open");
        openBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openBtnActionPerformed(evt);
            }
        });

        reloadBtn.setText("Reload");
        reloadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloadBtnActionPerformed(evt);
            }
        });

        settingsBtn.setText("Settings");
        settingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsBtnActionPerformed(evt);
            }
        });

        corruptBtn.setText("Corrupt");
        corruptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corruptBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Welcome to IMGCorrupt!");

        jLabel8.setText("<HTML><BODY>Be sure to play around with the settings <BR> if you aren't getting anything interesting.</BODY></HTML>");

        fileStat.setText("File is not open!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(openBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(corruptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reloadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(settingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(fileStat)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(openBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(corruptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reloadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(settingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fileStat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openBtnActionPerformed
        int returnVal = openFile.showOpenDialog(MainGUI.this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
        oFile = openFile.getSelectedFile();
        String s = oFile.getPath();
    int i = s.lastIndexOf('.');
    if (i > 0) {
    type = s.substring(i+1);
    }
        s = s.substring(0,s.length()-4);
        s = s + "-c." + type;
        f = new File(s);
       copyFile();

            try {
                p = new IMGCorrupt(f,0,1580,0);
                fileStat.setText("File is open!");
            } catch (FileNotFoundException ex) {
                err3.pack();
                err3.show();
            }
        }
    }//GEN-LAST:event_openBtnActionPerformed

private void copyFile(){
//really dirty hack
        InputStream inStream = null;
        OutputStream outStream = null;
        try{
 
            inStream = new FileInputStream(oFile);
            outStream = new FileOutputStream(f);
 
            byte[] buffer = new byte[1024];
 
            int length;
            while ((length = inStream.read(buffer)) > 0){
                outStream.write(buffer, 0, length);
            }
 
            inStream.close();
            outStream.close();
 
        }catch(IOException e){
            err3.pack();
            err3.show();
        }
}
    
    private void corruptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corruptBtnActionPerformed
        if(p != null){
        try {
        p.corrupt();
        if(open){
        Desktop dt = Desktop.getDesktop();
        dt.open(f);
        }
        } catch (IOException ex) {
            ex.printStackTrace();
            err3.pack();
            err3.show();
        }}
    }//GEN-LAST:event_corruptBtnActionPerformed

    private void offsetFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offsetFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_offsetFieldActionPerformed

    private void okSaveSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okSaveSettingsActionPerformed
        if(p == null){
        err2.pack();
        err2.show();
        return;
        }
        
        try{
        p.setSeed(Long.parseLong(seedField.getText()));
        p.setMaxBytes(Integer.parseInt(byteField.getText()));
        p.setOffset(Long.parseLong(offsetField.getText()));
        open = openOnC.isSelected();
        }
        catch(java.lang.NumberFormatException e){
        err.pack();
        err.show();
        }
    }//GEN-LAST:event_okSaveSettingsActionPerformed

    private void closeErrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeErrActionPerformed
        err.dispose();
    }//GEN-LAST:event_closeErrActionPerformed

    private void settingsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsBtnActionPerformed
       corruptSettings.pack();
       corruptSettings.show();
    }//GEN-LAST:event_settingsBtnActionPerformed

    private void err2OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_err2OkActionPerformed
        err2.dispose();
    }//GEN-LAST:event_err2OkActionPerformed

    private void err3OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_err3OKActionPerformed
        err3.dispose();
    }//GEN-LAST:event_err3OKActionPerformed

    private void reloadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadBtnActionPerformed
        if(oFile != null){
        copyFile();
        }
    }//GEN-LAST:event_reloadBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField byteField;
    private javax.swing.JButton closeErr;
    private javax.swing.JButton corruptBtn;
    private javax.swing.JFrame corruptSettings;
    private javax.swing.JDialog err;
    private javax.swing.JDialog err2;
    private javax.swing.JButton err2Ok;
    private javax.swing.JDialog err3;
    private javax.swing.JButton err3OK;
    private javax.swing.JLabel fileStat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField offsetField;
    private javax.swing.JButton okSaveSettings;
    private javax.swing.JButton openBtn;
    private javax.swing.JFileChooser openFile;
    private javax.swing.JCheckBox openOnC;
    private javax.swing.JButton reloadBtn;
    private javax.swing.JTextField seedField;
    private javax.swing.JButton settingsBtn;
    // End of variables declaration//GEN-END:variables
}
