package OOPS_2.GenericClassesMethods;

class Pair <B,M>{
    B x;
    M y;
}
public class GenericClass {
    public static void main(String[] args) {
        Pair<Integer , Long> p1 = new Pair<>();
        Pair<Integer , String> p2 = new Pair<>();
    }
}


