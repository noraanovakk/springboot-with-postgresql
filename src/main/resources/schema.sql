DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS cities;
CREATE TABLE cities(
    id serial PRIMARY KEY,
    name VARCHAR(255),
    population integer);

CREATE TABLE users(
    id serial PRIMARY KEY,
    name VARCHAR(30),
    age INTEGER,
    city_id BIGINT,
    CONSTRAINT fk_users_cities FOREIGN KEY (city_id) REFERENCES cities(id));

