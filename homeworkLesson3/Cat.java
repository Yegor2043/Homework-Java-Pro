package newPro.lesson3.homeworkLesson3;

public class Cat extends Animal {

    public Cat(int distance) {
        super(distance);
    }
    @Override
    public String run() {
        if (distance > 200) {
            return ("Кошка не может пробежать больше 200 метров!");
        }
        return ("Кошка пробежала пробежала: " + distance);
    }



    @Override
    public String swim() {
        return ("Кошка не умеет плавать!");
    }
}
