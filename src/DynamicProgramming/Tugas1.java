package DynamicProgramming;
import java.util.Scanner;
public class Tugas1 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
       System.out.println("Kombinasi Pecahan");
       System.out.println("");
       System.out.print("Masukkan Jumlah Uang: ");
      
       int uang = input.nextInt();
       int a = 0, b = 0, c = 0, d = 0, e = 0;
       int[] nominal = new int[] {100, 500, 1000, 2000, 5000};
       
       System.out.println(" ");
        
       while(uang >= 5000)
       {
           uang = uang - 5000;
           a++;
       }
       System.out.println("Banyak uang 5000 sebanyak: " + a + " buah");
       
       while(uang >= 2000)
       {
           uang = uang - 2000;
           b++;
       }
       System.out.println("Banyak uang 2000 sebanyak: " + b + " buah");
       
       while(uang >= 1000)
       {
           uang = uang - 1000;
           c++;
       }
       System.out.println("Banyak uang 1000 sebanyak: " + c + " buah");
       
       while(uang >= 500)
       {
           uang = uang - 500;
           d++;
       }
       System.out.println("Banyak uang 500  sebanyak: " + d + " buah");
       
       while(uang >= 100)
       {
           uang = uang - 100;
           e++;
       }
       System.out.println("Banyak uang 100  sebanyak: " + e + " buah");
   }
}