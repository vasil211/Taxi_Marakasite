drop database if exists taxi;
create database taxi;
Use taxi;

CREATE TABLE role (
    id INT AUTO_INCREMENT PRIMARY KEY,
    role_Name VARCHAR(20) NOT NULL
);

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    role_id int DEFAULT 03,
    user_Name VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL,
    first_Name VARCHAR(50) NOT NULL,
    last_Name VARCHAR(50) NOT NULL,
    phone INT UNIQUE, 
    email VARCHAR(50) NOT NULL UNIQUE,
    EGN INT NOT NULL UNIQUE,
    registration DATETIME DEFAULT CURRENT_TIMESTAMP,
    rating_Of_Driver double null,
    state_Of_Driver smallint null,
    CONSTRAINT FOREIGN KEY (role_id)
        REFERENCES role (id)
);

create TABLE cars(
  id INT AUTO_INCREMENT PRIMARY KEY,
  driver_id int null,
  CONSTRAINT FOREIGN KEY (driver_id)
        REFERENCES users (id)
);

CREATE TABLE rides (
    id INT AUTO_INCREMENT PRIMARY KEY,
	user_id INT NOT NULL,
    driver_id int not null,
    rating double null,
    car_id int not null,
    time_Of_Order TIME null,
    time_Of_Start Time null,
    time_Of_End Time null,
    date DATETIME DEFAULT CURRENT_TIMESTAMP,
    ride_State smallint NOT NULL,
    start_Location varchar(250) null,
    end_Location varchar(250) null,
    price double null,
    CONSTRAINT FOREIGN KEY (user_id)
        REFERENCES users (id),
	CONSTRAINT FOREIGN KEY (driver_id)
        REFERENCES users (id),
	CONSTRAINT FOREIGN KEY (car_id)
        REFERENCES cars (id)
);



insert into role(id,role_Name)
values(01,'admin');

insert into role(id,role_Name)
values(02,'driver');

insert into role(id,role_Name)
values(03,'userDao');

insert into users(role_id, user_Name, password, first_Name, last_Name, phone, email, egn)
values(01, "admin1", "e00cf25ad42683b3df678c61f42c6bda", "admin1", "admin1", 0876547812, "admin1@abv.bg", 0023234115),
(01, "admin2", "c84258e9c39059a89ab77d846ddab909", "admin2", "admin2", 0123545231, "admin2@abv.bg", 0123411123),
(02, "driver1", "b85aef08608180db9d4ddad38ae40545", "driver1", "driver1", 012304123, "driver1@abv.bg", 123141111),
(02, "driver2", "d95784faa6597a0253e483e500ced3ee", "driver2", "driver2", 123141111, "driver2@abv.bg", 454112112),
(03, "user1", "24c9e15e52afc47c225b757e7bee1f9d", "user1", "user1", 123412312, "user1@abv.bg", 1243141212),
(03, "user2", "7e58d63b60197ceb55a1c487989a3720", "user2", "user2", 213142211, "user2@abv.bg", 1242145345);

insert into cars(driver_id)
values(03),(04);
 

