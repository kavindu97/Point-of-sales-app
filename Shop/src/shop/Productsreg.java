/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hp
 */
public class Productsreg extends javax.swing.JFrame {

    /**
     * Creates new form Productsreg
     */
    public Productsreg() {
        initComponents();
        connection();
        showdata();
    }
    
    Connection con;
    PreparedStatement pst;
    public void connection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/shop", "root","");
            System.out.println("connecting");
        }catch (ClassNotFoundException ex) {
           ex.printStackTrace();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void showdata(){
          try{
            pst=con.prepareStatement("select * from proreg");
           ResultSet rs=pst.executeQuery();
            DefaultTableModel tbmodel=(DefaultTableModel)jTable1.getModel();
              tbmodel.setRowCount(0);
           while(rs.next()){
                 
               String id= String.valueOf(rs.getInt("id"));
               String pnamek=rs.getString("pname");
               String brpricek=String.valueOf(rs.getInt("brprice"));
               String slpricek=String.valueOf(rs.getInt("sellingprice"));
               String quantityk=String.valueOf(rs.getInt("quantity"));
               
               
            
               
               String tbdat[]={id,pnamek,brpricek,slpricek,quantityk};
               tbmodel.addRow(tbdat);
              
              
           
           }
        }catch(Exception e){
        
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtp = new javax.swing.JTextField();
        txtq = new javax.swing.JTextField();
        txts = new javax.swing.JTextField();
        txtb = new javax.swing.JTextField();
        btni = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnu = new javax.swing.JButton();
        btnd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txti = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 156));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hp\\Downloads\\ezgif.com-gif-maker (17).gif")); // NOI18N
        jLabel1.setText("Product Registration");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Product name:");

        jLabel3.setText("Brought price:");

        jLabel4.setText("Selling price:");

        jLabel5.setText("Quantity:");

        txts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsActionPerformed(evt);
            }
        });

        btni.setBackground(new java.awt.Color(255, 255, 255));
        btni.setForeground(new java.awt.Color(0, 0, 156));
        btni.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hp\\Downloads\\ezgif.com-gif-maker (10).gif")); // NOI18N
        btni.setText("insert new data");
        btni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Product Name", "Brought Price of a product", "Selling price of  a product", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnu.setBackground(new java.awt.Color(255, 255, 255));
        btnu.setForeground(new java.awt.Color(0, 0, 156));
        btnu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hp\\Downloads\\ezgif.com-gif-maker (13).gif")); // NOI18N
        btnu.setText("update");
        btnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuActionPerformed(evt);
            }
        });

        btnd.setBackground(new java.awt.Color(255, 255, 255));
        btnd.setForeground(new java.awt.Color(0, 0, 156));
        btnd.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hp\\Downloads\\ezgif.com-gif-maker (14).gif")); // NOI18N
        btnd.setText("delete");
        btnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndActionPerformed(evt);
            }
        });

        jLabel6.setText("*use id to update and delete ");

        jLabel7.setText("id:");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(0, 0, 156));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hp\\Downloads\\ezgif.com-gif-maker (6).gif")); // NOI18N
        jButton2.setText("goback");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtp)
                            .addComponent(txtb)
                            .addComponent(txts)
                            .addComponent(txtq, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txti, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnu)
                                .addGap(18, 18, 18)
                                .addComponent(btnd))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(jButton2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btni)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(btni)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnu)
                            .addComponent(btnd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(20, 20, 20))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsActionPerformed

    private void btniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniActionPerformed
        // TODO add your handling code here:
        String pname,brpice,slprice,quantity;
        pname=txtp.getText();
        brpice=txtb.getText();
        slprice=txts.getText();
        quantity=txtq.getText();
        try{
            pst=con.prepareStatement("insert into proreg(pname,brprice,sellingprice,quantity)values(?,?,?,?)");
            pst.setString(1, pname);
            pst.setString(2, brpice);
            pst.setString(3, slprice);
            pst.setString(4, quantity);
              pst.executeUpdate();
             
        }catch(Exception e){
        
    }
        try{
            pst=con.prepareStatement("select * from proreg");
           ResultSet rs=pst.executeQuery();
             DefaultTableModel tbmodel=(DefaultTableModel)jTable1.getModel();
              tbmodel.setRowCount(0);
           while(rs.next()){
               String id= String.valueOf(rs.getInt("id"));
               String pnamek=rs.getString("pname");
               String brpricek=String.valueOf(rs.getInt("brprice"));
               String slpricek=String.valueOf(rs.getInt("sellingprice"));
               String quantityk=String.valueOf(rs.getInt("quantity"));
               
               String tbdat[]={id,pnamek,brpricek,slpricek,quantityk};
              
               tbmodel.addRow(tbdat);
              
           }
            
        }catch(Exception e){
        
    }
         JOptionPane.showMessageDialog(null, "Record Addeddd!!!!!!");
    }//GEN-LAST:event_btniActionPerformed

    private void btndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndActionPerformed
        // TODO add your handling code here:
        String id=txti.getText();
        
       try{
           pst=con.prepareStatement("delete from proreg where id = ? ");
           pst.setString(1,id);
           pst.executeUpdate();
       }catch(Exception e){
           
       }
        try{
            pst=con.prepareStatement("select * from proreg");
           ResultSet rs=pst.executeQuery();
            DefaultTableModel tbmodel=(DefaultTableModel)jTable1.getModel();
              tbmodel.setRowCount(0);
           while(rs.next()){
               String idk= String.valueOf(rs.getInt("id"));
               String pnamek=rs.getString("pname");
               String brpricek=String.valueOf(rs.getInt("brprice"));
               String slpricek=String.valueOf(rs.getInt("sellingprice"));
               String quantityk=String.valueOf(rs.getInt("quantity"));
               
               String tbdat[]={idk,pnamek,brpricek,slpricek,quantityk};
              
               tbmodel.addRow(tbdat);
              
           }
            
        }catch(Exception e){
        
    }
         JOptionPane.showMessageDialog(null, "Record Deleted!!!!!!");
        
    }//GEN-LAST:event_btndActionPerformed

    private void btnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuActionPerformed
        // TODO add your handling code here:
        String pname=txtp.getText();
        String brprice=txtb.getText();
        String sprice=txts.getText();
        String quantity=txtq.getText();
        String id=txti.getText();
          try{
           pst=con.prepareStatement("update proreg set  pname=?,brprice=?,sellingprice=?,quantity=? where id=?");
           pst.setString(1, pname);
           pst.setString(2,brprice);
           pst.setString(3,sprice);
           pst.setString(4,quantity);
           pst.setString(5,id);
           pst.executeUpdate();
       }catch(Exception e){
           
       }
        try{
            pst=con.prepareStatement("select * from proreg");
           ResultSet rs=pst.executeQuery();
            DefaultTableModel tbmodel=(DefaultTableModel)jTable1.getModel();
              tbmodel.setRowCount(0);
           while(rs.next()){
               String idk= String.valueOf(rs.getInt("id"));
               String pnamek=rs.getString("pname");
               String brpricek=String.valueOf(rs.getInt("brprice"));
               String slpricek=String.valueOf(rs.getInt("sellingprice"));
               String quantityk=String.valueOf(rs.getInt("quantity"));
               
               String tbdat[]={idk,pnamek,brpricek,slpricek,quantityk};
              
               tbmodel.addRow(tbdat);
              
           }
            
        }catch(Exception e){
        
    }
         JOptionPane.showMessageDialog(null, "Record Updated!!!!!!");
        
    }//GEN-LAST:event_btnuActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      Myshop s=new Myshop();
      s.setVisible(true);
       
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Productsreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productsreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productsreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productsreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productsreg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnd;
    private javax.swing.JButton btni;
    private javax.swing.JButton btnu;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtb;
    private javax.swing.JTextField txti;
    private javax.swing.JTextField txtp;
    private javax.swing.JTextField txtq;
    private javax.swing.JTextField txts;
    // End of variables declaration//GEN-END:variables
}
