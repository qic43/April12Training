SELECT * FROM payment
JOIN customer on customer.customer_id = payment.customer_id
where customer.email = 'NANCY.THOMAS@sakilacustomer.org';