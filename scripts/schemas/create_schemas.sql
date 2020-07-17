CREATE SCHEMA `person_ad` ;
CREATE SCHEMA `app_ad` ;
CREATE SCHEMA `log_ad` ;

CREATE USER 'person_ad'@'localhost' IDENTIFIED WITH mysql_native_password BY 'person_ad';
CREATE USER 'app_ad'@'localhost' IDENTIFIED WITH mysql_native_password BY 'app_ad';
CREATE USER 'log_ad'@'localhost' IDENTIFIED WITH mysql_native_password BY 'lod_ad';

GRANT ALL ON `person_ad`.* TO 'person_ad'@'localhost';
GRANT ALL ON `app_ad`.* TO 'app_ad'@'localhost';
GRANT ALL ON `log_ad`.* TO 'log_ad'@'localhost';