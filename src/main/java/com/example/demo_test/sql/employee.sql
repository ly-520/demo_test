CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `company` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4;


INSERT INTO `employee`(`id`, `name`, `phone`, `email`, `age`, `company`) VALUES (1, '张三', '15036890102', '15036890102@163.com', 24, '天天户外');
INSERT INTO `employee`(`id`, `name`, `phone`, `email`, `age`, `company`) VALUES (2, '李四', '15036890103', '15036890103@163.com', 25, 'Tgroup工作室');
INSERT INTO `employee`(`id`, `name`, `phone`, `email`, `age`, `company`) VALUES (3, '王二', '15036890104', '15036890104@163.com', 58, '天天户外俱乐部');
INSERT INTO `employee`(`id`, `name`, `phone`, `email`, `age`, `company`) VALUES (4, '麻子', '15036890108', '15036890108@163.com', 18, '天天户外旗舰店');
INSERT INTO `employee`(`id`, `name`, `phone`, `email`, `age`, `company`) VALUES (5, '翠花', '15036890125', '15036890125@163.com', 16, '野渡无人');