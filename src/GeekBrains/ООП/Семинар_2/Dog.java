package GeekBrains.ООП.Семинар_2;

public class Dog extends Animal{

    @Override
    protected void goodAnswer() {
        System.out.println("Gav-gav");
    }

    @Override
    void badAnswer() {
        System.out.println("RRRRR");
    }
}
