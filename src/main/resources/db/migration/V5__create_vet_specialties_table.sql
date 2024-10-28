CREATE TABLE vet_specialties
(
    vet_id       INTEGER NOT NULL,
    specialty_id INTEGER NOT NULL
);
ALTER TABLE vet_specialties
    ADD CONSTRAINT fk_vet_specialties_vets FOREIGN KEY (vet_id) REFERENCES vets (id);
ALTER TABLE vet_specialties
    ADD CONSTRAINT fk_vet_specialties_specialties FOREIGN KEY (specialty_id) REFERENCES specialties (id);