public class Calculator {

    private String brand;

    public Calculator(String brand) {
        this.brand = brand;
    }

    // getter brand
    public String getBrand() {
        return brand;
    }

    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator("Casio");

        System.out.println("Calculator brand: " + calc.getBrand());
        System.out.println("Tambah int: " + calc.add(2, 3));
        System.out.println("Tambah double: " + calc.add(2.5, 3.5));
    }
}
