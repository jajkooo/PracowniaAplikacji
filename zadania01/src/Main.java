void main() {
    /* zad 1*/
  //  System.out.println("Adam");
  //  System.out.println("Monia");
  //  System.out.println("Klaudek");

    /* zad 2*/
  //  String imie = "jajkooo";
 //   int urodzenie = 2007;
 //   double ulamek = 0.66;

    /* zad 3*/
 //   System.out.println("Mam na imię " + imie + ", mam " + (2026 - urodzenie) + " lat i będę pisać maturę za " + ulamek + " roku.");

    /* zad 4*/
    Scanner scanner = new Scanner(System.in);
//    System.out.print("Aktualna temperatura c: ");
//    double stopnie = scanner.nextDouble();
//    double farenhajt = 1.8 * stopnie + 32.0;
//    System.out.println("Aktualna temperatura w farenhajtach " + farenhajt);

    /* zad 5*/
//    System.out.print("3 boku trojkata po spacji ");
//    double obwod = scanner.nextDouble() + scanner.nextDouble() + scanner.nextDouble();
//    System.out.println("Obwod: " + obwod);

    /* zad 6*/

//    System.out.println("3 slowa:");
//    String slowo1 = scanner.next();
//    String slowo2 = scanner.next();
//    String slowo3 = scanner.next();
//    System.out.println(slowo3 + ", " + slowo2 + ", " + slowo1);

    /* zad 7*/

//    System.out.print("Podaj wyraz: ");
//    String slowo = scanner.next();
//    int liczbaZnaków = slowo.length();
//    System.out.println(liczbaZnaków);

    /* zad 8*/
//    double x = 5;
//    double y = 2;
//    double wynik = x / y;
//    System.out.println(wynik);

    /* zad 9*/
 //   String slowo4;
 //   System.out.print("Podaj slowo: ");
 //  slowo4 = scanner.nextLine();
//    System.out.println(slowo4.toUpperCase());

    /* zad10*/
//    Scanner scanner7 = new Scanner(System.in);
    //   System.out.print("Promien: ");
  //  int promien = scanner7.nextInt();
//    double pole = Math.PI * promien * promien;
//    System.out.println("Pole koła: " + pole);

    /* zad 1 */
    System.out.print("Podaj liczbę: ");
    int liczbaZ1 = scanner.nextInt();
    if (liczbaZ1 % 3 == 0) {
        System.out.println("Liczba jest podzielna przez 3.");
    } else {
        System.out.println("Liczba nie jest podzielna przez 3.");
    }

    /* zad 2 */
    System.out.print("Podaj 3 boki trójkąta po spacji: ");
    double b1 = scanner.nextDouble();
    double b2 = scanner.nextDouble();
    double b3 = scanner.nextDouble();
    if (b1 + b2 > b3 && b1 + b3 > b2 && b2 + b3 > b1) {
        System.out.println("Można zbudować trójkąt.");
    } else {
        System.out.println("Nie można zbudować trójkąta.");
    }

    /* zad 3 */
    System.out.print("Podaj dwie liczby po spacji: ");
    double l1 = scanner.nextDouble();
    double l2 = scanner.nextDouble();
    double max2 = (l1 > l2) ? l1 : l2;
    System.out.println("Największa liczba to: " + max2);

    /* zad 4 */
    System.out.print("Podaj trzy liczby po spacji: ");
    double la = scanner.nextDouble();
    double lb = scanner.nextDouble();
    double lc = scanner.nextDouble();
    double max3 = la;
    if (lb > max3) max3 = lb;
    if (lc > max3) max3 = lc;
    System.out.println("Największa liczba to: " + max3);

    /* zad 5 */
    System.out.print("Podaj numer miesiąca (1-12): ");
    int miesiac = scanner.nextInt();
    switch (miesiac) {
        case 1: System.out.println("Styczeń"); break;
        case 2: System.out.println("Luty"); break;
        case 3: System.out.println("Marzec"); break;
        case 4: System.out.println("Kwiecień"); break;
        case 5: System.out.println("Maj"); break;
        case 6: System.out.println("Czerwiec"); break;
        case 7: System.out.println("Lipiec"); break;
        case 8: System.out.println("Sierpień"); break;
        case 9: System.out.println("Wrzesień"); break;
        case 10: System.out.println("Październik"); break;
        case 11: System.out.println("Listopad"); break;
        case 12: System.out.println("Grudzień"); break;
        default: System.out.println("Nieprawidlowy numer miesiaca");
    }

    /* zad 6 */
    System.out.print("Podaj swoje imię: ");
    String wpisaneImie = scanner.next();
    String mojeImie = "Java"; // Możesz wpisać swoje imię
    if (wpisaneImie.equals(mojeImie)) {
        System.out.println("Masz takie samo imię jak ja!");
    } else {
        System.out.println("Masz inne imię niż ja.");
    }

    /* zad 7 */
    System.out.print("Podaj swój wiek: ");
    int wiek = scanner.nextInt();
    boolean pelnoletni = (wiek >= 18) ? true : false;
    System.out.println("Czy pełnoletni: " + pelnoletni);

    /* zad 8 */
    System.out.print("Podaj rok: ");
    int rok = scanner.nextInt();
    if ((rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0)) {
        System.out.println("Podany rok jest rokiem przestępnym.");
    } else {
        System.out.println("Podany rok nie jest rokiem przestępnym.");
    }

    /* zad 9 */
    System.out.print("Podaj wagę (w kg) i wzrost (w m) po spacji: ");
    double waga = scanner.nextDouble();
    double wzrost = scanner.nextDouble();
    double bmi = waga / (wzrost * wzrost);
    if (bmi >= 18.5 && bmi <= 24.9) {
        System.out.println("waga prawidłowa");
    } else if (bmi < 18.5) {
        System.out.println("niedowaga");
    } else {
        System.out.println("nadwaga");
    }

    /* zad 10 */
    double cena = 0;
    int raty = 0;
    while (true) {
        System.out.print("Podaj cenę towaru (od 100 zł do 10 tyś. zł): ");
        cena = scanner.nextDouble();
        if (cena >= 100 && cena <= 10000) break;
        System.out.println("Błędna cena! Spróbuj ponownie.");
    }
    while (true) {
        System.out.print("Podaj liczbę rat (od 6 do 48): ");
        raty = scanner.nextInt();
        if (raty >= 6 && raty <= 48) break;
        System.out.println("Błędna liczba rat! Spróbuj ponownie.");
    }
    double oprocentowanie = 0.0;
    if (raty <= 12) oprocentowanie = 0.025;
    else if (raty <= 24) oprocentowanie = 0.05;
    else oprocentowanie = 0.10;

    double miesiecznaRata = (cena * (1 + oprocentowanie)) / raty;
    System.out.println("Wysokość miesięcznej raty wynosi: " + miesiecznaRata);

    /* zad 11 */
    System.out.println("Program kalkulator: wykonuje działania na dwóch liczbach.");
    System.out.print("Podaj pierwszą liczbę: ");
    double calcL1 = scanner.nextDouble();
    System.out.print("Podaj symbol operacji (+, -, *, /): ");
    char operator = scanner.next().charAt(0);
    System.out.print("Podaj drugą liczbę: ");
    double calcL2 = scanner.nextDouble();

    switch (operator) {
        case '+':
            System.out.println("Wynik: " + (calcL1 + calcL2));
            break;
        case '-':
            System.out.println("Wynik: " + (calcL1 - calcL2));
            break;
        case '*':
            System.out.println("Wynik: " + (calcL1 * calcL2));
            break;
        case '/':
            if (calcL2 == 0) {
                System.out.println("Błąd: Próba dzielenia przez zero!");
            } else {
                System.out.println("Wynik: " + (calcL1 / calcL2));
            }
            break;
        default:
            System.out.println("Błąd: Wprowadzono błędny symbol działania!");
            break;
    }
}
