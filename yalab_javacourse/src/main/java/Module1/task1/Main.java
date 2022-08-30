package Module1.task1;

import java.awt.*;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Main {

    private static int X = 5;
    private static int Y = 5;
    private static String ANSI_RESET = "\u001B[0m";
    private static int[][] arr = new int[X][Y];

    public static void main(String[] args) {

        System.out.println("двигайте мышку");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand();
                System.out.print(  arr[i][j]  + " ");

            }
        }
        System.out.println();
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
                .sum() / arr.length;
    }

    public static int rand() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        PointerInfo a = MouseInfo.getPointerInfo();
        Point b = a.getLocation();
        int x = (int) b.getX();
        int y = (int) b.getY();
        int position = x + y;

        return position;
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
