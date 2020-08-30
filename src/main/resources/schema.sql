drop table RESERVATIONS if exists;
drop table DEPARTURES if exists;
--create table flights (
    --id integer PRIMARY KEY AUTO_INCREMENT,
    --airline_code varchar(2),
    --airline_name varchar(50),
    --code_share boolean not null,
    --destination varchar(50),
    --destination_code varchar(3),
    --flight_number varchar(6),
    --terminal varchar(1),
    --time time);
CREATE TABLE DEPARTURES (
    FLIGHT_NUMBER VARCHAR(6) NOT NULL,
    DESTINATION VARCHAR(20),
    DESTINATION_CODE VARCHAR(3),
    AIRLINE_NAME VARCHAR(24),
    AIRLINE_CODE VARCHAR(2),
    DEPARTURE_TIME TIME,
    TERMINAL CHAR,
    CODE_SHARE BOOLEAN NOT NULL,
    PRIMARY KEY (FLIGHT_NUMBER))
CREATE TABLE RESERVATIONS (
    RESERVATION_NUMBER INTEGER NOT NULL,
    NAME_ON_RESERVATION VARCHAR(255),
    FLIGHT_FLIGHT_NUMBER varchar(6),
    primary key (RESERVATION_NUMBER))
ALTER TABLE RESERVATIONS
    ADD CONSTRAINT FK_FLIGHT_RESERVATIONS
    FOREIGN KEY (FLIGHT_FLIGHT_NUMBER)
    REFERENCES DEPARTURES
CREATE SEQUENCE HIBERNATE_SEQUENCE START WITH 1 INCREMENT BY 1