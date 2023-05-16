package newPro.lesson4;

public class Cat {
    private final int appetite;
    private boolean fullness;
    private String name;

    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    public boolean isFullness() {
        return fullness;
    }

    public void eat(Plate plate) {
        this.fullness = true;
        plate.decreaseFood(appetite);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "appetite=" + appetite +
                '}';
    }

    public int getAppetite() {
        return appetite;
    }
}
