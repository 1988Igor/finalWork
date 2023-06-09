package Animal;

class PackAnimal extends Animal {
    public PackAnimal(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " издает звук");
    }
}