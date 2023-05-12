package newPro.lesson3.homeworkLesson3;

public class Dog extends Animal{

    public Dog(int distance) {
        super(distance);
    }

    @Override
    public String run() {
        if (distance > 500) {
            return ("Собака не может пробежать больше 500 метров!");
        }
        return ("Собака пробежала: " + distance);
    }

    @Override
    public String swim() {
        if (distance > 10) {
            return "Собака не может проплыть больше 10 метров!";
        }
        return ("Собака проплыла: " + distance);
    }
}
