public class Example {

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    } // задача 1

    public static void checkSumSign() {
        int a = 10;
        int b = 20;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    } // задача 2

    public static void printColor() {
        int value = 10;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }//задача 3


    public static void compareNumbers() {
        int a = 10;
        int b = 20;
        if (a >= b) {
            System.out.println("a >=b");
        } else {
            System.out.println("a<b");
        }
    } // задача 4

    public static boolean isCheckSum(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    } // задача 5


    public static void printPosotiveInteger(int a) {
        if (a >= 0) {
            System.out.println("В метод передали положительное число");
        } else {
            System.out.println("В метод передали отрицательное число");
        }
    } // задача 6

    public static boolean isPositive(int a) {
        return a > 0;
    } // задача 7

    public static void methodOfPrint(String a, int b) {
        for (int i = 0; i <= b - 1; i++) {
            System.out.println(a);
        }
    } // задача 8

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            return true;
        } else if (year % 100 != 0) {
            return false;
        } else {
            return year % 400 == 0;
        }
    } // задача 9

    public static void massiveRefresh() {
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            } else {
                a[i] = 0;
            }
        }
    } // задача 10

    public static void voidMassive() {
        int[] a = new int[100];
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = i + 1;
        } // задача 11
    }

    public static void multiMassive() {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < 6) {
                a[i] *= 2;
            }
        }
    } // задача 12


    public static void doubleMassive() {
        int n = 5;
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            a[i][i] = 1;
        }
    } // задача 13


    public static int[] lastArray(int len, int initialValue) {
        int[] a = new int[len];
        for (int i = 0; i < len; i++) {
            a[i] = initialValue;
        }
        return a;
    } // задача 14



}
