import java.util.Scanner;

public class Soal1 {
 public static void main(String[]args){
  Scanner amd = new Scanner(System.in);
  int bilangan;
  System.out.print("Masukan bilangan bulat = ");
  bilangan = amd.nextInt();
  
  bilangan = bilangan * bilangan;
  System.out.println("Hasilnya adalah "+ bilangan) ;
 }
}