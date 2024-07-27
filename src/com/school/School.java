package com.school;

public class School {
    private String name;
    public Student[] students = new Student[0];
    public Teacher[] teachers = new Teacher[0];
    public Room[] rooms = new Room[0];
    public Lesson[] lessons = new Lesson[0];

    public School(String _name) {
        name = _name;

    }

    public School() {
        name = "Java Developers School";

    }

    public String getSchoolName() {
        return name;
    }

    public void setSchoolName(String schoolName) {
        name = schoolName;
    }



    public void addStudent(Student _student) {
        //todo
        Student [] tmpStudents = new Student[students.length];
        System.arraycopy(students, 0, tmpStudents, 0, students.length);
        students = new Student[tmpStudents.length + 1];
        System.arraycopy(tmpStudents,0, students, 0, tmpStudents.length);
        students[students.length -1] = _student;
    }

    public void printStudentNames () {
        for ( Student student : students) {
            System.out.println("Öğrenci adı " + student.getName());
        }
    }

    public void addRoom(Room _room) {
        //todo
        Room [] tmpRooms = new Room[rooms.length];
        System.arraycopy(rooms, 0, tmpRooms, 0, rooms.length);
        rooms = new Room[tmpRooms.length + 1];
        System.arraycopy(tmpRooms,0, rooms, 0, tmpRooms.length);
        rooms[rooms.length -1] = _room;
    }
    public void addTeacher(Teacher _teacher) {
        //todo
        Teacher [] tmpTeachers = new Teacher[teachers.length];
        System.arraycopy(teachers, 0, tmpTeachers, 0, teachers.length);
        teachers = new Teacher[tmpTeachers.length + 1];
        System.arraycopy(tmpTeachers,0, teachers, 0, tmpTeachers.length);
        teachers[teachers.length -1] = _teacher;
    }
    public void addLesson(Lesson _lesson) {
        //todo
        Lesson [] tmpLessons = new Lesson[lessons.length];
        System.arraycopy(lessons, 0, tmpLessons, 0, lessons.length);
        lessons = new Lesson[tmpLessons.length + 1];
        System.arraycopy(tmpLessons,0, lessons, 0, tmpLessons.length);
        lessons[lessons.length -1] = _lesson;
    }

    public void getStudentDetails() {
        System.out.println("Below are the students in the school");
        System.out.printf("| %-10s | %-8s | %4s |%n", "NAME", "ID", "ADDRESS");
        for (Student student : students) {
            System.out.printf("| %-10s | %-8s | %4s |%n", student.getName(), student.getId(), student.getAddress());
        }
    }

    public void getTeacherDetails() {
        System.out.println("Below are the teachers in the school");
        System.out.printf("| %-10s | %-8s | %4s |%n", "NAME", "ID", "ADDRESS");
        for (Teacher teacher : teachers) {
            System.out.printf("| %-10s | %-8s | %4s |%n", teacher.getName(), teacher.getId(), teacher.getAddress());
        }
    }

}
