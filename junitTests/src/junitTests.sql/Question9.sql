Start TRANSACTION;

Set Sql_safe_updates = 0;

Update store As s
Inner Join address AS a on a.address_id = s.address_id
Set s.last_update = CURDATE()
Where a.address = '110 Main';

Set SQL_SAFE_UPDATES = 1;

ROllBACK;