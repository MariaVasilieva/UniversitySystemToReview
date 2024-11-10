package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String studentId;
    private String name;
    private Map<String, List<Double>> courses;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.courses = new HashMap<>();
    }

    public void enrollInCourse(String courseName) {
        if (!courses.containsKey(courseName)) {
            courses.put(courseName, new ArrayList<>());
        } else {
            System.out.println("Student already enrolled in this course.");
        }
    }

    public void addGrade(String courseName, double grade) {
        List<Double> grades = courses.get(courseName);
        if (grades != null) {
            grades.add(grade);
        } else {
            System.out.println("Student is not enrolled in this course.");
        }
    }

    public double calculateAverageGrade() {
        double total = 0;
        int count = 0;
        for (List<Double> grades : courses.values()) {
            for (double grade : grades) {
                total += grade;
                count++;
            }
        }
        return count == 0 ? 0 : total / count;
    }

    public void print() {
        System.out.println("Courses for " + name + ":");
        for (Map.Entry<String, List<Double>> entry : courses.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

