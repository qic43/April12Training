DELIMITER //

CREATE PROCEDURE Store2()
BEGIN
	SELECT inventory_id FROM inventory
    inner join film on title = 'Alien Center'
    Limit 4;
END //

DELIMITER ;

CALL Store2()