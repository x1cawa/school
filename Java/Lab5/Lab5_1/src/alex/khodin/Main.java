package alex.khodin;

import java.io.*;

public class Main {

    public static void main(String[] args)
    {
	    Computer computer = new Computer();
        computer.os = computer.new OperatingSystem();
	    computer.ram = computer.new RAM();
	    computer.proc = computer.new Processor();

	    try
        {
            FileOutputStream fout = new FileOutputStream(new File("computer.txt"));
            ObjectOutputStream sout = new ObjectOutputStream(fout);

            sout.writeObject(computer);
            fout.close();
            sout.close();

            FileInputStream fin = new FileInputStream(new File("computer.txt"));
            ObjectInputStream sin = new ObjectInputStream(fin);

            // Read objects
            Computer c = (Computer) sin.readObject();
        } catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }


    }
}
