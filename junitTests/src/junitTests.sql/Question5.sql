SELECT SUM(amount) FROM payment
left JOIN customer
on customer.email = 'NANCY.THOMAS@sakilacustomer.org';