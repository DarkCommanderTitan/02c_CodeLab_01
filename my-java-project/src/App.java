public class App {
    public static void main(String[] args) {
        Konto konto1 = new Konto();
        Konto konto2 = new Konto();
        Konto konto3 = new Konto();

        // Output initial balances
        System.out.println("Initial Kontostand:");
        System.out.println("Konto1: " + konto1.getKontostand());
        System.out.println("Konto2: " + konto2.getKontostand());
        System.out.println("Konto3: " + konto3.getKontostand());

        // Modify balances
        konto1.setKontostand(konto1.getKontostand() * 2);
        konto2.setKontostand(konto2.getKontostand() * 3);
        konto3.setKontostand(konto3.getKontostand() * 10);

        // Output updated balances
        System.out.println("Updated Kontostand:");
        System.out.println("Konto1: " + konto1.getKontostand());
        System.out.println("Konto2: " + konto2.getKontostand());
        System.out.println("Konto3: " + konto3.getKontostand());
    }
}