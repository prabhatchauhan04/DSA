package Array_2D;

public class SpiralPrint {
    public static void main(String[] args) {
        int[][] arr = { {1,2,3,4} , {5,6,7,8} , {9,10,11,12} , {13,14,15,16} };
        Spiral(arr);
    }

    public static void Spiral(int[][] arr){
        int minR = 0;
        int minC = 0;
        int maxR = arr.length - 1;
        int maxC = arr[0].length - 1;
        int totalElements = arr.length * arr[0].length;
        int count = 0;

        while (count < totalElements) {
            for (int i = minC; i <= maxC && count < totalElements; i++) {
                System.out.print(arr[minR][i] + "   ");
                count++;
            }
            minR++;
            for (int i = minR; i <= maxR && count < totalElements; i++) {
                System.out.print(arr[i][maxC] + "   ");
                count++;
            }
            maxC--;
            for (int i = maxC; i >= minC && count < totalElements; i--) {
                System.out.print(arr[maxR][i] + "   ");
                count++;
            }
            maxR--;
            for (int i = maxR; i >= minR && count < totalElements; i--) {
                System.out.print(arr[i][minC] + "   ");
                count++;
            }
            minC++;
        }
    }
}
