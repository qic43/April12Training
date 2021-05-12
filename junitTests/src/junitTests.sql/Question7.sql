
SET @filmId = (
Select f.film_id
From film AS f
WHERE f.title = 'Alien Center');

SET @filmCount = 0;
Call film_in_stock(@filmId, 2, @filmCount);
Select @filmCount;