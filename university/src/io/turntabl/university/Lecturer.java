package io.turntabl.university;

public class Lecturer {
    private String name;
    private CourseName course;

    public Lecturer(String name, CourseName course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public CourseName getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}


