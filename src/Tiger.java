import java.util.Scanner;

public class Tiger extends Animal {
    public String name()
    {
        return "Тигр";
    }
    @Override
    void voice() {
        super.voice();
    }

    @Override
    boolean eat(Food food) {
        return food.isMeat();
    }
}