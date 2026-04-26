package tugas;
import java.util.Scanner;

public class soal1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char ulang;
    do {
      // input nilai
      System.out.print("Masukkan nilai: ");
      int nilai = input.nextInt();
      // menampilkan nilai
      System.out.println("Nilai yang dimasukkan: " + nilai);
      // menanyakan apakah ingin mengulang
      System.out.print("Ulangi? (y/n): ");
      ulang = input.next().charAt(0);
    } while (ulang == 'y' || ulang == 'Y');
    System.out.println("Program selesai.");
  }
}
