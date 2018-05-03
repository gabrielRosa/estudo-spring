--liquibase formatted sql
--changeset gabriel:Category-loaddata-dml context:test

INSERT INTO Category (name) VALUES ('Shoes');
INSERT INTO Category (name) VALUES ('Bags');
