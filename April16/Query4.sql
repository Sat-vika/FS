/*
Write a query to find students who have a kmec.com email address.


---------------
Database Schema
---------------

Students (
    student_id INT PRIMARY KEY,
    name VARCHAR(50),
    email VARCHAR(100),
    enrollment_year INT
);

Courses (
    course_id INT PRIMARY KEY,
    course_name VARCHAR(100),
    instructor VARCHAR(50)
);

Enrollments (
    enrollment_id INT PRIMARY KEY,
    student_id INT,
    course_id INT,
    grade CHAR(1),
    FOREIGN KEY (student_id) REFERENCES Students(student_id),
    FOREIGN KEY (course_id) REFERENCES Courses(course_id)
);


Sample Output:
--------------
student_id      name    email           enrollment_year 
1               Alice   alice@kmec.com      2023                                            


*/
use univ;
SELECT * FROM Students
WHERE email like "%kmec.com";