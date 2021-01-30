CREATE TABLE user (
    id        BIGINT        AUTO_INCREMENT,
    email     VARCHAR(60)   NOT NULL,
    password  VARCHAR(120)  NOT NULL,
    roles     VARCHAR(120)  NOT NULL,

    PRIMARY KEY (id),
    UNIQUE KEY (email)
);

INSERT INTO user (email, password, roles) VALUES ('test@example.com', '{bcrypt}$2a$10$uhuqnvtjTayBhSjs7ezeB.2DG5GlIERAawzRoCROyTxWpzwKy7T.e', 'ROLE_USER,ROLE_ADMIN');
