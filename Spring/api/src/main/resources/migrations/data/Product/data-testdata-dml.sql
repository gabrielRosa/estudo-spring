--liquibase formatted sql
--changeset gabriel:Product-loaddata-dml context:test

-- Shoes
INSERT INTO Product (name, price) VALUES ('COMBAT BOOTS SOLA TRATORADA LEATHER BLACK', 390.00);
INSERT INTO Product (name, price) VALUES ('BOTA CUT OUT BLACK', 590.00);

-- Bags
INSERT INTO Product (name, price) VALUES ('MINI LORENA TOTE BLACK', 850.00);
