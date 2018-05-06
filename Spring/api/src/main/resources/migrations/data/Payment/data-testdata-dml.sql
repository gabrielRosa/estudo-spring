--liquibase formatted sql
--changeset gabriel:Payment-loaddata-dml context:test

INSERT INTO Payment (customer_order_id, payment_status) VALUES (1, 0);
INSERT INTO Payment (customer_order_id, payment_status) VALUES (2, 1);
