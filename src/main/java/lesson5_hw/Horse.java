package lesson5_hw;

public class Horse extends Animal{

    Horse(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void run(int lenght) {
        if (lenght < 1500) {
            System.out.println(getName() + " пробежал " + lenght + " метров!");
        } else {
            System.out.println("Слишком далеко для " + getName());
        }
    }

    @Override
    public void swim(int lenght) {
        if (lenght < 100) {
            System.out.println(getName() + " проплыл " + lenght + " метров!");
        } else {
            System.out.println("Слишком далеко для " + getName());
        }
    }

    @Override
    public void jump(double height) {
        if (height < 3) {
            System.out.println(getName() + " прыгнул " + height + " метров!");
        } else {
            System.out.println("Слишком высоко для " + getName());
        }
    }
}
