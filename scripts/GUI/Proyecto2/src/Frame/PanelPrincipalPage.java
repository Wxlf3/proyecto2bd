
package Frame;

import Connection.ConnectDB;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class PanelPrincipalPage extends javax.swing.JFrame {

    private List<Object> products = new ArrayList<>();
    public String user;
    
    public PanelPrincipalPage() {
        initComponents();
        setLocationRelativeTo(null);
        user = "guest";
    }
    
    public PanelPrincipalPage(String puser) {
        initComponents();
        setLocationRelativeTo(null);
        user = puser;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PanelProducts = new javax.swing.JPanel();
        PanelGuest = new javax.swing.JPanel();
        ButtonProfile = new javax.swing.JButton();
        ButtonHistory = new javax.swing.JButton();
        ButtonBasket = new javax.swing.JButton();
        PanelUser = new javax.swing.JPanel();
        ButtonProfileUser = new javax.swing.JButton();
        ButtonHistoryUser = new javax.swing.JButton();
        ButtonBasketUser = new javax.swing.JButton();
        ButtonQueryUser = new javax.swing.JButton();
        ButtonSettingsUser = new javax.swing.JButton();
        ButtonWishlistUser = new javax.swing.JButton();
        PanelAdmin = new javax.swing.JPanel();
        ButtonProfileAdmin = new javax.swing.JButton();
        ButtonHistoryAdmin = new javax.swing.JButton();
        ButtonBasketAdmin = new javax.swing.JButton();
        ButtonQueryAdmin = new javax.swing.JButton();
        ButtonStatistics = new javax.swing.JButton();
        ButtonSettingsAdmin = new javax.swing.JButton();
        ButtonWishlist = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("framepanelprincipal"); // NOI18N
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelProducts.setBackground(new java.awt.Color(255, 255, 255));
        PanelProducts.setLayout(new java.awt.GridLayout(0, 4));
        jScrollPane1.setViewportView(PanelProducts);

        PanelPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 580));

        PanelGuest.setBackground(new java.awt.Color(255, 255, 255));
        PanelGuest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelGuestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelGuestMouseExited(evt);
            }
        });
        PanelGuest.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonProfile.setBackground(new java.awt.Color(255, 255, 255));
        ButtonProfile.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ButtonProfile.setForeground(new java.awt.Color(76, 40, 130));
        ButtonProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user(1).png"))); // NOI18N
        ButtonProfile.setBorder(null);
        ButtonProfile.setBorderPainted(false);
        ButtonProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonProfileActionPerformed(evt);
            }
        });
        PanelGuest.add(ButtonProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 30, 70, 70));

        ButtonHistory.setBackground(new java.awt.Color(255, 255, 255));
        ButtonHistory.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        ButtonHistory.setForeground(new java.awt.Color(76, 40, 130));
        ButtonHistory.setText("My history");
        ButtonHistory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        ButtonHistory.setContentAreaFilled(false);
        ButtonHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHistoryActionPerformed(evt);
            }
        });
        PanelGuest.add(ButtonHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 150, 160, 30));

        ButtonBasket.setBackground(new java.awt.Color(255, 255, 255));
        ButtonBasket.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        ButtonBasket.setForeground(new java.awt.Color(76, 40, 130));
        ButtonBasket.setText("Basket");
        ButtonBasket.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        ButtonBasket.setContentAreaFilled(false);
        ButtonBasket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBasketActionPerformed(evt);
            }
        });
        PanelGuest.add(ButtonBasket, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 200, 160, 30));

        PanelPrincipal.add(PanelGuest, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 220, 580));

        PanelUser.setBackground(new java.awt.Color(255, 255, 255));
        PanelUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonProfileUser.setBackground(new java.awt.Color(255, 255, 255));
        ButtonProfileUser.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ButtonProfileUser.setForeground(new java.awt.Color(76, 40, 130));
        ButtonProfileUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user(1).png"))); // NOI18N
        ButtonProfileUser.setBorder(null);
        ButtonProfileUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonProfileUserActionPerformed(evt);
            }
        });
        PanelUser.add(ButtonProfileUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 30, 70, 70));

        ButtonHistoryUser.setBackground(new java.awt.Color(255, 255, 255));
        ButtonHistoryUser.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        ButtonHistoryUser.setForeground(new java.awt.Color(76, 40, 130));
        ButtonHistoryUser.setText("My history");
        ButtonHistoryUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        ButtonHistoryUser.setContentAreaFilled(false);
        ButtonHistoryUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHistoryUserActionPerformed(evt);
            }
        });
        PanelUser.add(ButtonHistoryUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 150, 160, 30));

        ButtonBasketUser.setBackground(new java.awt.Color(255, 255, 255));
        ButtonBasketUser.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        ButtonBasketUser.setForeground(new java.awt.Color(76, 40, 130));
        ButtonBasketUser.setText("Basket");
        ButtonBasketUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        ButtonBasketUser.setContentAreaFilled(false);
        ButtonBasketUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBasketUserActionPerformed(evt);
            }
        });
        PanelUser.add(ButtonBasketUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 200, 160, 30));

        ButtonQueryUser.setBackground(new java.awt.Color(255, 255, 255));
        ButtonQueryUser.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        ButtonQueryUser.setForeground(new java.awt.Color(76, 40, 130));
        ButtonQueryUser.setText("Queries");
        ButtonQueryUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        ButtonQueryUser.setContentAreaFilled(false);
        ButtonQueryUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonQueryUserActionPerformed(evt);
            }
        });
        PanelUser.add(ButtonQueryUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 250, 160, 30));

        ButtonSettingsUser.setBackground(new java.awt.Color(255, 255, 255));
        ButtonSettingsUser.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        ButtonSettingsUser.setForeground(new java.awt.Color(76, 40, 130));
        ButtonSettingsUser.setText("Profile settings");
        ButtonSettingsUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        ButtonSettingsUser.setContentAreaFilled(false);
        ButtonSettingsUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSettingsUserActionPerformed(evt);
            }
        });
        PanelUser.add(ButtonSettingsUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 300, 160, 30));

        ButtonWishlistUser.setBackground(new java.awt.Color(255, 255, 255));
        ButtonWishlistUser.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        ButtonWishlistUser.setForeground(new java.awt.Color(76, 40, 130));
        ButtonWishlistUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/like.png"))); // NOI18N
        ButtonWishlistUser.setText(" Wishlist");
        ButtonWishlistUser.setBorder(null);
        ButtonWishlistUser.setContentAreaFilled(false);
        ButtonWishlistUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonWishlistUserActionPerformed(evt);
            }
        });
        PanelUser.add(ButtonWishlistUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 350, 121, 50));

        PanelPrincipal.add(PanelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 220, 580));

        PanelAdmin.setBackground(new java.awt.Color(255, 255, 255));
        PanelAdmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonProfileAdmin.setBackground(new java.awt.Color(255, 255, 255));
        ButtonProfileAdmin.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ButtonProfileAdmin.setForeground(new java.awt.Color(76, 40, 130));
        ButtonProfileAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user(1).png"))); // NOI18N
        ButtonProfileAdmin.setBorder(null);
        ButtonProfileAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonProfileAdminActionPerformed(evt);
            }
        });
        PanelAdmin.add(ButtonProfileAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 30, 70, 70));

        ButtonHistoryAdmin.setBackground(new java.awt.Color(255, 255, 255));
        ButtonHistoryAdmin.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        ButtonHistoryAdmin.setForeground(new java.awt.Color(76, 40, 130));
        ButtonHistoryAdmin.setText("My history");
        ButtonHistoryAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        ButtonHistoryAdmin.setContentAreaFilled(false);
        ButtonHistoryAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHistoryAdminActionPerformed(evt);
            }
        });
        PanelAdmin.add(ButtonHistoryAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 150, 160, 30));

        ButtonBasketAdmin.setBackground(new java.awt.Color(255, 255, 255));
        ButtonBasketAdmin.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        ButtonBasketAdmin.setForeground(new java.awt.Color(76, 40, 130));
        ButtonBasketAdmin.setText("Basket");
        ButtonBasketAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        ButtonBasketAdmin.setContentAreaFilled(false);
        ButtonBasketAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBasketAdminActionPerformed(evt);
            }
        });
        PanelAdmin.add(ButtonBasketAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 200, 160, 30));

        ButtonQueryAdmin.setBackground(new java.awt.Color(255, 255, 255));
        ButtonQueryAdmin.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        ButtonQueryAdmin.setForeground(new java.awt.Color(76, 40, 130));
        ButtonQueryAdmin.setText("Queries");
        ButtonQueryAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        ButtonQueryAdmin.setContentAreaFilled(false);
        ButtonQueryAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonQueryAdminActionPerformed(evt);
            }
        });
        PanelAdmin.add(ButtonQueryAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 250, 160, 30));

        ButtonStatistics.setBackground(new java.awt.Color(255, 255, 255));
        ButtonStatistics.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        ButtonStatistics.setForeground(new java.awt.Color(76, 40, 130));
        ButtonStatistics.setText("Statistics");
        ButtonStatistics.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        ButtonStatistics.setContentAreaFilled(false);
        ButtonStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonStatisticsActionPerformed(evt);
            }
        });
        PanelAdmin.add(ButtonStatistics, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 300, 160, 30));

        ButtonSettingsAdmin.setBackground(new java.awt.Color(255, 255, 255));
        ButtonSettingsAdmin.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        ButtonSettingsAdmin.setForeground(new java.awt.Color(76, 40, 130));
        ButtonSettingsAdmin.setText("Profile settings");
        ButtonSettingsAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        ButtonSettingsAdmin.setContentAreaFilled(false);
        ButtonSettingsAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSettingsAdminActionPerformed(evt);
            }
        });
        PanelAdmin.add(ButtonSettingsAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 350, 160, 30));

        ButtonWishlist.setBackground(new java.awt.Color(255, 255, 255));
        ButtonWishlist.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        ButtonWishlist.setForeground(new java.awt.Color(76, 40, 130));
        ButtonWishlist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/like.png"))); // NOI18N
        ButtonWishlist.setText(" Wishlist");
        ButtonWishlist.setBorder(null);
        ButtonWishlist.setContentAreaFilled(false);
        ButtonWishlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonWishlistActionPerformed(evt);
            }
        });
        PanelAdmin.add(ButtonWishlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 400, 121, 50));

        PanelPrincipal.add(PanelAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 220, 580));

        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        /*for(int i = 0; i < products.size(); i++){
            JButton product = new JButton();
            product.setText("example");
            product.setIcon(new ImageIcon("close-button.png"));
            PanelProducts.add(product);
        }*/
        if(user == "guest"){
            PanelGuest.setVisible(true);
            PanelAdmin.setVisible(false);
            PanelUser.setVisible(false);
        } else if(user == "admin"){
            PanelGuest.setVisible(false);
            PanelAdmin.setVisible(true);
            PanelUser.setVisible(false);
        } else {
            PanelGuest.setVisible(false);
            PanelAdmin.setVisible(false);
            PanelUser.setVisible(true);
        }
    }//GEN-LAST:event_formFocusGained

    private void ButtonProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonProfileActionPerformed
        Login w = new Login(user);
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonProfileActionPerformed

    private void PanelGuestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelGuestMouseEntered
        if(user == "guest"){
            PanelGuest.setVisible(true);
            PanelAdmin.setVisible(false);
            PanelUser.setVisible(false);
        } else if(user == "admin"){
            PanelGuest.setVisible(false);
            PanelAdmin.setVisible(true);
            PanelUser.setVisible(false);
        } else {
            PanelGuest.setVisible(false);
            PanelAdmin.setVisible(false);
            PanelUser.setVisible(true);
        }
    }//GEN-LAST:event_PanelGuestMouseEntered

    private void PanelGuestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelGuestMouseExited
        if(user == "guest"){
            PanelGuest.setVisible(true);
            PanelAdmin.setVisible(false);
            PanelUser.setVisible(false);
        } else if(user == "admin"){
            PanelGuest.setVisible(false);
            PanelAdmin.setVisible(true);
            PanelUser.setVisible(false);
        } else {
            PanelGuest.setVisible(false);
            PanelAdmin.setVisible(false);
            PanelUser.setVisible(true);
        }
    }//GEN-LAST:event_PanelGuestMouseExited

    private void ButtonBasketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBasketActionPerformed
        Basket w = new Basket(user);
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonBasketActionPerformed

    private void ButtonProfileUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonProfileUserActionPerformed
        Profile w = new Profile(user);
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonProfileUserActionPerformed

    private void ButtonHistoryUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHistoryUserActionPerformed
        History w = new History(user);
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonHistoryUserActionPerformed

    private void ButtonBasketUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBasketUserActionPerformed
        Basket w = new Basket(user);
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonBasketUserActionPerformed

    private void ButtonQueryUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonQueryUserActionPerformed
        QueryUser w = new QueryUser();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonQueryUserActionPerformed

    private void ButtonSettingsUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSettingsUserActionPerformed
        ProfileSettings w = new ProfileSettings();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonSettingsUserActionPerformed

    private void ButtonWishlistUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonWishlistUserActionPerformed
        Wishlist w = new Wishlist(user);
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonWishlistUserActionPerformed

    private void ButtonProfileAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonProfileAdminActionPerformed
        Profile w = new Profile(user);
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonProfileAdminActionPerformed

    private void ButtonHistoryAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHistoryAdminActionPerformed
        History w = new History(user);
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonHistoryAdminActionPerformed

    private void ButtonBasketAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBasketAdminActionPerformed
        Basket w = new Basket(user);
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonBasketAdminActionPerformed

    private void ButtonQueryAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonQueryAdminActionPerformed
        QueryAdmin w = new QueryAdmin();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonQueryAdminActionPerformed

    private void ButtonSettingsAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSettingsAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSettingsAdminActionPerformed

    private void ButtonStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonStatisticsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonStatisticsActionPerformed

    private void ButtonWishlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonWishlistActionPerformed
        Wishlist w = new Wishlist(user);
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonWishlistActionPerformed

    private void ButtonHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHistoryActionPerformed
        History w = new History(user);
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonHistoryActionPerformed

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
    private javax.swing.JButton ButtonQueryAdmin;
    private javax.swing.JButton ButtonQueryUser;
    private javax.swing.JButton ButtonSettingsAdmin;
    private javax.swing.JButton ButtonSettingsUser;
    private javax.swing.JButton ButtonStatistics;
    private javax.swing.JButton ButtonWishlist;
    private javax.swing.JButton ButtonWishlistUser;
    private javax.swing.JPanel PanelAdmin;
    private javax.swing.JPanel PanelGuest;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelProducts;
    private javax.swing.JPanel PanelUser;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
