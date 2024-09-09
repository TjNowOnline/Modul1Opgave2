import java.util.Scanner;

public class OpgaveScanner {
    public static void main(String[] args) {

                //Opretter en scanner-instans til at læse en brugers lder, navn samt decimaltal
                Scanner scanner = new Scanner(System.in);

                //Læser alder fra brugeren
                System.out.print("Indtast din alder: ");
                int heltal = scanner.nextInt();

                //Læser navn fra brugeren
                System.out.print("Indtast dit navn: ");
                String tekst = scanner.next();

                //Læser decimaltal fra brugeren
                System.out.print("Indtast et decimaltal: ");
                double decimaltal = scanner.nextDouble();
                System.out.println("Du indtastede: ");
                System.out.println("Alder: " + heltal);
                System.out.println("Navn: " + tekst);
                System.out.println("Decimaltal: " + decimaltal);





            }}