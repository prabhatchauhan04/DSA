package OOPS_1;

public class Student {
    String name;
    int age;

    public void Intro_yourSelf() {
       System.out.println("My name is " + name + " and age is " + age);
    }

    public void SayHey(String name){
        System.out.println(this.name + " Say Hey " + name);
    }

    public static void SayMentorName(){
        System.out.println("Mentor name Monu Bhaiya");
    } 

    static {
        System.out.println("This is static block of Student Class");
    }
}
