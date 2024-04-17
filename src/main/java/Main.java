import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Wczytanie znaku
    System.out.print("Podaj znak do narysowania trojkata: ");
    char znak = scanner.next().charAt(0);

    // Wczytanie rozmiaru trojkata
    System.out.print("Podaj rozmiar trojkata: ");
    int wiersz = scanner.nextInt();

    // Rysowanie trojkata
    for (int i = 1; i <= wiersz; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(znak + " ");
      }
      System.out.println();
    }
  }
}
