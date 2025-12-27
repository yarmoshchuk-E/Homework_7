//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Task_1");
        byte clientOS = 1;   //clientOS - операционная система клиента, 0-для iOS; 1-для Android
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }

        System.out.println("Task_2");
        int clientDeviceYear = 2015;  //год выпуска устройства клиента
        //переменная clientOS инициирована ранее и находится в поле видимости
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {

                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            }

        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        }

        System.out.println("Task_3");
        int startYear = 1584; //значение года, с которого был введен отсчет високосных
        int year = 2021;      //значение года, который необходимо определить
        if (year > startYear) {
            if ((year - startYear) % 4 == 0 && (year - startYear) % 400 == 0 && (year - startYear) % 100 != 0) {
                System.out.println(year + " год является високосным.");
            } else {
                System.out.println(year + " год не является високосным.");
            }
        } else {
            System.out.println("Невозможно определить.");
        }

        System.out.println("Task_4");
        byte deliveryDistance = 95;     //дистанция от офиса до клиента
        byte deliveryTime = 0;          //время доставки в днях
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            System.out.println("Потребуется дней - " + (deliveryTime + 1));
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней - " + (deliveryTime + 2));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней - " + (deliveryTime + 3));
        } else {
            System.out.println("Извините, доставки к Вам нет.");
        }

        System.out.println("Task_5");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Некорректно введен номер месяца.");
        }
    }
}