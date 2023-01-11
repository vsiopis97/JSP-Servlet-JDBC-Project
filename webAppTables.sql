CREATE TABLE `address` (
  `id` int NOT NULL AUTO_INCREMENT,
  `home_address` varchar(255) DEFAULT NULL,
  `work_address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `firstName` varchar(30) DEFAULT NULL,
  `surname` varchar(30) DEFAULT NULL,
  `gender` varchar(1) DEFAULT NULL,
  `birthdate` varchar(15) DEFAULT NULL,
  `address_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKodbgs3aask81yukws94tijx0c` (`address_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
