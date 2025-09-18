//Da jeg skal bruge input fra brugeren, inporterer jeg scanneren.
import java.util.Scanner;


// Først laver jeg min LoanItem klasse som er en slags skabelon med mine attributter.
class LoanItem {
    int id;
    String type;
    String title;

    // Her laver jeg konstruktøren som er min specielle metode som kører når vi opretter et nyt Item.
    public LoanItem(int id, String type, String title) {
        this.id = id;
        this.type = type;
        this.title = title;
    }

    //Her er det mit toString som samler variablerne i et objekt. Dette bruges til at udskrive objektets informationer.
    public String toString() {
        return id + "   " + type + "      " + title;
    }
}

//Her laver jeg så min main metode som er koden der skal køres.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Printer her velkommen beskeden.
        System.out.println("Hello there and welcome to the library!");

        // Her printer jeg så string som spørger hvor mange enheder brugeren ønsker at låne. Og tager i mod og gemmer brugerens input.
        System.out.print("How many loan items do you wish to register today? ");
        int count = in.nextInt();
        in.nextLine();

        // Laver det array som skal gemme flere af de objekter som brugeren giver som input. På den måde kan vi håndtere mange genstande på én gang.
        LoanItem[] items = new LoanItem[count];

        // Her bruger jeg loopet til at gentage min kode. 
        for (int i = 0; i < count; i++) {
            System.out.println("Item " + (i+1));

            System.out.print("  Type (B or V): ");
            String type = in.nextLine();

            System.out.print("  Title: ");
            String title = in.nextLine();

            // opretter objekt
            items[i] = new LoanItem(i+1, type, title);
        }

        // Til sidst producerer jeg outputtet i nogenlunde samme stil.
        System.out.println("\nLIST OF LOAN ITEMS");
        System.out.println("______________________");
        System.out.println("ID  " + "Type   " + "Title  ");
        for (LoanItem item : items) {
            System.out.println(item);
        }
        
    }
}
