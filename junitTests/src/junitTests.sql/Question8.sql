Start transaction;

INSERT INTO staff(first_name, last_name, address_id, email, store_id, `active`, username)
values ("John", "Doe", "18", "rando@gmail.com", "2", "1", "newJohn");

SET @staffId = last_insert_id();

Insert Into address (address, district, city_id, phone, location)
Values ( '110 Main', 'Dime Box', 300, 713777888, ST_GemoFromText('point(1 1)'));

set @addressId = last_insert_id();

Insert Into store (manager_staff_id, address_id)
values (@staffId, @adddressId);

set @storeId = last_insert_id();

Update staff
Set store_id = @storeId
Where staff_id = @staffId;

RollBack
