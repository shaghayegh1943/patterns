package builder;

public class LaptopBuilder {
    String companyName;
    String cpu;
    String monitor;
    int ram;
    int weight;

    public LaptopBuilder setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public LaptopBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public LaptopBuilder setMonitor(String monitor) {
        this.monitor = monitor;
        return this;
    }

    public LaptopBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public LaptopBuilder setWeight(int weight) {
        this.weight = weight;
        return this;
    }
    public Laptop getLaptop(){
        return new Laptop(companyName,cpu,monitor,ram,weight);
    }
}
