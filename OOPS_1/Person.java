package OOPS_1;

public class Person {
    private String name = "Kaju";
    private int age = 17;

    public Person(){

    }

    public Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        try {
            if (age < 0) {
                throw new Exception("Bklol age -ve hota hai");
            }
            this.age = age;
        } catch (Exception e) {
            e.printStackTrace();
            // System.exit(0);
        }
    }
}
