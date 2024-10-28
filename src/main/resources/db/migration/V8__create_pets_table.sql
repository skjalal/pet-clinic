CREATE TABLE pets
(
    id                 INTEGER PRIMARY KEY AUTO_INCREMENT,
    name               VARCHAR(30),
    birth_date         DATE,
    type_id            INTEGER NOT NULL,
    owner_id           INTEGER NOT NULL,
    created_date       TIMESTAMP,
    last_modified_date TIMESTAMP
);
CREATE INDEX pets_name ON pets (name);