import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите название автомобиля #" + i + ":");
            String name = scanner.nextLine();

            int speed;
            while (true) {
                System.out.println("Введите скорость автомобиля #" + i + " (от 1 до 250):");
                try {
                    speed = Integer.parseInt(scanner.nextLine());
                    if (speed > 0 && speed <= 250) {
                        break;
                    } else {
                        System.out.println("Неверная скорость! Скорость должна быть больше 0 и меньше или равна 250.");
                    }
                }
                catch (NumberFormatException e) {
                    System.out.println("Пожалуйста, введите числовое значение для скорости.");
                }
            }

            Automobile car = new Automobile(name, speed);
            race.updateLeader(car);
        }

        System.out.println("Самая быстрая машина: " + race.getLeaderName());
    }
}


