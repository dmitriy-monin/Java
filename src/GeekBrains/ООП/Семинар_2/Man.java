package GeekBrains.ООП.Семинар_2;

public abstract class Man implements Action{

    protected String name;
    protected int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public abstract void call(Animal animal);

}
