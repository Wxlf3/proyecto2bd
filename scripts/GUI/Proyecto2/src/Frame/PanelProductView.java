/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

/**
 *
 * @author diana
 */
public class PanelProductView extends javax.swing.JPanel {

    /**
     * Creates new form PanelProductView
     */
    public PanelProductView() {
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
        ButtonPicture = new javax.swing.JButton();
        ButtonLeft = new javax.swing.JButton();
        ButtonRight = new javax.swing.JButton();
        ButtonConfirm = new javax.swing.JButton();
        ButtonBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        FieldName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FieldDescription = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        FieldCategory = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        FieldPrice = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        FieldSeller = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        FieldReviewSeller = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableBuyerReview = new javax.swing.JTable();
        Decoration5 = new javax.swing.JPanel();
        Decoration4 = new javax.swing.JPanel();
        Decoration6 = new javax.swing.JPanel();
        Decoration8 = new javax.swing.JPanel();
        FieldName1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(76, 40, 130));
        jLabel1.setText("Product View");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));

        ButtonPicture.setBackground(new java.awt.Color(255, 255, 255));
        ButtonPicture.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        ButtonPicture.setForeground(new java.awt.Color(76, 40, 130));
        ButtonPicture.setText("Picture");
        ButtonPicture.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(76, 40, 130), 2, true));
        ButtonPicture.setContentAreaFilled(false);
        add(ButtonPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 120, 150));

        ButtonLeft.setBackground(new java.awt.Color(255, 255, 255));
        ButtonLeft.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        ButtonLeft.setForeground(new java.awt.Color(76, 40, 130));
        ButtonLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/video-player(1).png"))); // NOI18N
        ButtonLeft.setBorder(null);
        ButtonLeft.setContentAreaFilled(false);
        add(ButtonLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 50, 50));

        ButtonRight.setBackground(new java.awt.Color(255, 255, 255));
        ButtonRight.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        ButtonRight.setForeground(new java.awt.Color(76, 40, 130));
        ButtonRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/video-player.png"))); // NOI18N
        ButtonRight.setBorder(null);
        ButtonRight.setContentAreaFilled(false);
        add(ButtonRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 50, 50));

        ButtonConfirm.setBackground(new java.awt.Color(255, 255, 255));
        ButtonConfirm.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ButtonConfirm.setForeground(new java.awt.Color(76, 40, 130));
        ButtonConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/shopping-basket.png"))); // NOI18N
        ButtonConfirm.setText("  Add to the basket");
        ButtonConfirm.setBorder(null);
        add(ButtonConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 480, 200, 50));

        ButtonBack.setBackground(new java.awt.Color(255, 255, 255));
        ButtonBack.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        ButtonBack.setForeground(new java.awt.Color(76, 40, 130));
        ButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back-arrow.png"))); // NOI18N
        ButtonBack.setBorder(null);
        ButtonBack.setContentAreaFilled(false);
        add(ButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(76, 40, 130));
        jLabel3.setText("Seller:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, -1, -1));

        FieldName.setBackground(new java.awt.Color(255, 255, 255));
        FieldName.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        FieldName.setForeground(new java.awt.Color(76, 40, 130));
        add(FieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 190, 20));

        jSeparator1.setForeground(new java.awt.Color(76, 40, 130));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 190, 20));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(76, 40, 130));
        jLabel5.setText("Description:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        FieldDescription.setColumns(20);
        FieldDescription.setRows(5);
        jScrollPane1.setViewportView(FieldDescription);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 240, 70));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(76, 40, 130));
        jLabel4.setText("Category:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        FieldCategory.setBackground(new java.awt.Color(255, 255, 255));
        FieldCategory.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        FieldCategory.setForeground(new java.awt.Color(76, 40, 130));
        add(FieldCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 190, 20));

        jSeparator2.setForeground(new java.awt.Color(76, 40, 130));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 190, 20));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(76, 40, 130));
        jLabel6.setText("Price:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        FieldPrice.setBackground(new java.awt.Color(255, 255, 255));
        FieldPrice.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        FieldPrice.setForeground(new java.awt.Color(76, 40, 130));
        add(FieldPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 190, 20));

        jSeparator3.setForeground(new java.awt.Color(76, 40, 130));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 190, 20));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(76, 40, 130));
        jLabel8.setText("Pictures:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(76, 40, 130));
        jLabel7.setText("Name:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        FieldSeller.setBackground(new java.awt.Color(255, 255, 255));
        FieldSeller.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        FieldSeller.setForeground(new java.awt.Color(76, 40, 130));
        add(FieldSeller, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 190, 20));

        jSeparator4.setForeground(new java.awt.Color(76, 40, 130));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 190, 20));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(76, 40, 130));
        jLabel9.setText("Seller review:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, -1, -1));

        FieldReviewSeller.setColumns(20);
        FieldReviewSeller.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        FieldReviewSeller.setForeground(new java.awt.Color(76, 40, 130));
        FieldReviewSeller.setRows(5);
        jScrollPane3.setViewportView(FieldReviewSeller);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, 220, 70));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(76, 40, 130));
        jLabel10.setText("Score:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(76, 40, 130));
        jLabel11.setText("Estrellitas");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(76, 40, 130));
        jLabel12.setText("Buyers review:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, -1));

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
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

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 400, 110));

        Decoration5.setBackground(new java.awt.Color(239, 184, 16));
        Decoration5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(Decoration5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 60, 100));

        Decoration4.setBackground(new java.awt.Color(239, 184, 16));
        Decoration4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(Decoration4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 30, 60, 100));

        Decoration6.setBackground(new java.awt.Color(76, 40, 130));

        javax.swing.GroupLayout Decoration6Layout = new javax.swing.GroupLayout(Decoration6);
        Decoration6.setLayout(Decoration6Layout);
        Decoration6Layout.setHorizontalGroup(
            Decoration6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        Decoration6Layout.setVerticalGroup(
            Decoration6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        add(Decoration6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 60, 100));

        Decoration8.setBackground(new java.awt.Color(76, 40, 130));

        javax.swing.GroupLayout Decoration8Layout = new javax.swing.GroupLayout(Decoration8);
        Decoration8.setLayout(Decoration8Layout);
        Decoration8Layout.setHorizontalGroup(
            Decoration8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        Decoration8Layout.setVerticalGroup(
            Decoration8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        add(Decoration8, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 60, 100));

        FieldName1.setBackground(new java.awt.Color(255, 255, 255));
        FieldName1.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        FieldName1.setForeground(new java.awt.Color(76, 40, 130));
        add(FieldName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 190, 20));

        jSeparator5.setForeground(new java.awt.Color(76, 40, 130));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 190, 20));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonConfirm;
    private javax.swing.JButton ButtonLeft;
    private javax.swing.JButton ButtonPicture;
    private javax.swing.JButton ButtonRight;
    private javax.swing.JPanel Decoration4;
    private javax.swing.JPanel Decoration5;
    private javax.swing.JPanel Decoration6;
    private javax.swing.JPanel Decoration8;
    private javax.swing.JLabel FieldCategory;
    private javax.swing.JTextArea FieldDescription;
    private javax.swing.JLabel FieldName;
    private javax.swing.JLabel FieldName1;
    private javax.swing.JLabel FieldPrice;
    private javax.swing.JTextArea FieldReviewSeller;
    private javax.swing.JLabel FieldSeller;
    private javax.swing.JTable TableBuyerReview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
