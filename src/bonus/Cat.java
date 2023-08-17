package bonus;

public class Cat extends Animal implements Pet{

    String name;
    public Cat(int legs) {
        super(legs);
    }

    public Cat(int legs, String name) {
        super(legs);
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName() {

    }

    @Override
    public void play() {

    }

    @Override
    void eat() {
        super.eat();
    }
}
