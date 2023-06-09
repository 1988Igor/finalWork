package Animal;

class Donkey extends PackAnimal {
    public Donkey(String name) {
        super(name);
    }

    public void carryLoad() {
        System.out.println(getName() + " несет груз");
    }
}