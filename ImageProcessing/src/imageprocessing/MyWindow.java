/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageprocessing;

/**
 *
 * @author Tinh Pham
 */
import javax.imageio.*;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class MyWindow extends javax.swing.JFrame {

    /**
     * Creates new form MyWindow
     */
    BufferedImage img,ori;
    
    public MyWindow() {
        initComponents();
    }
    public BufferedImage zoomImage(BufferedImage mImg)
    {
            int w=mImg.getWidth(),h=mImg.getHeight();
            int i,j,k,l,p,pA,a,r,g,b;
            BufferedImage tmp=new BufferedImage(w/2,h/2,BufferedImage.TYPE_INT_ARGB);
            for(i=0,k=0;i<w-1;i+=2,k++)
                for(j=0,l=0;j<h-1;j+=2,l++)
                {
                    p=mImg.getRGB(i, j);
                    a=(p >> 24) & 0xff;
                    r=(p >> 16) & 0xff;
                    g=(p >> 8) & 0xff;
                    b=p & 0xff;
                    p=mImg.getRGB(i, j+1);
                    a+=(p >> 24) & 0xff;
                    r+=(p >> 16) & 0xff;
                    g+=(p >> 8) & 0xff;
                    b+=p & 0xff;
                    p=mImg.getRGB(i+1, j);
                    a+=(p >> 24) & 0xff;
                    r+=(p >> 16) & 0xff;
                    g+=(p >> 8) & 0xff;
                    b+=p & 0xff;
                    p=mImg.getRGB(i+1, j+1);
                    a+=(p >> 24) & 0xff;
                    r+=(p >> 16) & 0xff;
                    g+=(p >> 8) & 0xff;
                    b+=p & 0xff;
                    a=a/4;r=r/4;g=g/4;b=b/4;
                    p=(a<<24)+(r<<16)+(g<<8)+b;
                    tmp.setRGB(k,l , p);
                }
            return tmp;
    }
    public BufferedImage adjustImage(BufferedImage mImg,int ma,int mr,int mg,int mb)
    {
            int w=mImg.getWidth(),h=mImg.getHeight();
            int i,j,p,a,r,g,b;
            BufferedImage tmp=new BufferedImage(w,h,BufferedImage.TYPE_INT_ARGB);
            for(i=0;i<w;i++)
                for(j=0;j<h;j++)
                {
                    p=mImg.getRGB(i, j);
                    a=(p >> 24) & 0xff;
                    if(a+ma>255) a=255;
                    else a+=ma;
                    r=(p >> 16) & 0xff;
                    if(r+mr>255) r=255;
                    else r+=mr;
                    g=(p >> 8) & 0xff;
                    if(g+mg>255) g=255;
                    else g+=mg;
                    b=p & 0xff;
                    if(b+mb>255) b=255;
                    else b+=mb;
                    p=(a<<24)+(r<<16)+(g<<8)+b;
                    tmp.setRGB(i,j, p);
                }
            return tmp;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem8 = new javax.swing.JMenuItem();
        pImage = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();

        jMenuItem8.setText("jMenuItem8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        pImage.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pImageLayout = new javax.swing.GroupLayout(pImage);
        pImage.setLayout(pImageLayout);
        pImageLayout.setHorizontalGroup(
            pImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );
        pImageLayout.setVerticalGroup(
            pImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Open");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem12.setText("Save");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem12);

        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem3.setText("Gray Scale");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Rotate");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Zoom");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Red++");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Blue++");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem9.setText("Green++");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem10.setText("Alpha++");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuItem11.setText("Alpha--");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JFileChooser fc=new JFileChooser();
        fc.showOpenDialog(this);
        try
        {
            ori=img=ImageIO.read(fc.getSelectedFile());
            pImage.getGraphics().drawImage(img, 0, 0, this);
        } catch (Exception ex){}
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        if(img ==null)
            return;
        int w=img.getWidth(),h=img.getHeight();
        int i,j;
        int p,r,g,b,a;
        for(i=0;i<w;i++)
            for(j=0;j<h;j++)
            {
                p=img.getRGB(i, j);
                a=(p>>24) & 0xFF;
                r=(p>>16) & 0xFF;
                g=(p>>8) & 0xFF;
                b= p& 0xFF;
                r=(r+g+b)/3;
                p=(a<< 24) + (r << 16) + (r <<8) +r;
                img.setRGB(i, j, p);
            }
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
        if(img !=null)
        {
            pImage.getGraphics().clearRect(0, 0, pImage.getWidth(), pImage.getHeight());
            pImage.getGraphics().drawImage(img, 0, 0, this);
        }
    }//GEN-LAST:event_formFocusGained

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        int w=img.getWidth(),h=img.getHeight();
        int i,j;
        int p,r,g,b,a;
        BufferedImage tmp=new BufferedImage(h,w,BufferedImage.TYPE_INT_ARGB);
        for(j=0;j<h;j++) 
        for(i=0;i<w;i++)
            {
                p=img.getRGB(i, j);
                tmp.setRGB(h-j-1, i, p);
            }
         img=tmp;
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        img=zoomImage(img);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        img=adjustImage(img,0,20,0,0);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        img=adjustImage(img,0,0,0,20);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        img=adjustImage(img,0,0,20,0);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        img=adjustImage(img,20,0,0,0);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        img=adjustImage(img,-20,0,0,0);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        JFileChooser fc=new JFileChooser();
        fc.showSaveDialog(this);
        try
        {
            ImageIO.write(img,"png",fc.getSelectedFile());
        } catch (Exception ex){}
    }//GEN-LAST:event_jMenuItem12ActionPerformed

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
            java.util.logging.Logger.getLogger(MyWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel pImage;
    // End of variables declaration//GEN-END:variables
}
