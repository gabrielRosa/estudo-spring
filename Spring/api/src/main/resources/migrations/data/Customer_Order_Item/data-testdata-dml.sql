--liquibase formatted sql
--changeset gabriel:Customer_Order_Item-loaddata-dml context:test

INSERT INTO Customer_Order_Item (amount, discount, price, customer_order_id, product_id) VALUES (3, 20, 100, 1, 1);
INSERT INTO Customer_Order_Item (amount, discount, price, customer_order_id, product_id) VALUES (4, 20, 200, 2, 2);
