/*
Find students enrolled in more than 2 courses using GROUP BY and HAVING.


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
student_id  course_count                                                    
1               3                                                                       
2               3                                                                       


*/
use univ
select s.student_id, count(e.course_id) as course_count  
from Students as s
Join Enrollments as e on s.student_id=e.student_id
Group By s.student_id
Having course_count>2;