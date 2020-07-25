
package Frame;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

public class PanelPrincipalPage extends javax.swing.JFrame {

    private List<JButton> products;
    
    public PanelPrincipalPage() {
        initComponents();
        products = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelAdmin = new javax.swing.JPanel();
        ButtonProfileAdmin = new javax.swing.JButton();
        ButtonHistoryAdmin = new javax.swing.JButton();
        ButtonBasketAdmin = new javax.swing.JButton();
        ButtonQueryUser1 = new javax.swing.JButton();
        ButtonStatistics = new javax.swing.JButton();
        ButtonSettingsAdmin = new javax.swing.JButton();
        ButtonWishlistAdmin = new javax.swing.JButton();
        PanelUser = new javax.swing.JPanel();
        ButtonProfileUser = new javax.swing.JButton();
        ButtonHistoryUser = new javax.swing.JButton();
        ButtonBasketUser = new javax.swing.JButton();
        ButtonQueryUser = new javax.swing.JButton();
        ButtonSettingsUser = new javax.swing.JButton();
        ButtonWishlistAdmin1 = new javax.swing.JButton();
        PanelGuest = new javax.swing.JPanel();
        ButtonProfile = new javax.swing.JButton();
        ButtonHistory = new javax.swing.JButton();
        ButtonBasket = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PanelProducts = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelAdmin.setBackground(new java.awt.Color(255, 255, 255));
        PanelAdmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonProfileAdmin.setBackground(new java.awt.Color(255, 255, 255));
        ButtonProfileAdmin.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ButtonProfileAdmin.setForeground(new java.awt.Color(76, 40, 130));
        ButtonProfileAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user(1).png"))); // NOI18N
        ButtonProfileAdmin.setBorder(null);
        PanelAdmin.add(ButtonProfileAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 30, 70, 70));

        ButtonHistoryAdmin.setBackground(new java.awt.Color(255, 255, 255));
        ButtonHistoryAdmin.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        ButtonHistoryAdmin.setForeground(new java.awt.Color(76, 40, 130));
        ButtonHistoryAdmin.setText("My history");
        ButtonHistoryAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        ButtonHistoryAdmin.setContentAreaFilled(false);
        PanelAdmin.add(ButtonHistoryAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 150, 160, 30));

        ButtonBasketAdmin.setBackground(new java.awt.Color(255, 255, 255));
        ButtonBasketAdmin.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        ButtonBasketAdmin.setForeground(new java.awt.Color(76, 40, 130));
        ButtonBasketAdmin.setText("Basket");
        ButtonBasketAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        ButtonBasketAdmin.setContentAreaFilled(false);
        PanelAdmin.add(ButtonBasketAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 200, 160, 30));

        ButtonQueryUser1.setBackground(new java.awt.Color(255, 255, 255));
        ButtonQueryUser1.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        ButtonQueryUser1.setForeground(new java.awt.Color(76, 40, 130));
        ButtonQueryUser1.setText("Queries");
        ButtonQueryUser1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        ButtonQueryUser1.setContentAreaFilled(false);
        PanelAdmin.add(ButtonQueryUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 250, 160, 30));

        ButtonStatistics.setBackground(new java.awt.Color(255, 255, 255));
        ButtonStatistics.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        ButtonStatistics.setForeground(new java.awt.Color(76, 40, 130));
        ButtonStatistics.setText("Statistics");
        ButtonStatistics.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        ButtonStatistics.setContentAreaFilled(false);
        PanelAdmin.add(ButtonStatistics, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 300, 160, 30));

        ButtonSettingsAdmin.setBackground(new java.awt.Color(255, 255, 255));
        ButtonSettingsAdmin.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        ButtonSettingsAdmin.setForeground(new java.awt.Color(76, 40, 130));
        ButtonSettingsAdmin.setText("Profile settings");
        ButtonSettingsAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        ButtonSettingsAdmin.setContentAreaFilled(false);
        PanelAdmin.add(ButtonSettingsAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 350, 160, 30));

        ButtonWishlistAdmin.setBackground(new java.awt.Color(255, 255, 255));
        ButtonWishlistAdmin.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        ButtonWishlistAdmin.setForeground(new java.awt.Color(76, 40, 130));
        ButtonWishlistAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/like.png"))); // NOI18N
        ButtonWishlistAdmin.setText(" Wishlist");
        ButtonWishlistAdmin.setBorder(null);
        ButtonWishlistAdmin.setContentAreaFilled(false);
        PanelAdmin.add(ButtonWishlistAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 400, 121, 50));

        getContentPane().add(PanelAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 220, 580));

        PanelUser.setBackground(new java.awt.Color(255, 255, 255));
        PanelUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonProfileUser.setBackground(new java.awt.Color(255, 255, 255));
        ButtonProfileUser.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ButtonProfileUser.setForeground(new java.awt.Color(76, 40, 130));
        ButtonProfileUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user(1).png"))); // NOI18N
        ButtonProfileUser.setBorder(null);
        PanelUser.add(ButtonProfileUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 30, 70, 70));

        ButtonHistoryUser.setBackground(new java.awt.Color(255, 255, 255));
        ButtonHistoryUser.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        ButtonHistoryUser.setForeground(new java.awt.Color(76, 40, 130));
        ButtonHistoryUser.setText("My history");
        ButtonHistoryUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        ButtonHistoryUser.setContentAreaFilled(false);
        PanelUser.add(ButtonHistoryUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 150, 160, 30));

        ButtonBasketUser.setBackground(new java.awt.Color(255, 255, 255));
        ButtonBasketUser.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        ButtonBasketUser.setForeground(new java.awt.Color(76, 40, 130));
        ButtonBasketUser.setText("Basket");
        ButtonBasketUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        ButtonBasketUser.setContentAreaFilled(false);
        PanelUser.add(ButtonBasketUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 200, 160, 30));

        ButtonQueryUser.setBackground(new java.awt.Color(255, 255, 255));
        ButtonQueryUser.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        ButtonQueryUser.setForeground(new java.awt.Color(76, 40, 130));
        ButtonQueryUser.setText("Queries");
        ButtonQueryUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        ButtonQueryUser.setContentAreaFilled(false);
        PanelUser.add(ButtonQueryUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 250, 160, 30));

        ButtonSettingsUser.setBackground(new java.awt.Color(255, 255, 255));
        ButtonSettingsUser.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        ButtonSettingsUser.setForeground(new java.awt.Color(76, 40, 130));
        ButtonSettingsUser.setText("Profile settings");
        ButtonSettingsUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        ButtonSettingsUser.setContentAreaFilled(false);
        PanelUser.add(ButtonSettingsUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 300, 160, 30));

        ButtonWishlistAdmin1.setBackground(new java.awt.Color(255, 255, 255));
        ButtonWishlistAdmin1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        ButtonWishlistAdmin1.setForeground(new java.awt.Color(76, 40, 130));
        ButtonWishlistAdmin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/like.png"))); // NOI18N
        ButtonWishlistAdmin1.setText(" Wishlist");
        ButtonWishlistAdmin1.setBorder(null);
        ButtonWishlistAdmin1.setContentAreaFilled(false);
        PanelUser.add(ButtonWishlistAdmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 350, 121, 50));

        getContentPane().add(PanelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 220, 580));

        PanelGuest.setBackground(new java.awt.Color(255, 255, 255));
        PanelGuest.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonProfile.setBackground(new java.awt.Color(255, 255, 255));
        ButtonProfile.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ButtonProfile.setForeground(new java.awt.Color(76, 40, 130));
        ButtonProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user(1).png"))); // NOI18N
        ButtonProfile.setBorder(null);
        PanelGuest.add(ButtonProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 30, 70, 70));

        ButtonHistory.setBackground(new java.awt.Color(255, 255, 255));
        ButtonHistory.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        ButtonHistory.setForeground(new java.awt.Color(76, 40, 130));
        ButtonHistory.setText("My history");
        ButtonHistory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        ButtonHistory.setContentAreaFilled(false);
        PanelGuest.add(ButtonHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 150, 160, 30));

        ButtonBasket.setBackground(new java.awt.Color(255, 255, 255));
        ButtonBasket.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        ButtonBasket.setForeground(new java.awt.Color(76, 40, 130));
        ButtonBasket.setText("Basket");
        ButtonBasket.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        ButtonBasket.setContentAreaFilled(false);
        PanelGuest.add(ButtonBasket, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 200, 160, 30));

        getContentPane().add(PanelGuest, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 220, 580));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        PanelProducts.setBackground(new java.awt.Color(255, 255, 255));
        PanelProducts.setLayout(new java.awt.GridLayout(0, 4));
        jScrollPane1.setViewportView(PanelProducts);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
    private void ButtonHistoryAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHistoryAdminActionPerformed
        ConnectDB c = new ConnectDB();
        c.insertDeliveryType("Hola");
    }//GEN-LAST:event_ButtonHistoryAdminActionPerformed

=======
>>>>>>> parent of 2444cff... Connection
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
            java.util.logging.Logger.getLogger(PanelPrincipalPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipalPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipalPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipalPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelPrincipalPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBasket;
    private javax.swing.JButton ButtonBasketAdmin;
    private javax.swing.JButton ButtonBasketUser;
    private javax.swing.JButton ButtonHistory;
    private javax.swing.JButton ButtonHistoryAdmin;
    private javax.swing.JButton ButtonHistoryUser;
    private javax.swing.JButton ButtonProfile;
    private javax.swing.JButton ButtonProfileAdmin;
    private javax.swing.JButton ButtonProfileUser;
    private javax.swing.JButton ButtonQueryUser;
    private javax.swing.JButton ButtonQueryUser1;
    private javax.swing.JButton ButtonSettingsAdmin;
    private javax.swing.JButton ButtonSettingsUser;
    private javax.swing.JButton ButtonStatistics;
    private javax.swing.JButton ButtonWishlistAdmin;
    private javax.swing.JButton ButtonWishlistAdmin1;
    private javax.swing.JPanel PanelAdmin;
    private javax.swing.JPanel PanelGuest;
    private javax.swing.JPanel PanelProducts;
    private javax.swing.JPanel PanelUser;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
