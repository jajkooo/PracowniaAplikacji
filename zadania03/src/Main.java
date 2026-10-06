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


//zad4
    System.out.println("ZADANIE 4");
    System.out.println("Podawaj liczby. 0 kończy program.");

    int liczba4;
    int suma4 = 0;
    int ilosc4 = 0;
    int najmniejsza = 0;
    int najwieksza = 0;

    do {
        liczba4 = scanner.nextInt();

        if (liczba4 != 0) {

            if (ilosc4 == 0) {
                najmniejsza = liczba4;
                najwieksza = liczba4;
            }

            if (liczba4 < najmniejsza) {
                najmniejsza = liczba4;
            }

            if (liczba4 > najwieksza) {
                najwieksza = liczba4;
            }

            suma4 = suma4 + liczba4;
            ilosc4++;
        }

    } while (liczba4 != 0);

    if (ilosc4 > 0) {
        System.out.println("Najmniejsza: " + najmniejsza);
        System.out.println("Największa: " + najwieksza);
        System.out.println("Suma najmniejszej i największej: " + (najmniejsza + najwieksza));

        double srednia = (double) suma4 / ilosc4;
        System.out.println("Średnia: " + srednia);
    } else {
        System.out.println("Nie podano żadnych liczb.");
    }


}