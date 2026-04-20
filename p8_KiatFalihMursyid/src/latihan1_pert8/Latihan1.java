package latihan1_pert8;
import java.util.Scanner;

public class Latihan1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("input batas: ");
    int b = input.nextInt();
    for(int a = 1; a <= b; a++){
      System.out.println("nilai ke: "+ a);
    }
  }
}
