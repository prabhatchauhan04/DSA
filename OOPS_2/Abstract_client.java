package OOPS_2;

public class Abstract_client {
    public static void main(String[] args) {
        Payment_method ab1 = new Payment_method();
        ab1.Payment();

        Abstract_demo ab2 = new Abstract_demo() {
            @Override
            public void Payment() {
                
            }
            @Override
            public int No_of_items(){
                return 0;
            }
        };
    }
}
