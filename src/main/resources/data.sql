INSERT INTO cities(name, population) VALUES('Bratislava', 432000);
INSERT INTO cities(name, population) VALUES('Budapest', 1759000);
INSERT INTO cities(name, population) VALUES('Prague', 1280000);
INSERT INTO cities(name, population) VALUES('Warsaw', 1748000);
INSERT INTO cities(name, population) VALUES('Los Angeles', 3971000);
INSERT INTO cities(name, population) VALUES('New York', 8550000);
INSERT INTO cities(name, population) VALUES('Edinburgh', 464000);
INSERT INTO cities(name, population) VALUES('Berlin', 3671000);

INSERT INTO users(name, age, city_id) VALUES ('John Doe', 32, (SELECT c.id FROM cities c WHERE c.name = 'Prague'));
INSERT INTO users(name, age, city_id) VALUES ('Jane Doe', 25, (SELECT c.id FROM cities c WHERE c.name = 'Prague'));
INSERT INTO users(name, age, city_id) VALUES ('Bob Burger', 40, (SELECT c.id FROM cities c WHERE c.name = 'Berlin'));
INSERT INTO users(name, age, city_id) VALUES ('Peter Pan', 12, (SELECT c.id FROM cities c WHERE c.name = 'Budapest'));
INSERT INTO users(name, age, city_id) VALUES ('Kelly Cow', 6, (SELECT c.id FROM cities c WHERE c.name = 'Warsaw'));
INSERT INTO users(name, age, city_id) VALUES ('Steven Hawking', 55, (SELECT c.id FROM cities c WHERE c.name = 'Berlin'));
INSERT INTO users(name, age, city_id) VALUES ('Edward Teller', 60, (SELECT c.id FROM cities c WHERE c.name = 'Prague'));
INSERT INTO users(name, age, city_id) VALUES ('Steven King', 77, (SELECT c.id FROM cities c WHERE c.name = 'Budapest'));