package com.school;

public class Room {
    public String name;
    public Lesson[] lessons = new Lesson[0];

    public Room(String _name) {
        name = _name;
    }

    public void addLessonToRoom(Lesson _lesson) {
        Lesson [] tmpLessons = new Lesson[lessons.length];
        System.arraycopy(lessons, 0, tmpLessons, 0, lessons.length);
        lessons = new Lesson[tmpLessons.length + 1];
        System.arraycopy(tmpLessons,0, lessons, 0, tmpLessons.length);
        lessons[lessons.length -1] = _lesson;
    }
}
