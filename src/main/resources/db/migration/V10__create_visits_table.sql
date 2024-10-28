CREATE TABLE visits
(
    id                 INTEGER PRIMARY KEY AUTO_INCREMENT,
    pet_id             INTEGER NOT NULL,
    visit_date         DATE,
    description        VARCHAR(255),
    created_date       TIMESTAMP,
    last_modified_date TIMESTAMP
);
CREATE INDEX visits_pet_id ON visits (pet_id);