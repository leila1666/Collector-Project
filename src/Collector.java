import java.util.ArrayList;

public class Collector {
    private String trainer;
    private Creature activeCreature;
    private ArrayList<Creature> collection;


    public Collector(String trainer) {
        this.trainer = trainer;
        this.collection = new ArrayList<>();
    }

    public Collector(String trainer, Creature activeCreature) {
        this.trainer = trainer;
        this.activeCreature = activeCreature;
        this.collection = new ArrayList<>();
    }
//search for creature by name
    public Creature searchCreature(String name){
        for(Creature creature : collection){
            if (creature.getName().equalsIgnoreCase(name)){
                return creature;
            }
        }
        return null;
    }
//find creatures at or above a certain level
    public ArrayList<Creature> filterByLevel(int minimumLevel){
        ArrayList<Creature> result = new ArrayList<>();

        for (Creature creature : collection){
            if(creature.getLevel() >= minimumLevel){
                result.add(creature);
            }
            }
        return result;
    }


    public String getTrainer() {
        return trainer;
    }
    public Creature getActiveCreature() {
        return activeCreature;
    }

    public void addCreature(Creature creature) {
        collection.add(creature);
    }
    public ArrayList<Creature> getCollection(){
        return collection;
    }

    public void showCreatures() {
        System.out.println(trainer + " has these creatures: ");

        for (Creature creature : collection) {
            System.out.println("-" + creature);
        }
    }

    public String toString() {
        return trainer;
    }
}

