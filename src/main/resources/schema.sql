CREATE TABLE user (
    id        BIGINT        AUTO_INCREMENT,
    email     VARCHAR(60)   NOT NULL,
    password  VARCHAR(120)  NOT NULL,

    PRIMARY KEY (id),
    UNIQUE KEY (email)
);
