package dashboard;

import DBCon.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AddProduct extends javax.swing.JDialog {
    @SuppressWarnings("FieldMayBeFinal")
    private static DBCon.DBConnect  Con = new DBConnect();
    @SuppressWarnings({"StaticNonFinalUsedInInitialization", "FieldMayBeFinal"})
    private static Connection DB = Con.getConnection();
    @SuppressWarnings("FieldMayBeFinal")
    private static PreparedStatement stmt = null;
    /**
     * Creates new form AddProduct
     */
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public AddProduct(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         this.ProductID.setText(Functionvalidate.extractProductMAXID());
         setClean();
    }
    public void setClean(){
        this.ProductID.setText("");
        this.Productname.setText("");
        this.ProductPrice.setText("");
        this.ProductCategory.setSelectedItem("");
        this.ProductBrand.setSelectedItem("");
        this.ProductQty.setText("");
        this.ProductStatus.setSelectedItem("");
        this.ProductDescription.setText("");

        this.ProductID.setText(Functionvalidate.extractProductMAXID());
  
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
        AddProductTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Productname = new javax.swing.JTextField();
        ProductNameLabel = new javax.swing.JLabel();
        ProductPrice = new javax.swing.JTextField();
        qtylabel = new javax.swing.JLabel();
        ProductQty = new javax.swing.JTextField();
        PriceLabel = new javax.swing.JLabel();
        ProductStatus = new javax.swing.JComboBox<>();
        Statuslabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductDescription = new javax.swing.JTextArea();
        AddBtnSave = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        catlabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ProductCategory = new javax.swing.JComboBox<>();
        ProductBrand = new javax.swing.JComboBox<>();
        brandlabel = new javax.swing.JLabel();
        ProductID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        AddProductTitle.setBackground(new java.awt.Color(218, 6, 6));
        AddProductTitle.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        AddProductTitle.setForeground(new java.awt.Color(255, 255, 255));
        AddProductTitle.setText("Add New Product");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddProductTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(216, 216, 216))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddProductTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        Productname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductnameActionPerformed(evt);
            }
        });

        ProductNameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ProductNameLabel.setText("Product Name:*");

        ProductPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductPriceActionPerformed(evt);
            }
        });
        ProductPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ProductPriceKeyPressed(evt);
            }
        });

        qtylabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        qtylabel.setText("Quantity:*");

        ProductQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductQtyActionPerformed(evt);
            }
        });

        PriceLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PriceLabel.setText("Price:*");

        ProductStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "In Stock", "Out Of Stock" }));
        ProductStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductStatusActionPerformed(evt);
            }
        });

        Statuslabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Statuslabel.setText("Status:*");

        ProductDescription.setColumns(20);
        ProductDescription.setRows(5);
        jScrollPane1.setViewportView(ProductDescription);

        AddBtnSave.setBackground(new java.awt.Color(3, 126, 3));
        AddBtnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddBtnSave.setForeground(new java.awt.Color(255, 255, 255));
        AddBtnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_save_close_20px.png"))); // NOI18N
        AddBtnSave.setText("Save");
        AddBtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnSaveActionPerformed(evt);
            }
        });

        CancelBtn.setBackground(new java.awt.Color(133, 133, 133));
        CancelBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        CancelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_reset_20px.png"))); // NOI18N
        CancelBtn.setText("Cancel");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        catlabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        catlabel.setText("Category:*");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Description:*");

        ProductCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductCategoryMouseClicked(evt);
            }
        });
        ProductCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductCategoryActionPerformed(evt);
            }
        });

        ProductBrand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductBrandMouseClicked(evt);
            }
        });

        brandlabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        brandlabel.setText("Brand:*");

        ProductID.setText("PID");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProductNameLabel)
                            .addComponent(catlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Statuslabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(brandlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(ProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                                .addComponent(AddBtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Productname)
                            .addComponent(ProductPrice)
                            .addComponent(ProductQty)
                            .addComponent(ProductCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ProductBrand, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ProductStatus, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Productname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProductNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProductCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(catlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProductBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProductQty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProductStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Statuslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProductID))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProductnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductnameActionPerformed

    private void ProductPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductPriceActionPerformed
     
    }//GEN-LAST:event_ProductPriceActionPerformed

    private void ProductPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProductPriceKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar(); 
        if(Character.isLetter(c)){
//            Disallow Character from user::ONLY int is allow
            ProductPrice.setEditable(false);
//            Alert Message with dialog
        }else{
            ProductPrice.setEditable(true);
        }
    }//GEN-LAST:event_ProductPriceKeyPressed

    private void AddBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnSaveActionPerformed
       String Pname = Productname.getText();
       String Pprice = ProductPrice.getText();
       String Pcat = (String) ProductCategory.getSelectedItem();
       String Pbrand = (String) ProductBrand.getSelectedItem();
       String Pqty = ProductQty.getText();
       String Pstatus = (String) ProductStatus.getSelectedItem();
       String Pdescription = ProductDescription.getText();
     
      if(Pname.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Category Name.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else if(Pprice.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Product Price.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else if(Pcat.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Select Product Category.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else if(Pbrand.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Select Product Brand.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else if(Pqty.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Product Quantity..", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else if(Pstatus.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Provide The Status Of The Product..", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else if(Pdescription.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter The Products Description..", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
         RouteClass run = new RouteClass();
            
          run.setProductID(this.ProductID.getText());
          run.setProductname(this.Productname.getText());
          run.setProductPrice(this.ProductPrice.getText());
          run.setProductCategory((String) this.ProductCategory.getSelectedItem());
          run.setProductBrand((String) this.ProductBrand.getSelectedItem());
          run.setProductQty(this.ProductQty.getText());
          run.setProductStatus((String) this.ProductStatus.getSelectedItem());
          run.setProductDescription(this.ProductDescription.getText());
          
         if(Functionvalidate.InsertProduct(run)){
            setClean();
           Functionvalidate.ViewProductFunction("");
            JOptionPane.showMessageDialog(this, "Product Succesfully Created.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
         }else{
            JOptionPane.showMessageDialog(this, "Fail To Create Product.", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
         }
      }
    }//GEN-LAST:event_AddBtnSaveActionPerformed

    private void ProductQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductQtyActionPerformed
       
    }//GEN-LAST:event_ProductQtyActionPerformed

    private void ProductStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductStatusActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        dispose();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void ProductCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductCategoryActionPerformed

    private void ProductCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductCategoryMouseClicked
       try {
                Statement st = DB.createStatement();
                ProductCategory.removeAllItems();
                 String sql = "SELECT *  FROM category";
                 ResultSet rs = st.executeQuery(sql);
            while(rs.next()){ 
             ProductCategory.addItem(rs.getString("CategoryName"));
            }
         }catch (SQLException ex) {
             JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Functionvalidate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ProductCategoryMouseClicked

    private void ProductBrandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductBrandMouseClicked
          try {
                Statement st = DB.createStatement();
                ProductBrand.removeAllItems();
                 String sql = "SELECT *  FROM brand";
                 ResultSet rs = st.executeQuery(sql);
            while(rs.next()){ 
             ProductBrand.addItem(rs.getString("BrandName"));
            }
         }catch (SQLException ex) {
             JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Functionvalidate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ProductBrandMouseClicked

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
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddProduct dialog = new AddProduct(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtnSave;
    private javax.swing.JLabel AddProductTitle;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JComboBox<String> ProductBrand;
    private javax.swing.JComboBox<String> ProductCategory;
    private javax.swing.JTextArea ProductDescription;
    private javax.swing.JLabel ProductID;
    private javax.swing.JLabel ProductNameLabel;
    private javax.swing.JTextField ProductPrice;
    private javax.swing.JTextField ProductQty;
    private javax.swing.JComboBox<String> ProductStatus;
    private javax.swing.JTextField Productname;
    private javax.swing.JLabel Statuslabel;
    private javax.swing.JLabel brandlabel;
    private javax.swing.JLabel catlabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel qtylabel;
    // End of variables declaration//GEN-END:variables
}
