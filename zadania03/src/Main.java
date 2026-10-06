void main () {
    Scanner scanner = new Scanner(System.in);
//zad1
    System.out.println("ZADANIE 1");
    System.out.print("Podaj liczbę: ");
    int liczba1 = scanner.nextInt();

    for (int i = 1; i <= liczba1; i += 2) {
        System.out.println(i);
    }

}