--liquibase formatted sql
--changeset gabriel:City-loaddata-dml context:test

INSERT INTO City (name, state_id) VALUES ('São Leopoldo', 1);
INSERT INTO City (name, state_id) VALUES ('Novo Hamburgo', 1);
INSERT INTO City (name, state_id) VALUES ('São Paulo', 2);
