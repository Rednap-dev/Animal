public class Veget extends Food {
    @Override
    public boolean isMeat() {
        return false;
    }
    @Override
    public String name(){
        return "Овощ";
    }
}
