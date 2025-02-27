package MultipleInheritance;

public class Amphibian implements Flyable,Swimmable {

    String name;

    public Amphibian(String name)
    {
        this.name=name;
    }

    @Override
    public void fly() {
        System.out.println(name +" is an amphibian and can fly ");

    }

    @Override
    public void swim() {
        System.out.println(name +" is an amphibian and can swim ");
    }
}
