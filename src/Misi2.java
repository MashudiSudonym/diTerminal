
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * Copyright (C) 2015 diTerminal Team
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

/**
 *
 * @author diTerminal Team
 */
public class Misi2 extends javax.swing.JFrame {

    /**
     * Creates new form Misi2
     */
    public Misi2() {
        initComponents();
        
        // Center Window
        setLocationRelativeTo(null);
        
        // Image Icon
        setIconImage(new ImageIcon(getClass().getResource("/img/PremanTerminalLogo.png")).getImage());
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
        btBack = new javax.swing.JButton();
        btHome = new javax.swing.JButton();
        btPraktikum5 = new javax.swing.JButton();
        btPraktikum6 = new javax.swing.JButton();
        btPraktikum7 = new javax.swing.JButton();
        btPraktikum8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("diTerminal - Misi 2");
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(50, 113, 224));

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MISI diTerminal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(41, 41, 41))
        );

        btBack.setBackground(new java.awt.Color(51, 51, 51));
        btBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        btBack.setToolTipText("Rumah");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        btHome.setBackground(new java.awt.Color(51, 51, 51));
        btHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        btHome.setToolTipText("Rumah");
        btHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHomeActionPerformed(evt);
            }
        });

        btPraktikum5.setBackground(new java.awt.Color(50, 113, 224));
        btPraktikum5.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        btPraktikum5.setForeground(new java.awt.Color(255, 255, 255));
        btPraktikum5.setText("MISI PRAKTIKUM 5");
        btPraktikum5.setToolTipText("Misi Praktikum 5");
        btPraktikum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPraktikum5ActionPerformed(evt);
            }
        });

        btPraktikum6.setBackground(new java.awt.Color(50, 113, 224));
        btPraktikum6.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        btPraktikum6.setForeground(new java.awt.Color(255, 255, 255));
        btPraktikum6.setText("MISI PRAKTIKUM 6");
        btPraktikum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPraktikum6ActionPerformed(evt);
            }
        });

        btPraktikum7.setBackground(new java.awt.Color(50, 113, 224));
        btPraktikum7.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        btPraktikum7.setForeground(new java.awt.Color(255, 255, 255));
        btPraktikum7.setText("MISI PRAKTIKUM 7");
        btPraktikum7.setToolTipText("Misi Praktikum 7");
        btPraktikum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPraktikum7ActionPerformed(evt);
            }
        });

        btPraktikum8.setBackground(new java.awt.Color(50, 113, 224));
        btPraktikum8.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        btPraktikum8.setForeground(new java.awt.Color(255, 255, 255));
        btPraktikum8.setText("MISI PRAKTIKUM 8");
        btPraktikum8.setToolTipText("Misi Praktikum 8");
        btPraktikum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPraktikum8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btPraktikum7, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                        .addComponent(btPraktikum8, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btPraktikum5, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btPraktikum6, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btHome)))
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPraktikum5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPraktikum6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPraktikum7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPraktikum8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPraktikum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPraktikum6ActionPerformed
        // TODO add your handling code here:
        // Informasi fitur
        JOptionPane.showMessageDialog(
                rootPane,
                "MISI PRAKTIKUM 6 akan tersedia di versi alpha 0.2",
                "MISI PRAKTIKUM 6",
                JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_btPraktikum6ActionPerformed

    private void btPraktikum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPraktikum7ActionPerformed
        // TODO add your handling code here:
        // Informasi fitur
        JOptionPane.showMessageDialog(
                rootPane,
                "MISI PRAKTIKUM 7 akan tersedia di versi alpha 0.2",
                "MISI PRAKTIKUM 7",
                JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_btPraktikum7ActionPerformed

    private void btPraktikum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPraktikum8ActionPerformed
        // TODO add your handling code here:
        // Informasi fitur
        JOptionPane.showMessageDialog(
                rootPane,
                "MISI PRAKTIKUM 8 akan tersedia di versi alpha 0.2",
                "MISI PRAKTIKUM 8",
                JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_btPraktikum8ActionPerformed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        // TODO add your handling code here:
        // kembali ke MainMenu
        this.dispose();
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_btBackActionPerformed

    private void btHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHomeActionPerformed
        // TODO add your handling code here:
        // kembali ke Main Frame
        this.dispose();
        new Main().setVisible(true);
    }//GEN-LAST:event_btHomeActionPerformed

    private void btPraktikum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPraktikum5ActionPerformed
        // TODO add your handling code here:
        // Informasi fitur
        JOptionPane.showMessageDialog(
                rootPane,
                "MISI PRAKTIKUM 5 akan tersedia di versi alpha 0.2",
                "MISI PRAKTIKUM 5",
                JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_btPraktikum5ActionPerformed

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
            java.util.logging.Logger.getLogger(Misi2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Misi2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Misi2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Misi2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Misi2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btHome;
    private javax.swing.JButton btPraktikum5;
    private javax.swing.JButton btPraktikum6;
    private javax.swing.JButton btPraktikum7;
    private javax.swing.JButton btPraktikum8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
