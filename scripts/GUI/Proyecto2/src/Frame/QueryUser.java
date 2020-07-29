
package Frame;

import Connection.ConnectDB;
import Connection.currentUser;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sebas
 */
public class QueryUser extends javax.swing.JFrame {

    
    public QueryUser() {
        initComponents();
        setLocationRelativeTo(null);
        FillIn();
    }
    
    public void FillIn(){
        BoxMonth.removeAllItems();
        BoxCategoryAllProducts.addItem("3 months");
        BoxCategoryAllProducts.addItem("6 months");
        BoxCategoryAllProducts.addItem("12 months");
        BoxCategoryAllProducts.addItem("All");
        ConnectDB c = new ConnectDB();
        
        BoxCategoryAllProducts.removeAllItems();
        BoxCategoryAllProducts.addItem("Default");

        ResultSet category = c.query("getAll_category",true);
        
        try {
            while(category.next())
            {
                BoxCategoryAllProducts.addItem(String.valueOf(category.getString("name")));
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelSearchingProduct = new javax.swing.JPanel();
        FieldNameProduct = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        ButtonConfirm = new javax.swing.JButton();
        ButtonBack = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableAllProducts = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BoxCategoryAllProducts = new javax.swing.JComboBox<>();
        PanelPurchaseHistory = new javax.swing.JPanel();
        ButtonBack1 = new javax.swing.JButton();
        ButtonConfirm2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        BoxMonth = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablePurchaseHistory = new javax.swing.JTable();
        PanelRecentlyViewed = new javax.swing.JPanel();
        ButtonBack2 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        ListRecentlyViewed = new javax.swing.JList<>();
        PanelListProductsSold = new javax.swing.JPanel();
        ButtonBack3 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        ListProductsSold = new javax.swing.JList<>();
        ButtonConfirm3 = new javax.swing.JButton();
        PanelPurchasesMade = new javax.swing.JPanel();
        ButtonBack4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableUserPurchases = new javax.swing.JTable();
        ButtonConfirm4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(79, 40, 130));
        jTabbedPane1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

        PanelSearchingProduct.setBackground(new java.awt.Color(255, 255, 255));
        PanelSearchingProduct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FieldNameProduct.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        FieldNameProduct.setForeground(new java.awt.Color(76, 40, 130));
        FieldNameProduct.setBorder(null);
        PanelSearchingProduct.add(FieldNameProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 390, 30));

        jSeparator1.setForeground(new java.awt.Color(76, 40, 130));
        jSeparator1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        PanelSearchingProduct.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 390, 30));

        ButtonConfirm.setBackground(new java.awt.Color(255, 255, 255));
        ButtonConfirm.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ButtonConfirm.setForeground(new java.awt.Color(76, 40, 130));
        ButtonConfirm.setText("Search");
        ButtonConfirm.setBorder(null);
        ButtonConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConfirmActionPerformed(evt);
            }
        });
        PanelSearchingProduct.add(ButtonConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 110, 30));

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
        PanelSearchingProduct.add(ButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        TableAllProducts.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(TableAllProducts);

        PanelSearchingProduct.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, 290));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(76, 40, 130));
        jLabel7.setText("Category:");
        PanelSearchingProduct.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(76, 40, 130));
        jLabel8.setText("Name Product: ");
        PanelSearchingProduct.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        BoxCategoryAllProducts.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        BoxCategoryAllProducts.setForeground(new java.awt.Color(76, 40, 130));
        PanelSearchingProduct.add(BoxCategoryAllProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 170, 30));

        jTabbedPane1.addTab("Searching product", PanelSearchingProduct);

        PanelPurchaseHistory.setBackground(new java.awt.Color(255, 255, 255));
        PanelPurchaseHistory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonBack1.setBackground(new java.awt.Color(255, 255, 255));
        ButtonBack1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        ButtonBack1.setForeground(new java.awt.Color(76, 40, 130));
        ButtonBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back-arrow.png"))); // NOI18N
        ButtonBack1.setBorder(null);
        ButtonBack1.setContentAreaFilled(false);
        ButtonBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBack1ActionPerformed(evt);
            }
        });
        PanelPurchaseHistory.add(ButtonBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        ButtonConfirm2.setBackground(new java.awt.Color(255, 255, 255));
        ButtonConfirm2.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ButtonConfirm2.setForeground(new java.awt.Color(76, 40, 130));
        ButtonConfirm2.setText("Confirm");
        ButtonConfirm2.setBorder(null);
        ButtonConfirm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConfirm2ActionPerformed(evt);
            }
        });
        PanelPurchaseHistory.add(ButtonConfirm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 110, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(76, 40, 130));
        jLabel6.setText("Time:");
        PanelPurchaseHistory.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        BoxMonth.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        BoxMonth.setForeground(new java.awt.Color(76, 40, 130));
        PanelPurchaseHistory.add(BoxMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 170, 30));

        TablePurchaseHistory.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablePurchaseHistory);

        PanelPurchaseHistory.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, 290));

        jTabbedPane1.addTab("Purchase history", PanelPurchaseHistory);

        PanelRecentlyViewed.setBackground(new java.awt.Color(255, 255, 255));
        PanelRecentlyViewed.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonBack2.setBackground(new java.awt.Color(255, 255, 255));
        ButtonBack2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        ButtonBack2.setForeground(new java.awt.Color(76, 40, 130));
        ButtonBack2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back-arrow.png"))); // NOI18N
        ButtonBack2.setBorder(null);
        ButtonBack2.setContentAreaFilled(false);
        ButtonBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBack2ActionPerformed(evt);
            }
        });
        PanelRecentlyViewed.add(ButtonBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        jScrollPane5.setBorder(null);
        jScrollPane5.setForeground(new java.awt.Color(76, 40, 130));
        jScrollPane5.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

        ListRecentlyViewed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        ListRecentlyViewed.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        ListRecentlyViewed.setForeground(new java.awt.Color(76, 40, 130));
        ListRecentlyViewed.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(ListRecentlyViewed);

        PanelRecentlyViewed.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 340, 430));

        jTabbedPane1.addTab("Recently viewed products", PanelRecentlyViewed);

        PanelListProductsSold.setBackground(new java.awt.Color(255, 255, 255));
        PanelListProductsSold.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonBack3.setBackground(new java.awt.Color(255, 255, 255));
        ButtonBack3.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        ButtonBack3.setForeground(new java.awt.Color(76, 40, 130));
        ButtonBack3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back-arrow.png"))); // NOI18N
        ButtonBack3.setBorder(null);
        ButtonBack3.setContentAreaFilled(false);
        ButtonBack3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBack3ActionPerformed(evt);
            }
        });
        PanelListProductsSold.add(ButtonBack3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        jScrollPane6.setBorder(null);
        jScrollPane6.setForeground(new java.awt.Color(76, 40, 130));
        jScrollPane6.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

        ListProductsSold.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        ListProductsSold.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        ListProductsSold.setForeground(new java.awt.Color(76, 40, 130));
        ListProductsSold.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane6.setViewportView(ListProductsSold);

        PanelListProductsSold.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 340, 430));

        ButtonConfirm3.setBackground(new java.awt.Color(255, 255, 255));
        ButtonConfirm3.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ButtonConfirm3.setForeground(new java.awt.Color(76, 40, 130));
        ButtonConfirm3.setText("Confirm");
        ButtonConfirm3.setBorder(null);
        ButtonConfirm3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConfirm3ActionPerformed(evt);
            }
        });
        PanelListProductsSold.add(ButtonConfirm3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 110, 30));

        jTabbedPane1.addTab("List of products sold for each user", PanelListProductsSold);

        PanelPurchasesMade.setBackground(new java.awt.Color(255, 255, 255));
        PanelPurchasesMade.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonBack4.setBackground(new java.awt.Color(255, 255, 255));
        ButtonBack4.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        ButtonBack4.setForeground(new java.awt.Color(76, 40, 130));
        ButtonBack4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back-arrow.png"))); // NOI18N
        ButtonBack4.setBorder(null);
        ButtonBack4.setContentAreaFilled(false);
        ButtonBack4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBack4ActionPerformed(evt);
            }
        });
        PanelPurchasesMade.add(ButtonBack4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        TableUserPurchases.setAutoCreateColumnsFromModel(false);
        TableUserPurchases.setAutoCreateRowSorter(true);
        TableUserPurchases.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        TableUserPurchases.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        TableUserPurchases.setForeground(new java.awt.Color(76, 40, 130));
        TableUserPurchases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Category", "Products"
            }
        ));
        TableUserPurchases.setGridColor(new java.awt.Color(76, 40, 130));
        jScrollPane2.setViewportView(TableUserPurchases);

        PanelPurchasesMade.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 490, 390));

        ButtonConfirm4.setBackground(new java.awt.Color(255, 255, 255));
        ButtonConfirm4.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ButtonConfirm4.setForeground(new java.awt.Color(76, 40, 130));
        ButtonConfirm4.setText("Confirm");
        ButtonConfirm4.setBorder(null);
        ButtonConfirm4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConfirm4ActionPerformed(evt);
            }
        });
        PanelPurchasesMade.add(ButtonConfirm4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 110, 30));

        jTabbedPane1.addTab("Total purchases made by category greater than $ 1,000", PanelPurchasesMade);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConfirmActionPerformed
        ConnectDB c = new ConnectDB();
        DefaultTableModel modelo = new DefaultTableModel();
        TableAllProducts.setModel(modelo);
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        String name = FieldNameProduct.getText();
        String category_element = (String) BoxCategoryAllProducts.getSelectedItem();
        int id_category;
        if(category_element == "Default")
            id_category = 0;
        else
            id_category = c.getIntWithString(category_element, "getId_category", true);
        ResultSet q = c.queryWithStringAndInt(name, id_category,"search_product",true);
        try {
            modelo = (DefaultTableModel)TableAllProducts.getModel();
            modelo.addColumn("Id");
            modelo.addColumn("Price");
            modelo.addColumn("Name");
            modelo.addColumn("Description");
            while(q.next())
            {
                modelo.addRow(new Object[]{q.getInt("id"),q.getFloat("price"),q.getString("name"),q.getString("description")});
            }
            TableAllProducts.setModel(modelo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Is a problem with this query.");
        }
    }//GEN-LAST:event_ButtonConfirmActionPerformed

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        PanelPrincipalPage w = new PanelPrincipalPage();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonBackActionPerformed

    private void ButtonBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBack1ActionPerformed
        PanelPrincipalPage w = new PanelPrincipalPage();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonBack1ActionPerformed

    private void ButtonBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBack2ActionPerformed
        PanelPrincipalPage w = new PanelPrincipalPage();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonBack2ActionPerformed

    private void ButtonBack3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBack3ActionPerformed
        PanelPrincipalPage w = new PanelPrincipalPage();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonBack3ActionPerformed

    private void ButtonBack4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBack4ActionPerformed
        PanelPrincipalPage w = new PanelPrincipalPage();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonBack4ActionPerformed

    private void ButtonConfirm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConfirm2ActionPerformed
        currentUser cu = currentUser.getInstance();
        String username = cu.getUsername();
        ConnectDB c = new ConnectDB();
        DefaultTableModel modelo = new DefaultTableModel();
        TableAllProducts.setModel(modelo);
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        int month_element = BoxMonth.getSelectedIndex();
        int month;
        if(month_element == 1)
            month = 3;
        else if(month_element == 2)
            month = 6;
        else if(month_element == 3)
            month = 12;
        else
            month = 0;
        ResultSet q = c.queryWithStringAndInt(username, month,"purchase_history",true);
        try {
            modelo = (DefaultTableModel)TableAllProducts.getModel();
            modelo.addColumn("Id");
            modelo.addColumn("Name");
            modelo.addColumn("Date");
            modelo.addColumn("Quantity");
            modelo.addColumn("Price by Unit");
            modelo.addColumn("Final Price");
            modelo.addColumn("Username Seller");
            while(q.next())
            {
                modelo.addRow(new Object[]{q.getInt("product_id"),
                                            q.getString("product_name"),
                                            q.getDate("date"),
                                            q.getInt("quantity"),
                                            q.getFloat("price_by_unit"),
                                            q.getFloat("final_price"),
                                            q.getString("username_seller")});
            }
            TableAllProducts.setModel(modelo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Is a problem with this query.");
        }
    }//GEN-LAST:event_ButtonConfirm2ActionPerformed

    private void ButtonConfirm3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConfirm3ActionPerformed
        currentUser cu = currentUser.getInstance();
        String username = cu.getUsername();
        ConnectDB c = new ConnectDB();
        DefaultTableModel modelo = new DefaultTableModel();
        TableAllProducts.setModel(modelo);
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        ResultSet q = c.queryWithString(username,"selling_history",true);
        try {
            modelo = (DefaultTableModel)TableAllProducts.getModel();
            modelo.addColumn("Id");
            modelo.addColumn("Name");
            modelo.addColumn("Date");
            modelo.addColumn("Quantity");
            modelo.addColumn("Price by Unit");
            modelo.addColumn("Final Price");
            modelo.addColumn("Username Buyer");
            while(q.next())
            {
                modelo.addRow(new Object[]{q.getInt("product_id"),
                                            q.getString("product_name"),
                                            q.getDate("date"),
                                            q.getInt("quantity"),
                                            q.getFloat("price_by_unit"),
                                            q.getFloat("final_price"),
                                            q.getString("username_buyer")});
            }
            TableAllProducts.setModel(modelo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Is a problem with this query.");
        }
    }//GEN-LAST:event_ButtonConfirm3ActionPerformed

    private void ButtonConfirm4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConfirm4ActionPerformed
        currentUser cu = currentUser.getInstance();
        String username = cu.getUsername();
        ConnectDB c = new ConnectDB();
        DefaultTableModel modelo = new DefaultTableModel();
        TableAllProducts.setModel(modelo);
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        ResultSet q = c.queryWithString(username,"purchases_quantity_over_1000_by_category",true);
        try {
            modelo = (DefaultTableModel)TableAllProducts.getModel();
            modelo.addColumn("Category");
            modelo.addColumn("Purchases over 1000");
            while(q.next())
            {
                modelo.addRow(new Object[]{q.getInt("category"),
                                            q.getString("purchases_over_1000"),});
            }
            TableAllProducts.setModel(modelo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Is a problem with this query.");
        }
    }//GEN-LAST:event_ButtonConfirm4ActionPerformed

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
            java.util.logging.Logger.getLogger(QueryUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QueryUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QueryUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QueryUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QueryUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxCategoryAllProducts;
    private javax.swing.JComboBox<String> BoxMonth;
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonBack1;
    private javax.swing.JButton ButtonBack2;
    private javax.swing.JButton ButtonBack3;
    private javax.swing.JButton ButtonBack4;
    private javax.swing.JButton ButtonConfirm;
    private javax.swing.JButton ButtonConfirm2;
    private javax.swing.JButton ButtonConfirm3;
    private javax.swing.JButton ButtonConfirm4;
    private javax.swing.JTextField FieldNameProduct;
    private javax.swing.JList<String> ListProductsSold;
    private javax.swing.JList<String> ListRecentlyViewed;
    private javax.swing.JPanel PanelListProductsSold;
    private javax.swing.JPanel PanelPurchaseHistory;
    private javax.swing.JPanel PanelPurchasesMade;
    private javax.swing.JPanel PanelRecentlyViewed;
    private javax.swing.JPanel PanelSearchingProduct;
    private javax.swing.JTable TableAllProducts;
    private javax.swing.JTable TablePurchaseHistory;
    private javax.swing.JTable TableUserPurchases;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
