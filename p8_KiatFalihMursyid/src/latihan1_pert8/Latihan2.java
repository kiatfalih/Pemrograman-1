package latihan1_pert8;
import java.util.Scanner;

public class Latihan2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("input pilihan: ");
    int c = input.nextInt();
    
    if (c == 1) {
      int k;
      int a;
      System.out.print("input kehadiran: ");
      k = input.nextInt();
      float v = 21 * 75/100; 
      for (a = 1 ; k <= v; a++) {
        System.out.println("kehadiran kamu tidak memenuhi syarat (<= 75%)");
        System.out.print("input kehadiran: ");
        k = input.nextInt();
        }
        System.out.println("kehadiran kamu memenuhi syarat");
    } else {
      System.out.println("kamu tidak memilih pilihan");
    }
    System.out.println("terimakasih sudah menggunakan program kami");
  }
}
