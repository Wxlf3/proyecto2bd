package Frame;

import BL.product;
import Connection.ConnectDB;
import Connection.currentUser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelPrincipalPage extends javax.swing.JFrame {

    private List<Object> products = new ArrayList<>();
    
    public PanelPrincipalPage() {
        initComponents();
        setLocationRelativeTo(null);
        clear();
    }
    
    public void clear()
    {
        DefaultTableModel modelo = new DefaultTableModel();
        TableAllProducts.setModel(modelo);
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        modelo = (DefaultTableModel)TableAllProducts.getModel();
        modelo.addColumn("Id");
        modelo.addColumn("Price");
        modelo.addColumn("Name");
        modelo.addColumn("Category");
       
        ConnectDB c = new ConnectDB();
        
        BoxCategory.removeAllItems();
        BoxCategory.addItem("Default");

        ResultSet category = c.query("getAll_category",true);
        
        try {
            while(category.next())
            {
                BoxCategory.addItem(String.valueOf(category.getString("name")));
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }
    
    public void lock()
    {
        try{
        currentUser cu = currentUser.getInstance();
        if(cu.getUsername() == "Guest"){
            PanelGuest.setVisible(true);
            PanelAdmin.setVisible(false);
            PanelUser.setVisible(false);
        } else if(cu.isAdmin()){
            PanelAdmin.setVisible(true);
            PanelGuest.setVisible(false);
            PanelUser.setVisible(false);
        } else if(cu.getUsername() != null){
            PanelUser.setVisible(true);
            PanelGuest.setVisible(false);
            PanelAdmin.setVisible(false);
        }
        }catch(Exception e)
        {
            System.out.println("Error: " +e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PanelProducts = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableAllProducts = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        FieldNameProduct = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        BoxCategory = new javax.swing.JComboBox<>();
        ButtonSearch = new javax.swing.JButton();
        ButtonShow = new javax.swing.JButton();
        PanelGuest = new javax.swing.JPanel();
        ButtonProfile = new javax.swing.JButton();
        ButtonBasket = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PanelAdmin = new javax.swing.JPanel();
        ButtonProfileAdmin = new javax.swing.JButton();
        ButtonBasketAdmin = new javax.swing.JButton();
        ButtonQueryAdmin = new javax.swing.JButton();
        ButtonStatistics = new javax.swing.JButton();
        ButtonSettingsAdmin = new javax.swing.JButton();
        ButtonWishlist = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ButtonSettingsAdmin1 = new javax.swing.JButton();
        ButtonLogOut1 = new javax.swing.JButton();
        PanelUser = new javax.swing.JPanel();
        ButtonProfileUser = new javax.swing.JButton();
        ButtonBasketUser = new javax.swing.JButton();
        ButtonQueryUser = new javax.swing.JButton();
        ButtonSettingsUser = new javax.swing.JButton();
        ButtonWishlistUser = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ButtonLogOut = new javax.swing.JButton();

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
        PanelProducts.setLayout(null);

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
        jScrollPane4.setViewportView(TableAllProducts);

        PanelProducts.add(jScrollPane4);
        jScrollPane4.setBounds(0, 0, 454, 580);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(76, 40, 130));
        jLabel8.setText("Name Product: ");
        PanelProducts.add(jLabel8);
        jLabel8.setBounds(550, 127, 134, 42);

        FieldNameProduct.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        FieldNameProduct.setForeground(new java.awt.Color(76, 40, 130));
        FieldNameProduct.setBorder(null);
        PanelProducts.add(FieldNameProduct);
        FieldNameProduct.setBounds(540, 180, 160, 30);

        jSeparator1.setForeground(new java.awt.Color(76, 40, 130));
        jSeparator1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        PanelProducts.add(jSeparator1);
        jSeparator1.setBounds(540, 210, 160, 30);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(76, 40, 130));
        jLabel7.setText("Category:");
        PanelProducts.add(jLabel7);
        jLabel7.setBounds(560, 250, 83, 22);

        BoxCategory.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        BoxCategory.setForeground(new java.awt.Color(76, 40, 130));
        PanelProducts.add(BoxCategory);
        BoxCategory.setBounds(530, 300, 170, 30);

        ButtonSearch.setBackground(new java.awt.Color(255, 255, 255));
        ButtonSearch.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ButtonSearch.setForeground(new java.awt.Color(76, 40, 130));
        ButtonSearch.setText("Search");
        ButtonSearch.setBorder(null);
        ButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSearchActionPerformed(evt);
            }
        });
        PanelProducts.add(ButtonSearch);
        ButtonSearch.setBounds(560, 360, 110, 30);

        ButtonShow.setBackground(new java.awt.Color(255, 255, 255));
        ButtonShow.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ButtonShow.setForeground(new java.awt.Color(76, 40, 130));
        ButtonShow.setText("View Product");
        ButtonShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonShowActionPerformed(evt);
            }
        });
        PanelProducts.add(ButtonShow);
        ButtonShow.setBounds(550, 450, 170, 30);

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
        ButtonProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonProfileMouseClicked(evt);
            }
        });
        ButtonProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonProfileActionPerformed(evt);
            }
        });
        PanelGuest.add(ButtonProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 30, 70, 70));

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
        PanelGuest.add(ButtonBasket, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 160, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo.png"))); // NOI18N
        PanelGuest.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, -1, -1));

        PanelPrincipal.add(PanelGuest, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 220, 580));

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
        PanelAdmin.add(ButtonWishlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 121, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo.png"))); // NOI18N
        PanelAdmin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, -1, -1));

        ButtonSettingsAdmin1.setBackground(new java.awt.Color(255, 255, 255));
        ButtonSettingsAdmin1.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        ButtonSettingsAdmin1.setForeground(new java.awt.Color(76, 40, 130));
        ButtonSettingsAdmin1.setText("System settings");
        ButtonSettingsAdmin1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        ButtonSettingsAdmin1.setContentAreaFilled(false);
        ButtonSettingsAdmin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSettingsAdmin1ActionPerformed(evt);
            }
        });
        PanelAdmin.add(ButtonSettingsAdmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 400, 160, 30));

        ButtonLogOut1.setBackground(new java.awt.Color(255, 255, 255));
        ButtonLogOut1.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        ButtonLogOut1.setForeground(new java.awt.Color(76, 40, 130));
        ButtonLogOut1.setText("Log out");
        ButtonLogOut1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        ButtonLogOut1.setContentAreaFilled(false);
        ButtonLogOut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLogOut1ActionPerformed(evt);
            }
        });
        PanelAdmin.add(ButtonLogOut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 120, 40));

        PanelPrincipal.add(PanelAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 220, 580));

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo.png"))); // NOI18N
        PanelUser.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, -1, -1));

        ButtonLogOut.setBackground(new java.awt.Color(255, 255, 255));
        ButtonLogOut.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        ButtonLogOut.setForeground(new java.awt.Color(76, 40, 130));
        ButtonLogOut.setText("Log out");
        ButtonLogOut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        ButtonLogOut.setContentAreaFilled(false);
        ButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLogOutActionPerformed(evt);
            }
        });
        PanelUser.add(ButtonLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 120, 40));

        PanelPrincipal.add(PanelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 220, 580));

        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        ConnectDB c = new ConnectDB();
        ResultSet pro = c.query("getAll_product",true);
        try {
            while(pro.next()){
                    product p = new product(pro.getFloat("price"),
                                            pro.getString("name"),
                                            pro.getString("description"),
                                            pro.getInt("quant_in_stock"),
                                            pro.getBoolean("is_visible"),
                                            pro.getInt("id_category"),
                                            pro.getString("username_seller"),
                                            pro.getInt("id_delivery_type"));
                    products.add(p);
            }
        } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error. Try later");
        } finally{
            currentUser cu = currentUser.getInstance();
            for(Object p : this.products){
                JButton Bttnproduct = new JButton();
                var prod = (product) p;
                Bttnproduct.setText(prod.getName());
                Bttnproduct.setIcon(new ImageIcon("close-button.png"));
                PanelProducts.add(Bttnproduct);
                Bttnproduct.addActionListener(new ActionListener(){  
                    public void actionPerformed(ActionEvent e){  
                        cu.insertInHistory(prod);
                    }  
                });
            lock();
            }
        }
    }//GEN-LAST:event_formFocusGained

    private void ButtonProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonProfileActionPerformed
        Login w = new Login();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonProfileActionPerformed

    private void PanelGuestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelGuestMouseEntered
        lock();
    }//GEN-LAST:event_PanelGuestMouseEntered

    private void PanelGuestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelGuestMouseExited
        lock();
    }//GEN-LAST:event_PanelGuestMouseExited

    private void ButtonBasketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBasketActionPerformed
        Basket w = new Basket();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonBasketActionPerformed

    private void ButtonProfileUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonProfileUserActionPerformed
        ProfileSettings w = new ProfileSettings();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonProfileUserActionPerformed

    private void ButtonBasketUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBasketUserActionPerformed
        Basket w = new Basket();
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
        Wishlist w = new Wishlist();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonWishlistUserActionPerformed

    private void ButtonProfileAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonProfileAdminActionPerformed
        ProfileSettings w = new ProfileSettings();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonProfileAdminActionPerformed

    private void ButtonBasketAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBasketAdminActionPerformed
        Basket w = new Basket();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonBasketAdminActionPerformed

    private void ButtonQueryAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonQueryAdminActionPerformed
        QueryAdmin w = new QueryAdmin();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonQueryAdminActionPerformed

    private void ButtonSettingsAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSettingsAdminActionPerformed
        ProfileSettings w = new ProfileSettings();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonSettingsAdminActionPerformed

    private void ButtonStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonStatisticsActionPerformed
        Statistics w = new Statistics();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonStatisticsActionPerformed

    private void ButtonWishlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonWishlistActionPerformed
        Wishlist w = new Wishlist();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonWishlistActionPerformed

    private void ButtonProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonProfileMouseClicked
        ProfileSettings w = new ProfileSettings();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonProfileMouseClicked

    private void ButtonSettingsAdmin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSettingsAdmin1ActionPerformed
        SystemSettings w = new SystemSettings();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonSettingsAdmin1ActionPerformed

    private void ButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSearchActionPerformed
        ConnectDB c = new ConnectDB();
        DefaultTableModel modelo = new DefaultTableModel();
        TableAllProducts.setModel(modelo);
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        String name = FieldNameProduct.getText();
        String category_element = (String) BoxCategory.getSelectedItem();
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
            modelo.addColumn("Category");
            while(q.next())
            {
                modelo.addRow(new Object[]{q.getInt("id"),q.getFloat("price"),q.getString("name"),q.getString("category")});
            }
            TableAllProducts.setModel(modelo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error, Try again later.");
        }
    }//GEN-LAST:event_ButtonSearchActionPerformed

    private void ButtonShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonShowActionPerformed
        int row = TableAllProducts.getSelectedRow();
        int pid = (int) TableAllProducts.getModel().getValueAt(row, 0);
        ProductView w = new ProductView(pid);
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonShowActionPerformed

    private void ButtonLogOut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLogOut1ActionPerformed
        currentUser c = currentUser.getInstance();
        c.setUsername("Guest");
        c.setId_userType(0);
        Login w = new Login();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonLogOut1ActionPerformed

    private void ButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLogOutActionPerformed
        currentUser c = currentUser.getInstance();
        c.setUsername("Guest");
        c.setId_userType(0);
        Login w = new Login();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonLogOutActionPerformed

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
    private javax.swing.JComboBox<String> BoxCategory;
    private javax.swing.JButton ButtonBasket;
    private javax.swing.JButton ButtonBasketAdmin;
    private javax.swing.JButton ButtonBasketUser;
    private javax.swing.JButton ButtonLogOut;
    private javax.swing.JButton ButtonLogOut1;
    private javax.swing.JButton ButtonProfile;
    private javax.swing.JButton ButtonProfileAdmin;
    private javax.swing.JButton ButtonProfileUser;
    private javax.swing.JButton ButtonQueryAdmin;
    private javax.swing.JButton ButtonQueryUser;
    private javax.swing.JButton ButtonSearch;
    private javax.swing.JButton ButtonSettingsAdmin;
    private javax.swing.JButton ButtonSettingsAdmin1;
    private javax.swing.JButton ButtonSettingsUser;
    private javax.swing.JButton ButtonShow;
    private javax.swing.JButton ButtonStatistics;
    private javax.swing.JButton ButtonWishlist;
    private javax.swing.JButton ButtonWishlistUser;
    private javax.swing.JTextField FieldNameProduct;
    private javax.swing.JPanel PanelAdmin;
    private javax.swing.JPanel PanelGuest;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelProducts;
    private javax.swing.JPanel PanelUser;
    private javax.swing.JTable TableAllProducts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
