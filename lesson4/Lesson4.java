package newPro.lesson4;

/**
 * Java. Homework #3
 * @author user Yehor Zhornik
 * @version 12 May 2023
 */

public class Lesson4 {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        Cat[] cats = {new Cat("Barsik",9, false), new Cat("Max",3, false), new Cat("Sofa", 4, false)};
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat.isFullness());
        }
    }
}
