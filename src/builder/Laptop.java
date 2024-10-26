package builder;

public class Laptop {
    String companyName;
    String cpu;
    String monitor;
    int ram;
    int weight;

    public Laptop(String companyName, String cpu, String monitor, int ram, int weight) {
        this.companyName = companyName;
        this.cpu = cpu;
        this.monitor = monitor;
        this.ram = ram;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "companyName='" + companyName + '\'' +
                ", cpu='" + cpu + '\'' +
                ", monitor='" + monitor + '\'' +
                ", ram=" + ram +
                ", weight=" + weight +
                '}';
    }
}
