package com.freemarker.freemarker.model;

public class Student {
    
    private Integer id;
    private String studentName;
    private double grade;
 
    public Student(Integer id, String studentName, double grade) {
        this.id = id;
        this.studentName = studentName;
        this.grade = grade;
    }
 
    public double getGrade() {
        return grade;
    }
 
    public void setGrade(double grade) {
        this.grade = grade;
    }
 
    public String getStudentName() {
        return studentName;
    }
 
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
 
    public Integer getId() {
 
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 }