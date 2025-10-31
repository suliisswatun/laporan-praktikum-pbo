package ocp;

public class Main {
    public static void main(String[] args) {
        PembayaranCustomer pembayaranCustomer = new PembayaranCustomer();
        
        TipePembayaran cash = new Cash();
        pembayaranCustomer.menerimaPembayaran(cash);
        
        TipePembayaran debit = new Debit();
        pembayaranCustomer.menerimaPembayaran(debit);
        
        TipePembayaran kredit = new Kredit();
        pembayaranCustomer.menerimaPembayaran(kredit);
    }
    
}
