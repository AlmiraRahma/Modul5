/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SMK TELKOM
 */
public class latihan1 extends javax.swing.JFrame {

    /**
     * Creates new form latihan1
     */
    public latihan1() {
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

        Alamat = new javax.swing.JTextField();
        Nama = new javax.swing.JTextField();
        Kelas = new javax.swing.JTextField();
        Proses = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        hslalamat = new javax.swing.JTextField();
        hslnama = new javax.swing.JTextField();
        hslkelas = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(Alamat);
        Alamat.setBounds(210, 110, 110, 20);
        getContentPane().add(Nama);
        Nama.setBounds(210, 50, 110, 20);
        getContentPane().add(Kelas);
        Kelas.setBounds(210, 80, 110, 20);

        Proses.setText("Proses");
        Proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProsesActionPerformed(evt);
            }
        });
        getContentPane().add(Proses);
        Proses.setBounds(160, 150, 90, 30);

        jLabel8.setText("Formulir");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(180, 4, 60, 30);

        jLabel9.setText("Alamat");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(140, 110, 70, 20);

        jLabel10.setText("Nama");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(140, 50, 70, 20);

        jLabel11.setText("Kelas");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(140, 80, 70, 20);
        getContentPane().add(hslalamat);
        hslalamat.setBounds(210, 250, 110, 20);
        getContentPane().add(hslnama);
        hslnama.setBounds(210, 190, 110, 20);
        getContentPane().add(hslkelas);
        hslkelas.setBounds(210, 220, 110, 20);

        jLabel12.setText("Alamat");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(140, 250, 70, 20);

        jLabel13.setText("Nama");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(140, 190, 70, 20);

        jLabel14.setText("Kelas");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(140, 220, 70, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProsesActionPerformed
        // TODO add your handling code here:
        String nama = Nama.getText();
        hslnama.setText(nama);
        String kelas = Kelas.getText();
        hslkelas.setText(kelas);
        String alamat = Alamat.getText();
        hslalamat.setText(alamat);  
    }//GEN-LAST:event_ProsesActionPerformed

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
            java.util.logging.Logger.getLogger(latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new latihan1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat;
    private javax.swing.JTextField Kelas;
    private javax.swing.JTextField Nama;
    private javax.swing.JButton Proses;
    private javax.swing.JTextField hslalamat;
    private javax.swing.JTextField hslkelas;
    private javax.swing.JTextField hslnama;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
