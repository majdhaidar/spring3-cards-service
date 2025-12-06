CREATE TABLE IF NOT EXISTS `cards` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `mobile_number` varchar(15) NOT NULL,
    `card_number` varchar(100) NOT NULL,
    `card_type` varchar(100) NOT NULL,
    `total_limit` int NOT NULL,
    `amount_used` int NOT NULL,
    `available_amount` int NOT NULL,
    `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_at` timestamp DEFAULT CURRENT_TIMESTAMP,
    `created_by` varchar(20) NOT NULL,
    `updated_by` varchar(20) DEFAULT NULL,
    PRIMARY KEY (`id`)
    );