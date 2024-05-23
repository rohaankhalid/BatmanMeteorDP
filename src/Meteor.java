public class Meteor implements Comparable<Meteor>{
    private String name;
    private int impactTime;

    public Meteor(String name, int impactTime) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Meteor name cannot be null or empty.");
        }
        if (impactTime < 0) {
            throw new IllegalArgumentException("Impact time cannot be negative.");
        }
        this.name = name;
        this.impactTime = impactTime;
    }

    public String getName() {
        return name;
    }

    public int getImpactTime() {
        return impactTime;
    }

    @Override
    public int compareTo(Meteor other) {
        return Integer.compare(this.impactTime, other.impactTime);
    }

    @Override
    public String toString() {
        return "Meteor{" +
                "name='" + name + '\'' +
                ", impactTime=" + impactTime +
                '}';
    }
}
