package srp;
public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(5);
        
        PenghitungPersegi penghitung = new PenghitungPersegi();
        int luas = penghitung.hitungLuas(persegi);
        System.out.println("Luas Persegi: " + luas);
    }
    
}
