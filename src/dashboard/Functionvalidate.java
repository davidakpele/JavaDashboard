package dashboard;

import DBCon.DBConnect;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Functionvalidate {
    @SuppressWarnings("FieldMayBeFinal")
    private static DBCon.DBConnect Con = new DBConnect();
    @SuppressWarnings({"StaticNonFinalUsedInInitialization", "FieldMayBeFinal"})
    private static Connection DB = Con.getConnection();
    private static PreparedStatement stmt = null;
    
//    ###Categroy function START HERE###
    public static boolean InsertCategory(RouteClass s){
       String sql = RouteClass.isInsertCat;
        try {
            stmt = DB.prepareStatement(sql);
            stmt.setString(1, s.getCategoryID());
            stmt.setString(2, s.getCategoryName());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public static boolean InUpdateCategory(RouteClass s){
       String sql = RouteClass.isUpdateCategory;
        try {
            stmt = DB.prepareStatement(sql);
            stmt.setString(1, s.getCategoryName());
            stmt.setString(2, s.getCategoryID());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
     public static boolean isDeleteCategory(RouteClass s){
         String sql = RouteClass.isDeleteCategory;
        try {
            stmt = DB.prepareStatement(sql);
            stmt.setString(1, s.getCategoryID());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
     
      public static boolean isTruncateCategoryTable(){
       String sql = RouteClass.isTruncateC;
        try {
            stmt = DB.prepareStatement(sql);
            stmt.executeUpdate();
            return true;
       } catch (SQLException ex) {
            return false;
        }
    }
      public static void ViewCategoryFunction(String LookFor){
        DefaultTableModel x = (DefaultTableModel)Category.CategoryTable.getModel();
            while(x.getRowCount() > 0){
            x.removeRow(0);
        }
        
        @SuppressWarnings("UnusedAssignment")
        String sql = "";
        if(LookFor.equals("")){
            sql = RouteClass.isSelectCategory;
        }else{
            sql = "SELECT * FROM category WHERE ("
                    + "CategoryName LIKE'"+LookFor+"%' "+ ")";
        }
        String data[] = new String[3];
        try {
            Statement st = DB.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                data[0] = rs.getString("CategoryID");
                data[1] = rs.getString("CategoryName");
                data[2] = rs.getString("Parent");
                x.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Functionvalidate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public static void setLists(String LookFor){
        DefaultTableModel modelo = (DefaultTableModel)Category.CategoryTable.getModel();
        while(modelo.getRowCount() > 0){
            modelo.removeRow(0);
        }
        
        @SuppressWarnings("UnusedAssignment")
        String sql = "";
        if(LookFor.equals("")){
            sql = RouteClass.isSelectCategory;
        }else{
            sql = "SELECT * FROM category WHERE ("
                    + "CategoryID LIKE'"+LookFor+"%' OR "
                    + "CategoryName LIKE'"+LookFor+"%' "
                    + ")";
        }
        String data[] = new String[3];
        
        try {
            Statement st = DB.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                data[0] = rs.getString("CategoryID");
                data[1] = rs.getString("CategoryName");
                data[2] = rs.getString("Parent");
                modelo.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Functionvalidate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
      public static String extractCatMAXID(){
        String sql = "SELECT MAX(CategoryID) FROM category";
        int ProductID = 0;
        try {
            Statement st = DB.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                ProductID = rs.getInt(1);
            }
            if(ProductID == 0){
                ProductID = 1;
            }else{
                ProductID = ProductID + 1; 
            }
            return String.valueOf(ProductID);
        } catch (SQLException ex) {
            return null;
        }
   }
//    ### Category function END HERE###
     
     
 //=====================================
     
     
//     ###Brand function START HERE###
    public static boolean isRegisterBrand(RouteClass s){
         String sql = RouteClass.isInsertBrand;
        try {
            stmt = DB.prepareStatement(sql);
           
            stmt.setString(1, s.getBrandID());
            stmt.setString(2, s.getBrandName());
            stmt.setString(3, s.getBrandParent());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
   
    public static boolean isUpDateBrand(RouteClass s){
         String sql = RouteClass.isUpdateBrand;
        try {
            stmt = DB.prepareStatement(sql);
            stmt.setString(1, s.getBrandName());
            stmt.setString(2, s.getBrandParent());
            stmt.setString(3, s.getBrandID());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
   public static boolean isDeleteBrand(RouteClass s){
       String sql = RouteClass.isDeleteBrand;
        try {
            stmt = DB.prepareStatement(sql);
            stmt.setString(1, s.getBrandID());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
   
   public static boolean isTruncateBrandTable(){
       String sql = RouteClass.isTruncateB;
        try {
            stmt = DB.prepareStatement(sql);
            stmt.executeUpdate();
            return true;
       } catch (SQLException ex) {
            return false;
        }
    }
   public static void ViewBrandloader(String LookFor){
        DefaultTableModel x = (DefaultTableModel)Brand.BrandTable.getModel();
            while(x.getRowCount() > 0){
            x.removeRow(0);
        }
        
        @SuppressWarnings("UnusedAssignment")
        String sql = "";
        if(LookFor.equals("")){
            sql = RouteClass.isSelectBrand;
        }else{
            sql = "SELECT * FROM brand WHERE ("
                    + "BrandName LIKE'"+LookFor+"%' OR "
                     + "BrandParent LIKE'"+LookFor+"%' "
                    + ")";
        }
        String data[] = new String[3];
        try {
            Statement st = DB.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                data[0] = rs.getString("BrandID");
                data[1] = rs.getString("BrandName");
                data[2] = rs.getString("BrandParent");
                x.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Functionvalidate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
   public static String extractBrandIDMax(){
        String sql = "SELECT MAX(BrandID) FROM brand";
        int ProductID = 0;
        try {
            Statement st = DB.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                ProductID = rs.getInt(1);
            }
            if(ProductID == 0){
                ProductID = 1;
            }else{
                ProductID = ProductID + 1; 
            }
            return String.valueOf(ProductID);
        } catch (SQLException ex) {
            return null;
        }
    }
//   ##Brand function ENDS HERE ###
   
//   ======================================//`  
     
  
//   ##Product function START HERE ##
   
    public static boolean InsertProduct(RouteClass s){
        String sql = RouteClass.insertProduct;
        try {
            stmt = DB.prepareStatement(sql);
            stmt.setString(1, s.getProductID());
            stmt.setString(2, s.getProductname());
            stmt.setString(3, s.getProductPrice());
            stmt.setString(4, s.getProductCategory());
            stmt.setString(5, s.getProductBrand());
            stmt.setString(6, s.getProductQty());
            stmt.setString(7, s.getProductStatus());
            stmt.setString(8, s.getProductDescription());
             
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public static boolean isUpdateDataProduct(RouteClass s){
       String sql = RouteClass.isUpdateProduct;
        try {
            stmt = DB.prepareStatement(sql);
            
            stmt.setString(1, s.getProductname());
            stmt.setString(2, s.getProductPrice());
            stmt.setString(3, s.getProductCategory());
            stmt.setString(4, s.getProductBrand());
            stmt.setString(5, s.getProductQty());
            stmt.setString(6, s.getProductStatus());
            stmt.setString(7, s.getProductDescription());
            stmt.setString(8, s.getProductID());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
   
    public static boolean isDeleteProducts(RouteClass x){
         String sql = RouteClass.isDeleteProd;
        try {
            stmt = DB.prepareStatement(sql);
            stmt.setString(1, x.getProductID());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
     
    public static boolean isTruncateProductTable(){
       String sql = RouteClass.isTruncateP;
        try {
            stmt = DB.prepareStatement(sql);
            stmt.executeUpdate();
            return true;
       } catch (SQLException ex) {
            return false;
        }
    }
    
     public static String extractProductMAXID(){
        String sql = "SELECT MAX(ProductID) FROM productbag";
        int ProductID = 0;
        try {
            Statement st = DB.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                ProductID = rs.getInt(1);
            }
            if(ProductID == 0){
                ProductID = 102739261;
            }else{
                ProductID = ProductID + 1; 
            }
            return String.valueOf(ProductID);
        } catch (SQLException ex) {
            return null;
        }
    }
        public static String extractBrandIDMAX(){
        String sql = "SELECT MAX(BrandID) FROM brand";
        int BrandID = 0;
        try {
            Statement st = DB.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                BrandID = rs.getInt(1);
            }
            if(BrandID == 0){
                BrandID = 1;
            }else{
                BrandID = BrandID + 1; 
            }
            return String.valueOf(BrandID);
        } catch (SQLException ex) {
            return null;
        }
    }
     public static void ViewProductFunction(String LookFor){
        DefaultTableModel modelo = (DefaultTableModel)DashboardPanel.ProductDataTable.getModel();
            while(modelo.getRowCount() > 0){
            modelo.removeRow(0);
        }
        
        @SuppressWarnings("UnusedAssignment")
        String sql = "";
        if(LookFor.equals("")){
            sql = RouteClass.isSelectProduct;
        }else{
            sql = "SELECT * FROM productbag WHERE ("
                    + "Productname LIKE'"+LookFor+"%' OR "
                    + "ProductPrice LIKE'"+LookFor+"%' OR "
                    + "ProductCategory LIKE'"+LookFor+"%' OR "
                    + "ProductBrand LIKE'"+LookFor+"%' OR "
                    + "ProductQty LIKE'"+LookFor+"%' OR "
                    + "ProductStatus LIKE'"+LookFor+"%' OR "
                    + "ProductDescription LIKE'"+LookFor+"%'"
                    + ")";
        }
        String data[] = new String[8];
        
        try {
            Statement st = DB.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                data[0] = rs.getString("ProductID");
                data[1] = rs.getString("Productname");
                data[2] = rs.getString("ProductPrice");
                data[3] = rs.getString("ProductCategory");
                data[4] = rs.getString("ProductBrand");
                data[5] = rs.getString("ProductQty");
                data[6] = rs.getString("ProductStatus");
                data[7] = rs.getString("ProductDescription");
                modelo.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Functionvalidate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//   ## Product function ENDS HERE##
    
}
