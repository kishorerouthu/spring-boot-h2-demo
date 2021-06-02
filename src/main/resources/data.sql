INSERT INTO TBL_EMPLOYEES (first_name, last_name, email) VALUES	('Lokesh', 'Gupta', 'howtodoinjava@gmail.com'),('John', 'Doe', 'xyz@email.com');

 -- Insert data into product catalogue tables --
INSERT INTO PRODUCT (name, description) VALUES ('Rug', 'A cool rug'  ), ('Cup', 'A coffee cup');
INSERT INTO VARIANT (name) VALUES ('color'),('material'),('size') ;
INSERT INTO SELLER (name) VALUES ('AbcCorp'),('XyzCorp') ;

INSERT INTO PRODUCT_DETAILS(product_id,variant_id,seller_id,variant_value,sku,price) VALUES (1, 1, 1,'red', 'a122',50);
INSERT INTO PRODUCT_DETAILS(product_id,variant_id,seller_id,variant_value,sku,price) VALUES (1, 2, 1,'cotton', 'a123',60);
INSERT INTO PRODUCT_DETAILS(product_id,variant_id,seller_id,variant_value,sku,price) VALUES (2, 2, 2,'whool', 'a124',70);
INSERT INTO PRODUCT_DETAILS(product_id,variant_id,seller_id,variant_value,sku,price) VALUES (2, 3, 2,'10', 'a125',80);