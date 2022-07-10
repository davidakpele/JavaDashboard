##This is the SQL QUERY CRATING BARND TABLE

CREATE TABLE `jdcpapidb`.`brand` ( `BrandID` INT(10) NOT NULL AUTO_INCREMENT , `BrandName` VARCHAR(200) NOT NULL , `BrandParent` VARCHAR(255) NOT NULL , PRIMARY KEY (`BrandID`)) ENGINE = InnoDB;

##This is the SQL QUERY CRATING CATEGORY TABLE

CREATE TABLE `jdcpapidb`.`category` ( `CategoryID` INT(10) NOT NULL AUTO_INCREMENT , `CategoryName` VARCHAR(200) NOT NULL , `Parent` VARCHAR(255) NOT NULL , PRIMARY KEY (`CategoryID`)) ENGINE = InnoDB;


##This is the SQL QUERY CRATING PRODUCT TABLE

CREATE TABLE `jdcpapidb`.`productbag` ( `ProductID` INT NOT NULL , `Productname` VARCHAR(200) NOT NULL , `ProductPrice` VARCHAR(255) NOT NULL , `ProductCategory` VARCHAR(255) NOT NULL , `ProductBrand` VARCHAR(200) NOT NULL , `ProductQty` VARCHAR(200) NOT NULL , `ProductStatus` VARCHAR(255) NOT NULL , `ProductDescription` VARCHAR(200) NOT NULL , PRIMARY KEY (`ProductID`)) ENGINE = InnoDB;
