--liquibase formatted sql
--changeset gabriel:Customer_Order-loaddata-dml context:test

INSERT INTO Customer_Order (id, created, delivery_address_id, customer_id) VALUES (1, current_timestamp, 1, 1);
INSERT INTO Customer_Order (id, created, delivery_address_id, customer_id) VALUES (2, current_timestamp, 2, 2);
