package Module1.task1;

import java.util.Arrays;

public class Main {
    private static long randMax = 4294967296l;
    private static long state = 0;
    private static int X = 10;
    private static int Y = 10;
    private static String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        int[][] arr = new int[X][Y];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand();
            }
        }
        for (int[] anArr : arr) {
            for (int anAnArr : anArr) {
                if (anAnArr > 0) {
                    ANSI_RESET = "\u001B[34m";
                } else ANSI_RESET = "\u001B[36m";

                System.out.print(ANSI_RESET + anAnArr + " ");
            }
            System.out.println();
        }
        System.out.println("\u001B[32m" + "Минимум " + min(arr));
        System.out.println("\u001B[31m" + "Максимум " + max(arr));
        System.out.println("\u001B[33m" + "Среднее " + (arg(arr)));
    }

    private static int arg(int[][] arr) {
      return Arrays.stream(arr)
                .flatMapToInt(Arrays::stream)
                .sum()/ arr.length;
    }

    public static int rand() {

        state = 214 * state + 25;
        state ^= state >> 15;
        return (int) (state % randMax);

    }

    public static int min(int[][] arr) {
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                min = min > arr[i][j] ? arr[i][j] : min;
            }
        }
        return min;
    }

    public static int max(int[][] arr) {
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                min = min < arr[i][j] ? arr[i][j] : min;
            }
        }
        return min;
    }
}
