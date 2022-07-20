CREATE DATABASE  IF NOT EXISTS `album` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `album`;
-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: album
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `perfil`
--

DROP TABLE IF EXISTS `perfil`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `perfil` (
  `idPerfil` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) DEFAULT NULL,
  `Apellidos` varchar(45) DEFAULT NULL,
  `Edad` int DEFAULT NULL,
  `NombreUsuario` varchar(45) DEFAULT NULL,
  `Contrasena` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idPerfil`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perfil`
--

LOCK TABLES `perfil` WRITE;
/*!40000 ALTER TABLE `perfil` DISABLE KEYS */;
INSERT INTO `perfil` VALUES (1,'Andrés','Fuentes Corella',19,'andrescr','0000');
/*!40000 ALTER TABLE `perfil` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personajes`
--

DROP TABLE IF EXISTS `personajes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `personajes` (
  `idPersonaje` int NOT NULL,
  `imagen` longblob,
  `bueno` tinyint DEFAULT NULL,
  PRIMARY KEY (`idPersonaje`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personajes`
--

LOCK TABLES `personajes` WRITE;
/*!40000 ALTER TABLE `personajes` DISABLE KEYS */;
INSERT INTO `personajes` VALUES (1,_binary 'C:UsersAndresOneDriveEscritorioGITHUBProyecto1AlbumSOBRESBuenosAnakinSky',1),(2,_binary 'C:UsersAndresOneDriveEscritorioGITHUBProyecto1AlbumSOBRESBuenosC3PO',1),(3,_binary 'C:UsersAndresOneDriveEscritorioGITHUBProyecto1AlbumSOBRESBuenosChewbacca',1),(4,_binary 'C:UsersAndresOneDriveEscritorioGITHUBProyecto1AlbumSOBRESBuenosHanSolo',1),(5,_binary 'C:UsersAndresOneDriveEscritorioGITHUBProyecto1AlbumSOBRESBuenosLukeNiño',1),(6,_binary 'C:UsersAndresOneDriveEscritorioGITHUBProyecto1AlbumSOBRESBuenosObiWanK',1),(7,_binary 'C:UsersAndresOneDriveEscritorioGITHUBProyecto1AlbumSOBRESBuenosPrincesaLeia',1),(8,_binary 'C:UsersAndresOneDriveEscritorioGITHUBProyecto1AlbumSOBRESBuenosquin-gon',1),(9,_binary 'C:UsersAndresOneDriveEscritorioGITHUBProyecto1AlbumSOBRESBuenosR2-D2',1),(10,_binary 'C:UsersAndresOneDriveEscritorioGITHUBProyecto1AlbumSOBRESBuenosYoda',1),(11,_binary 'C:UsersAndresOneDriveEscritorioGITHUBProyecto1AlbumSOBRESMalosBattleDroid',0),(12,_binary 'C:UsersAndresOneDriveEscritorioGITHUBProyecto1AlbumSOBRESMalosCapitanPhasma',0),(13,_binary 'C:UsersAndresOneDriveEscritorioGITHUBProyecto1AlbumSOBRESMalosCapitanRex',0),(14,_binary 'C:UsersAndresOneDriveEscritorioGITHUBProyecto1AlbumSOBRESMalosComandanteBacara',0),(15,_binary 'C:UsersAndresOneDriveEscritorioGITHUBProyecto1AlbumSOBRESMalosDroideka',0),(16,_binary 'C:UsersAndresOneDriveEscritorioGITHUBProyecto1AlbumSOBRESMalosKylo',0),(17,_binary 'C:UsersAndresOneDriveEscritorioGITHUBProyecto1AlbumSOBRESMalosSandTrooper',0),(18,_binary 'C:UsersAndresOneDriveEscritorioGITHUBProyecto1AlbumSOBRESMalosScoutTrooper',0),(19,_binary 'C:UsersAndresOneDriveEscritorioGITHUBProyecto1AlbumSOBRESMalosSnowTrooper',0),(20,_binary 'C:UsersAndresOneDriveEscritorioGITHUBProyecto1AlbumSOBRESMalosStormTrooper',0);
/*!40000 ALTER TABLE `personajes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `postales`
--

DROP TABLE IF EXISTS `postales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `postales` (
  `idPostal` int NOT NULL AUTO_INCREMENT,
  `idPerfil` int DEFAULT NULL,
  `idPersonaje` int DEFAULT NULL,
  `imagen` longblob,
  PRIMARY KEY (`idPostal`),
  KEY `idPerfil_idx` (`idPerfil`),
  KEY `idPersonaje_idx` (`idPersonaje`),
  CONSTRAINT `idPerfil` FOREIGN KEY (`idPerfil`) REFERENCES `perfil` (`idPerfil`),
  CONSTRAINT `idPersonaje` FOREIGN KEY (`idPersonaje`) REFERENCES `personajes` (`idPersonaje`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `postales`
--

LOCK TABLES `postales` WRITE;
/*!40000 ALTER TABLE `postales` DISABLE KEYS */;
/*!40000 ALTER TABLE `postales` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-20 11:02:07
