package Animal;

class Hamster extends DomesticAnimal {
    public Hamster(String name) {
        super(name);
    }


    public void runOnWheel() {
        System.out.println(getName() + " бегает на колесе");
    }
}