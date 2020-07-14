## Part 1: Test it with SQL
id INT AUTO_INCREMENT PRIMARY KEY,
employer VARCHAR(255),
name VARCHAR(255),
skill VARCHAR(255)

## Part 2: Test it with SQL
SELECT * FROM techjobs.employer WHERE location="St. Louis City"

## Part 3: Test it with SQL
DROP TABLE job

## Part 4: Test it with SQL
SELECT id, name, description
FROM skill
ORDER BY name, description ASC;