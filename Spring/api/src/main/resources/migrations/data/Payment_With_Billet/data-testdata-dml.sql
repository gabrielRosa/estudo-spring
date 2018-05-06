--liquibase formatted sql
--changeset gabriel:Payment_With_Billet-loaddata-dml context:test

INSERT INTO Payment_With_Billet (due_date, payday, customer_order_id) VALUES (current_timestamp , current_timestamp, 1);
