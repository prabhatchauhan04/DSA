package BinarySearch;

/* You are given number of pages in " n " different books and " m " students.
The books are arranged in ascending order of number of pages. 
Every student is assigned to read some consecutive books. 
The task is to assign books in such a way that the maximum number of pages assigned to a student is minimum. */

public class BookAllocationProblem {
    public static void main(String[] args) {
        int [] page = { 10 , 20 , 30 , 40 };
        int m = 2; // 2 students

        System.out.print(MinPages(page, m));
    }

    public static int MinPages(int[] page , int m){
        int lo = 0;
        int hi = 0;

        for (int i = 0; i < page.length; i++) {
            hi = hi + page[i];
        }

        int ans = 0;
        while (lo <= hi) {
            int mid = (lo + hi)/2;
            if ( isitpossible(page , m , mid) == true ) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return ans;
    }

    public static boolean isitpossible(int[] page , int m , int mid){
        int student = 1;
        int readpages = 0;

        for (int i = 0; i < page.length ; ) {

            if ( (readpages + page[i] <= mid)) {
                readpages += page[i];
                i++;
            } else {
                student++;
                readpages = 0;
            }

            if (student > m) {
                return false;
            }

        }

        return true;
    }
}
