CREATE TABLE types
(
    id                 INTEGER PRIMARY KEY AUTO_INCREMENT,
    name               VARCHAR(80),
    created_date       TIMESTAMP,
    last_modified_date TIMESTAMP
);
CREATE INDEX types_name ON types (name);