import com.school.*;
import com.school.Class;

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
        javaTeacher.id = javaSchool.giveNewId();
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
        javaStudent1.id = javaSchool.giveNewId();
        javaStudent1.getAddress();
        javaSchool.addStudent(javaStudent1);
        javaStarter.addStudents(javaStudent1);

        System.out.println(javaSchool.getSchoolName() + " okulunda " +
                javaStarter.name + " dersimiz " +
                javaStarter.room.name + " odasında " +
                javaStarter.teacher.name + " hocası tarafından " +
                "verilmeye başlanmıştır.");

        System.out.println("Hocanın id'si " + javaTeacher.id);
        System.out.println("Öğrencinin id'si " + javaStudent1.id);
        // add new student
        Student student2 = new Student();
        student2.id = javaSchool.giveNewId();
        System.out.println("Diğer öğrencinin id'si " + student2.id);

        Member abc = new Member(MemberTypes.Student);
    }
}