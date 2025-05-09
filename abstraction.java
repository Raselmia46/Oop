
interface Sound{
    void makeSound();
}

abstract class Bird{
    String name;

    public Bird(String name) {
        this.name=name;
    }
    abstract void move();
    public void showName()
    {
        System.out.println("Bird name"+name);
    }

}

class Parot extends Bird implements Sound{

    public Parot(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Parot Says:Coco");
    }
    @Override
    void move() {
        System.out.println("Parot Fly");
    }
}

class Robin extends Bird implements Sound{
    public Robin(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Robin says: warbel!");
    }
    @Override
    void move() {
        System.out.println("Robin Fly easily");
    }
}

public class abstruction {
    public static void main(String[] args) {
        Bird parot = new Parot("Polly");
        parot.showName();
        ((Sound) parot).makeSound();
        parot.move();

        System.out.println();

        Bird robin = new Robin("Robin_bird");
        robin.showName();
        ((Sound) robin).makeSound();
        robin.move();
    }
}