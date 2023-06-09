package Animal;

class Dog extends DomesticAnimal {
    public Dog(String name) {
        super(name);
    }


    public void bark() {
        System.out.println(getName() + " лает");
    }
}
