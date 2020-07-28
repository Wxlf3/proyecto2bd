
package Frame;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Basket extends javax.swing.JFrame {

    private List<Object> products = new ArrayList<>();
    
    public Basket() {
        initComponents();
        setLocationRelativeTo(null);
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
        ButtonBack = new javax.swing.JButton();
        ButtonCancel = new javax.swing.JButton();
        ButtonConfirm = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PanelProducts = new javax.swing.JPanel();
        Decoration = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(76, 40, 130));
        jLabel1.setText("Basket");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        ButtonBack.setBackground(new java.awt.Color(255, 255, 255));
        ButtonBack.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        ButtonBack.setForeground(new java.awt.Color(76, 40, 130));
        ButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back-arrow.png"))); // NOI18N
        ButtonBack.setBorder(null);
        ButtonBack.setContentAreaFilled(false);
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        ButtonCancel.setBackground(new java.awt.Color(255, 255, 255));
        ButtonCancel.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ButtonCancel.setForeground(new java.awt.Color(76, 40, 130));
        ButtonCancel.setText("Cancel");
        ButtonCancel.setBorder(null);
        ButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, 110, 30));

        ButtonConfirm.setBackground(new java.awt.Color(255, 255, 255));
        ButtonConfirm.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ButtonConfirm.setForeground(new java.awt.Color(76, 40, 130));
        ButtonConfirm.setText("Confirm");
        ButtonConfirm.setBorder(null);
        ButtonConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConfirmActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, 110, 30));

        PanelProducts.setBackground(new java.awt.Color(255, 255, 255));
        PanelProducts.setLayout(new java.awt.GridLayout(0, 3));
        jScrollPane1.setViewportView(PanelProducts);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 850, 390));

        Decoration.setBackground(new java.awt.Color(76, 40, 130));

        javax.swing.GroupLayout DecorationLayout = new javax.swing.GroupLayout(Decoration);
        Decoration.setLayout(DecorationLayout);
        DecorationLayout.setHorizontalGroup(
            DecorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        DecorationLayout.setVerticalGroup(
            DecorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        jPanel1.add(Decoration, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 100, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        PanelPrincipalPage w = new PanelPrincipalPage();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonBackActionPerformed

    private void ButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelActionPerformed
        //Eliminar todos los productos
        PanelPrincipalPage w = new PanelPrincipalPage();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonCancelActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        /*for(int i = 0; i < products.size(); i++){
            JButton product = new JButton();
            product.setText("example");
            product.setIcon(new ImageIcon("close-button.png"));
            PanelProducts.add(product);
        }*/
    }//GEN-LAST:event_formWindowGainedFocus

    private void ButtonConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonConfirmActionPerformed

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
            java.util.logging.Logger.getLogger(Basket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Basket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Basket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Basket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Basket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JButton ButtonConfirm;
    private javax.swing.JPanel Decoration;
    private javax.swing.JPanel PanelProducts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
