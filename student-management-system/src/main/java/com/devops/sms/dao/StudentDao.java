package com.devops.sms.dao;

import java.util.ArrayList;
import java.util.List;
import com.devops.sms.model.Student;

public class StudentDao {

    private List<Student> students = new ArrayList<>();

    public void save(Student student) {
        students.add(student);
    }

    public List<Student> findAll() {
        return students;
    }
}
