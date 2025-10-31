package isp;

public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        Kubus kubus = new Kubus();

        System.out.println("Persegi:");
        persegi.calculateArea();

        System.out.println("\nKubus:");
        kubus.calculateArea();
        kubus.calculateVolume();
    }
    
}
