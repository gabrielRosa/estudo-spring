--liquibase formatted sql
--changeset gabriel:Payment_With_Card-loaddata-dml context:test

INSERT INTO Payment_With_Card (installments, customer_order_id) VALUES (3, 2);
