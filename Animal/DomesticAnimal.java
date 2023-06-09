package Animal;

class DomesticAnimal extends Animal {
    public DomesticAnimal(String name) {
        super(name);
    }

    // Переопределение метода makeSound()
    @Override
    public void makeSound() {
        System.out.println(getName() + " издает звук");
    }
}