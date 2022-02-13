CREATE TABLE activities (
    id INT AUTO_INCREMENT,
    start_time DATETIME,
    activity_desc VARCHAR(255),
    activity_type ENUM('BIKING', 'HIKING', 'RUNNING', 'BASKETBALL'),
    PRIMARY KEY (id)
);
