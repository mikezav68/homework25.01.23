import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2021;
        checkYear(year);
        System.out.println("Задача 2");
        int systemType = 0;
        int deviceYear = 2020;
        checkSystem(systemType, deviceYear);
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        checkDelivery(deliveryDistance);
        if (checkDelivery(deliveryDistance) > 0)
            System.out.println("Для доставки потребуется " + checkDelivery(deliveryDistance) + " дня");
        else System.out.println("Доставка дальше 100 км не осуществляется");
    }
    public static void checkYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 ==0)) {
            System.out.println("Год " + year + " - високосный"); }
        else {
            System.out.println("Год " + year + " - не високосный");
        }
    }
    public static void checkSystem(int systemType, int deviceYear) {
        int currentYear = 2023;
        if (deviceYear < currentYear) {
            switch (systemType) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для IOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Мы не смогли определить Вашу версию ОС");
            }
        } else {
            switch (systemType) {
                case 0:
                    System.out.println("Установите приложение для IOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите приложение для Android по ссылке");
                    break;
                default:
                    System.out.println("Мы не смогли определить Вашу версию ОС");
            }
        }
    }
    public static int checkDelivery(int deliveryDistance) {
        int deliveryDays = 0;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
            return deliveryDays; }
        else if (deliveryDistance <= 60) {
            deliveryDays = 2;
            return deliveryDays; }
        else if (deliveryDistance <= 100) {
            deliveryDays = 3;
            return deliveryDays; }
        else { deliveryDays = 0;
            return deliveryDays; }
    }
}