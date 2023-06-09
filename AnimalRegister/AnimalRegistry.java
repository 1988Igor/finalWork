package AnimalRegister;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class AnimalRegistry {
    private static List<Animal> animals = new ArrayList<>();

    public static void main(String[] args) {
        try (Counter counter = new Counter()) {
            Scanner scanner = new Scanner(System.in);
            boolean exit = false;

            while (!exit) {
                System.out.println("Меню:");
                System.out.println("1. Завести новое животное");
                System.out.println("2. Определить животное в правильный класс");
                System.out.println("3. Увидеть список команд, которые выполняет животное");
                System.out.println("4. Обучить животное новым командам");
                System.out.println("5. Выход");
                System.out.print("Выберите пункт меню: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Чтение символа новой строки после ввода числа

                switch (choice) {
                    case 1:
                        createNewAnimal(scanner);
                        break;
                    case 2:
                        determineAnimalClass(scanner);
                        break;
                    case 3:
                        showAnimalCommands(scanner);
                        break;
                    case 4:
                        trainAnimal(scanner);
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Некорректный выбор. Попробуйте снова.");
                        break;
                }

                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static void createNewAnimal(Scanner scanner) {
        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();

        System.out.print("Введите вид животного: ");
        String species = scanner.nextLine();

        System.out.print("Введите возраст животного: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Чтение символа новой строки после ввода числа

        Animal animal = new Animal(name, species, age);
        animals.add(animal);

        System.out.println("Животное успешно зарегистрировано.");
    }

    private static void determineAnimalClass(Scanner scanner) {
        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();

        Animal animal = findAnimalByName(name);

        if (animal != null) {
            System.out.println("Животное " + name + " относится к классу " + animal.getClass().getSimpleName());
        } else {
            System.out.println("Животное не найдено.");
        }
    }

    private static void showAnimalCommands(Scanner scanner) {
        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();

        Animal animal = findAnimalByName(name);

        if (animal != null) {
            animal.showCommands();
        } else {
            System.out.println("Животное не найдено.");
        }
    }

    private static void trainAnimal(Scanner scanner) {
        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();

        Animal animal = findAnimalByName(name);

        if (animal != null) {
            System.out.print("Введите новую команду для животного: ");
            String command = scanner.nextLine();

            animal.addCommand(command);
            System.out.println("Животное успешно обучено новой команде.");
        } else {
            System.out.println("Животное не найдено.");
        }
    }

    private static Animal findAnimalByName(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        return null;
    } }