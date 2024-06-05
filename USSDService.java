package TUBES2;

import java.util.Scanner;

public class USSDService {
    private PulsaService pulsaService;
    private KuotaService kuotaService;
    private InformasiAkunService informasiAkunService;
    private Pengguna pengguna;

    public USSDService(Pengguna pengguna) {
        this.pengguna = pengguna;
        pulsaService = new PulsaService(10000); // Initial pulsa
        kuotaService = new KuotaService(1024); // Initial kuota in MB
        informasiAkunService = new InformasiAkunService(pengguna);
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("USSD Menu:");
            System.out.println("1. Cek Pulsa");
            System.out.println("2. Cek Kuota");
            System.out.println("3. Informasi Akun");
            System.out.println("4. Isi Ulang Pulsa");
            System.out.println("5. Tambah Kuota");
            System.out.println("6. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    pulsaService.execute();
                    break;
                case 2:
                    kuotaService.execute();
                    break;
                case 3:
                    informasiAkunService.execute();
                    break;
                case 4:
                    pulsaService.tampilkanOpsiIsiPulsa();
                    break;
                case 5:
                    kuotaService.tampilkanOpsiTambahKuota(pulsaService);
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan layanan USSD.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}