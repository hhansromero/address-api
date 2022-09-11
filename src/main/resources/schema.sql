CREATE TABLE addresses (
                          id            INTEGER   NOT NULL AUTO_INCREMENT,
                          dni           VARCHAR(8) NOT NULL,
                          street        VARCHAR(200) NULL,
                          city          VARCHAR(200) NULL,
                          postal_code   VARCHAR(200) NULL,
                          country       VARCHAR(200) NULL,
                          PRIMARY KEY (id)
);
