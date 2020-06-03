package lesson2_hw;

import java.util.Arrays;

public class Lesson2_hw {

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random() * 2);
        }
        task1(a);
        a = new int[8];
        task2(a);
        a = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        task3(a);
        int [][] b = new int[5][5];
        task4(b);
    }

    public static void task1(int [] a) {
        System.out.println("Случайный массив");
        System.out.println(Arrays.toString(a));
        System.out.println("Преобразованный массив");
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            } else {
                a[i] = 0;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void task2(int [] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = i * 3;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void task3(int [] a) {
        System.out.println("Заданный массив");
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) {
                a[i] *= 2;
            }
        }
        System.out.println("Преобразованный массив");
        System.out.println(Arrays.toString(a));
    }

    public static void task4(int [][] b) {
        for (int i = 0; i < b.length; i++) {
            b[i][i] = 1;
            b[i][b[i].length - i - 1] = 1;
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
