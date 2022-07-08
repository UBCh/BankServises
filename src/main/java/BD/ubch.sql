-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Хост: 127.0.0.1
-- Время создания: Июл 08 2022 г., 21:09
-- Версия сервера: 5.5.25
-- Версия PHP: 5.2.12

SET FOREIGN_KEY_CHECKS=0;
SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT=0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- База данных: `ubch`
--

-- --------------------------------------------------------

--
-- Структура таблицы `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `id` int(50) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `city` varchar(50) NOT NULL,
  `outside` varchar(50) NOT NULL,
  `house` varchar(30) NOT NULL,
  `flat` varchar(30) NOT NULL,
  `cardNumber` varchar(20) NOT NULL,
  `cvv` int(3) NOT NULL,
  `typeCard` varchar(10) NOT NULL,
  `saving` varchar(20) NOT NULL,
  `secretname` varchar(20) NOT NULL,
  `passw` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `users`
--

INSERT INTO `users` (`id`, `firstname`, `lastname`, `city`, `outside`, `house`, `flat`, `cardNumber`, `cvv`, `typeCard`, `saving`, `secretname`, `passw`) VALUES
(1, 'иванов', 'Иван', 'Москва', 'ленина', '10', '1', '000000000000000000', 123, 'GOLD', '999999667', 'limon', 'limon'),
(10, 'Gaga', 'Ledy', 'Berlin', 'Zero', '10', '3', '11111111111111111', 123, 'GOLD', '19221', 'Kukumber', 'qwerty'),
(755, 'vagCHD', 'XJIZJR', 'ImAPIW', 'rHAAnu', '28', '7', '485977605', 791, 'GOLD', '0', 'XqiEHf', 'gpooJp'),
(8854, 'pLvUMe', 'QaGgYk', 'LbQEld', 'aGLGtT', '1', '2', '907666375', 235, 'GOLD', '0', 'hVlKFG', 'fKpCZQ'),
(98589, 'xFfbVC', 'dQlNBv', 'IkRHUe', 'zkhCCG', '95', '61', '844880107', 972, 'GOLD', '0', 'MgTKBl', 'PDxaJV'),
(67456857, 'fOdbxD', 'yuAzcc', 'HrTNkz', 'DnWESq', '10', '10', '502259722', 162, 'GOLD', '0', 'uWifAV', 'AHCYzz'),
(111172391, 'cEeGDR', 'tlrPFR', 'gEVLro', 'sQyNuK', '10', '10', '839705164', 688, 'GOLD', '0', 'RscDWt', 'fyIkdJ'),
(319443316, 'AVaMjy', 'tDNdDc', 'rOiOyN', 'EECRve', '9', '25', '936725980', 984, 'GOLD', '0', 'JYVQom', 'HjiRVw'),
(365963496, 'iBzmDU', 'BFgpew', 'obQdNu', 'mGfXhj', '59', '19', '387992970', 182, 'GOLD', '0', 'bHWfVV', 'kUfMsb'),
(389004402, 'mdueAn', 'wFAJjO', 'cgdfbr', 'SlBOvq', '30', '96', '417161156', 424, 'GOLD', '0', 'hXebgm', 'NgCCPG'),
(402112801, 'Петр', 'gtnhjd', 'Минск', '99', '2', '1', '103330046', 353, 'GOLD', '0', 'йцукен', 'фывап'),
(817419676, 'CMOMRE', 'sgkNmM', 'hRSutc', 'oUSurI', '57', '7', '903805153', 108, 'GOLD', '0', 'oEKftq', 'HUqSVW'),
(884954862, 'капустина', 'Кристина', 'Москва', 'Мира', '77', '2', '66193432', 871, 'GOLD', '0', 'qwert', 'gladyolus'),
(912013994, 'MnDjZM', 'bIQgHc', 'hCieXy', 'IQTxju', '15', '93', '514154344', 291, 'GOLD', '0', 'rlDjVn', 'mKlXnJ');
SET FOREIGN_KEY_CHECKS=1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
