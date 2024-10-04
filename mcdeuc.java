import java.util.Scanner;

public class mcdeuc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci il primo numero (a): ");
        int a = scanner.nextInt();
        
        System.out.print("Inserisci il secondo numero (b): ");
        int b = scanner.nextInt();
        
        int mcd = calcolaMCD(a, b);
        
        System.out.println("Il MCD tra " + a + " e " + b + " è: " + mcd);
    }
    
    public static int calcolaMCD(int a, int b) {
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }
}