/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pharmacy2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Asus
 */
public class ChangePassword extends javax.swing.JFrame {

    /**
     * Creates new form ChangePassword
     */
    public static String agentusername;
    public int id;
    public ChangePassword() {
        initComponents();
    }
    public ChangePassword(String name) {
        initComponents();
        agentusername = name;
        try{
                    Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","kawshik244");
                    PreparedStatement pst = Con.prepareStatement("select *from AGENTTBL where ANAME = ?");
                    pst.setString(1,agentusername);
                    Rs = pst.executeQuery();
           if(Rs.next()){
              
               id = Integer.valueOf(Rs.getString("AID"));
               //imgname = Rs.getString("ANAME");
           }
           
        }
        catch(SQLException e){
                e.printStackTrace();
            }
    }
Connection Con = null;
Statement St = null,St1 = null;
ResultSet Rs = null,Rs1 = null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        Oldtxt = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Rtxt = new javax.swing.JPasswordField();
        Newtxt = new javax.swing.JPasswordField();
        SignBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 255, 204));
        jLabel9.setText("forgot your password?");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 150, -1));

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

        Oldtxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(Oldtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 210, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\OneDrive\\Desktop\\Pharmacy2\\xxx.png")); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 30, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\OneDrive\\Desktop\\Pharmacy2\\zback1.png")); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 40, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\OneDrive\\Desktop\\Pharmacy2\\xxx.png")); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 30, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Re-Enter Password");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 120, 20));

        Rtxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(Rtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 210, 30));

        Newtxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(Newtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 210, 30));

        SignBtn.setBackground(new java.awt.Color(204, 204, 204));
        SignBtn.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        SignBtn.setForeground(new java.awt.Color(102, 0, 255));
        SignBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\OneDrive\\Desktop\\Pharmacy2\\passwordpasa1.png")); // NOI18N
        SignBtn.setText("Change Password");
        SignBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignBtnMouseClicked(evt);
            }
        });
        SignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SignBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 200, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("New Password");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 100, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Old Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 100, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\OneDrive\\Desktop\\Pharmacy2\\xxx.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 30, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 290, 10));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 204));
        jLabel4.setText("Skye Pharma Centralized System");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 300, 30));

        jLabel3.setBackground(new java.awt.Color(51, 255, 255));
        jLabel3.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 204));
        jLabel3.setText("Welcome To");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 100, 50));

        jLabel28.setFont(new java.awt.Font("Segoe Print", 2, 20)); // NOI18N
        jLabel28.setText("Caring Beyond Drugs");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 220, 30));

        jLabel27.setFont(new java.awt.Font("Cambria", 1, 34)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 153));
        jLabel27.setText("Skye Pharma Limited");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 350, 50));

        jLabel29.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\OneDrive\\Desktop\\Pharmacy2\\pharmacy iconF.png")); // NOI18N
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\OneDrive\\Desktop\\Pharmacy2\\1newcp.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 460, 300));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 10, 600));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\OneDrive\\Desktop\\Pharmacy2\\login back.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 420, 600));

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

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        new Forgot().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        new AgentProfile(agentusername).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked
//String name;
    private void SignBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignBtnMouseClicked

        if(Oldtxt.getText().isEmpty() || Newtxt.getText().isEmpty() || Rtxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Fill All The Fields");
            Oldtxt.setText("");
            Newtxt.setText("");
            Rtxt.setText("");
        }else{
        
        
        try{
            String Query = "select * from mysql.ADMTBL where  ADMINPASS = '"+Oldtxt.getText()+"'";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","kawshik244");
            St = Con.createStatement();
            Rs = St.executeQuery(Query);
           //name = Oldtxt.getText();
            //agentusername = name;
            if(Rs.next()){
                if( Newtxt.getText().equals(Rtxt.getText())){
                    String UpdateQuery = "Update mysql.AGENTTBL set APASS = '"+Newtxt.getText()+"' where AID = "+String.valueOf(id);
               Statement Add = Con.createStatement();
               Add.executeUpdate(UpdateQuery);
               JOptionPane.showMessageDialog(this, "Password Changed Successfully");
               new AgentProfile(agentusername).setVisible(true);
               this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(this, "Set New Password Carefully");
                    Oldtxt.setText("");
                    Newtxt.setText("");
                    Rtxt.setText("");
                }

            }
            else{
                JOptionPane.showMessageDialog(this, "Wrong Password");
                Oldtxt.setText("");
                Newtxt.setText("");
            Rtxt.setText("");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_SignBtnMouseClicked

    private void SignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignBtnActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        new AgentProfile(agentusername).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Newtxt;
    private javax.swing.JPasswordField Oldtxt;
    private javax.swing.JPasswordField Rtxt;
    private javax.swing.JButton SignBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
