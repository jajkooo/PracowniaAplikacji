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

    /* zad 5*/
    Scanner scanner1 = new Scanner(System.in);
    System.out.print("3 boku trojkata po spacji ");
    double obwod = scanner1.nextDouble() + scanner1.nextDouble() + scanner1.nextDouble();
    System.out.println("Obwod: " + obwod);

    /* zad 6*/
    Scanner scanner2 = new Scanner(System.in);
    System.out.println("3 slowa:");
    String slowo1 = scanner2.next();
    String slowo2 = scanner2.next();
    String slowo3 = scanner2.next();
    System.out.println(slowo3 + ", " + slowo2 + ", " + slowo1);

    /* zad 7*/
    Scanner scanner3 = new Scanner(System.in);
    System.out.print("Podaj wyraz: ");
    String slowo = scanner3.next();1
    int liczbaZnaków = slowo.length();
    System.out.println(liczbaZnaków);

    /* zad 8*/
    
}
