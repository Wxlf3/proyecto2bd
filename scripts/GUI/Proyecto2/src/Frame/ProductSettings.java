/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import BL.product;
import Connection.ConnectDB;
import Connection.currentUser;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sebas
 */
public class ProductSettings extends javax.swing.JFrame {

    /**
     * Creates new form ProductSettings
     */
    public ProductSettings() {
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
        ButtonAddProduct = new javax.swing.JButton();
        ButtonEditProduct = new javax.swing.JButton();
        ButtonDeleteProduct = new javax.swing.JButton();
        ButtonCancel = new javax.swing.JButton();
        ButtonConfirm = new javax.swing.JButton();
        ButtonBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PanelProducts = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableProducts = new javax.swing.JTable();
        Decoration = new javax.swing.JPanel();
        Decoration1 = new javax.swing.JPanel();
        ButtonRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(76, 40, 130));
        jLabel1.setText("Products Settings");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 40, -1, -1));

        ButtonAddProduct.setBackground(new java.awt.Color(255, 255, 255));
        ButtonAddProduct.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        ButtonAddProduct.setForeground(new java.awt.Color(76, 40, 130));
        ButtonAddProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/paint-palette.png"))); // NOI18N
        ButtonAddProduct.setBorder(null);
        ButtonAddProduct.setContentAreaFilled(false);
        ButtonAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddProductActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonAddProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 250, 80, 80));

        ButtonEditProduct.setBackground(new java.awt.Color(255, 255, 255));
        ButtonEditProduct.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        ButtonEditProduct.setForeground(new java.awt.Color(76, 40, 130));
        ButtonEditProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add.png"))); // NOI18N
        ButtonEditProduct.setBorder(null);
        ButtonEditProduct.setContentAreaFilled(false);
        ButtonEditProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditProductActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonEditProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 120, 80, 80));

        ButtonDeleteProduct.setBackground(new java.awt.Color(255, 255, 255));
        ButtonDeleteProduct.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        ButtonDeleteProduct.setForeground(new java.awt.Color(76, 40, 130));
        ButtonDeleteProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cross-square-black-button.png"))); // NOI18N
        ButtonDeleteProduct.setBorder(null);
        ButtonDeleteProduct.setContentAreaFilled(false);
        ButtonDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeleteProductActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonDeleteProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 390, 80, 80));

        ButtonCancel.setBackground(new java.awt.Color(255, 255, 255));
        ButtonCancel.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ButtonCancel.setForeground(new java.awt.Color(76, 40, 130));
        ButtonCancel.setText("Cancel");
        ButtonCancel.setBorder(null);
        jPanel1.add(ButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 110, 30));

        ButtonConfirm.setBackground(new java.awt.Color(255, 255, 255));
        ButtonConfirm.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ButtonConfirm.setForeground(new java.awt.Color(76, 40, 130));
        ButtonConfirm.setText("Confirm");
        ButtonConfirm.setBorder(null);
        jPanel1.add(ButtonConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 110, 30));

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

        PanelProducts.setBackground(new java.awt.Color(255, 255, 255));
        PanelProducts.setLayout(new java.awt.GridLayout(0, 3));

        TableProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TableProducts);

        PanelProducts.add(jScrollPane2);

        jScrollPane1.setViewportView(PanelProducts);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 730, 370));

        Decoration.setBackground(new java.awt.Color(239, 184, 16));

        javax.swing.GroupLayout DecorationLayout = new javax.swing.GroupLayout(Decoration);
        Decoration.setLayout(DecorationLayout);
        DecorationLayout.setHorizontalGroup(
            DecorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DecorationLayout.setVerticalGroup(
            DecorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(Decoration, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 90, 490));

        Decoration1.setBackground(new java.awt.Color(76, 40, 130));

        javax.swing.GroupLayout Decoration1Layout = new javax.swing.GroupLayout(Decoration1);
        Decoration1.setLayout(Decoration1Layout);
        Decoration1Layout.setHorizontalGroup(
            Decoration1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Decoration1Layout.setVerticalGroup(
            Decoration1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(Decoration1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 70, 90, 490));

        ButtonRefresh.setBackground(new java.awt.Color(255, 255, 255));
        ButtonRefresh.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ButtonRefresh.setForeground(new java.awt.Color(76, 40, 130));
        ButtonRefresh.setText("Refresh");
        ButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRefreshActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddProductActionPerformed
        int row = TableProducts.getSelectedRow();
        int id_product = (int) TableProducts.getModel().getValueAt(row, 0);
        ProductView w = new ProductView(id_product);
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonAddProductActionPerformed

    private void ButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRefreshActionPerformed
        currentUser cu = currentUser.getInstance();
        String username = cu.getUsername();
        ConnectDB c = new ConnectDB();
        DefaultTableModel modelo = new DefaultTableModel();
        TableProducts.setModel(modelo);
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        ResultSet q = c.queryWithString(username,"getAll_product_username",true);
        try {
            modelo = (DefaultTableModel)TableProducts.getModel();
            modelo.addColumn("Id");
            modelo.addColumn("Name");
            modelo.addColumn("Quantity");
            modelo.addColumn("Price");
            while(q.next())
            {
                modelo.addRow(new Object[]{q.getInt("id"),
                                            q.getString("name"),
                                            q.getInt("quantity"),
                                            q.getFloat("price")});
            }
            TableProducts.setModel(modelo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error. Try again.");
        }
    }//GEN-LAST:event_ButtonRefreshActionPerformed

    private void ButtonEditProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditProductActionPerformed
        
        AddProduct w = new AddProduct();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonEditProductActionPerformed

    private void ButtonDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteProductActionPerformed
        try{
        int row = TableProducts.getSelectedRow();
        int id_product = (int) TableProducts.getModel().getValueAt(row, 0);
        ConnectDB c = new ConnectDB();
        c.removeWithId(id_product,"remove_product",true);
        
        JOptionPane.showMessageDialog(this, "The product was deleted succesfully.");
        }
        catch(Exception e){JOptionPane.showMessageDialog(this, "Is a problem with this query.");}
    }//GEN-LAST:event_ButtonDeleteProductActionPerformed

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonBackActionPerformed

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
            java.util.logging.Logger.getLogger(ProductSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductSettings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAddProduct;
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JButton ButtonConfirm;
    private javax.swing.JButton ButtonDeleteProduct;
    private javax.swing.JButton ButtonEditProduct;
    private javax.swing.JButton ButtonRefresh;
    private javax.swing.JPanel Decoration;
    private javax.swing.JPanel Decoration1;
    private javax.swing.JPanel PanelProducts;
    private javax.swing.JTable TableProducts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
