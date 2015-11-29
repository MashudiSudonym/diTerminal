
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
public class HubungiDeveloper extends javax.swing.JFrame {

    /**
     * Creates new form HubungiDeveloper
     */
    public HubungiDeveloper() {
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

        lbJudulDeveloper = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbTahun = new javax.swing.JLabel();
        lbNamaEmail1 = new javax.swing.JLabel();
        btDonasi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Developer");
        setResizable(false);

        lbJudulDeveloper.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        lbJudulDeveloper.setText("diTerminal Team"); // NOI18N

        lbTahun.setText("2015");

        lbNamaEmail1.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        lbNamaEmail1.setText("<html>  <p>Muhamad Mashudi Ardi Winata</p> <p><b>E-mail :</b> muhamadmashudiardiwinata@gmail.com</p><p></p> <p>Adam Maulana</p> <p><b>E-mail :</b> </p><p></p> <p>Faidl Fahrudin Nawa</p> <p><b>E-mail : </b></p> </html>"); // NOI18N

        btDonasi.setBackground(new java.awt.Color(0, 0, 204));
        btDonasi.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        btDonasi.setForeground(new java.awt.Color(255, 255, 255));
        btDonasi.setText("DONASI"); // NOI18N
        btDonasi.setToolTipText("donasi");
        btDonasi.setBorder(null);
        btDonasi.setBorderPainted(false);
        btDonasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDonasiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btDonasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbTahun))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbJudulDeveloper)
                            .addComponent(lbNamaEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbJudulDeveloper)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNamaEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                .addComponent(btDonasi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lbTahun)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btDonasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDonasiActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(
                rootPane,
                "Aplikasi ini sepenuhnya GRATIS, dan BEBAS. Namun, kami menerima Donasi dalam nominal berapapun.\n"
                        + "\nDonasi kami gunakan untuk proses pengembangan lebih lanjut dari aplikasi diTerminal ini.\n"
                        + "\nUntuk informasi lebih detail. Kontak kami di :\n \nmuhamadmashudiardiwinata@gmail.com \n",
                "Donasi",
                JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btDonasiActionPerformed

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
            java.util.logging.Logger.getLogger(HubungiDeveloper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HubungiDeveloper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HubungiDeveloper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HubungiDeveloper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HubungiDeveloper().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDonasi;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbJudulDeveloper;
    private javax.swing.JLabel lbNamaEmail1;
    private javax.swing.JLabel lbTahun;
    // End of variables declaration//GEN-END:variables
}
