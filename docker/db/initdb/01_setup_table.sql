DROP TABLE IF EXISTS characters;
CREATE TABLE IF NOT EXISTS characters (
  id SERIAL PRIMARY KEY,
  age BIGINT NOT NULL,
  jobs VARCHAR (100) NOT NULL,
  username VARCHAR (100) NOT NULL
);

-- INSERT INTO characters (id, age, jobs, username) VALUES
--     (1, 20, 'Engineer', 'Bob'),
--     (2, 999, 'Engineer', 'BobBob');