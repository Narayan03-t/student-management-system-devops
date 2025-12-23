package com.devops.sms.app;

import com.devops.sms.service.StudentService;

public class StudentManagementApp {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        service.enrollStudent(1, "Rahul", "CSE", 8.2, 92, 0, true);
        service.enrollStudent(2, "Anita", "ECE", 7.5, 85, 1, true);
        service.enrollStudent(3, "Aman", "CSE", 6.8, 78, 2, false);
        service.enrollStudent(4, "Neha", "IT", 8.9, 95, 0, true);
        service.enrollStudent(5, "Ravi", "ME", 6.2, 70, 3, false);
        service.enrollStudent(6, "Priya", "CSE", 9.1, 98, 0, true);
        service.enrollStudent(7, "Kunal", "ECE", 7.0, 82, 1, true);
        service.enrollStudent(8, "Swati", "IT", 8.4, 88, 0, true);
        service.enrollStudent(9, "Vikas", "CE", 6.5, 75, 2, false);
        service.enrollStudent(10, "Pooja", "CSE", 9.3, 99, 0, true);

        service.showStudents();
    }
}
