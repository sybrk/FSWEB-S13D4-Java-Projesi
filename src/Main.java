import com.school.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /*
        System.out.println("Hello world!");

        Point first = new Point(6,5);
        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());

        Player sinan = new Player("Sinan", 150, Weapon.PARABELLUM);

        System.out.println("Sinan kalan sağlık " + sinan.healthRemaining());
        sinan.loseHealth(50);
        System.out.println("Sinan sağlık azalt " + sinan.healthRemaining());
        sinan.restoreHealth(23);
        System.out.println("Sinan sağlık artır " + sinan.healthRemaining());
        sinan.loseHealth(99);
        sinan.restoreHealth(150);
        System.out.println("Sinan kalan sağlık " + sinan.healthRemaining());
        */
        /*
        // create school
        School javaSchool = new School("Java School");
        System.out.println("Yeni Okul " + javaSchool.getSchoolName() + " oluşturuldu.");
        // create room
        Room room1 = new Room("Room 1");
        javaSchool.addRoom(room1);
        // create a class
        Class javaStarter = new Class("Introduction to Java");
        javaSchool.addClass(javaStarter);
        // create a teacher
        Teacher javaTeacher = new Teacher();
        javaTeacher.name = "Tunç Kıral";

        javaTeacher.getAddress();
        javaTeacher.address = "awdawkdhawıudhawıud";
        javaSchool.addTeacher(javaTeacher);
        // assign teacher to the class
        javaStarter.teacher = javaTeacher;
        // assign room to the class;
        javaStarter.room = room1;
        // create a student;
        Student javaStudent1 = new Student();
        javaStudent1.name = "Sinan";

        javaStudent1.getAddress();
        javaSchool.addStudent(javaStudent1);
        javaStarter.addStudents(javaStudent1);

        System.out.println(javaSchool.getSchoolName() + " okulunda " +
                javaStarter.name + " dersimiz " +
                javaStarter.room.name + " odasında " +
                javaStarter.teacher.name + " hocası tarafından " +
                "verilmeye başlanmıştır.");

        System.out.println("Hocanın id'si " + javaTeacher.getId());
        System.out.println("Öğrencinin id'si " + javaStudent1.getId());
        // add new student
        Student student2 = new Student();

        System.out.println("Diğer öğrencinin id'si " + student2.getId());

        Member abc = new Member(MemberTypes.Student);
         */

        MockData mockData = new MockData();
        //create school
        School javaSchool = new School("Java School");
        // create students with mock data
        for (int i = 0; i < mockData.mockStudentNames.length; i++) {
            Student tmpStudent = new Student(mockData.mockStudentNames[i],new Date(2010,05,i + 1),"istanbul / Turkey");
            javaSchool.addStudent(tmpStudent);
        }

        // create teachers with mock data
        for (int i = 0; i < mockData.mockTeacherNames.length; i++) {
            Teacher tmpTeacher = new Teacher(mockData.mockTeacherNames[i],new Date(1989,07,i + 2),"istanbul / Turkey");
            javaSchool.addTeacher(tmpTeacher);
        }
        // create rooms with mock data
        for (int i = 0; i < mockData.mockRoomNames.length; i++) {
            Room tmpRoom = new Room(mockData.mockRoomNames[i]);
            javaSchool.addRoom(tmpRoom);
        }
        // create lessons with mock data
        for (int i = 0; i < mockData.mockLessonNames.length; i++) {
            Lesson tmpLesson = new Lesson(mockData.mockLessonNames[i]);
            javaSchool.addLesson(tmpLesson);
        }
        // select a lesson and assign teacher, room and some students to it.
        Lesson java101 = javaSchool.lessons[0];
        java101.teacher = javaSchool.teachers[0];
        java101.room = javaSchool.rooms[0];
        java101.length = 3;
        java101.addStudentToLesson(javaSchool.students[0]);
        java101.addStudentToLesson(javaSchool.students[1]);
        
        // now let's print as many info as possible about java101
        System.out.println(
                "Yeni dersimizin adı " + java101.name
                + " hocasının adı " + java101.teacher.getName()
                + " hocasının id'si " + java101.teacher.getId()
                + " dersi alan öğrencilerin adları ve ID'leri "
                + java101.students[0].getName() + " " + java101.students[0].getId() + " "
                + java101.students[1].getName() + " " + java101.students[1].getId() + " "
                + "dersin verildiği odanın adı " + java101.room.name
        );


    }
}