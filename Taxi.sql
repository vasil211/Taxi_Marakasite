drop database if exists taxi;
create database Taxi;
Use Taxi;

CREATE TABLE role (
    id INT AUTO_INCREMENT PRIMARY KEY,
    roleName VARCHAR(20) NOT NULL
);

CREATE TABLE user (
    id INT AUTO_INCREMENT PRIMARY KEY,
    role_id int DEFAULT 03,
    uname VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL,
    firstName VARCHAR(50) NOT NULL,
    lastName VARCHAR(50) NOT NULL,
    phone INT UNIQUE, 
    email VARCHAR(50) NOT NULL UNIQUE,
    EGN INT NOT NULL UNIQUE,
    registration DATETIME DEFAULT CURRENT_TIMESTAMP,
    rating double null,
    state smallint null,
    CONSTRAINT FOREIGN KEY (role_id)
        REFERENCES role (id)
);


CREATE TABLE rides (
    id INT AUTO_INCREMENT PRIMARY KEY,
	user_id INT NOT NULL,
    driver_id int not null,
    time_Of_Order TIME NOT NULL,
    time_Of_Start Time null,
    time_Of_End Time null,
    date DATE NOT NULL,
    ride_State smallint NOT NULL,
    start_Location varchar(250) null,
    end_location varchar(250) null,
    price double null,
    CONSTRAINT FOREIGN KEY (user_id)
        REFERENCES user (id),
	CONSTRAINT FOREIGN KEY (driver_id)
        REFERENCES user (id)
);


insert into role(id,roleName)
values(01,'admin');

insert into role(id,roleName)
values(02,'driver');

insert into role(id,roleName)
values(03,'user');
