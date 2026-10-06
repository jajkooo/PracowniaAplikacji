void main () {
    Scanner scanner = new Scanner(System.in);
//zad1
    System.out.println("ZADANIE 1");
    System.out.print("Podaj liczbę: ");
    int liczba1 = scanner.nextInt();

    for (int i = 1; i <= liczba1; i += 2) {
        System.out.println(i);
    }

//zad2
    System.out.println("ZADANIE 2");
    System.out.print("Podaj liczbę: ");
    int liczba2 = scanner.nextInt();

    int potega = 1;

    while (potega <= liczba2) {
        System.out.println(potega);
        potega = potega * 2;
    }
//zad3
    System.out.println("ZADANIE 3");
    System.out.println("Podawaj liczby. 0 kończy program.");

    int liczba3;
    int suma3 = 0;

    do {
        liczba3 = scanner.nextInt();
        suma3 = suma3 + liczba3;
    } while (liczba3 != 0);

    System.out.println("Suma: " + suma3);


}