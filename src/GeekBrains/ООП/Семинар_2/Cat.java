package GeekBrains.ООП.Семинар_2;

public class Cat extends Animal {

    @Override
    protected void goodAnswer() {
        System.out.println("Myau");
    }

    @Override
    void badAnswer() {
        System.out.println("FFFFF");
    }
}
