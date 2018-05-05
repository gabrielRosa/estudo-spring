--liquibase formatted sql
--changeset gabriel:Customer-loaddata-dml context:test

INSERT INTO Customer (id, cpf_or_cnpj, customer_type, email, name) VALUES (1, '99999999999', 0, 'ok@gmail.com', 'Gabriel');
INSERT INTO Customer (id, cpf_or_cnpj, customer_type, email, name) VALUES (2, '99999999999', 1, 'ok@gmail.com', 'Gabriel2');
