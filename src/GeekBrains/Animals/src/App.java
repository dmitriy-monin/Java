import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {

    // завести новое животное;
    // определять животное в правильный класс;
    // увидеть список команд, которые выполняет животное;
    // обучить животное новым командам;
    // раелизовать навигацию по меню.
    public static void main(String[] args) {
        run();
    }



    public static void run() {
        Repository repository = new Repository();
        boolean loop = true;
        while (loop) {
            System.out.println("Введите цифру пункта меню:");
            System.out.println("1 - Завести новое животное");
            System.out.println("2 - Посмотреть всех животных");
            System.out.println("3 - Посмотреть список команд конкретного животного");
            System.out.println("4 - Обучить животное новой команде");
            System.out.println("5 - Выйти");
            Scanner scanner = new Scanner(System.in);
            int item = scanner.nextInt();
            switch (item) {
                case 1:
                    try (Counter counter = new Counter()) {
                        createAnimal(repository);
                        counter.add();
                    } catch (ParseException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Не удалось завести животное.");
                    } catch (Exception ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 2:
                    repository.showAllAnimals();
                    break;
                case 3:
                    showAnimalCommands();
                    break;
                case 4:
                    learning();
                    break;
                case 5:
                    loop = false;
                    break;
                default:
                    System.out.println("Введите цифру от 1 до 4");
                    break;
            }
        }
    }


    public static void createAnimal(Repository repository) throws ParseException {
        System.out.println("Введите имя животного.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Введите день рождения животного в формате YYYY-MM-DD");
        String birthday = scanner.nextLine();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        Date birth = s.parse(birthday);
        System.out.println("Введите цифру, соответствующую типу животного:");
        System.out.println("1 - Кот\n2 - Собака\n3 - Хомяк\n4 - Верблюд\n5 - Осел\n6 - Лошадь");
        int animalType = scanner.nextInt();
        switch (animalType) {
            case 1 -> {
                Cat cat = new Cat(name, birth);
                repository.addAnimal(cat);
            }
            case 2 -> {
                Dog dog = new Dog(name, birth);
                repository.addAnimal(dog);
            }
            case 3 -> {
                Hamster hamster = new Hamster(name, birth);
                repository.addAnimal(hamster);
            }
            case 4 -> {
                Camel camel = new Camel(name, birth);
                repository.addAnimal(camel);
            }
            case 5 -> {
                Donkey donkey = new Donkey(name, birth);
                repository.addAnimal(donkey);
            }
            case 6 -> {
                Horse horse = new Horse(name, birth);
                repository.addAnimal(horse);
            }
            default -> System.out.println("Неверные данные");
        }
    }


    public static void learning(){
        System.out.println("Введите id животного, которое Вы хотите обучать");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        int animalId = Integer.parseInt(id);

        System.out.println("Введите новую команду, которой Вы хотите обучить животное");
        String newCommand = scanner.nextLine();

        for (Animal animal : Repository.getRegistry()){
            if (animal.getId() == animalId)
                animal.learnCommand(newCommand);
        }
    }


    public static void showAnimalCommands(){
        System.out.println("Введите id животного, команды которого Вы хотите посмотреть");
        Scanner scanner = new Scanner(System.in);
        int animalId = scanner.nextInt();

        for (Animal animal : Repository.getRegistry()){
            if (animal.getId() == animalId)
                animal.showCommands();
        }
    }

}


