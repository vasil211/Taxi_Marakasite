drop database if exists taxi;
create database taxi;
Use taxi;


CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    role_id int DEFAULT 300,
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
    date date DEFAULT CURRENT_DATE(),
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

insert into users(type, name, password, first_Name, last_Name, phone, email, egn)
values(3000, "admin1", "$2y$10$xjBoJpe4eDNTPguyggqzI.uyyEcRv91RzFJRTD.1sFF/mREqqXtIi", "admin1", "admin1", 0876547812, "admin1@abv.bg", 0023234115),
(3000, "admin2", "$2y$10$BRXaO6zBARZpiYgm1hJ61.RIwBF2izwj0BGg0F3UDFoQylnIDF7o6", "admin2", "admin2", 0123545231, "admin2@abv.bg", 0123411123),
(2000, "driver1", "$2y$10$ZoMik1XX2UzLkn/k7a73kuft0iZmrd3JVdt5zS8tHy2YWE7OwqlC2", "driver1", "driver1", 012304123, "driver1@abv.bg", 123141111),
(2000, "driver2", "$2y$10$ZoMik1XX2UzLkn/k7a73kuft0iZmrd3JVdt5zS8tHy2YWE7OwqlC2", "driver2", "driver2", 123141111, "driver2@abv.bg", 454112112),
(1000, "user1", "$2y$10$gZ46TTvV8hFVEUMiGH/i.OfDtbii3PHK82FlxxWDDtoylVoFDeRW.", "user1", "user1", 123412312, "user1@abv.bg", 1243141212),
(1000, "user2", "$2y$10$gZ46TTvV8hFVEUMiGH/i.OfDtbii3PHK82FlxxWDDtoylVoFDeRW.", "user2", "user2", 213142211, "user2@abv.bg", 1242145345);

insert into cars(driver_id)
values(03),(04);
 
 insert into rides(user_id,driver_id,rating,car_id)
values(01,02,5,01);
 

