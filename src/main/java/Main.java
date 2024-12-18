import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car("", 0);
        for (int i = 1; i<=3; i++) {
            String name = scanner.next();
            int speed;
            System.out.println("Введите название автомобиля № " + i + ":");

            while (true) {
                System.out.println("Введите скорость автомобиля № " + i + ":");
                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();
                    if (0 < speed && speed <= 250) {
                        break;
                    } else {
                        System.out.println("Скорость должна быть в диапазоне 0 - 250 км/ч. Повторите ввод");
                    }
                } else {
                    System.out.println("Скорость должна быть в диапазоне 0 - 250 км/ч. Повторите ввод");
                }
            }
        }
    }



}

