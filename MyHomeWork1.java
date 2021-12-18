 /**
 *Java 1. MyHomeWork1
 *
 *@author Aleksandra Feschuk
 *@version 11-18.12.2021
 */
public class MyHomeWork1 {
    public static void main(String[]args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 20;
        int b = -30;
        System.out.println("Sum is " + (a + b >= 0 ? "positive" : "negative"));
    }

    static void printColor() {
        int value = 30;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    static void compareNumbers() {
        int a = 5;
        int b = 25;
        System.out.println(a >= b ? " a >= b " : " a < b ");
    }
}
