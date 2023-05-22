import java.util.Scanner;

public class Dog extends Animal{
    public String name()
    {
        return "Собака";
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
