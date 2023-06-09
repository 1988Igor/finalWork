package Animal;

class Horse extends PackAnimal {
    public Horse(String name) {
        super(name);
    }

    public void gallop() {
        System.out.println(getName() + " галопирует");
    }
}
