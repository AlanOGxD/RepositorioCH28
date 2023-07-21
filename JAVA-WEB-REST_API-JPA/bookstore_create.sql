-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema bookstore
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bookstore
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bookstore` DEFAULT CHARACTER SET utf8 ;
USE `bookstore` ;

-- -----------------------------------------------------
-- Table `bookstore`.`User`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bookstore`.`User` (
  `user_id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(25) NOT NULL,
  `password` VARCHAR(30) NOT NULL,
  `rol` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`user_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bookstore`.`Genre`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bookstore`.`Genre` (
  `genre_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(35) NOT NULL,
  PRIMARY KEY (`genre_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bookstore`.`Book`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bookstore`.`Book` (
  `book_id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(250) NOT NULL,
  `isbn` VARCHAR(20) NOT NULL,
  `publish_date` DATE NOT NULL,
  `stock` TINYINT ZEROFILL NOT NULL,
  `Genre_genre_id` INT NOT NULL,
  PRIMARY KEY (`book_id`),
  INDEX `fk_Book_Genre1_idx` (`Genre_genre_id` ASC) VISIBLE,
  CONSTRAINT `fk_Book_Genre1`
    FOREIGN KEY (`Genre_genre_id`)
    REFERENCES `bookstore`.`Genre` (`genre_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bookstore`.`Author`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bookstore`.`Author` (
  `author_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `birthdate` DATE NOT NULL,
  `nationality` VARCHAR(70) NOT NULL,
  PRIMARY KEY (`author_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bookstore`.`Book_has_Author`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bookstore`.`Book_has_Author` (
  `Book_book_id` INT NOT NULL,
  `Author_author_id` INT NOT NULL,
  INDEX `fk_Book_has_Author_Author1_idx` (`Author_author_id` ASC) VISIBLE,
  INDEX `fk_Book_has_Author_Book_idx` (`Book_book_id` ASC) VISIBLE,
  CONSTRAINT `fk_Book_has_Author_Book`
    FOREIGN KEY (`Book_book_id`)
    REFERENCES `bookstore`.`Book` (`book_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Book_has_Author_Author1`
    FOREIGN KEY (`Author_author_id`)
    REFERENCES `bookstore`.`Author` (`author_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bookstore`.`User_has_Book`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bookstore`.`User_has_Book` (
  `User_user_id` INT NOT NULL,
  `Book_book_id` INT NOT NULL,
  INDEX `fk_User_has_Book_Book1_idx` (`Book_book_id` ASC) VISIBLE,
  INDEX `fk_User_has_Book_User1_idx` (`User_user_id` ASC) VISIBLE,
  CONSTRAINT `fk_User_has_Book_User1`
    FOREIGN KEY (`User_user_id`)
    REFERENCES `bookstore`.`User` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_User_has_Book_Book1`
    FOREIGN KEY (`Book_book_id`)
    REFERENCES `bookstore`.`Book` (`book_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
