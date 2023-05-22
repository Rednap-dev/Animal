import java.util.Scanner;

public class Rabbit extends Animal {
    public String name()
    {
        return "Кролик";
    }
    @Override
    void voice() {
        super.voice();
    }

    @Override
    boolean eat(Food food) {
        return !food.isMeat();
    }
}
