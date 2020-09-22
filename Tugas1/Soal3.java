import java.util.Scanner;
 
 
public class Soal3{
 public static void main(String[]args){
  Scanner amd = new Scanner(System.in);
  double nilai_pratikum;
  double nilai_asesmen_1;
   double nilai_asesmen_2;
  double nilai_akhir;
  
  System.out.print("Masukan nilai pratikum = ");
  nilai_pratikum = amd.nextDouble();
  
  System.out.print("Masukan nilai asesmen 1");
  nilai_asesmen_1 = amd.nextDouble();
  
  System.out.print("Masukan nilai asesmen 2");
  nilai_asesmen_2 = amd.nextDouble();
  
  double persentase_1 = 0.30;  //30%
  double persentase_2 = 0.45;  //45%
   double persentase_3 = 0.50;   //50%
   
   
  nilai_akhir = (persentase_1 * nilai_pratikum) + (persentase_2 * nilai_asesmen_1) + (persentase_3 * nilai_asesmen_2);
  
  System.out.println("Nilai akhir kamu adalah "+ nilai_akhir);
 }
}