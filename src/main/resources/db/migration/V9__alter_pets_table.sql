ALTER TABLE pets
    ADD CONSTRAINT fk_pets_owners FOREIGN KEY (owner_id) REFERENCES owners (id);
ALTER TABLE pets
    ADD CONSTRAINT fk_pets_types FOREIGN KEY (type_id) REFERENCES types (id);