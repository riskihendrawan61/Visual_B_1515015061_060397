/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttes6;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Asus
 */
public class FormDataBuku extends javax.swing.JFrame {
private DefaultTableModel model;
private final Connection con = koneksi.getConnection();
private Statement stt;
private ResultSet rss;
private PreparedStatement pst;
//koneksi konek;
    /**
     * Creates new form FormDataBuku
     */
    public FormDataBuku() {
        initComponents();
//        setTitle("Data buku");
//        konek = new koneksi();
//        select();
        
    }
    
    private void InitTable(){//inisiasi tabel atau membuat table secara manual
        model = new DefaultTableModel(); //instansi class model dari class defaulttablemodel
        model.addColumn("JUDUL"); //membuat kolom judul di instans class model
        model.addColumn("PENULIS"); //membuat kolom penulis di instans class model
        model.addColumn("HARGA"); // membuat kolom harga di instance class model
        
        table.setModel(model); //mengeset instance of class model ke table
    
    }
    
    public void select(){
//        Object header[]={"judul","penulis","harga"};
//        DefaultTableModel defaultTableModel = new DefaultTableModel(null,header);
//        table.setModel(defaultTableModel);
//        int baris = table.getRowCount();
//        for (int i = 0; i < baris; i++) {
//            defaultTableModel.removeRow(i);
//        }
//        String sql = "select * from buku";
//        try{
//            stt = con.createStatement();
//            rss=stt.executeQuery(sql);
//            while(rss.next()){
//                String kolom1= rss.getString(1);
//                String kolom2= rss.getString(2);
//                String kolom3= rss.getString(3);
//                String kolom[]={kolom1,kolom2,kolom3};
//                defaultTableModel.addRow(kolom);
//            }
//        }catch(Exception e){JOptionPane.showMessageDialog(null, e.getMessage());}
    
    }
    
   private boolean validasi(String judul){ //mthod agar tidk ada data yang sama ketika dibuat
       try{ //untuk membuat eksepsi
           stt = con.createStatement(); //agar konek db
           String sql = "SELECT * FROM buku where judul='"+judul+"'"; //mendeklarasikan variabel sql dengan query untuk menampilkan data sesuai kondisi judul yang ditentukan
           rss = stt.executeQuery(sql); //untuk konek ke db
           if(rss.next())
               return true;
           else
               return false;
       }catch(SQLException e){ //menangkap sebuah error pada SQL
           System.out.println(e.getMessage());
           return false;
       }
   }
   
//   private void search(){
//       
////        String header[] = {"Judul","Penulis","Harga"};
////        DefaultTableModel defaultTableModel = new DefaultTableModel(null,header);
////        table.setModel(defaultTableModel);
////        for (int i = 0; i < table.getRowCount(); i++) {
////            defaultTableModel.removeRow(i);
////        }
////        
////        try{
////            stt = con.createStatement();
////            rss = stt.executeQuery(sql);
////            while(rss.next()){
////                String judul = rss.getString(1);
////                String penulis = rss.getString(2);
////                int harga = rss.getInt(3);
////                Object baris[] = {judul,penulis,harga};
////                defaultTableModel.addRow(baris);
////            }
////        }catch(Exception e){JOptionPane.showMessageDialog(null, e.getMessage());}
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        judul = new javax.swing.JTextField();
        harga = new javax.swing.JTextField();
        penulis = new javax.swing.JComboBox<String>();
        simpan = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        pilihan = new javax.swing.JComboBox<String>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel1.setText("FORM DATA BUKU");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));

        jLabel2.setText("Judul :");

        jLabel3.setText("Penulis :");

        jLabel4.setText("Harga :");

        harga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hargaKeyTyped(evt);
            }
        });

        penulis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tere Liye", "W.S Rendra", "Felix Siauw", "Asma Nadia", "Dewi Lestari" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(penulis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(124, 124, 124))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(penulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        ubah.setText("Ubah");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        jLabel5.setText("Search");

        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchKeyTyped(evt);
            }
        });

        pilihan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "judul", "penulis", "harga" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(simpan))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(ubah)
                                .addGap(50, 50, 50)
                                .addComponent(hapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addComponent(keluar)
                                .addGap(42, 42, 42))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pilihan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan)
                    .addComponent(ubah)
                    .addComponent(hapus)
                    .addComponent(keluar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pilihan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        InitTable();
        TampilData();
    }//GEN-LAST:event_formComponentShown

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        String judull = judul.getText();
        String penuliss = penulis.getSelectedItem().toString();
        String hargaa = harga.getText();
        if(validasi(judull)){
            JOptionPane.showMessageDialog(null, "Judul sudah ada");
        }else{
            TambahData(judull,penuliss,hargaa);
        }
        
    }//GEN-LAST:event_simpanActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        // TODO add your handling code here:
        int baris = table.getSelectedRow();
        table.setValueAt(judul.getText(),baris,0);
        table.setValueAt(penulis.getSelectedItem(),baris,1);
        table.setValueAt(harga.getText(),baris,2);
        
    }//GEN-LAST:event_ubahActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        int pilih = JOptionPane.showConfirmDialog(this, "INGIN HAPUS ?", "Confirm Hapus", JOptionPane.WARNING_MESSAGE);
        if (pilih==JOptionPane.YES_OPTION) {
            int baris = table.getSelectedRow();
            model.removeRow(baris);
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void hargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hargaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaKeyTyped

    private void searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyTyped
        // TODO add your handling code here:
       model.getDataVector().removeAllElements();//mendeklarasikan model yang mmengambil data vector dan meremove semua ellements
       model.fireTableDataChanged();//mendeklarasikan model yang di fireTableDataChanged
       String caridengan = pilihan.getSelectedItem().toString();
       try{
           String sql = "select * from buku where "+caridengan+" like '%"+search.getText()+"%'";
           stt = con.createStatement();//pembuatan statement
           rss = stt.executeQuery(sql);//eksekusi query
           ResultSet rss=stt.executeQuery(sql);
           while(rss.next()){// perulangan result set dari variable rss hingga tidak terpenuhi untuk perulangan
                //menampilkan data sesuai array :
               Object[] o=new Object[3];
               o[0]=rss.getString("JUDUL");
               o[1]=rss.getString("PENULIS");
               o[2]=rss.getString("HARGA");
               model.addRow(o);
           }
           stt.close();//menutup stt
           rss.close();//menutup rss
       }catch(SQLException e){System.out.println("Terjadi Kesalahan");}
//        String sqlSearch = "SELECT * from buku where judul like '&"+search.getText()+"&'";
//    try {
//        search(sqlSearch);
//    } catch (SQLException ex) {
//        Logger.getLogger(FormDataBuku.class.getName()).log(Level.SEVERE, null, ex);
//    }
    }//GEN-LAST:event_searchKeyTyped
    
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
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDataBuku().setVisible(true);
            }
        });
    }
    
     private void TampilData(){
        try{
            String sql = "SELECT * from buku"; //membuat perintah query yaitu query untuk melihat isi atau data dari table buku
            stt = con.createStatement(); //pembuatan statement
            rss = stt.executeQuery(sql); //eksekusi query
            while(rss.next()){
                Object[] o=new Object[3];
                o[0] = rss.getString("judul");
                o[1] = rss.getString("penulis");
                o[2] = rss.getString("harga");
                model.addRow(o);
            }
            rss.close(); //menutup rss
            stt.close(); //menutup stt
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    
    }
    
    private void TambahData(String judul,String penulis,String harga){
        try{
            String sql = 
                    "INSERT INTO buku VALUES (NULL,'"+judul+"','"+penulis+"',"+harga+")";
            stt = con.createStatement();
            stt.executeUpdate(sql); 
            this.judul.setText("");
            this.penulis.setSelectedItem(0);
            this.harga.setText("");
            model.addRow(new Object[]{judul,penulis,harga});
        }catch(SQLException e){System.out.println(e.getMessage());}
    }
    
    private void HapusData(String judull){
        try {
            String sql="delete from buku where judul='"+judull+"'";//mendeklarasikan variabel sql dengan query untuk menghapus data sesuai kondisi
            stt = con.createStatement();//pembuatan statement
            stt.executeUpdate(sql);//eksekusi query
            //mengosongkan atau menset isi dari tesxfield dan combobox di frame
            judul.setText("");
            penulis.setSelectedItem(0);
            harga.setText("");
            
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void UpdateData(String judul, String penulis, String harga){
       try {
            int baris = table.getSelectedRow();
            String sql = "update buku set judul='"+judul+"',penulis='"+penulis+"',harga="+harga+" where judul='"+table.getValueAt(baris, 0).toString()+"'";//mendeklarasikan variabel sql dengan query untuk mengupdate data judul, penulis, harga dari kondisi yang ditentukan
            stt = con.createStatement();//pembuatan statement
            stt.executeUpdate(sql);//eksekusi query
            
            //mengosongkan atau menset isi dari tesxfield dan combobox di frame
            this.judul.setText("");
            this.penulis.setSelectedItem(0);
            this.harga.setText("");
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hapus;
    private javax.swing.JTextField harga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField judul;
    private javax.swing.JButton keluar;
    private javax.swing.JComboBox<String> penulis;
    private javax.swing.JComboBox<String> pilihan;
    private javax.swing.JTextField search;
    private javax.swing.JButton simpan;
    private javax.swing.JTable table;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}
