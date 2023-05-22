CREATE SCHEMA `matriculaidat` DEFAULT CHARACTER SET latin1 COLLATE latin1_spanish_ci ;

CREATE TABLE `matriculaidat`.`curso` (
  `idcurso` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(60) NOT NULL,
  `ciclo` INT NULL,
  `creditos` INT NULL,
  PRIMARY KEY (`idcurso`));
