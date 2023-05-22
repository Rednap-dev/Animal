import java.util.Scanner;

public class Animal {
    String name;
    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void voice() {

    }

    boolean eat(Food food) {
        return food.isMeat();
    }

}
