package at.rangel.projects.oo.isahasa;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal(40, 20);
        Animal a2 = new Animal(60, 60);

        Zoo zoo = new Zoo("Tiergarten Schönbrunn", "Maxingstraße 13b");
        zoo.addAnimal(a1);
        zoo.addAnimal(a2);

        Dog d1 = new Dog(30, 50);
        d1.bark();
        zoo.addAnimal(d1);
        zoo.printAnimals();
    }
}
