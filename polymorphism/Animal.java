// Simpan dengan nama Animal.java
public class Animal {
    private String name;
    private int age;

    // constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void sound() {
        System.out.println("Hewan mengeluarkan suara...");
    }

    // getter
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    // main method tetap di sini
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Bulldog");
        Cat cat = new Cat("Kitty", 2, "Putih");

        dog.sound(); 
        System.out.println("Umur: " + dog.getAge() + " tahun, Ras: " + dog.getBreed());

        cat.sound();
        System.out.println("Umur: " + cat.getAge() + " tahun, Warna: " + cat.getColor());
    }
}

// Subclass Dog
class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age); // panggil constructor Animal
        this.breed = breed;
    }

    @Override
    void sound() {
        System.out.println("Anjing " + getName() + " menggonggong: Guk guk!");
    }

    public String getBreed() {
        return breed;
    }
}

// Subclass Cat
class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    void sound() {
        System.out.println("Kucing " + getName() + " mengeong: Meong!");
    }

    public String getColor() {
        return color;
    }
}
