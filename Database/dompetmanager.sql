-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 07, 2018 at 02:09 PM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 7.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dompetmanager`
--

-- --------------------------------------------------------

--
-- Table structure for table `kategori`
--

CREATE TABLE `kategori` (
  `id_kategori` int(3) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `icon` varchar(100) DEFAULT NULL,
  `tipe` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kategori`
--

INSERT INTO `kategori` (`id_kategori`, `nama`, `icon`, `tipe`) VALUES
(1, 'Pakaian', 'Baju', 'Pemasukan'),
(2, 'Makanan', 'no Icon', 'Pengeluaran'),
(3, 'Gaji', 'no Icon', 'Pemasukan');

-- --------------------------------------------------------

--
-- Table structure for table `penyimpanan`
--

CREATE TABLE `penyimpanan` (
  `id_penyimpanan` int(3) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `catatan` varchar(255) DEFAULT NULL,
  `saldo_awal` int(10) NOT NULL,
  `saldo_akhir` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penyimpanan`
--

INSERT INTO `penyimpanan` (`id_penyimpanan`, `nama`, `catatan`, `saldo_awal`, `saldo_akhir`) VALUES
(1, 'andra', '', 0, 0),
(2, 'rizki', '', 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `rencana_belanja`
--

CREATE TABLE `rencana_belanja` (
  `id_rencana` int(5) NOT NULL,
  `nama_item` varchar(100) NOT NULL,
  `harga` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` int(3) NOT NULL,
  `id_Kategori` int(3) DEFAULT NULL,
  `id_penyimpanan` int(3) DEFAULT NULL,
  `tipe` varchar(20) NOT NULL,
  `tanggal` date DEFAULT NULL,
  `catatan` varchar(255) DEFAULT NULL,
  `jumlah` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `transfer`
--

CREATE TABLE `transfer` (
  `id_transfer` int(3) NOT NULL,
  `id_asal` int(3) NOT NULL,
  `id_tujuan` int(3) NOT NULL,
  `jumlah` int(10) NOT NULL,
  `deskripsi` varchar(255) DEFAULT NULL,
  `tanggal` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kategori`
--
ALTER TABLE `kategori`
  ADD PRIMARY KEY (`id_kategori`);

--
-- Indexes for table `penyimpanan`
--
ALTER TABLE `penyimpanan`
  ADD PRIMARY KEY (`id_penyimpanan`);

--
-- Indexes for table `rencana_belanja`
--
ALTER TABLE `rencana_belanja`
  ADD PRIMARY KEY (`id_rencana`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`),
  ADD KEY `id_Kategori` (`id_Kategori`),
  ADD KEY `id_penyimpanan` (`id_penyimpanan`);

--
-- Indexes for table `transfer`
--
ALTER TABLE `transfer`
  ADD PRIMARY KEY (`id_transfer`),
  ADD KEY `id_asal` (`id_asal`),
  ADD KEY `id_tujuan` (`id_tujuan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `kategori`
--
ALTER TABLE `kategori`
  MODIFY `id_kategori` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `penyimpanan`
--
ALTER TABLE `penyimpanan`
  MODIFY `id_penyimpanan` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `rencana_belanja`
--
ALTER TABLE `rencana_belanja`
  MODIFY `id_rencana` int(5) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id_transaksi` int(3) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `transfer`
--
ALTER TABLE `transfer`
  MODIFY `id_transfer` int(3) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`id_Kategori`) REFERENCES `kategori` (`id_kategori`),
  ADD CONSTRAINT `transaksi_ibfk_2` FOREIGN KEY (`id_penyimpanan`) REFERENCES `penyimpanan` (`id_penyimpanan`);

--
-- Constraints for table `transfer`
--
ALTER TABLE `transfer`
  ADD CONSTRAINT `transfer_ibfk_1` FOREIGN KEY (`id_asal`) REFERENCES `penyimpanan` (`id_penyimpanan`),
  ADD CONSTRAINT `transfer_ibfk_2` FOREIGN KEY (`id_tujuan`) REFERENCES `penyimpanan` (`id_penyimpanan`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
