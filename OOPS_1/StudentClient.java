package OOPS_1;

public class StudentClient {
    public static void main(String[] args) {

        System.out.println("Now we are inside main method of StudentClient class");

        Student s = new Student();

        System.out.println(s.name);
        System.out.println(s.age);

        s.name = "Monu";
        s.age = 22;
        s.Intro_yourSelf();

        s.SayHey("Ariana");

        Student.SayMentorName();


    }

    static {
        System.out.println("This is static block of StudentClient Class");
    }
}
