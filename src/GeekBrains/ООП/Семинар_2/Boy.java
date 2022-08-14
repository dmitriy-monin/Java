package GeekBrains.ООП.Семинар_2;

public class Boy extends Man {

    public Boy(String name, int age) {
        super(name, age);
    }

    @Override
    public void call(Animal animal) {
        if (animal instanceof Cat) {
            System.out.println("Boy call cat");
            animal.badAnswer();
        } else if (animal instanceof Dog) {
            System.out.println("Boy call dog");
            animal.goodAnswer();
        }
    }
}
