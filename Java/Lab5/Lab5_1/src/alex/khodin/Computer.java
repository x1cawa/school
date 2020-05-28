package alex.khodin;

import java.io.Serializable;

public class Computer implements Serializable
{
    public enum BitDepth
    {
        x86,
        x64
    }

    public enum ProcessorCompany
    {
        Intel,
        Amd
    }

    public class OperatingSystem implements Serializable
    {
        public String name;
        public BitDepth bitDepth;

        public OperatingSystem() {}
        public OperatingSystem(String name, BitDepth bitDepth)
        {
            this.name = name;
            this.bitDepth = bitDepth;
        }
    }

    public class  Processor implements Serializable
    {
        public String name;
        public ProcessorCompany processorCompany;
        public float frequency;

        public Processor() {}
        public Processor(String name, ProcessorCompany processorCompany, float frequency)
        {
            this.name = name;
            this.processorCompany = processorCompany;
            this.frequency = frequency;
        }
    }

    public class RAM implements Serializable
    {
        public String name;
        public float sizeMB;

        public RAM() {}
        public RAM(String name) { this.name = name; }
        public RAM(String name, float sizeMB)
        {
            this.name = name;
            this.sizeMB = sizeMB;
        }

        public void setSizeKB(float sizeKB) { this.sizeMB = sizeKB / 1024; }
        public void setSizeMB(float sizeMB) { this.sizeMB = sizeMB; }
        public void setSizeGB(float sizeGB)
                throws ArithmeticException
        {
            if(((double) sizeGB) * 1024 > Float.MAX_VALUE)
                throw new ArithmeticException("Float Overflow");
            this.sizeMB = sizeGB * 1024;
        }

        public float getSizeKB()
        {
            if(((double) this.sizeMB) * 1024 > Float.MAX_VALUE)
                throw new ArithmeticException("Float Overflow");
            return this.sizeMB * 1024;
        }
        public float getSizeMB() { return this.sizeMB; }
        public float getSizeGB() { return this.sizeMB / 1024; }
    }

    public RAM ram;
    public Processor proc;
    public OperatingSystem os;

    public Computer() {}
}
