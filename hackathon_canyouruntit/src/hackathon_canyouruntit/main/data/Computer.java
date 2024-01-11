package hackathon_canyouruntit.main.data;

public class Computer {
    private Disk disk;
    private CPU cpu;
    private RAM ram;

    public Computer(Disk disk, CPU cpu, RAM ram) {
        this.cpu = cpu;
        this.disk = disk;
        this.ram = ram;
    }

    public CPU getCpu() {
        return cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public Disk getDisk() {
        return disk;
    }
}

