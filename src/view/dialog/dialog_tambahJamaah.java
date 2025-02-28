/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.dialog;

import entity.Jamaah;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import repository.JamaahRepository;
import view.main.maindasboard;

import java.awt.Color;
/**
 *
 * @author adzaz
 */
public class dialog_tambahJamaah extends Dialog {

    /**
     * Creates new form dialog_tambahJamaah
     */
    public dialog_tambahJamaah(JFrame fram) {
        super(fram);
        initComponents();
        jPanel1.setVisible(false);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnTambah = new javax.swing.JLabel();
        btnBatal1 = new javax.swing.JLabel();
        txtNotelp = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        cmbJenisKelamin = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new Color(0,0,0,90));
        jPanel1.setLayout(null);

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(330, 360, 120, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imageValidasi/validasi editgagal login_1.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(101, 119, 568, 285);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 820, 550));

        btnTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTambahMouseClicked(evt);
            }
        });
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 160, 30));

        btnBatal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBatal1MouseClicked(evt);
            }
        });
        getContentPane().add(btnBatal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 170, 30));

        txtNotelp.setBorder(null);
        getContentPane().add(txtNotelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 300, 40));

        txtAlamat.setBorder(null);
        getContentPane().add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 300, 40));

        txtNama.setBorder(null);
        getContentPane().add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 300, 40));

        cmbJenisKelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "laki-laki", "perempuan" }));
        cmbJenisKelamin.setBorder(null);
        getContentPane().add(cmbJenisKelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 290, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/tambah jamaah.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 820, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBatal1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatal1MouseClicked
        closeMessage();
    }//GEN-LAST:event_btnBatal1MouseClicked

    private void btnTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseClicked
        String nama = txtNama.getText();
        String jenisKelamin = String.valueOf(cmbJenisKelamin.getSelectedItem());
        String alamat = txtAlamat.getText();
        String noTelp = txtNotelp.getText();
        Jamaah jamaah = new Jamaah(nama,jenisKelamin,alamat,noTelp);
        JamaahRepository jamaahRepo = new JamaahRepository();
        
        if(jamaahRepo.add(jamaah)){
           jPanel1.setVisible(true);
        }else{
            System.out.println("gagal");
        }
    }//GEN-LAST:event_btnTambahMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        closeMessage();
    }//GEN-LAST:event_jLabel3MouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBatal1;
    private javax.swing.JLabel btnTambah;
    private javax.swing.JComboBox<String> cmbJenisKelamin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNotelp;
    // End of variables declaration//GEN-END:variables
}
