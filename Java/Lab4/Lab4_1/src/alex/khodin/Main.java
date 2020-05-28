package alex.khodin;

public class Main {

    public static void main(String[] args)
    {
        Computer computer = new Computer();
        Computer.OperatingSystem os = computer.new OperatingSystem("Windows", Computer.BitDepth.x64);
        Computer.Processor processor = computer.new Processor("i7", Computer.ProcessorCompany.Intel, 3.2f);
        Computer.RAM ram = computer.new RAM("RAM");
        ram.setSizeGB(8);
    }
}
