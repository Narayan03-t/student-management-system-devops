package com.devops.sms.service;

import com.devops.sms.model.Student;
import com.devops.sms.repository.StudentRepository;

public class StudentService {

    private StudentRepository repository = new StudentRepository();

    public void enrollStudent(int id, String name, String dept,
                              double cgpa, int attendance,
                              int backlogs, boolean assignmentSubmitted) {

        Student student = new Student(
                id, name, dept, cgpa,
                attendance, backlogs, assignmentSubmitted
        );

        repository.addStudent(student);
    }

    public void showStudents() {

        System.out.println("-------------------------------------------------------------");
        System.out.println("ID | Name     | Dept | CGPA | Attendance | Backlogs | Assignment");
        System.out.println("-------------------------------------------------------------");

        for (Student s : repository.getAllStudents()) {
            System.out.printf(
                    "%-2d | %-8s | %-4s | %.2f | %-10d | %-8d | %s%n",
                    s.getId(),
                    s.getName(),
                    s.getDepartment(),
                    s.getCgpa(),
                    s.getAttendance(),
                    s.getBacklogs(),
                    s.isAssignmentSubmitted() ? "Submitted" : "Pending"
            );
        }

        System.out.println("-------------------------------------------------------------");
    }
}
