import java.util.PriorityQueue;

public class MeteorManager {
    private PriorityQueue<Meteor> meteorQueue;

    public MeteorManager() {
        this.meteorQueue = new PriorityQueue<>();
    }

    public void addMeteor(Meteor meteor) {
        if (meteor == null) {
            throw new IllegalArgumentException("Cannot add a null meteor.");
        }
        meteorQueue.add(meteor);
    }

    public Meteor getNextMeteor() {
        if (meteorQueue.isEmpty()) {
            throw new IllegalStateException("No meteors to retrieve.");
        }
        return meteorQueue.poll();
    }

    public void clearAllMeteors() {
        meteorQueue.clear();
    }

    @Override
    public String toString() {
        return meteorQueue.toString();
    }

    public static void main(String[] args) {
        try {
            MeteorManager meteorManager = new MeteorManager();
            meteorManager.addMeteor(new Meteor("A", 10));
            meteorManager.addMeteor(new Meteor("B", 5));
            meteorManager.addMeteor(new Meteor("C", 15));
            meteorManager.addMeteor(new Meteor("D", 1));
            meteorManager.addMeteor(new Meteor("E", 20));

            System.out.println("Order to destroy meteors:");
            while (!meteorManager.meteorQueue.isEmpty()) {
                System.out.println(meteorManager.getNextMeteor());
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}