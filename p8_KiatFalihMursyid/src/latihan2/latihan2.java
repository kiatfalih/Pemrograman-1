package latihan2;
import java.util.Scanner;

public class latihan2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char ulang;
    do {
      System.out.print("Nama: ");
      String nama = input.nextLine();
      System.out.print("NIM: ");
      String nim = input.nextLine();
      System.out.print("Data: "+ nama + " - "+ nim);
      System.out.print("\nUlangi? (y/n): ");
      ulang = input.nextLine().charAt(0);
    } while (ulang == 'y' || ulang == 'Y');
  }
}
