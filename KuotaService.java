package TUBES2;

import java.util.Scanner;

public class KuotaService extends Service {
    private int kuotaInternet; // Kuota dalam MB

    public KuotaService(int kuotaInternet) {
        this.kuotaInternet = kuotaInternet;
    }

    @Override
    public void execute() {
        cekKuota();
    }

    public void cekKuota() {
        System.out.println("Sisa kuota internet Anda: " + kuotaInternet + "MB");
    }

    public void tampilkanOpsiTambahKuota(PulsaService pulsaService) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Opsi Tambah Kuota:");
        System.out.println("1. 500 MB - Rp 5.000");
        System.out.println("2. 1 GB - Rp 10.000");
        System.out.println("3. 2 GB - Rp 20.000");
        System.out.print("Pilih opsi: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                tambahKuota(pulsaService, 500, 5000);
                break;
            case 2:
                tambahKuota(pulsaService, 1024, 10000);
                break;
            case 3:
                tambahKuota(pulsaService, 2048, 20000);
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }
    }

    private void tambahKuota(PulsaService pulsaService, int kuota, int harga) {
        if (pulsaService.kurangiPulsa(harga)) {
            kuotaInternet += kuota;
            System.out.println("Kuota berhasil ditambahkan. Sisa kuota internet Anda: " + kuotaInternet + "MB");
        }
    }
}
