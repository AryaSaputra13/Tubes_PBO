package TUBES2;

public class InformasiAkunService extends Service {
    private Pengguna pengguna;

    public InformasiAkunService(Pengguna pengguna) {
        this.pengguna = pengguna;
    }

    @Override
    public void execute() {
        cekInformasiAkun();
    }

    public void cekInformasiAkun() {
        System.out.println("Nomor Seluler Anda: " + pengguna.getNomorSeluler());
        System.out.println("Masa aktif kartu Anda hingga: 31-12-2024");
        System.out.println("Bonus: 100 SMS");
    }
}