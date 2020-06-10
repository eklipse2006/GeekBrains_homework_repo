package lesson5_hw;

public class Cat extends Animal{

    Cat(String name, String color, int age) {
        super(name, color, age);
    }


    @Override
    public void run(int lenght) {
        if (lenght < 200) {
            System.out.println(getName() + " пробежал " + lenght + " метров!");
        } else {
            System.out.println("Слишком далеко для " + getName());
        }
    }

    @Override
    public void swim(int lenght) {
        System.out.println(getName() + " не умеет плавать!");
    }

    @Override
    public void jump(double height) {
        if (height < 2) {
            System.out.println(getName() + " прыгнул " + height + " метров!");
        } else {
            System.out.println("Слишком высоко для " + getName());
        }
    }
}
