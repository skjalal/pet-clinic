CREATE TABLE owners
(
    id                 INTEGER PRIMARY KEY AUTO_INCREMENT,
    first_name         VARCHAR(30),
    last_name          VARCHAR(30),
    address            VARCHAR(255),
    city               VARCHAR(80),
    telephone          VARCHAR(20),
    created_date       TIMESTAMP,
    last_modified_date TIMESTAMP
);
CREATE INDEX owners_last_name ON owners (last_name);