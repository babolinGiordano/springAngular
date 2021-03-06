CREATE USER IF NOT EXISTS SA SALT 'a9160799b9bc9c38' HASH '55cdff35bf0a2fe6bf8d88ab8eba4911cc8fac325176cd02f0498640181089cc' ADMIN;            
CREATE SEQUENCE PUBLIC.HIBERNATE_SEQUENCE START WITH 3;        
CREATE CACHED TABLE PUBLIC.T_USER(
    ID BIGINT NOT NULL,
    FIRST_NAME VARCHAR(255),
    LAST_NAME VARCHAR(255)
);          
ALTER TABLE PUBLIC.T_USER ADD CONSTRAINT PUBLIC.CONSTRAINT_9 PRIMARY KEY(ID);  
INSERT INTO PUBLIC.T_USER(ID, FIRST_NAME, LAST_NAME) VALUES
(1, 'John', 'Doe'),
(2, 'Giordano', 'Babolin'); 