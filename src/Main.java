import java.time.LocalDate;

public class Main {
    public static void checkLeapYear(short a) {
        if ((a % 4 == 0 && a % 100 != 0) || (a >= 400 && a % 400 == 0)) {
            System.out.println(a + " год - високосный год");
        } else {
            System.out.println(a + " год - невисокосный год");
        }
    }
    public static void checkDeviceYear(boolean a, short b) {
        int currentYear = LocalDate.now().getYear();
        if (a) {
            if (b == currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (b == currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке»");
            }
        }
    }
    public static void deliveryTime (short a) {
        if (a <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (a <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (a <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет!");
        }
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        short year = 2021;
        checkLeapYear(year);
    }
    public static void task2() {
        boolean clientOS = true;
        short clientDeviceYear = 2015;
        checkDeviceYear(clientOS, clientDeviceYear);
    }
    public static void task3() {
        short deliveryDistance = 95;
        deliveryTime(deliveryDistance);
    }
}