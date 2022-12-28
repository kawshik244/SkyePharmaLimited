/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pharmacy2;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form Signup
     */
    public Signup() {
        initComponents();
        
    }

Connection Con = null;
Statement St = null,St1 = null;
ResultSet Rs = null,Rs1 = null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        GenderCb = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        SignUpBtn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Aname = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Aage = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Aphone = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        Apass = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        Aid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\OneDrive\\Desktop\\Pharmacy2\\xmarsx.png")); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 30, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gender");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, -1, -1));

        GenderCb.setFont(new java.awt.Font("Segoe UI Symbol", 1, 16)); // NOI18N
        GenderCb.setForeground(new java.awt.Color(153, 0, 153));
        GenderCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        GenderCb.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 153), new java.awt.Color(204, 0, 51), null, null));
        GenderCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderCbActionPerformed(evt);
            }
        });
        jPanel1.add(GenderCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 210, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\OneDrive\\Desktop\\Pharmacy2\\zback1.png")); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 0, 40, 40));

        SignUpBtn.setBackground(new java.awt.Color(204, 204, 204));
        SignUpBtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        SignUpBtn.setForeground(new java.awt.Color(102, 0, 255));
        SignUpBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\OneDrive\\Desktop\\Pharmacy2\\fxx.png")); // NOI18N
        SignUpBtn.setText("Sign Up");
        SignUpBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SignUpBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SignUpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpBtnMouseClicked(evt);
            }
        });
        jPanel1.add(SignUpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, 150, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\OneDrive\\Desktop\\Pharmacy2\\xxx.png")); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 30, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("New Password");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 100, 20));

        Aname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Aname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnameActionPerformed(evt);
            }
        });
        jPanel1.add(Aname, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 210, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\OneDrive\\Desktop\\Pharmacy2\\fcal.png")); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 30, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\OneDrive\\Desktop\\Pharmacy2\\fpx.png")); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 30, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Age");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 70, 20));

        Aage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(Aage, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 210, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Phone");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, 70, 20));

        Aphone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(Aphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, 210, 30));

        jPanel7.setBackground(new java.awt.Color(224, 20, 71));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("X");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(857, 0, -1, -1));

        Apass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(Apass, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 210, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Agent Name");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 80, 20));

        Aid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(Aid, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 210, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Agent ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 80, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\OneDrive\\Desktop\\Pharmacy2\\fid.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 30, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\OneDrive\\Desktop\\Pharmacy2\\xxy.png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 40, 30));

        jLabel28.setFont(new java.awt.Font("Segoe Print", 2, 20)); // NOI18N
        jLabel28.setText("Caring Beyond Drugs");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 220, 30));

        jLabel27.setFont(new java.awt.Font("Cambria", 1, 34)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 153));
        jLabel27.setText("Skye Pharma Limited");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 350, 50));

        jLabel29.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\OneDrive\\Desktop\\Pharmacy2\\pharmacy iconF.png")); // NOI18N
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\OneDrive\\Desktop\\Pharmacy2\\0sign.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 500, 460));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, 600));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\OneDrive\\Desktop\\Pharmacy2\\login back.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 320, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void SignUpBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpBtnMouseClicked
        if(Aid.getText().isEmpty() || Aname.getText().isEmpty() || Aage.getText().isEmpty() || Aphone.getText().isEmpty() || Apass.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else
        {

            try
        {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","kawshik244");
            PreparedStatement add = Con.prepareStatement("insert into VERIFYAGENT values(?,?,?,?,?,?)");
            add.setInt(1, Integer.valueOf(Aid.getText()));
            add.setString(2, Aname.getText());
            add.setInt(3, Integer.valueOf(Aage.getText()));
            add.setString(4, Aphone.getText());
            add.setString(5, Apass.getText());
            add.setString(6, GenderCb.getSelectedItem().toString());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Waiting For Admin Approval");
            Con.close();
            new login().setVisible(true);
            this.dispose();
            
            
            
        }
        catch(SQLException e){
            
            e.printStackTrace();
        }

        }
    }//GEN-LAST:event_SignUpBtnMouseClicked

    private void AnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnameActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void GenderCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderCbActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Aage;
    private javax.swing.JTextField Aid;
    private javax.swing.JTextField Aname;
    private javax.swing.JPasswordField Apass;
    private javax.swing.JTextField Aphone;
    private javax.swing.JComboBox<String> GenderCb;
    private javax.swing.JButton SignUpBtn;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
