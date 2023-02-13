package com.ua.java.lesson10;

public class Main {
    public static void main(String[] args) {

        // Teacher and student class
        Student student = new Student("John", "White", 20, "math-1193", 1002);
        student.showStudentsData();
        System.out.println("");
        student.changeCourse("physics-11012B-12");
        student.showStudentsData();

        Student student2 = new Student("John", "Smith", 20, "math-1192", 1001);
        student2.showStudentsData();
        System.out.println("");
        student2.showStudentsData();

        Student student3 = new Student("Student1", "SomeStudent2", 20, "math-1100", 1000);
        student3.showStudentsData();
        System.out.println("");
        student3.showStudentsData();


        Teacher teacher = new Teacher("Alan", "Storm", "101-19", 43, 112);

        teacher.addStudent(student.getId());
        teacher.addStudent(student2.getId());


        if( teacher.isStudentBelongsToTeacher(student2.getId())) {
            System.out.println("The student " + student2.getFirstName() + " " + student2.getLastName() + " belongs to teacher");
        }

        teacher.removeStudent(student2.getId());

        if(!teacher.isStudentBelongsToTeacher(student2.getId())) {
            System.out.println("The student " + student2.getFirstName() + " " + student2.getLastName() + " doesn't belong to teacher");
        }


        if(!teacher.isStudentBelongsToTeacher(student3.getId())) {
            System.out.println("The student " + student3.getFirstName() + " " + student3.getLastName() + " doesn't belong to teacher");
        }

        // Array class

        Array array = new Array(10);

        array.sortArrayAsc();
        array.printArray();
        System.out.println("");
        array.sortArrayDesc();
        array.printArray();

    }
}
