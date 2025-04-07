package TimeSpaceComplexity;

public class ExperimentalWayTimeComplexity {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10; i++) {
            System.out.print(" ");
        }

        long end = System.currentTimeMillis();

        System.out.println("Experimental Time Complexity is : " + ( end - start ));
    }
}