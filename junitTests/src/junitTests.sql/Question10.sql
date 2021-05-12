START transaction;
SET SQL_SAFE_UPDATES = 0;

DELETE s.* From store AS s
Inner Join address AS a ON a.address_id = s.address_id
Where a.address = '110 Main';

Set SQL_SAFE_UPDATES = 1;

ROLLBACK;