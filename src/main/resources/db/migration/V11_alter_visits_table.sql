ALTER TABLE visits
    ADD CONSTRAINT fk_visits_pets FOREIGN KEY (pet_id) REFERENCES pets (id);