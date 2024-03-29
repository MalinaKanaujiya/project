/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hostelmanagement;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class Login extends javax.swing.JFrame {

   
    public Login() {
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

        Heading = new javax.swing.JPanel();
        head = new javax.swing.JLabel();
        FrameL = new javax.swing.JPanel();
        Image = new javax.swing.JLabel();
        User = new javax.swing.JLabel();
        UsernameT = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        PasswordF = new javax.swing.JPasswordField();
        SPassword = new javax.swing.JCheckBox();
        Login = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Heading.setBackground(new java.awt.Color(204, 204, 255));
        Heading.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        head.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        head.setText("Hostel Management System");

        javax.swing.GroupLayout HeadingLayout = new javax.swing.GroupLayout(Heading);
        Heading.setLayout(HeadingLayout);
        HeadingLayout.setHorizontalGroup(
            HeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadingLayout.createSequentialGroup()
                .addGap(547, 547, 547)
                .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(728, Short.MAX_VALUE))
        );
        HeadingLayout.setVerticalGroup(
            HeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadingLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(head)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(Heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1610, -1));

        FrameL.setBackground(new java.awt.Color(204, 204, 255));

        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hostelmanagement/hostel img.png"))); // NOI18N

        User.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        User.setText("Username");

        UsernameT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        Password.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Password.setText("Password");

        PasswordF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        SPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SPassword.setText("Show Password");
        SPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPasswordActionPerformed(evt);
            }
        });

        Login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hostelmanagement/login.png"))); // NOI18N
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        Close.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hostelmanagement/close.png"))); // NOI18N
        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FrameLLayout = new javax.swing.GroupLayout(FrameL);
        FrameL.setLayout(FrameLLayout);
        FrameLLayout.setHorizontalGroup(
            FrameLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(FrameLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameLLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(FrameLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FrameLLayout.createSequentialGroup()
                                .addGroup(FrameLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Password)
                                    .addComponent(User))
                                .addGap(38, 38, 38)
                                .addGroup(FrameLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PasswordF, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UsernameT, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(FrameLLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(Login)
                                .addGap(32, 32, 32)
                                .addComponent(Close))))
                    .addGroup(FrameLLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(SPassword)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FrameLLayout.setVerticalGroup(
            FrameLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameLLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(FrameLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FrameLLayout.createSequentialGroup()
                        .addGroup(FrameLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FrameLLayout.createSequentialGroup()
                                .addGroup(FrameLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(User)
                                    .addComponent(UsernameT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addComponent(PasswordF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Password))
                        .addGap(48, 48, 48)
                        .addComponent(SPassword)
                        .addGap(38, 38, 38)
                        .addGroup(FrameLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Login)
                            .addComponent(Close)))
                    .addComponent(Image))
                .addContainerGap(248, Short.MAX_VALUE))
        );

        getContentPane().add(FrameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 710, 650));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hostelmanagement/backg.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPasswordActionPerformed
        // TODO add your handling code here:
        if(SPassword.isSelected())
        {
            PasswordF.setEchoChar((char)0);
 
        }
        else
            PasswordF.setEchoChar('*');
    }//GEN-LAST:event_SPasswordActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
        if(UsernameT.getText().equals("hostel")&& PasswordF.getText().equals("admin"))
        {
            setVisible(false);
            new Home().setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
    }//GEN-LAST:event_LoginActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to Exit Application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_CloseActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Close;
    private javax.swing.JPanel FrameL;
    private javax.swing.JPanel Heading;
    private javax.swing.JLabel Image;
    private javax.swing.JButton Login;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField PasswordF;
    private javax.swing.JCheckBox SPassword;
    private javax.swing.JLabel User;
    private javax.swing.JTextField UsernameT;
    private javax.swing.JLabel head;
    // End of variables declaration//GEN-END:variables
}
