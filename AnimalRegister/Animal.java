package AnimalRegister;

import java.util.ArrayList;
import java.util.List;

public  class Animal {
    private String name;
    private String species;
    private int age;
    private List<String> commands;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.commands = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void showCommands() {
        System.out.println("Команды для животного " + name + ":");
        for (String command : commands) {
            System.out.println("- " + command);
        }
    }

    public void addCommand(String command) {
        commands.add(command);
    }
}