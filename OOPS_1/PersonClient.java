package OOPS_1;

public class PersonClient {
    public static void main(String[] args){
        Person p = new Person();
        // System.out.println(p.name);
        // System.out.println(p.age);

        Person p1 = new Person("Pooja" , 32);
        // System.out.println(p1.name);
        // System.out.println(p1.age);

        p1.setAge(-9);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
    }
}
