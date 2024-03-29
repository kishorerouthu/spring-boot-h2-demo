DROP TABLE IF EXISTS TBL_EMPLOYEES;
CREATE TABLE TBL_EMPLOYEES (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL
);

-- Define Schema for Product catalogue --
DROP TABLE IF EXISTS PRODUCT;
CREATE TABLE PRODUCT (
     id INT AUTO_INCREMENT primary key,
     name VARCHAR(20),
     description VARCHAR(30)
 );

DROP TABLE IF EXISTS VARIANT;
CREATE TABLE VARIANT (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50)
);

DROP TABLE IF EXISTS SELLER;
CREATE TABLE SELLER (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50)
);

DROP TABLE IF EXISTS PRODUCT_DETAILS;
CREATE TABLE PRODUCT_DETAILS(
    id INT AUTO_INCREMENT PRIMARY KEY,
    product_id INT,
    variant_id INT,
    seller_id INT,
    variant_value VARCHAR(50),
    sku VARCHAR(50),
    price FLOAT
 );