
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
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
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
        lbJudulMainMenu = new javax.swing.JLabel();
        btMisi1 = new javax.swing.JButton();
        btBack = new javax.swing.JButton();
        btMisi3 = new javax.swing.JButton();
        btMisi2 = new javax.swing.JButton();
        btMisiEkstra = new javax.swing.JButton();
        btAturanMisi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("diTerminal - Aplikasi Belajar Command Line Sistem Operasi Berbasis Linux");
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(204, 6, 16));

        lbJudulMainMenu.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        lbJudulMainMenu.setForeground(new java.awt.Color(255, 255, 255));
        lbJudulMainMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJudulMainMenu.setText("diTerminal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(lbJudulMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(346, 346, 346))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lbJudulMainMenu)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        btMisi1.setBackground(new java.awt.Color(204, 6, 16));
        btMisi1.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        btMisi1.setForeground(new java.awt.Color(255, 255, 255));
        btMisi1.setText("MISI 1");
        btMisi1.setToolTipText("Misi Pertama");
        btMisi1.setBorder(null);
        btMisi1.setBorderPainted(false);
        btMisi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMisi1ActionPerformed(evt);
            }
        });

        btBack.setBackground(new java.awt.Color(51, 51, 51));
        btBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        btBack.setToolTipText("Kembali");
        btBack.setBorder(null);
        btBack.setBorderPainted(false);
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        btMisi3.setBackground(new java.awt.Color(204, 6, 16));
        btMisi3.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        btMisi3.setForeground(new java.awt.Color(255, 255, 255));
        btMisi3.setText("MISI 3");
        btMisi3.setToolTipText("Misi Ke tiga");
        btMisi3.setBorder(null);
        btMisi3.setBorderPainted(false);
        btMisi3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMisi3ActionPerformed(evt);
            }
        });

        btMisi2.setBackground(new java.awt.Color(204, 6, 16));
        btMisi2.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        btMisi2.setForeground(new java.awt.Color(255, 255, 255));
        btMisi2.setText("MISI 2");
        btMisi2.setToolTipText("Misi Ke dua");
        btMisi2.setBorder(null);
        btMisi2.setBorderPainted(false);
        btMisi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMisi2ActionPerformed(evt);
            }
        });

        btMisiEkstra.setBackground(new java.awt.Color(204, 6, 16));
        btMisiEkstra.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        btMisiEkstra.setForeground(new java.awt.Color(255, 255, 255));
        btMisiEkstra.setText("MISI EKSTRA");
        btMisiEkstra.setToolTipText("Misi Ekstra");
        btMisiEkstra.setBorder(null);
        btMisiEkstra.setBorderPainted(false);
        btMisiEkstra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMisiEkstraActionPerformed(evt);
            }
        });

        btAturanMisi.setBackground(new java.awt.Color(51, 51, 51));
        btAturanMisi.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        btAturanMisi.setForeground(new java.awt.Color(255, 255, 255));
        btAturanMisi.setText("ATURAN MISI");
        btAturanMisi.setToolTipText("Aturan");
        btAturanMisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAturanMisiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btMisi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btMisi2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btMisiEkstra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAturanMisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(73, 73, 73)
                .addComponent(btMisi3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMisi1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMisi3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMisi2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btMisiEkstra, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btBack, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(btAturanMisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );

        setSize(new java.awt.Dimension(810, 534));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btMisi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMisi1ActionPerformed
        // TODO add your handling code here:
        // Misi pertama
        this.dispose();
        new Misi1().setVisible(true);
    }//GEN-LAST:event_btMisi1ActionPerformed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        // TODO add your handling code here:
        // kembali ke halaman utama
        this.dispose();
        new Main().setVisible(true);
    }//GEN-LAST:event_btBackActionPerformed

    private void btMisi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMisi2ActionPerformed
        // TODO add your handling code here:
        // Misi ke dua
        this.dispose();
        new Misi2().setVisible(true);
    }//GEN-LAST:event_btMisi2ActionPerformed

    private void btMisi3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMisi3ActionPerformed
        // TODO add your handling code here:
        // Misi ke tiga
        this.dispose();
        new Misi3().setVisible(true);
    }//GEN-LAST:event_btMisi3ActionPerformed

    private void btMisiEkstraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMisiEkstraActionPerformed
        // TODO add your handling code here:
        // panggil jendela Misi Ekstra
        this.dispose();
        new MisiEkstra().setVisible(true);
    }//GEN-LAST:event_btMisiEkstraActionPerformed

    private void btAturanMisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAturanMisiActionPerformed
        // TODO add your handling code here:
        // panggil jendela AturanMisi
        this.dispose();
        new AturanMisi().setVisible(true);
    }//GEN-LAST:event_btAturanMisiActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAturanMisi;
    private javax.swing.JButton btBack;
    private javax.swing.JButton btMisi1;
    private javax.swing.JButton btMisi2;
    private javax.swing.JButton btMisi3;
    private javax.swing.JButton btMisiEkstra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbJudulMainMenu;
    // End of variables declaration//GEN-END:variables
}
