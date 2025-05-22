import java.util.Scanner;
public class bouteille  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Combien de litre d'eau voulez-vous boire ? ");
        double litres = scanner.nextDouble();
        if (litres <= 1) {
            System.out.println("Il reste encore " + (1 - litres) * 100 + " cl d'eau à boire.");
        } else {
            System.out.println("La bouteille d'eau est vide.");
            scanner.close();
        
        }
    }
}