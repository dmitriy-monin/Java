package GeekBrains.ООП.Семинар_2;

public class Girl extends Man {

    public Girl(String name, int age) {
        super(name, age);
    }

    public void call(Animal animal) {
        if (animal instanceof Cat) {
            System.out.println("Girl call cat");
            animal.goodAnswer();
        } else if (animal instanceof Dog) {
            System.out.println("Girl call dog");
            animal.badAnswer();

        }
    }
}