package newPro.lesson3.homeworkLesson3;


public class Lesson4Homework {
    public static void main(String[] args) {
        IAnimal[] animals = {new Dog (501), new Dog(300),new Dog(450), new Cat(30)};
        for (IAnimal animal : animals) {
            System.out.println(animal.run());
            System.out.println(animal.swim());
        }

        int dogCounter = 0;
        int catCounter = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].getClass().equals(Dog.class)) {
                dogCounter++;
            } else {
                catCounter++;
            }
        }
        System.out.println("Количество собак: " + dogCounter + "\nКоличество кошек:" + catCounter + "\nКоличество животных: " + (dogCounter + catCounter));
    }
}
