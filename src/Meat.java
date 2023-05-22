class Meat extends Food {
    @Override
    public boolean isMeat() {
        return true;
    }
    @Override
    public String name(){
        return "Мясо";
    }
}
