package lesson5_hw;

public class MainClass {
    public static void main(String[] args) {

        Animal dog = new Dog("Полкан", "Черный", 3);
        Animal dog2 = new Dog("Барбос", "Коричневый", 8);
        Animal cat = new Cat("Борис", "Рыжий", 5);
        Animal horse = new Horse("Сивка", "Серый", 7);
        Animal bird = new Bird("Каркуша", "Белый", 4);


        dog.info();
        dog.run(600);
        cat.swim(10);

    }
}
