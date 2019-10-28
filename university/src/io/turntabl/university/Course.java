package io.turntabl.university;

import java.util.List;

public class Course {
   private Lecturer lecturerName;
   private List<Student> studentName;
   private CourseYear courseYear;

    public Course(Lecturer lecturerName, List<Student> studentName, CourseYear courseYear) {
        this.lecturerName = lecturerName;
        this.studentName = studentName;
        this.courseYear = courseYear;
    }

    public Lecturer getLecturerName() {
        return lecturerName;
    }

    public List<Student> getStudentName() {
        return studentName;
    }

    public CourseYear getCourseYear() {
        return courseYear;
    }

    @Override
    public String toString() {
        return "Course{" +
                "lecturerName=" + lecturerName +
                ", studentName=" + studentName +
                ", courseYear=" + courseYear +
                '}';
    }
}
