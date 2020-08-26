/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.5.5-10.1.8-MariaDB : Database - jdbc
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`jdbc` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `jdbc`;

/*Table structure for table `cust_detail` */

DROP TABLE IF EXISTS `cust_detail`;

CREATE TABLE `cust_detail` (
  `name` varchar(30) NOT NULL,
  `adhar` bigint(40) unsigned NOT NULL,
  `mobile` bigint(40) unsigned NOT NULL,
  `copassenger_no` int(10) unsigned NOT NULL,
  `home_city` varchar(20) DEFAULT NULL,
  `booking_id` bigint(40) unsigned NOT NULL,
  PRIMARY KEY (`booking_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cust_detail` */

insert  into `cust_detail`(`name`,`adhar`,`mobile`,`copassenger_no`,`home_city`,`booking_id`) values ('ABC',5565248564585,9874563210,3,'pune',584697),('Rohit',785696854123,9876543210,12,'Nagpur',726147),('Akash',785645217632,8745632145,7,'Latur',7079382),('Saurabh',784596324510,7856413290,9,'Akola',7342909);

/*Table structure for table `inside_pune` */

DROP TABLE IF EXISTS `inside_pune`;

CREATE TABLE `inside_pune` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `distance` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;

/*Data for the table `inside_pune` */

insert  into `inside_pune`(`id`,`name`,`distance`) values (1,'Shaniwar Wada',0),(2,'Aga Khan Palace',6),(3,'Dagdusheth Halwai Ganpati',0),(4,'Osho Ashram',4),(5,'Vetal Tekdi',4),(6,'Lal Mahal',0),(7,'Raja Dinakar Kelkar Museum',1),(8,'National Defence Academy',12),(9,'Vishrambaug Wada',1),(10,'Katraj Snake Park',7),(11,'Okayama Friendship Garden',4),(12,'Joshi Museum',4),(13,'Parvati Hill Temple',4),(14,'Khadakwasla Dam',13),(15,'Sinhagad Fort',20),(16,'National War Museum',3),(17,'Bund garden',4),(18,'Mulshi Lake Dam',36),(19,'Panshet Water Park',1),(20,'Saras Garden',2),(21,'Mahatma Phule Museum',1),(22,'Shree Balaji Mandir',7);

/*Table structure for table `list` */

DROP TABLE IF EXISTS `list`;

CREATE TABLE `list` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `list` */

insert  into `list`(`id`,`name`) values (1,'A'),(2,'B'),(3,'C'),(4,'D'),(5,'E'),(6,'F');

/*Table structure for table `outside_pune` */

DROP TABLE IF EXISTS `outside_pune`;

CREATE TABLE `outside_pune` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `distance` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;

/*Data for the table `outside_pune` */

insert  into `outside_pune`(`id`,`name`,`distance`) values (1,'Lonavla',69),(2,'Mumbai',150),(3,'Matheran',80),(4,'Mahabaleshwar',130),(5,'Lavasa',57),(6,'Khandala',71),(7,'Panchgani',112),(8,'Alibag',144),(9,'Rajmachi',84),(10,'Ajanta and Ellora',256),(11,'Shirdi',186),(12,'Bhandardara',172),(13,'Kolad',146),(14,'Nashik',212),(15,'Raigad',128),(16,'Malshej Ghat',121),(19,'Ganpatipule',348);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
