public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1.");
        for (int q = 1; q <= 10; q = q + 1) {
            System.out.println(q);
        }
        System.out.println("Task 2.");
        for (int w = 10; w >= 1; w = w - 1) {
            System.out.println(w);
        }
        System.out.println("Task 3.");
        for (int e = 0; e <= 17; e = e + 2) {
            System.out.println(e);
        }
        System.out.println("Task 4.");
        for (int r = 10; r >= -10; r = r - 1) {
            System.out.println(r);
        }
        System.out.println("Task 5.");
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год - является високосным.");
        }
        System.out.println("Task 6.");
        for (int t = 7; t <= 100; t = t + 7) {
            System.out.println(t);
        }
        System.out.println("Task 7");
        for (int y = 1; y <= 2048; y = y * 2) {
            System.out.println(y);
        }
        System.out.println("Task 8.");
        int deposit = 29000;
        int total = 0;
        for (int m = 0; m <= 12; m++) {
            total = total + deposit;
            System.out.println("Месяц " + m + " сумма накоплений = " + total);
        }
        System.out.println("Task 9.");
        int deposit2 = 29000;
        int total2 = 0;
        for (int n = 0; n < 12; n++) {
            total2 = total2 + total2/100;
            total2 = total2 + deposit2;
            System.out.println("Месяц " + n + " сумма накоплений = " + total2);
        }
    }
}