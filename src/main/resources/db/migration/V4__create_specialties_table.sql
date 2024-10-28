CREATE TABLE specialties
(
    id                 INTEGER PRIMARY KEY AUTO_INCREMENT,
    name               VARCHAR(80),
    created_date       TIMESTAMP,
    last_modified_date TIMESTAMP
);
CREATE INDEX specialties_name ON specialties (name);