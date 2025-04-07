package Basics;

/*
 The triple dot operator (...) in Java is known as the varargs (variable-length argument) syntax. It allows you to 
 pass a variable number of arguments to a method. With varargs, you can pass any number of arguments (including zero) of 
 the specified type, and Java will treat them as an array within the method.
 */

public class TripleDotOperator {
    public static void main(String[] args) {
        System.out.println(Add(1 , 2 , 3 , 5 , 6));
    }
    public static int Add(int x , int ... arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
