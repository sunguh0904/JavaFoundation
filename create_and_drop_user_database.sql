-- 데이터베이스 생성 권한 주기  
GRANT CREATE ON *.* To 'ohgiraffers'@'%';
DROP DATABASE IF EXISTS BOOT;
DROP USER IF EXISTS 'BOOT'@'%';
CREATE DATABASE BOOT;
USE BOOT;
CREATE USER 'BOOT'@'%' IDENTIFIED BY 'BOOT';
GRANT ALL PRIVILEGES ON BOOT.* TO 'BOOT'@'%';
SHOW GRANTS FOR 'BOOT'@'%';