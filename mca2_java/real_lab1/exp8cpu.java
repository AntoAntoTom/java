import java.util.Scanner;

class Exp8CPU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter CPU Price:");
        int price = scanner.nextInt();

        System.out.println("Enter Processor Cores:");
        int cores = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Processor Manufacturer:");
        String processorManufacturer = scanner.nextLine();

        System.out.println("Enter RAM Memory (in GB):");
        int memory = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter RAM Manufacturer:");
        String ramManufacturer = scanner.nextLine();

        CPU.Processor processor = new CPU.Processor(cores, processorManufacturer);
        CPU.RAM ram = new CPU.RAM(memory, ramManufacturer);

        CPU cpu = new CPU(price, processor, ram);
        cpu.printInformation();

        scanner.close();
    }
}

class CPU {
    int price;
    Processor processor;
    RAM ram;

    CPU(int price, Processor processor, RAM ram) {
        this.price = price;
        this.processor = processor;
        this.ram = ram;
    }

    void printInformation() {
        System.out.println("CPU Information:");
        System.out.println("Price: " + price);
        System.out.println("Processor:");
        System.out.println("   Cores: " + processor.getCores());
        System.out.println("   Manufacturer: " + processor.getManufacturer());
        System.out.println("RAM:");
        System.out.println("   Memory: " + ram.getMemory() + "GB");
        System.out.println("   Manufacturer: " + ram.getManufacturer());
    }

    static class Processor {
        int cores;
        String manufacturer;

        Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        int getCores() {
            return cores;
        }

        String getManufacturer() {
            return manufacturer;
        }
    }

    static class RAM {
        int memory;
        String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        int getMemory() {
            return memory;
        }

        String getManufacturer() {
            return manufacturer;
        }
    }
}
