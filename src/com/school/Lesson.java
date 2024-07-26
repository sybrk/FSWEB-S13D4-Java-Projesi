package com.school;

public class Lesson {
    public String name;
    public Teacher teacher;
    public int length;
    public Room room;
    public Student[] students = new Student[0];

    public Lesson(String _name) {
        name = _name;
    }

    public void addStudentToLesson(Student _student) {
        //todo
        Student [] tmpStudents = new Student[students.length];
        System.arraycopy(students, 0, tmpStudents, 0, students.length);
        students = new Student[tmpStudents.length + 1];
        System.arraycopy(tmpStudents,0, students, 0, tmpStudents.length);
        students[students.length -1] = _student;
    }
}
