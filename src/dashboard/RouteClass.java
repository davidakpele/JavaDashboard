package dashboard;

public class RouteClass {
     public static String isSelectCategory = "SELECT * FROM category";
     
     public static String isSelectBrand = "SELECT * FROM brand";
     
     public static String isSelectProduct = "SELECT * FROM productbag";
    
    public static String isInsertCat = "INSERT INTO category ("
        + "CategoryID,"
        + "CategoryName) "
        + "VALUES(?, ? )";
      
     public static String insertProduct = "INSERT INTO  productbag ("
        + "ProductID,"
        + "Productname,"
        + "ProductPrice,"
        + "ProductCategory,"
        + "ProductBrand,"
        + "ProductQty,"
        + "ProductStatus,"
        + "ProductDescription) "
        + "VALUES(?,?,?,?,?,?,?,?)";
      
  public static String isInsertBrand = "INSERT INTO brand ("
            + "BrandID,"
            + "BrandName,"
            + "BrandParent) "
            + "VALUES(?, ?, ?)";
  
  public static String isUpdateBrand = "UPDATE brand SET "
            + "BrandName = ?,"
            + "BrandParent = ? " 
            + "WHERE BrandID = ?";
    
    public static String isUpdateProduct = "UPDATE productbag SET  "
            +  "Productname = ?,"
            +  "ProductPrice = ?,"
            +  "ProductCategory = ?,"
            +  "ProductBrand = ?,"
            +  "ProductQty = ?,"
            +  "ProductStatus = ?,"
            +  "ProductDescription = ? "
            +  "WHERE ProductID = ?";
    
      public static String isUpdateCategory = "UPDATE Category SET  "
            +  "CategoryName = ? "
            +  "WHERE CategoryID = ?";
      
    public static String isDeleteBrand =  "DELETE FROM brand WHERE BrandID = ?";
    
    public static String isDeleteProd= "DELETE FROM productbag WHERE ProductID = ?";
    
    public static String isDeleteCategory= "DELETE FROM Category WHERE CategoryID = ?";
    
    public static String isTruncateP= "TRUNCATE TABLE productbag";
    
    public static String isTruncateB= "TRUNCATE TABLE brand";
    
    public static String isTruncateC= "TRUNCATE TABLE Category";
    
//  Brand
    private String  BrandID;
    private String  BrandName;
    private String BrandParent;
//    Product 
    private String ProductID;
    private String Productname;
    private String ProductPrice;
    private String ProductCategory;
    private String ProductBrand;
    private String ProductQty;
    private String ProductStatus;
    private String ProductDescription;
  
    // Category
    private String CategoryName;
    private String  CategoryID;

    public String getBrandID() {
        return BrandID;
    }

    public void setBrandID(String BrandID) {
        this.BrandID = BrandID;
    }

    public String getBrandName() {
        return BrandName;
    }
    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }
    
     public String getBrandParent() {
        return BrandParent;
    }
    public void setBrandParent(String BrandParent) {
        this.BrandParent = BrandParent;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    public String getProductname() {
        return Productname;
    }

    public void setProductname(String Productname) {
        this.Productname = Productname;
    }

    public String getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(String ProductPrice) {
        this.ProductPrice = ProductPrice;
    }

    public String getProductCategory() {
        return ProductCategory;
    }

    public void setProductCategory(String ProductCategory) {
        this.ProductCategory = ProductCategory;
    }

    public String getProductBrand() {
        return ProductBrand;
    }

    public void setProductBrand(String ProductBrand) {
        this.ProductBrand = ProductBrand;
    }

    public String getProductQty() {
        return ProductQty;
    }

    public void setProductQty(String ProductQty) {
        this.ProductQty = ProductQty;
    }

    public String getProductStatus() {
        return ProductStatus;
    }

    public void setProductStatus(String ProductStatus) {
        this.ProductStatus = ProductStatus;
    }

    public String getProductDescription() {
        return ProductDescription;
    }

    public void setProductDescription(String ProductDescription) {
        this.ProductDescription = ProductDescription;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    public String getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(String CategoryID) {
        this.CategoryID = CategoryID;
    }
    
  
  
     
}
