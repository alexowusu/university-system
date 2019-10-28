package io.turntabl.university;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main<students> {

    public static void main(String[] args) {
        // lecturers
        Lecturer owusu = new Lecturer("owusu", CourseName.INTRO_PROGRAMMING);
        Lecturer ofori = new Lecturer("ofori", CourseName.GARDENING);
        Lecturer lexis = new Lecturer("lexis", CourseName.PHYSICS);

        // write your code here
        List<Student> students = Arrays.asList(
                new Student("alex", 123, Year.FIRST),
                new Student("patricia", 133, Year.FORTH),
                new Student("francis", 143, Year.SECOND),
                new Student("dennis", 153, Year.THIRD),
                new Student("david", 163, Year.FIRST),
                new Student("franklin", 173, Year.SECOND),
                new Student("lexis", 183, Year.THIRD)
        );
        printStudent(students);


        List<Student> firstYearStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getYear() == Year.FIRST) {
                firstYearStudents.add(student);
            }
        }
        Course intro_programing = new Course(owusu, firstYearStudents, CourseYear.FIRST);
        System.out.println(intro_programing);

        List<Student> third_forthYearStudents = new ArrayList<>();

        for (Student student : students) {

            if (student.getYear() == Year.THIRD || student.getYear() == Year.FORTH) {
                third_forthYearStudents.add(student);
            }
        }


        Course gardening = new Course(ofori, third_forthYearStudents, CourseYear.THIRD_FORTH);
        System.out.println( gardening );
    }


    private static void printStudent(List<Student> students) {

    }

}
