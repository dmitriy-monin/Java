package GeekBrains.ООП.Семинар_2;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat();
        Animal dog = new Dog();

        Man boy = new Boy("Дмитрий", 32);
        System.out.println(boy.name + " " + boy.age);
        boy.call(dog);
        boy.call(cat);
        System.out.println("------------------");
        Man girl = new Girl("Алена", 32);
        girl.call(dog);
        girl.call(cat);

    }
}
