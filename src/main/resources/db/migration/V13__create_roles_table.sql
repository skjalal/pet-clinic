CREATE TABLE roles
(
    id       INTEGER AUTO_INCREMENT,
    username VARCHAR(20) NOT NULL,
    role     VARCHAR(20) NOT NULL,
    PRIMARY KEY (id),
    UNIQUE KEY uni_username_role (role,username),
    KEY      fk_username_idx (username),
    CONSTRAINT fk_username FOREIGN KEY (username) REFERENCES users (username)
);