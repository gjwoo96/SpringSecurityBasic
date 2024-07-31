create database eazybank;

use eazybank;

CREATE TABLE `authorities` (
           `id` int(11) NOT NULL AUTO_INCREMENT,
           `username` varchar(45) NOT NULL,
           `authority` varchar(45) NOT NULL,
           PRIMARY KEY (`id`);
        )
CREATE TABLE `users` (
            `id` int(11) NOT NULL AUTO_INCREMENT,
            `username` varchar(45) NOT NULL,
            `password` varchar(45) NOT NULL,
            `enbaled` int(11) NOT NULL,
            PRIMARY KEY (`id`);
        )

insert into users values(null, 'happy','1234','1');
insert into authorities values(null, 'happy','write');