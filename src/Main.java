
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Collector marinette = new Collector("Marinette");
        marinette.addCreature(new Creature("Tiki", "Creation", "Red", 5, 200, 20));
        marinette.addCreature(new Creature("Trixx", "Illusion", "Orange", 1, 100, 15));
        marinette.addCreature(new Creature("Pollen", "Immobilization", "Yellow", 1, 100, 15));

        Collector adrien = new Collector("Adrien");
        adrien.addCreature(new Creature("Plagg", "Destruction", "Black", 5, 200, 20));
        adrien.addCreature(new Creature("Wayzz", "Protection", "Green", 1, 100, 15));
        adrien.addCreature(new Creature("Fluff", "Time Travel", "White", 1, 100, 15));

        List<Collector> allCollectors = new ArrayList<>();
        allCollectors.add(marinette);
        allCollectors.add(adrien);

        ArrayList<Creature> strongCreatures = marinette.filterByLevel(5);

        //Display everyone's Creatures
        System.out.println("Current locations:");

        for (Collector collector : allCollectors) {
            System.out.println(collector.getTrainer() + "'s Collection: ");
            for (Creature creature : collector.getCollection()) {
                System.out.println(" - " + creature);
            }
        }

        //Search for a creature by name
        boolean found = false;
        while (!found) {
            System.out.print("Enter creature name to search: ");
            String searchQuery = input.nextLine();

            System.out.println("Searching for: " + searchQuery + "...");


            for (Collector collector : allCollectors) {
                for (Creature creature : collector.getCollection()) {
                    if (creature.getName().equalsIgnoreCase(searchQuery)) {
                        System.out.println(searchQuery + " belongs to " + collector.getTrainer());
                        found = true;
                    }
                }
            }
            if (!found) {
                System.out.println("No collector owns a creature named " + searchQuery);
                System.out.println("Please try again.");
            }
        }
            //search for creature by colour
        found = false;
        while(!found) {
            System.out.println("Enter the creature's colour to search: ");
            String colourQuery = input.nextLine();


            System.out.println("Search for colour: " + colourQuery + "...");

            for (Collector collector : allCollectors) {
                for (Creature creature : collector.getCollection()) {
                    if (creature.getColour().equalsIgnoreCase(colourQuery)) {
                        System.out.println(colourQuery + " belongs to " + collector.getTrainer());
                        found = true;
                    }
                }
            }
            if (!found) {
                System.out.println("No collector owns a creature coloured " + colourQuery);
                System.out.println("Please try again.");
            }
        }

        }
    }



















