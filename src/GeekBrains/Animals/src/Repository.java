import java.util.ArrayList;

public class Repository {
    private static ArrayList<Animal> registry = new ArrayList<>();

    public void addAnimal(Animal animal){
        registry.add(animal);
    }

    public void showAllAnimals(){
        System.out.println();
        for(Animal animal: registry){
            System.out.println(animal);
        }
        System.out.println();
    }

    public static ArrayList<Animal> getRegistry() {
        return registry;
    }

    public Repository() {
    }
}
