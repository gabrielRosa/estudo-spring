--liquibase formatted sql
--changeset gabriel:State-loaddata-dml context:test

INSERT INTO State (id, name) VALUES (1, 'Rio Grande do Sul');
INSERT INTO State (id, name) VALUES (2, 'São Paulo');
