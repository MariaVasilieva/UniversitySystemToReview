package org.example;

public class Main {
    public static void main(String[] args) {
        // Створення системи університету
        UniversitySystem university = new UniversitySystem();

        // Додавання студентів
        university.add_student("S001", "Olexandr Petrenko");
        university.add_student("S002", "Katerina Vasilenko");

        // Реєстрація студентів на курси
        university.enrollStudentInCourse("S001", "Mathematics");
        university.enrollStudentInCourse("S001", "Physics");
        university.enrollStudentInCourse("S002", "Chemistry");

        // Додавання оцінок
        university.add_grade("S001", "Mathematics", 90.5);
        university.add_grade("S001", "Physics", 85.0);
        university.add_grade("S002", "Chemistry", 92.0);

        // Обчислення середньої оцінки
        System.out.println("Average grade for S001: " + university.calculateAverageGrade("S001"));
        System.out.println("Average grade for S002: " + university.calculateAverageGrade("S002"));

        // Виведення інформації про студентів
        university.print("S001");
        university.print("S002");
    }
}
