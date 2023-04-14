-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 03, 2023 at 06:10 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbparkir`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbparkir`
--

CREATE TABLE `tbparkir` (
  `PLAT` varchar(10) DEFAULT NULL,
  `NIM` varchar(10) DEFAULT NULL,
  `JN_KENDARAAN` varchar(10) DEFAULT NULL,
  `WAKTU_IN` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbparkir`
--

INSERT INTO `tbparkir` (`PLAT`, `NIM`, `JN_KENDARAAN`, `WAKTU_IN`) VALUES
('BK304 LK', '2005102026', 'MOTOR', 'Fri Feb 03 11:51:58 ICT 2023'),
('BK 123 AC', '2005101014', 'MOBIL', 'Fri Mar 03 00:54:00 ICT 2023');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
