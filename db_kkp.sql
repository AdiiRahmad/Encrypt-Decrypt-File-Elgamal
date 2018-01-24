# Host: localhost  (Version: 5.1.41)
# Date: 2016-08-09 10:48:53
# Generator: MySQL-Front 5.3  (Build 4.186)

/*!40101 SET NAMES latin1 */;

#
# Structure for table "laporan"
#

DROP TABLE IF EXISTS `laporan`;
CREATE TABLE `laporan` (
  `kd_file` char(4) NOT NULL DEFAULT '0',
  `namaFile` varchar(255) DEFAULT NULL,
  `Ukuran` varchar(255) DEFAULT NULL,
  `Proses` varchar(255) DEFAULT NULL,
  `Waktu` varchar(255) DEFAULT NULL,
  `kd_user` char(4) DEFAULT NULL,
  PRIMARY KEY (`kd_file`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

#
# Data for table "laporan"
#

/*!40000 ALTER TABLE `laporan` DISABLE KEYS */;
INSERT INTO `laporan` VALUES ('F001','coba txt.txt','2.0','Enkripsi','1.297','P002'),('F002','enc.coba txt.txt','16.0','Dekripsi','4.851','P002'),('F003','coba excel.xls','28.0','Enkripsi','13.266','P001'),('F004','enc.coba excel.xls','176.0','Dekripsi','14.297','P001'),('F005','coba txt.txt','2.0','Enkripsi','1.59','P001'),('F006','abc.txt','0.0','Enkripsi','0.062','P001'),('F007','coba excel.xls','28.0','Enkripsi','34.177','P001'),('F008','coba excel.xls','28.0','Enkripsi','17.563','P001'),('F009','enc.coba excel.xls','167.0','Dekripsi','169.08','P001');
/*!40000 ALTER TABLE `laporan` ENABLE KEYS */;

#
# Structure for table "user"
#

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `kd_user` char(4) NOT NULL DEFAULT '',
  `User` varchar(255) NOT NULL DEFAULT '',
  `Password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`kd_user`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

#
# Data for table "user"
#

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('P001','User','123'),('P002','boy','123');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
