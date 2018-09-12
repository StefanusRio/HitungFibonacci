package DynamicProgramming;
import java.util.Scanner;
public class HitungFibonacci {
    public static void tampilJudul(String identitas)
    {
        System.out.println("Identitas : "+ identitas);
        
        System.out.println("Hitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21,......dst");
    }
    public static int tampilInput()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bilangan ke- ");
        int n = scanner.nextInt();
        
        return n;     
    }
     public static void main(String args[])
    {
        String identitas = "Stefanus Ario Prabowo / X RPL 3/ 37";
        
        tampilJudul(identitas);
        
        int n = tampilInput();

    }
}
