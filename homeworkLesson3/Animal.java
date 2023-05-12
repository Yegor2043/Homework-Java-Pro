package newPro.lesson3.homeworkLesson3;


public abstract class Animal implements IAnimal{
    protected int distance;
    public Animal(int distance) {
        this.distance = distance;
    }

    public abstract String run();

    public abstract String swim();
}
