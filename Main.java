package TUBES2;

public class Main {
    public static void main(String[] args) {
        Pengguna pengguna = new Pengguna("081234567890");
        USSDService ussdService = new USSDService(pengguna);
        ussdService.showMenu();
    }
}