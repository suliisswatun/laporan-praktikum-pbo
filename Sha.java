// Abstract class
abstract class Shape {
    public static void main(String[] args) {
        // Abstract class
        Shape s = new Circle();
        s.draw();
    
        // Interface
        Drawable d = new Rectangle();
        d.draw();
    }
    abstract void draw(); // abstract method -> harus diimplementasi

}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Menggambar Lingkaran...");
    }
}

// Interface
interface Drawable {
    void draw();
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Menggambar Persegi Panjang...");
    }
}


