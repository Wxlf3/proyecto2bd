package Frame;

import BL.person;
import BL.user;
import Connection.ConnectDB;
import java.sql.Date;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class Registration extends javax.swing.JFrame {
    
    public Registration() {
        initComponents();
        setLocationRelativeTo(null);
        fillCombo();
    }
    
    void fillCombo()
    {
        ConnectDB c = new ConnectDB();
        
        BoxNationality.removeAllItems();
        BoxNationality.addItem("Default");
        
        ResultSet nationality = c.query("`getAll_nationality`",false);
        
        BoxGender.removeAllItems();
        BoxGender.addItem("Default");
        
        ResultSet gender = c.query("`getAll_gender`",false);
        
        BoxCountry.removeAllItems();
        BoxCountry.addItem("Default");
        
        ResultSet country = c.query("`getAll_country`",false);
        
        BoxState.removeAllItems();
        BoxState.addItem("Default");
        
        ResultSet state = c.query("`getAll_state`",false);
        
        BoxCity.removeAllItems();
        BoxCity.addItem("Default");
        
        ResultSet city = c.query("`getAll_city`",false);
        
        BoxDistrict.removeAllItems();
        BoxDistrict.addItem("Default");
        
        ResultSet district = c.query("`getAll_district`",false);
        
        try {
            while(nationality.next())
            {
                BoxNationality.addItem(String.valueOf(nationality.getString("name")));
            }
            while(gender.next())
            {
                BoxGender.addItem(String.valueOf(gender.getString("name")));
            }
            while(country.next())
            {
                BoxCountry.addItem(String.valueOf(country.getString("name")));
            }
            while(state.next())
            {
                BoxState.addItem(String.valueOf(state.getString("name")));
            }
            while(city.next())
            {
                BoxCity.addItem(String.valueOf(city.getString("name")));
            }
            while(district.next())
            {
                BoxDistrict.addItem(String.valueOf(district.getString("name")));
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ButtonPicture = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ButtonCancel = new javax.swing.JButton();
        ButtonConfirm = new javax.swing.JButton();
        FieldPhone = new javax.swing.JTextField();
        FieldName = new javax.swing.JTextField();
        FieldMiddleName = new javax.swing.JTextField();
        FieldLastName = new javax.swing.JTextField();
        FieldId = new javax.swing.JTextField();
        FieldUsername = new javax.swing.JTextField();
        FieldPassword = new javax.swing.JTextField();
        FieldEmail = new javax.swing.JTextField();
        FieldBirthday = new javax.swing.JFormattedTextField();
        BoxDistrict = new javax.swing.JComboBox<>();
        BoxNationality = new javax.swing.JComboBox<>();
        BoxGender = new javax.swing.JComboBox<>();
        BoxCountry = new javax.swing.JComboBox<>();
        BoxState = new javax.swing.JComboBox<>();
        BoxCity = new javax.swing.JComboBox<>();
        Decoration = new javax.swing.JPanel();
        PanelDecoration1 = new javax.swing.JPanel();
        PanelDecoration2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(76, 40, 130));
        jLabel1.setText("Registration");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(76, 40, 130));
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(76, 40, 130));
        jLabel3.setText("Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(76, 40, 130));
        jLabel4.setText("Middle name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(76, 40, 130));
        jLabel5.setText("Last name:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(76, 40, 130));
        jLabel6.setText("Email:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(76, 40, 130));
        jLabel7.setText("Phone number:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(76, 40, 130));
        jLabel8.setText("Birthday:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(76, 40, 130));
        jLabel9.setText("Id:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(76, 40, 130));
        jLabel10.setText("Nationality:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(76, 40, 130));
        jLabel11.setText("Gender:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(76, 40, 130));
        jLabel12.setText("District:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, -1, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(76, 40, 130));
        jLabel13.setText("Username:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, -1, -1));

        ButtonPicture.setBackground(new java.awt.Color(255, 255, 255));
        ButtonPicture.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        ButtonPicture.setForeground(new java.awt.Color(76, 40, 130));
        ButtonPicture.setText("Picture");
        ButtonPicture.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(76, 40, 130), 2, true));
        ButtonPicture.setContentAreaFilled(false);
        jPanel1.add(ButtonPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 120, 150));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(76, 40, 130));
        jLabel14.setText("Residence");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(76, 40, 130));
        jLabel15.setText("Country:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, -1));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(76, 40, 130));
        jLabel16.setText("State:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(76, 40, 130));
        jLabel17.setText("City:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, -1));

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
        jPanel1.add(ButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 520, 110, 30));

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
        jPanel1.add(ButtonConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, 110, 30));

        FieldPhone.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        FieldPhone.setForeground(new java.awt.Color(76, 40, 130));
        jPanel1.add(FieldPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, 190, 30));

        FieldName.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        FieldName.setForeground(new java.awt.Color(76, 40, 130));
        jPanel1.add(FieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 190, 30));

        FieldMiddleName.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        FieldMiddleName.setForeground(new java.awt.Color(76, 40, 130));
        jPanel1.add(FieldMiddleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 190, 30));

        FieldLastName.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        FieldLastName.setForeground(new java.awt.Color(76, 40, 130));
        jPanel1.add(FieldLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 190, 30));

        FieldId.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        FieldId.setForeground(new java.awt.Color(76, 40, 130));
        jPanel1.add(FieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 190, 30));

        FieldUsername.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        FieldUsername.setForeground(new java.awt.Color(76, 40, 130));
        jPanel1.add(FieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 190, 30));

        FieldPassword.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        FieldPassword.setForeground(new java.awt.Color(76, 40, 130));
        jPanel1.add(FieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 320, 190, 30));

        FieldEmail.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        FieldEmail.setForeground(new java.awt.Color(76, 40, 130));
        jPanel1.add(FieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 190, 30));

        FieldBirthday.setForeground(new java.awt.Color(76, 40, 130));
        FieldBirthday.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        FieldBirthday.setCaretColor(new java.awt.Color(76, 40, 130));
        FieldBirthday.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        FieldBirthday.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jPanel1.add(FieldBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, 120, 30));

        BoxDistrict.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        BoxDistrict.setForeground(new java.awt.Color(76, 40, 130));
        jPanel1.add(BoxDistrict, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 170, 30));

        BoxNationality.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        BoxNationality.setForeground(new java.awt.Color(76, 40, 130));
        jPanel1.add(BoxNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 99, 170, 30));

        BoxGender.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        BoxGender.setForeground(new java.awt.Color(76, 40, 130));
        jPanel1.add(BoxGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 170, 30));

        BoxCountry.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        BoxCountry.setForeground(new java.awt.Color(76, 40, 130));
        jPanel1.add(BoxCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 170, 30));

        BoxState.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        BoxState.setForeground(new java.awt.Color(76, 40, 130));
        jPanel1.add(BoxState, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 170, 30));

        BoxCity.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        BoxCity.setForeground(new java.awt.Color(76, 40, 130));
        jPanel1.add(BoxCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 170, 30));

        Decoration.setBackground(new java.awt.Color(255, 255, 255));
        Decoration.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelDecoration1.setBackground(new java.awt.Color(76, 40, 130));

        javax.swing.GroupLayout PanelDecoration1Layout = new javax.swing.GroupLayout(PanelDecoration1);
        PanelDecoration1.setLayout(PanelDecoration1Layout);
        PanelDecoration1Layout.setHorizontalGroup(
            PanelDecoration1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        PanelDecoration1Layout.setVerticalGroup(
            PanelDecoration1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        Decoration.add(PanelDecoration1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 580));

        PanelDecoration2.setBackground(new java.awt.Color(239, 184, 16));

        javax.swing.GroupLayout PanelDecoration2Layout = new javax.swing.GroupLayout(PanelDecoration2);
        PanelDecoration2.setLayout(PanelDecoration2Layout);
        PanelDecoration2Layout.setHorizontalGroup(
            PanelDecoration2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        PanelDecoration2Layout.setVerticalGroup(
            PanelDecoration2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        Decoration.add(PanelDecoration2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 580));

        jPanel1.add(Decoration, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 580));

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

    private void ButtonConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConfirmActionPerformed
        ConnectDB c = new ConnectDB();
        var id = FieldId.getText();
        var first_name = FieldName.getText();
        var middle_name = " ";
        try {
        middle_name = FieldMiddleName.getText();
        }
        catch (NullPointerException e) {}
        var last_name = FieldLastName.getText();
        var email = FieldEmail.getText();
        var phone_number = FieldPhone.getText();
        java.util.Date birthday = null;
        try {
            birthday = new SimpleDateFormat("dd/MM/yy").parse(FieldBirthday.getText());
        }
        catch (Exception e){}
        java.sql.Date birthday_sql = new java.sql.Date(birthday.getTime());
        var picture_path = "";
        var username = FieldUsername.getText();
        var password = FieldPassword.getText();
        String id_gender_element = (String) BoxGender.getSelectedItem();
        var id_gender = c.getIntWithString(id_gender_element, "getId_gender", false);
        String id_district_element = (String) BoxDistrict.getSelectedItem();
        var id_district = c.getIntWithString(id_district_element, "getId_gender", false);
        person p = new person(id, first_name, middle_name, last_name, email, phone_number, birthday_sql, picture_path, id_gender, id_district, username);
        c.insertPerson(p);
        user u = new user(username, password, 2);
        c.insertUser(u);
        JOptionPane.showMessageDialog(this, "The person was created successfully in the system.");
    }//GEN-LAST:event_ButtonConfirmActionPerformed

    private void ButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelActionPerformed
        PanelPrincipalPage w = new PanelPrincipalPage();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonCancelActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxCity;
    private javax.swing.JComboBox<String> BoxCountry;
    private javax.swing.JComboBox<String> BoxDistrict;
    private javax.swing.JComboBox<String> BoxGender;
    private javax.swing.JComboBox<String> BoxNationality;
    private javax.swing.JComboBox<String> BoxState;
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JButton ButtonConfirm;
    private javax.swing.JButton ButtonPicture;
    private javax.swing.JPanel Decoration;
    private javax.swing.JFormattedTextField FieldBirthday;
    private javax.swing.JTextField FieldEmail;
    private javax.swing.JTextField FieldId;
    private javax.swing.JTextField FieldLastName;
    private javax.swing.JTextField FieldMiddleName;
    private javax.swing.JTextField FieldName;
    private javax.swing.JTextField FieldPassword;
    private javax.swing.JTextField FieldPhone;
    private javax.swing.JTextField FieldUsername;
    private javax.swing.JPanel PanelDecoration1;
    private javax.swing.JPanel PanelDecoration2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
