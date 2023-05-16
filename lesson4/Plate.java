package newPro.lesson4;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    @Override
    public String
    toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }

    public void addFood(int food) {
        this.food += food;
    }

    public int decreaseFood(int eatingFood) {
        if (food >= eatingFood) {
            this.food -= eatingFood;
        } else {
            System.out.println("Кот не хочет есть еду, когда её недостаточно!");;
        }
        return getFood();
    }
}
