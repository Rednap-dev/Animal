public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal rabbit = new Rabbit();
        Animal tiger = new Tiger();
        Food food1 = new Meat();
        Food food2 = new Veget();
        dog.setName("Собака");
        rabbit.setName("Кролик");
        tiger.setName("Тигр");
        check(dog,food2);
        check(rabbit,food2);
        check(tiger, food1);

    }
    static void check(Animal animal, Food food){
        if (animal.eat(food)){
            System.out.println((animal.name + " с удовольствием съест " + food.name()));
        }else {
            System.out.println((animal.name + " не будет есть " + food.name()));
        }
    }
}
