/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancayepharama;

import javax.swing.ImageIcon;

/**
 *
 * @author Abdoulaye DIAZ
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
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
        jConnexion = new javax.swing.JLabel();
        jInscription = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abdoulaye DIAZ\\projet\\supervision_bceao\\inscape\\Bandoliere1.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 30, 560, 130);

        jConnexion.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abdoulaye DIAZ\\projet\\supervision_bceao\\inscape\\CC1.png")); // NOI18N
        jConnexion.setToolTipText("Connexion");
        jConnexion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jConnexion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jConnexionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jConnexionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jConnexionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jConnexionMousePressed(evt);
            }
        });
        getContentPane().add(jConnexion);
        jConnexion.setBounds(350, 400, 210, 170);

        jInscription.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abdoulaye DIAZ\\projet\\supervision_bceao\\inscape\\c.png")); // NOI18N
        jInscription.setToolTipText("Inscription");
        jInscription.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jInscription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jInscriptionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jInscriptionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jInscriptionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jInscriptionMousePressed(evt);
            }
        });
        getContentPane().add(jInscription);
        jInscription.setBounds(610, 390, 210, 200);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abdoulaye DIAZ\\projet\\supervision_bceao\\inscape\\trai.png")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 280, 340, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abdoulaye DIAZ\\projet\\supervision_bceao\\inscape\\point1.png")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(500, 290, 50, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abdoulaye DIAZ\\projet\\supervision_bceao\\inscape\\point1.png")); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(560, 290, 50, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abdoulaye DIAZ\\projet\\supervision_bceao\\inscape\\trai.png")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(630, 280, 340, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abdoulaye DIAZ\\projet\\supervision_bceao\\inscape\\footer11.png")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(190, 640, 750, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abdoulaye DIAZ\\projet\\supervision_bceao\\inscape\\cadre0.png")); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(190, 20, 750, 170);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abdoulaye DIAZ\\projet\\supervision_bceao\\inscape\\fondblanc0.png")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(80, 0, 920, 680);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abdoulaye DIAZ\\Desktop\\tpzero\\images\\img\\fond_vertclair.jpg")); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 1080, 680);

        setSize(new java.awt.Dimension(1101, 721));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jConnexionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jConnexionMouseEntered
            ImageIcon II = new ImageIcon(getClass().getResource("/images/CH1.png"));
            jConnexion.setIcon(II);
    }//GEN-LAST:event_jConnexionMouseEntered

    private void jConnexionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jConnexionMouseExited
            ImageIcon II = new ImageIcon(getClass().getResource("/images/CC1.png"));
            jConnexion.setIcon(II);
    }//GEN-LAST:event_jConnexionMouseExited

    private void jConnexionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jConnexionMouseClicked
        main m = new main();
        ConnexionsPrincipale c = new ConnexionsPrincipale();
        m.setVisible(false);
        c.setVisible(true);
    }//GEN-LAST:event_jConnexionMouseClicked

    private void jConnexionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jConnexionMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/images/CF1.png"));
        jConnexion.setIcon(II);
    }//GEN-LAST:event_jConnexionMousePressed

    private void jInscriptionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jInscriptionMouseEntered
         ImageIcon II = new ImageIcon(getClass().getResource("/images/CIH1.png"));
            jInscription.setIcon(II);
    }//GEN-LAST:event_jInscriptionMouseEntered

    private void jInscriptionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jInscriptionMousePressed
         ImageIcon II = new ImageIcon(getClass().getResource("/images/CIF1.png"));
            jInscription.setIcon(II);
    }//GEN-LAST:event_jInscriptionMousePressed

    private void jInscriptionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jInscriptionMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/images/c.png"));
            jInscription.setIcon(II);
    }//GEN-LAST:event_jInscriptionMouseExited

    private void jInscriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jInscriptionMouseClicked
        main m = new main();
         Inscription i = new Inscription();
        m.setVisible(false);
        i.setVisible(true);
    }//GEN-LAST:event_jInscriptionMouseClicked

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jConnexion;
    private javax.swing.JLabel jInscription;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
