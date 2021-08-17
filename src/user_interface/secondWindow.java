
package user_interface;

import classes.museos;
import classes.DBConsults.museosConsult;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author LENOVO
 */
public class secondWindow extends javax.swing.JFrame {
    

    /**
     * Creates new form secondWindow
     */
    public secondWindow() {
        initComponents();
        
        
        setTitle("Opciones");
        setSize(630,430);
        setLocationRelativeTo(null);
        setResizable(false);        
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE); 
        
        //Modifying the background
        ImageIcon background = new ImageIcon("src/images/background3.jpg");
        Icon icono = new ImageIcon(background.getImage().getScaledInstance(jLabel_secondWindow.getWidth(),
                jLabel_secondWindow.getHeight(), Image.SCALE_DEFAULT));
        jLabel_secondWindow.setIcon(icono);
        this.repaint();
        
        ImageIcon background_logo = new ImageIcon("src/images/minCultura2.png");
        Icon icon_logo = new ImageIcon(background_logo.getImage().getScaledInstance(jLabel_Logo.getWidth(),
                jLabel_Logo.getHeight(),Image.SCALE_DEFAULT));
        jLabel_Logo.setIcon(icon_logo); 
        this.repaint();
        
        
        //Museum Label
        
        
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/escudoIcon.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_MuseumName = new javax.swing.JLabel();
        jButton_Paints = new javax.swing.JButton();
        jButton_Artist = new javax.swing.JButton();
        jButton_Value = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_Logo = new javax.swing.JLabel();
        jButton_return = new javax.swing.JButton();
        jLabel_secondWindow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_MuseumName.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel_MuseumName.setForeground(new java.awt.Color(153, 0, 102));
        jLabel_MuseumName.setText("jLabel1");
        getContentPane().add(jLabel_MuseumName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jButton_Paints.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconsPaint.png"))); // NOI18N
        jButton_Paints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PaintsActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Paints, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 120, 120));

        jButton_Artist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconArtist.png"))); // NOI18N
        jButton_Artist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ArtistActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Artist, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 120, 120));

        jButton_Value.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconValue.png"))); // NOI18N
        jButton_Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ValueActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Value, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 120, 120));

        jLabel1.setForeground(new java.awt.Color(102, 0, 51));
        jLabel1.setText("Pinturas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        jLabel2.setForeground(new java.awt.Color(102, 0, 51));
        jLabel2.setText("Artistas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));

        jLabel3.setForeground(new java.awt.Color(102, 0, 51));
        jLabel3.setText("Avalúo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, -1));

        jLabel_Logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 310, 90));

        jButton_return.setText("Regresar");
        jButton_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_returnActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_return, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, -1, -1));

        jLabel_secondWindow.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_secondWindow.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_secondWindow.setToolTipText("");
        getContentPane().add(jLabel_secondWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_PaintsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PaintsActionPerformed
        // TODO add your handling code here:        
       
        if(evt.getSource() == jButton_Paints){
            new gallery().setVisible(true);            
        }
    }//GEN-LAST:event_jButton_PaintsActionPerformed

    private void jButton_ArtistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ArtistActionPerformed
        // TODO add your handling code here:
        new artistWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_ArtistActionPerformed

    private void jButton_ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ValueActionPerformed
        // TODO add your handling code here:
        new valueWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_ValueActionPerformed

    private void jButton_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_returnActionPerformed
        // TODO add your handling code here:
        
        new firstWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_returnActionPerformed
    
    
    //Method to get the JFrame of this window
    private JFrame getFrame(){        
        return this;
    }
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
            java.util.logging.Logger.getLogger(secondWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(secondWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(secondWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(secondWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new secondWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Artist;
    private javax.swing.JButton jButton_Paints;
    private javax.swing.JButton jButton_Value;
    private javax.swing.JButton jButton_return;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Logo;
    public static javax.swing.JLabel jLabel_MuseumName;
    private javax.swing.JLabel jLabel_secondWindow;
    // End of variables declaration//GEN-END:variables
}