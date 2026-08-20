-- ==============================================================
-- SQL Fundamentals (Preparation for Java JDBC)
-- ==============================================================

-- 1. CREATE DATABASE
-- Drops it first if you want a clean slate
DROP DATABASE IF EXISTS java_jdbc;
CREATE DATABASE java_jdbc;

-- Switch to the database (syntax varies by RDBMS, this is for PostgreSQL/MySQL)
-- \c java_jdbc (PostgreSQL)
-- USE java_jdbc; (MySQL)

-- 2. CREATE TABLE
-- Defines the structure of the table.
-- Primary Key uniquely identifies a row. Auto_Increment/Serial generates IDs automatically.
CREATE TABLE student (
    id SERIAL PRIMARY KEY, -- Use AUTO_INCREMENT in MySQL
    name VARCHAR(100) NOT NULL,
    age INT,
    course VARCHAR(100)
);

-- Creating a secondary table to demonstrate Foreign Keys and JOINs
CREATE TABLE course_details (
    course_name VARCHAR(100) PRIMARY KEY,
    instructor VARCHAR(100),
    credits INT
);

-- 3. INSERT DATA
-- Single Insert
INSERT INTO course_details (course_name, instructor, credits) 
VALUES ('Java Backend', 'Mr. Navin', 4);

-- Multiple Insert
INSERT INTO course_details (course_name, instructor, credits) VALUES 
('Python Data Science', 'Ms. Smith', 3),
('Frontend Dev', 'Mr. Harsh', 3);

-- Inserting students
INSERT INTO student (name, age, course) VALUES 
('Asfin', 22, 'Java Backend'),
('Rohan', 20, 'Python Data Science'),
('Kiran', 23, 'Java Backend'),
('Sushil', 21, 'Frontend Dev');

-- 4. SELECT (Read Data)
-- Select all columns
SELECT * FROM student;

-- Select specific columns
SELECT name, course FROM student;

-- 5. WHERE (Filtering)
SELECT * FROM student WHERE age > 21;
SELECT * FROM student WHERE course = 'Java Backend';

-- 6. UPDATE (Modify Data)
-- ALWAYS use a WHERE clause with UPDATE, or you will update every row!
UPDATE student SET age = 24 WHERE name = 'Kiran';

-- 7. DELETE (Remove Data)
-- ALWAYS use a WHERE clause with DELETE!
DELETE FROM student WHERE name = 'Sushil';

-- 8. ORDER BY (Sorting)
SELECT * FROM student ORDER BY age DESC; -- Descending order
SELECT * FROM student ORDER BY name ASC; -- Ascending order

-- 9. AGGREGATE FUNCTIONS & GROUP BY
-- Count total students
SELECT COUNT(*) FROM student;

-- Find average age
SELECT AVG(age) FROM student;

-- Group By: Count how many students are in each course
SELECT course, COUNT(*) as student_count 
FROM student 
GROUP BY course;

-- 10. HAVING (Filtering Grouped Data)
-- Like WHERE, but applied after GROUP BY
SELECT course, COUNT(*) as student_count 
FROM student 
GROUP BY course 
HAVING COUNT(*) >= 2;

-- 11. JOIN (Combining Tables)
-- We want to see student details ALONG with their instructor details.
SELECT s.name, s.age, s.course, c.instructor, c.credits
FROM student s
JOIN course_details c ON s.course = c.course_name;
