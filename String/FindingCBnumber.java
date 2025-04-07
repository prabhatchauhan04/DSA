package String;

/* Deepak and Gautam are having a discussion on a new type of number that they call Coding Blocks Number or CB Number.
 They use following criteria to define a CB Number.

0 and 1 are not a CB number.
2,3,5,7,11,13,17,19,23,29 are CB numbers.
Any number not divisible by the numbers in point 2( Given above) are also CB numbers.

Deepak said he loved CB numbers.Hearing it, Gautam throws a challenge to him.

Gautam will give Deepak a string of digits. Deepak’s task is to find the number of CB numbers in the string.

CB number once detected should not be sub-string or super-string of any other CB number.
Ex- In 4991, both 499 and 991 are CB numbers but you can choose either 499 or 991, not both.

Further, the CB number formed can only be a sub-string of the string.
Ex - In 481, you can not take 41 as CB number because 41 is not a sub-string of 481.

As there can be multiple solutions, Gautam asks Deepak to find the maximum number of CB numbers that can be formed from the given string.

Deepak has to take class of Launchpad students. Help him by solving Gautam’s challenge.
( Constraints : 1 <= length of string of digits <= 17 ) */

public class FindingCBnumber {
    public static void main(String[] args) {
        String str = "82819";
        Substring(str);
    }

    public static void Substring(String str) {
        int count = 0;
        boolean[] visited = new boolean[str.length()];

        for (int len = 1; len <= str.length(); len++) {

            for (int j = len; j <= str.length(); j++) {

                int i = j - len;

                String s = str.substring(i, j);

                if (IscbNumber(Long.parseLong(s)) == true && IsNotvisited(visited, i, j - 1) == true) {
                    count++;
                    for (int k = i; k < j; k++) {
                        visited[k] = true;
                    }
                }

            }

        }

        System.out.print("Maximum Number of CB numbers that can be formed are : " + count);
    }

    public static boolean IsNotvisited(boolean[] visited, int i, int j) {

        for (int k = i ; k <= j ; k++) {

            if (visited[k] == true) {
                return false;
            }

        }

        return true;
    
    }

    public static boolean IscbNumber(long num) {
        if (num == 0 || num == 1) {
            return false;
        }

        int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };

        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return true;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (num % arr[i] == 0) {
                return false;
            }
        }

        return true;
    }
}
