/*
Write a query to find students enrolled in the course having course ID is 101.


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
student_id  name    email           enrollment_year                                 
1           Alice   alice@kmec.com  2023                                            
2           Bob     bob@ngit.com    2022                                            

*/
use univ;
select s.student_id,s.name,s.email,s.enrollment_year 
From Students as s
JOIN Enrollments as e on s.student_id=e.student_id
JOIN Courses as c on c. course_id=e. course_id
WHERE c. course_id=101;