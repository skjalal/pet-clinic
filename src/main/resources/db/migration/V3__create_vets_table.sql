CREATE TABLE vets
(
    id                 INTEGER PRIMARY KEY AUTO_INCREMENT,
    first_name         VARCHAR(30),
    last_name          VARCHAR(30),
    created_date       TIMESTAMP,
    last_modified_date TIMESTAMP
);
CREATE INDEX vets_last_name ON vets (last_name);