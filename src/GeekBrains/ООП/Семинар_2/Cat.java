package GeekBrains.ООП.Семинар_2;

public class Cat extends Animal {


    public Cat(String name) {
        super(name);
    }

    @Override
    public void come() {
        super.come();
    }

    @Override
    public void answer() {
        super.answer();
        System.out.println("Myau");
    }
}
