package Animal;

class Cat extends DomesticAnimal {
    public Cat(String name) {
        super(name);
    }


    public void meow() {
        System.out.println(getName() + " мяукает");
    }
}