--liquibase formatted sql
--changeset gabriel:Product_Category-loaddata-dml context:test

-- Shoes
INSERT INTO Product_Category (product_id, category_id) VALUES (1, 1);
INSERT INTO Product_Category (product_id, category_id) VALUES (2, 1);

-- Bags
INSERT INTO Product_Category (product_id, category_id) VALUES (3, 2);
