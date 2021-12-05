package day34animalproject;

public class Eagle extends Animal{
    
    String name;
    int age;
    String habitat;
    boolean isDomestic;
    
    public Eagle() {
        }
    
    public Eagle(String name, int age, String habitat, boolean isDomestic) {
        super(name, age, habitat, isDomestic);
        this.name = name;
        this.age = age;
        this.habitat = habitat;
        this.isDomestic = isDomestic;
    }
    @Override
    String animalName() {
        return this.name;
    }
    @Override
    int animalAge() {
        return this.age;
    }
    @Override
    String habitat() {
        return this.habitat;
    }
    @Override
    boolean isDomestic() {
        return this.isDomestic;
    }
    
}
