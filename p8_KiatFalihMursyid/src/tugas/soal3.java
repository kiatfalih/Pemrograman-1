package tugas;
import java.util.Scanner;

public class soal3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int realisasi = 0;
    float totalKeseluruhan = 0;
    float r = 0;
    char ulang;
    // input sks
    System.out.print("input 2 sks / 3 sks: ");
    int sks = input.nextInt();
    if(sks == 2) {
      realisasi = 14;
    } else if(sks == 3) {
      realisasi = 21;
    } else {
      System.out.println("input salah");
      return;
    }

    do {
      // input kehadiran dan nilai
      System.out.print("input kehadiran: ");
      int kehadiran = input.nextInt();
      System.out.print("input nilai tugas: ");
      int tugas = input.nextInt();
      System.out.print("input nilai uts: ");
      int uts = input.nextInt();
      System.out.print("input nilai uas: ");
      int uas = input.nextInt();
      // hitung nilai akhir
      float Presensi = ((float)kehadiran / realisasi) * 10;
      int TUGAS = tugas * 20/100;
      int UTS = uts * 30/100;
      int UAS = uas * 40/100;
      float Total = Presensi + TUGAS + UTS + UAS;
      totalKeseluruhan += Total;
      r++;
      float rataRata = totalKeseluruhan / r;

      // tampilkan hasil
      System.out.println("Total nilai kamu: " + (int)Total);
      System.out.println("rata-rata nilai kamu: " + (int)rataRata);
      System.out.print("Ulangi? (y/n): ");
      ulang = input.next().charAt(0);
    } while (ulang == 'y' || ulang == 'Y');
    System.out.print("program selesai.");
  }
}
