void main() {
    /* zad 1*/
    System.out.println("Adam");
    System.out.println("Monia");
    System.out.println("Klaudek");

    /* zad 2*/
    String imie = "jajkooo";
    int urodzenie = 2007;
    double ulamek = 0.66;

    /* zad 3*/
    System.out.println("Mam na imię " + imie + ", mam " + (2026 - urodzenie) + " lat i będę pisać maturę za " + ulamek + " roku.");

    /* zad 4*/
    Scanner scanner = new Scanner(System.in);
    System.out.print("Aktualna temperatura c: ");
    double stopnie = scanner.nextDouble();
    double farenhajt = 1.8 * stopnie + 32.0;
    System.out.println("Aktualna temperatura w farenhajtach " + farenhajt);
}
