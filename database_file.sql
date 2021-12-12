-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 12, 2021 at 07:29 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `Mobile_project_final`
--

-- --------------------------------------------------------

--
-- Table structure for table `Reservations`
--

CREATE TABLE `Reservations` (
  `id` int(11) NOT NULL,
  `date` varchar(250) NOT NULL,
  `time` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `Reservations`
--

INSERT INTO `Reservations` (`id`, `date`, `time`) VALUES
(1, '10/28/2021', '4:12 PM'),
(2, '12/16/2020', '9:17 AM'),
(3, '12/29/2020', '12:17 PM'),
(4, '2/23/2021', '12:35 AM'),
(5, '3/26/2021', '9:06 AM'),
(6, '4/2/2021', '11:02 AM'),
(7, '5/23/2021', '1:22 AM'),
(8, '2/14/2021', '6:06 AM'),
(9, '8/13/2021', '6:25 AM'),
(10, '5/22/2021', '1:42 AM'),
(11, '6/11/2021', '5:06 AM'),
(12, '1/21/2021', '11:39 AM'),
(13, '7/15/2021', '12:57 PM'),
(14, '7/8/2021', '1:19 AM'),
(15, '1/9/2021', '8:05 AM'),
(16, '7/29/2021', '7:15 AM'),
(17, '11/9/2021', '2:48 AM'),
(18, '9/28/2021', '4:05 AM'),
(19, '1/18/2021', '4:38 PM'),
(20, '12/26/2020', '8:12 AM'),
(21, '7/14/2021', '11:27 AM'),
(22, '9/12/2021', '6:11 AM'),
(23, '3/29/2021', '2:34 AM'),
(24, '8/17/2021', '8:51 AM');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `username` varchar(250) NOT NULL,
  `password` varchar(250) NOT NULL,
  `phone` int(11) NOT NULL,
  `city` varchar(250) NOT NULL,
  `address` varchar(250) NOT NULL,
  `Floor` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`username`, `password`, `phone`, `city`, `address`, `Floor`) VALUES
('ah', '4fc82b26aecb47d2868c4efbe3581732a3e7cbcc6c2efb32062c08170a05eeb8', 828, 'gshs', 'gsg', 1),
('arslan', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', 71390051, 'neirut', 'bork', 1),
('jad', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', 71390062, 'beirut', 'firtsde', 1),
('jad1', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', 1, 'beirut', 'firtsde', 1),
('jad10', 'e7f6c011776e8db7cd330b54174fd76f7d0216b612387a5ffcfb81e6f0919683', 6, 'uy', 'y', 2),
('jad2', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', 71390062, 'beirut', 'firtsde', 1),
('jad3', '043a718774c572bd8a25adbeb1bfcd5c0256ae11cecf9f9c3f925d0e52beaf89', 71390062, 'beirut', 'firtsde', 1),
('jad4', '043a718774c572bd8a25adbeb1bfcd5c0256ae11cecf9f9c3f925d0e52beaf89', 71390062, 'beirut', 'firtsde', 1),
('jad6', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', 12, 'yf', 'fy', 4),
('jadw1', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', 1, 'ds', 'ddc', 5),
('khodor', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', 71390062, 'beirut', 'firtsde', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Reservations`
--
ALTER TABLE `Reservations`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Reservations`
--
ALTER TABLE `Reservations`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
