import java.time.LocalDate;

public class Main {
    public static void checkLeapYear(short year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year >= 400 && year % 400 == 0)) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - невисокосный год");
        }
    }
    public static void checkDeviceYear(boolean clientOS, short clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS) {
            if (clientDeviceYear == currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientDeviceYear == currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке»");
            }
        }
    }
    public static void deliveryTime (short deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance <= 100) {
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