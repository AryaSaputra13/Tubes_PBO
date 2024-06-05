package TUBES2;

//PulsaService.java
import java.util.Scanner;

public class PulsaService extends Service {
 private int saldoPulsa;

 public PulsaService(int saldoPulsa) {
     this.saldoPulsa = saldoPulsa;
 }

 @Override
 public void execute() {
     cekPulsa();
 }

 public void cekPulsa() {
     System.out.println("Sisa pulsa Anda: Rp " + saldoPulsa);
 }

 public void tampilkanOpsiIsiPulsa() {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Opsi Isi Pulsa:");
     System.out.println("1. Rp 5.000");
     System.out.println("2. Rp 10.000");
     System.out.println("3. Rp 20.000");
     System.out.print("Pilih opsi: ");
     int choice = scanner.nextInt();

     switch (choice) {
         case 1:
             isiPulsa(5000);
             break;
         case 2:
             isiPulsa(10000);
             break;
         case 3:
             isiPulsa(20000);
             break;
         default:
             System.out.println("Pilihan tidak valid. Silakan coba lagi.");
     }
 }

 private void isiPulsa(int jumlah) {
     saldoPulsa += jumlah;
     System.out.println("Pulsa berhasil diisi. Sisa pulsa Anda: Rp " + saldoPulsa);
 }

 public boolean kurangiPulsa(int jumlah) {
     if (saldoPulsa >= jumlah) {
         saldoPulsa -= jumlah;
         return true;
     }
     System.out.println("Pulsa tidak cukup.");
     return false;
 }
}
