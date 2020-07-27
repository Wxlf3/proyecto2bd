
package Frame;

public class Profile extends javax.swing.JFrame {

    public String user;
    
    public Profile() {
        initComponents();
    }
    
    public Profile(String puser) {
        initComponents();
        user = puser;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SpaceName = new javax.swing.JLabel();
        SpaceResidence = new javax.swing.JLabel();
        SpaceRatingSeller = new javax.swing.JLabel();
        SpaceRatingBuyer = new javax.swing.JLabel();
        ButtonContact = new javax.swing.JButton();
        ButtonBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PanelProducts = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ButtonPicture = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableBuyerReview = new javax.swing.JTable();
        SpaceRatingSeller1 = new javax.swing.JLabel();
        SpaceRatingSeller2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/location.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 132, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(76, 40, 130));
        jLabel2.setText("Products");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 200, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(76, 40, 130));
        jLabel3.setText("Comments");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 280, 200, -1));

        SpaceName.setBackground(new java.awt.Color(255, 255, 255));
        SpaceName.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        SpaceName.setForeground(new java.awt.Color(76, 40, 130));
        SpaceName.setText("Name of the user");
        jPanel1.add(SpaceName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 200, -1));

        SpaceResidence.setBackground(new java.awt.Color(255, 255, 255));
        SpaceResidence.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        SpaceResidence.setForeground(new java.awt.Color(76, 40, 130));
        SpaceResidence.setText("City, Country Residence");
        jPanel1.add(SpaceResidence, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 200, -1));

        SpaceRatingSeller.setBackground(new java.awt.Color(255, 255, 255));
        SpaceRatingSeller.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        SpaceRatingSeller.setForeground(new java.awt.Color(76, 40, 130));
        SpaceRatingSeller.setText("Rating as seller");
        jPanel1.add(SpaceRatingSeller, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 120, -1));

        SpaceRatingBuyer.setBackground(new java.awt.Color(255, 255, 255));
        SpaceRatingBuyer.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        SpaceRatingBuyer.setForeground(new java.awt.Color(76, 40, 130));
        SpaceRatingBuyer.setText("Rating as buyer");
        jPanel1.add(SpaceRatingBuyer, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 130, -1));

        ButtonContact.setBackground(new java.awt.Color(255, 255, 255));
        ButtonContact.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        ButtonContact.setForeground(new java.awt.Color(76, 40, 130));
        ButtonContact.setText("Contact");
        ButtonContact.setBorder(null);
        ButtonContact.setContentAreaFilled(false);
        jPanel1.add(ButtonContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 120, 40));

        ButtonBack.setBackground(new java.awt.Color(255, 255, 255));
        ButtonBack.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        ButtonBack.setForeground(new java.awt.Color(76, 40, 130));
        ButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back-arrow.png"))); // NOI18N
        ButtonBack.setBorder(null);
        ButtonBack.setContentAreaFilled(false);
        jPanel1.add(ButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        PanelProducts.setBackground(new java.awt.Color(255, 255, 255));
        PanelProducts.setLayout(new java.awt.GridLayout(0, 3));
        jScrollPane1.setViewportView(PanelProducts);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 320, 220));

        jPanel2.setBackground(new java.awt.Color(239, 184, 16));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 50, 580));

        ButtonPicture.setBackground(new java.awt.Color(255, 255, 255));
        ButtonPicture.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        ButtonPicture.setForeground(new java.awt.Color(76, 40, 130));
        ButtonPicture.setText("Picture");
        ButtonPicture.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(76, 40, 130), 2, true));
        ButtonPicture.setContentAreaFilled(false);
        jPanel1.add(ButtonPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 120, 150));

        jScrollPane4.setForeground(new java.awt.Color(76, 40, 130));

        TableBuyerReview.setAutoCreateColumnsFromModel(false);
        TableBuyerReview.setAutoCreateRowSorter(true);
        TableBuyerReview.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        TableBuyerReview.setForeground(new java.awt.Color(76, 40, 130));
        TableBuyerReview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "User", "Comment"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(TableBuyerReview);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 320, 220));

        SpaceRatingSeller1.setBackground(new java.awt.Color(255, 255, 255));
        SpaceRatingSeller1.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        SpaceRatingSeller1.setForeground(new java.awt.Color(76, 40, 130));
        SpaceRatingSeller1.setText("estrellitas");
        jPanel1.add(SpaceRatingSeller1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 120, -1));

        SpaceRatingSeller2.setBackground(new java.awt.Color(255, 255, 255));
        SpaceRatingSeller2.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        SpaceRatingSeller2.setForeground(new java.awt.Color(76, 40, 130));
        SpaceRatingSeller2.setText("estrellitas");
        jPanel1.add(SpaceRatingSeller2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 120, -1));

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
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonContact;
    private javax.swing.JButton ButtonPicture;
    private javax.swing.JPanel PanelProducts;
    private javax.swing.JLabel SpaceName;
    private javax.swing.JLabel SpaceRatingBuyer;
    private javax.swing.JLabel SpaceRatingSeller;
    private javax.swing.JLabel SpaceRatingSeller1;
    private javax.swing.JLabel SpaceRatingSeller2;
    private javax.swing.JLabel SpaceResidence;
    private javax.swing.JTable TableBuyerReview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
