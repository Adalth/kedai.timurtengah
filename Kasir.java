
package com.mycompany.kasir_maven;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Kasir extends javax.swing.JFrame {

    public ArrayList menu = new ArrayList();
    public ArrayList harga = new ArrayList();
    public ArrayList jumlah = new ArrayList();
    public ArrayList subtotal = new ArrayList();
    
    public Kasir() {
        initComponents();
    }

    private void setHargaMakanan(){
        int harga=0;
        int pilihan = cbMakanan.getSelectedIndex();
        switch(pilihan){
            case 1:
                harga = 36000;
                break;
            case 2:
                harga = 25000;
                break;
            case 3:
                harga = 24000;
                break;
            case 4:
                harga = 28000;
                break;
            case 5:
                harga = 66000;
                break;
        }
        txtHargaMakanan.setText("" + harga);
    }
    
    private void setHargaMinuman(){
        int harga=0;
        int pilihan = cbMinuman.getSelectedIndex();
        switch(pilihan){
            case 1:
                harga = 14000;
                break;
            case 2:
                harga = 16000;
                break;
            case 3:
                harga = 15000;
                break;
            case 4:
                harga = 22000;
                break;
            case 5:
                harga = 45000;
                break;
        }
        txtHargaMinuman.setText("" + harga);
    }
    
    private void setTabel(){
        int total=0;
        double pajak=0;
        int bayar=0;
        
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Menu");
        tbl.addColumn("Harga");
        tbl.addColumn("Jumlah");
        tbl.addColumn("Sub Total");
        
        for(int n=0; n<menu.size(); n++){
            total = total + Integer.parseInt(subtotal.get(n).toString());
            
            tbl.addRow(new Object[]{
                menu.get(n),
                harga.get(n),
                jumlah.get(n),
                subtotal.get(n),
            });
        }
        pajak = total * 0.10;
        bayar = (int) (total + pajak);
        
        dataTabel.setModel(tbl);
        txtTotal.setText("" + total);
        txtPajak.setText("" + pajak);
        txtTotalBayar.setText("" + bayar);
    }
    
    public boolean cekKosong(boolean makanan){
        boolean hasil = true;
        
        if(makanan == true){
            if(txtJumlahMakanan.getText().isEmpty() == true){
                JOptionPane.showMessageDialog(null, "Please input your food!");
                hasil=true;
            }
        }else{
            if(txtJumlahMinuman.getText().isEmpty() == true){
                JOptionPane.showMessageDialog(null, "Please input your drink!");
            }
        }
        return false;
    }
        
    private boolean cekDataTabel(String data){
        boolean hasil = menu.contains(data);
        if(hasil==true) JOptionPane.showMessageDialog(null, "Menu is already add");
        return hasil;
    }    
            
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbMakanan = new javax.swing.JComboBox<>();
        txtHargaMakanan = new javax.swing.JTextField();
        txtSubTotalMakanan = new javax.swing.JTextField();
        txtJumlahMakanan = new javax.swing.JTextField();
        btnMakanan = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbMinuman = new javax.swing.JComboBox<>();
        txtHargaMinuman = new javax.swing.JTextField();
        txtSubTotalMinuman = new javax.swing.JTextField();
        txtJumlahMinuman = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnMinuman = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTabel = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtPajak = new javax.swing.JTextField();
        txtTotalBayar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtJumlahBayar = new javax.swing.JTextField();
        txtKembalian = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnBayar = new javax.swing.JButton();
        btnTambahMakanan = new javax.swing.JButton();
        btnTambahMinuman = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kasir");

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("Kedai Timur-Tengah");

        jLabel2.setText("Menu (Food):");

        jLabel3.setText("Quantity:");

        jLabel4.setText("Price:");

        jLabel5.setText("Sub Total:");

        cbMakanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Choose-", "Nasi Kebuli", "Kebab", "Sambosa", "Roti Maryam", "Manakeesh" }));
        cbMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMakananActionPerformed(evt);
            }
        });

        txtHargaMakanan.setEditable(false);
        txtHargaMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaMakananActionPerformed(evt);
            }
        });

        txtSubTotalMakanan.setEditable(false);

        btnMakanan.setText("*");
        btnMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakananActionPerformed(evt);
            }
        });

        jLabel6.setText("Sub Total:");

        cbMinuman.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Choose-", "Orange Juice", "Mango Juice", "Mint Tea", "Arabian Coffee", "Arak" }));
        cbMinuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMinumanActionPerformed(evt);
            }
        });

        txtHargaMinuman.setEditable(false);

        txtSubTotalMinuman.setEditable(false);

        jLabel7.setText("Menu (Drink):");

        btnMinuman.setText("*");
        btnMinuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinumanActionPerformed(evt);
            }
        });

        jLabel8.setText("Quantity:");

        jLabel9.setText("Price:");

        dataTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Menu", "Harga", "Jumlah", "Sub Total"
            }
        ));
        jScrollPane1.setViewportView(dataTabel);

        jLabel10.setText("Total:");

        jLabel11.setText("Tax (10%):");

        jLabel12.setText("Bill:");

        txtTotal.setEditable(false);

        txtPajak.setEditable(false);

        txtTotalBayar.setEditable(false);

        jLabel13.setText("Change:");

        txtKembalian.setEditable(false);

        jLabel14.setText("Your Payment:");

        btnBayar.setText("Pay");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });

        btnTambahMakanan.setText("Add");
        btnTambahMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahMakananActionPerformed(evt);
            }
        });

        btnTambahMinuman.setText("Add");
        btnTambahMinuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahMinumanActionPerformed(evt);
            }
        });

        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtJumlahBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPajak, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBayar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnClear)
                                .addGap(64, 64, 64)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnTambahMakanan)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtSubTotalMakanan)
                                            .addComponent(cbMakanan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(txtJumlahMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtHargaMakanan))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbMinuman, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtHargaMinuman)
                                            .addComponent(txtSubTotalMinuman)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(txtJumlahMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTambahMinuman)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnClear))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHargaMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJumlahMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMakanan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSubTotalMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHargaMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJumlahMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMinuman))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSubTotalMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTambahMakanan)
                    .addComponent(btnTambahMinuman))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPajak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJumlahBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(btnBayar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMakananActionPerformed
        // TODO add your handling code here:
        setHargaMakanan();
    }//GEN-LAST:event_cbMakananActionPerformed

    private void btnMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakananActionPerformed
        // TODO add your handling code here:
        try{
            int hargaMakanan = Integer.parseInt(txtHargaMakanan.getText());
            int jumlahMakanan = Integer.parseInt(txtJumlahMakanan.getText());
            txtSubTotalMakanan.setText("" + (hargaMakanan*jumlahMakanan));
        }catch(NumberFormatException e){
           txtSubTotalMakanan.setText("0");
        }
    }//GEN-LAST:event_btnMakananActionPerformed

    private void cbMinumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMinumanActionPerformed
        // TODO add your handling code here:
        setHargaMinuman();
    }//GEN-LAST:event_cbMinumanActionPerformed

    private void btnMinumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinumanActionPerformed
        // TODO add your handling code here:
        try{
            int hargaMinuman = Integer.parseInt(txtHargaMinuman.getText());
            int jumlahMinuman = Integer.parseInt(txtJumlahMinuman.getText());
            txtSubTotalMinuman.setText("" + (hargaMinuman*jumlahMinuman));
        }catch(NumberFormatException e){
           txtSubTotalMinuman.setText("0");
        }
    }//GEN-LAST:event_btnMinumanActionPerformed

    private void txtHargaMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaMakananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaMakananActionPerformed

    private void btnTambahMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahMakananActionPerformed
        // TODO add your handling code here:
        if(cekKosong(true) == false){
            String menuItem = cbMakanan.getSelectedItem().toString();
            if(cekDataTabel(menuItem) == false){
                int hrg = Integer.parseInt(txtHargaMakanan.getText());
                int kuantiti = Integer.parseInt(txtJumlahMakanan.getText());
                txtSubTotalMakanan.setText("" + (hrg*kuantiti));
                
                menu.add(menuItem);
                harga.add(txtHargaMakanan.getText());
                jumlah.add(txtJumlahMakanan.getText());
                subtotal.add(txtSubTotalMakanan.getText());
                
                setTabel();
            }
        }
        cbMakanan.setSelectedIndex(0);
        txtHargaMakanan.setText("");
        txtJumlahMakanan.setText("");
        txtSubTotalMakanan.setText("");
    }//GEN-LAST:event_btnTambahMakananActionPerformed

    private void btnTambahMinumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahMinumanActionPerformed
        // TODO add your handling code here:
        if(cekKosong(false) == false){
            String menuItem = cbMinuman.getSelectedItem().toString();
            if(cekDataTabel(menuItem) == false){
                int hrg = Integer.parseInt(txtHargaMinuman.getText());
                int kuantiti = Integer.parseInt(txtJumlahMinuman.getText());
                txtSubTotalMinuman.setText("" + (hrg*kuantiti));
                
                menu.add(menuItem);
                harga.add(txtHargaMinuman.getText());
                jumlah.add(txtJumlahMinuman.getText());
                subtotal.add(txtSubTotalMinuman.getText());
                
                setTabel();
            }
        }
        cbMinuman.setSelectedIndex(0);
        txtHargaMinuman.setText("");
        txtJumlahMinuman.setText("");
        txtSubTotalMinuman.setText("");
    }//GEN-LAST:event_btnTambahMinumanActionPerformed

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        // TODO add your handling code here:
        int totalBayar = Integer.parseInt(txtTotalBayar.getText());
        int jumlahBayar = Integer.parseInt(txtJumlahBayar.getText());
        
        txtKembalian.setText("" + (jumlahBayar-totalBayar));
    }//GEN-LAST:event_btnBayarActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtTotal.setText("");
        txtPajak.setText("");
        txtTotalBayar.setText("");
        txtJumlahBayar.setText("");
        txtKembalian.setText("");
        
        menu.clear();
        harga.clear();
        jumlah.clear();
        subtotal.clear();
        
        setTabel();
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnMakanan;
    private javax.swing.JButton btnMinuman;
    private javax.swing.JButton btnTambahMakanan;
    private javax.swing.JButton btnTambahMinuman;
    private javax.swing.JComboBox<String> cbMakanan;
    private javax.swing.JComboBox<String> cbMinuman;
    private javax.swing.JTable dataTabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtHargaMakanan;
    private javax.swing.JTextField txtHargaMinuman;
    private javax.swing.JTextField txtJumlahBayar;
    private javax.swing.JTextField txtJumlahMakanan;
    private javax.swing.JTextField txtJumlahMinuman;
    private javax.swing.JTextField txtKembalian;
    private javax.swing.JTextField txtPajak;
    private javax.swing.JTextField txtSubTotalMakanan;
    private javax.swing.JTextField txtSubTotalMinuman;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalBayar;
    // End of variables declaration//GEN-END:variables
}
