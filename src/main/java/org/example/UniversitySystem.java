package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniversitySystem {
    private Map<String, Student> students;

    public UniversitySystem() {
        students = new HashMap<>();
    }

    public void add_student(String studentId, String name) {
        if (!students.containsKey(studentId)) {
            students.put(studentId, new Student(studentId, name));
        } else {
            System.out.println("Student already exists.");
        }
    }

    public void enrollStudentInCourse(String studentId, String courseName) {
        Student student = students.get(studentId);
        if (student == null) {
            System.out.println("Student not found.");
            return;
        }
        student.enrollInCourse(courseName);
    }

    public void add_grade(String studentId, String courseName, double grade) {
        Student student = students.get(studentId);
        if (student == null) {
            System.out.println("Student not found.");
            return;
        }
        student.addGrade(courseName, grade);
    }

    public double calculateAverageGrade(String studentId) {
        Student a = students.get(studentId);
        return a.calculateAverageGrade();
    }

    public void print(String studentId) {
        Student s = students.get(studentId);
        s.print();
    }
}