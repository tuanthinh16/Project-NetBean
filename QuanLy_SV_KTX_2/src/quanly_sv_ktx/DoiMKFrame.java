/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanly_sv_ktx;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author AnhTu
 */
public class DoiMKFrame extends javax.swing.JFrame {

    private Connection conn;
    private MyConnect myConnect = new MyConnect();
    private PreparedStatement pst;
    private ResultSet rs;
    
    /**
     * Creates new form DoiMKFrame
     */
    public DoiMKFrame() {
        initComponents();
    }

    private boolean isTfNull() {
        boolean checkTf = false;
        if((tfTen.getText().equals(""))||(tfMKCu.getText().equals(""))||(tfMKMoi.getText().equals(""))||(tfNhapLaiMK.getText().equals(""))) checkTf = true;
        //chú ý, nếu dùng tfTen.getText() == null là sai
        System.out.println("Are textfields null? : " + checkTf);
        return checkTf;
    }
    
    private void doiMK(String username, String mkMoi) {
        conn = myConnect.connect();
        try {
            pst = conn.prepareStatement("UPDATE admin set password = ? WHERE username = ?");
            pst.setString(1, mkMoi);
            pst.setString(2, username);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DoiMKFrame.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        lbTen = new javax.swing.JLabel();
        lbMKCu = new javax.swing.JLabel();
        lbMKMoi = new javax.swing.JLabel();
        lbNhapLaiMK = new javax.swing.JLabel();
        tfMKCu = new javax.swing.JPasswordField();
        tfMKMoi = new javax.swing.JPasswordField();
        tfNhapLaiMK = new javax.swing.JPasswordField();
        btOK = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        tfTen = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ĐỔI MẬT KHẨU");

        lbTen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbTen.setText("Username");

        lbMKCu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbMKCu.setText("Mật khẩu cũ");

        lbMKMoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbMKMoi.setText("Mật khẩu mới");

        lbNhapLaiMK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbNhapLaiMK.setText("Nhập lại mật khẩu");

        tfNhapLaiMK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNhapLaiMKKeyPressed(evt);
            }
        });

        btOK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btOK.setText("OK");
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKActionPerformed(evt);
            }
        });

        btCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btCancel.setText("Cancel");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbMKMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbMKCu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbTen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbNhapLaiMK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfNhapLaiMK, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                .addComponent(tfMKMoi, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                .addComponent(tfMKCu, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                .addComponent(tfTen)))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTen, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTen, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMKCu, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMKCu, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMKMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMKMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNhapLaiMK, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNhapLaiMK, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed
        boolean check = isTfNull();
        if(check==true) {
            JOptionPane.showMessageDialog(null, "Bạn chưa điền đủ thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        else {
            conn = myConnect.connect();
            try {
                pst = conn.prepareStatement("SELECT * FROM admin WHERE username = '" + tfTen.getText() + "' AND password = '" + tfMKCu.getText() + "'");
                rs = pst.executeQuery();
                if (rs.first() != true) {
                    JOptionPane.showMessageDialog(null, "username hoặc password ko đúng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                } else if (tfMKMoi.getText().equals(tfNhapLaiMK.getText())) {
                    doiMK(tfTen.getText(), tfMKMoi.getText());
                    JOptionPane.showMessageDialog(null, "Đã thay đổi thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    setVisible(false); //hiện cái frame này đi khi đã đổi đc mk
                } else {
                    JOptionPane.showMessageDialog(null, "Nhập lại mật khẩu ko đúng! Ko thể thay đổi!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DoiMKFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btOKActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btCancelActionPerformed

    private void tfNhapLaiMKKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNhapLaiMKKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ////làm giống với btOK:
            
            boolean check = isTfNull();
            if (check == true) {
                JOptionPane.showMessageDialog(null, "Bạn chưa điền đủ thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
            } else {
                conn = myConnect.connect();
                try {
                    pst = conn.prepareStatement("SELECT * FROM admin WHERE username = '" + tfTen.getText() + "' AND password = '" + tfMKCu.getText() + "'");
                    rs = pst.executeQuery();
                    if (rs.first() != true) {
                        JOptionPane.showMessageDialog(null, "username hoặc password ko đúng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    } else if (tfMKMoi.getText().equals(tfNhapLaiMK.getText())) {
                        doiMK(tfTen.getText(), tfMKMoi.getText());
                        JOptionPane.showMessageDialog(null, "Đã thay đổi thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                        setVisible(false); //hiện cái frame này đi khi đã đổi đc mk
                    } else {
                        JOptionPane.showMessageDialog(null, "Nhập lại mật khẩu ko đúng! Ko thể thay đổi!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(DoiMKFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }//GEN-LAST:event_tfNhapLaiMKKeyPressed

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
            java.util.logging.Logger.getLogger(DoiMKFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoiMKFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoiMKFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoiMKFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoiMKFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbMKCu;
    private javax.swing.JLabel lbMKMoi;
    private javax.swing.JLabel lbNhapLaiMK;
    private javax.swing.JLabel lbTen;
    private javax.swing.JPasswordField tfMKCu;
    private javax.swing.JPasswordField tfMKMoi;
    private javax.swing.JPasswordField tfNhapLaiMK;
    private javax.swing.JTextField tfTen;
    // End of variables declaration//GEN-END:variables
}
