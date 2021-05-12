CREATE VIEW FilmInfoOfBobFawcett AS
SELECT DISTINCT film.film_id, film.title, film.description, film.release_year, 
film.language_id,film.original_language_id, film.rental_duration, film.rental_rate,
film.length, film.replacement_cost, film.rating, film.special_features FROM film
Inner JOIN film_actor
on film_actor.film_id = film.film_id 
Inner JOIN actor on actor.actor_id = film_actor.actor_id 
AND actor.first_name = 'Bob' And actor.last_name = 'Fawcett';

Select film_info FROM actor_info
where first_name = 'BOB'
AND last_name = 'FAWCETT';