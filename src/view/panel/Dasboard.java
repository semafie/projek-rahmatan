/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.panel;

import entity.Keberangkatan;
import entity.Pemesanan;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.NumberFormat;
import java.util.Locale;
import repository.DashboardRepository;
import repository.KeberangkatanRepository;
import repository.PemesananRepository;

public class Dasboard extends javax.swing.JPanel {
    DashboardRepository dashboardRepo = new DashboardRepository();
    KeberangkatanRepository keberangkatanRepo = new KeberangkatanRepository();
    PemesananRepository pemesananRepo = new PemesananRepository();
    NumberFormat nf = NumberFormat.getNumberInstance(new Locale("in", "ID"));
    panel_menupojok apa = new panel_menupojok();
    /**
     * Creates new form Dasboard1
     */
    public Dasboard() {
        initComponents();
        apa.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseEntered(MouseEvent e) {
        int mouseX = e.getX();
        int mouseY = e.getY();
        if (mouseX >= 0 && mouseX <= apa.getWidth() && mouseY >= 0 && mouseY <= apa.getHeight()) {
            // Mouse masih berada di dalam panel, tidak perlu menghapus
            return;
        }
        hilangtampilan();
    }
});
        Font font = new Font("Quicksand", Font.BOLD, 35);
        lblPemasukan.setFont(font);
        setValue();
    }
    
    public void setValue(){
        lblPemasukan.setText(String.valueOf(nf.format(dashboardRepo.getIncome())));
        lblPengeluaran.setText(String.valueOf(nf.format(dashboardRepo.getExpenditure())));
        lblToday.setText(String.valueOf(dashboardRepo.getIncomePerDay()));
        
        for(Keberangkatan k:keberangkatanRepo.getOrderByDesc()){
            lblTanggal.setText(k.getTanggal().toString());
            lblNama.setText(k.getPaket().getNama());
            lblHarga.setText(String.valueOf(nf.format(k.getPaket().getHarga())));
            int orang = 0;
            for(Pemesanan p:pemesananRepo.get()){
                orang += 1;
            }
            lblBerapaOrang.setText(String.valueOf(orang));
            
        }
        
    }
    
    public void tampilpojokk(){
        
        apa.setSize(214,217);
    this.add(apa);
    
    this.setComponentZOrder(apa, 0);
//    apa.setRequestFocusEnabled(false);
    apa.setLocation(1052, 11);
    this.revalidate();
    this.repaint();
    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/pojokk2.png")));
    }
    public void hilangtampilan(){
        this.remove(apa);
    this.revalidate();
    this.repaint();
    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/pojokk1.png")));
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
        lblNama = new javax.swing.JLabel();
        lblBerapaOrang = new javax.swing.JLabel();
        lblHarga = new javax.swing.JLabel();
        lblTanggal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tampilPaketUmrohDasboard1 = new view.swing.tampilPaketUmrohDasboard();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblPengeluaran = new javax.swing.JLabel();
        lblPemasukan = new javax.swing.JLabel();
        lblToday = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 249, 243));

        jPanel1.setBackground(new Color(0,0,0,0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNama.setFont(new java.awt.Font("Quicksand Bold", 0, 24)); // NOI18N
        jPanel1.add(lblNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 200, 50));

        lblBerapaOrang.setFont(new java.awt.Font("Quicksand Bold", 0, 18)); // NOI18N
        jPanel1.add(lblBerapaOrang, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 386, 170, 40));

        lblHarga.setFont(new java.awt.Font("Quicksand Bold", 0, 18)); // NOI18N
        jPanel1.add(lblHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 315, 170, 40));

        lblTanggal.setFont(new java.awt.Font("Quicksand Bold", 0, 18)); // NOI18N
        jPanel1.add(lblTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 170, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/bg berangkat das.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 320, -1));

        jPanel2.setBackground(new Color(0,0,0,0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(tampilPaketUmrohDasboard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 400));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/bg paket das.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 344, -1));

        jPanel3.setBackground(new Color(0,0,0,0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPengeluaran.setFont(new java.awt.Font("Quicksand Bold", 0, 33)); // NOI18N
        jPanel3.add(lblPengeluaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 250, 60));

        lblPemasukan.setFont(new java.awt.Font("Quicksand Bold", 0, 33)); // NOI18N
        jPanel3.add(lblPemasukan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 250, 60));

        lblToday.setFont(new java.awt.Font("Quicksand Bold", 0, 15)); // NOI18N
        jPanel3.add(lblToday, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 70, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/bg pemasukandas.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 430, 550));

        jPanel4.setBackground(new Color(0,0,0,0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/title dashboard11.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setLayout(null);

        jLabel6.setText("jLabel6");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/pojokk1.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
    
    
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
    tampilpojokk();
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
//    hilangtampilan();
    }//GEN-LAST:event_jLabel2MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblBerapaOrang;
    private javax.swing.JLabel lblHarga;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblPemasukan;
    private javax.swing.JLabel lblPengeluaran;
    private javax.swing.JLabel lblTanggal;
    private javax.swing.JLabel lblToday;
    private view.swing.tampilPaketUmrohDasboard tampilPaketUmrohDasboard1;
    // End of variables declaration//GEN-END:variables
}
