package ocp;
import ocp.TipePembayaran;

public class PembayaranCustomer {
    
    public void  menerimaPembayaran (TipePembayaran tipe) {
        System.out.println(" Customer melakukan pembayaran ");
        tipe.memprosesPembayaran();
        System.out.println("pembayaran berhasil dilakukan ");
    }
}
