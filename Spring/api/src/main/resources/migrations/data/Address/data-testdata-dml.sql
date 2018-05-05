--liquibase formatted sql
--changeset gabriel:Address-loaddata-dml context:test

INSERT INTO Address (id, address, cep, complement, number, city_id, customer_id) VALUES (1, 'avenida Ab', '99999999', 'Here', '99', 1, 1);
INSERT INTO Address (id, address, cep, complement, number, city_id, customer_id) VALUES (2, 'avenida Cd', '99999999', 'Here', '99', 2, 2);
