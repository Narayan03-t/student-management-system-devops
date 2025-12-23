package com.devops.sms.repository;

import java.util.ArrayList;
import java.util.List;
import com.devops.sms.model.Student;

public class StudentRepository {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getAllStudents() {
        return students;
    }
}
