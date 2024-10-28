CREATE TABLE users
(
    username           VARCHAR(20)          NOT NULL PRIMARY KEY,
    password           VARCHAR(20)          NOT NULL,
    enabled            BOOLEAN DEFAULT TRUE NOT NULL,
    created_date       TIMESTAMP,
    last_modified_date TIMESTAMP
);