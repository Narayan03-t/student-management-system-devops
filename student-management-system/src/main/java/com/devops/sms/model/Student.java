package com.devops.sms.model;

public class Student {

    private int id;
    private String name;
    private String department;
    private double cgpa;
    private int attendance;
    private int backlogs;
    private boolean assignmentSubmitted;

    public Student(int id, String name, String department,
                   double cgpa, int attendance,
                   int backlogs, boolean assignmentSubmitted) {

        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        this.attendance = attendance;
        this.backlogs = backlogs;
        this.assignmentSubmitted = assignmentSubmitted;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getCgpa() { return cgpa; }
    public int getAttendance() { return attendance; }
    public int getBacklogs() { return backlogs; }
    public boolean isAssignmentSubmitted() { return assignmentSubmitted; }
}
