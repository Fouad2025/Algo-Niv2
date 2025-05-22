import java.util.Scanner;
public class salairejalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quel est votre salaire BRUT ? (en euros) : ");
        double salaireBrut = scanner.nextDouble();
        
        double tauxCotisation = 0.23;
        double salaireNet = salaireBrut * (1 - tauxCotisation );
       System.out.print("Votre salaire NET sera de : " + String.format("%.2f", salaireNet) + " euros\n");
        scanner.close();
    }
}
