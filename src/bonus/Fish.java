package bonus;

public class Fish extends Animal implements Pet{

    String name;
    public Fish(int legs) {
        super(legs);
    }

    public Fish(int legs, String name) {
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
    void walk() {
        super.walk();
    }

    @Override
    void eat() {
        super.eat();
    }
}
