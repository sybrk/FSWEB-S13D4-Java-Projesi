package com.school;

public class School {
    private String name;
    private int idCounter;
    private String[] students;
    private String[] teachers;
    private String[] rooms;
    private String[] classes;

    public School(String _name) {
        name = _name;
        idCounter = 1;
    }

    public School() {
        name = "Java Developers School";
        idCounter = 1;
    }

    public String getSchoolName() {
        return name;
    }

    public void setSchoolName(String schoolName) {
        name = schoolName;
    }

    public int giveNewId() {
        int newId = idCounter;
        idCounter++;
        return newId;
    }

    public void addStudent(Student _student) {
        //todo
    }

    public void addRoom(Room _room) {
        //todo
    }
    public void addTeacher(Teacher _teacher) {
        //todo
    }
    public void addClass(Class _class) {
        //todo
    }

}
