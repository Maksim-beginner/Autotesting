import java.util.Arrays;

public class FirstApp {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println();
        checkSumSign();
        System.out.println();
        printColor();
        System.out.println();
        compareNumbers();
        System.out.println();
        System.out.println(checkRange(1, 2));
        System.out.println();
        checkPosNeg(5);
        System.out.println();
        System.out.println(checkPosNegBoolean(-3));
        System.out.println();
        printStringRepeat("Max", 5);
        System.out.println();
        System.out.println(checkLeapYear(2026));
        System.out.println();
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
        int[] arrS = new int[100];
        for(int i = 0; i < 100; i++) {
            arrS[i] = i + 1;
        }
        System.out.println(Arrays.toString(arrS));
        System.out.println();
        int[] arrT = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrT.length; i++) {
            if (arrT[i] < 6) {
                arrT[i] = arrT[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arrT));
        System.out.println();
        int[][] table = new int[10][10];
        for (int i = 0; i < table.length; i++) {
            table[i][i] = 1;
        }
        for (int[] row : table) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
        System.out.println(Arrays.toString(createArray(5, 3)));
    }

    public static void printThreeWords() {
        String[] fruits = {"Orange", "Banana", "Apple"};
        for (String f : fruits) {
            System.out.println(f);
        }
    }

    public static void checkSumSign() {
        int a = 1;
        int b = 2;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 & value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers() {
        int a = 1;
        int b = 2;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 & sum <= 20;
    }

    public static void checkPosNeg(int number) {
        if (number >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean checkPosNegBoolean(int number) {
        return number < 0;
    }

    public static void printStringRepeat(String a, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(a);
        }
    }

    public static boolean checkLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
