--liquibase formatted sql
--changeset gabriel:Phones-loaddata-dml context:test

INSERT INTO Phones (customer_id, phones) VALUES (1, '999999999');
INSERT INTO Phones (customer_id, phones) VALUES (2, '111111111');
