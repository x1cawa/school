package alex.khodin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        List<Integer> currInts = new ArrayList<>();
        System.out.println("Input ints, char to stop input");
        try
        {
            while (true)
            {
                currInts.add(scanner.nextInt());
            }
        }catch(Exception ex) {}

        List<Integer> nextInts = new ArrayList<>();
        while (true)
        {
            if(currInts.size() == 1)
                break;
            for(int i = 1; i < currInts.size(); i++)
                nextInts.add(currInts.get(i-1) + currInts.get(i));
            printList(nextInts);
            currInts = new ArrayList<>(nextInts);
            nextInts.clear();
        }
    }
    public static void printList(List<Integer> ints)
    {
        for (Integer i : ints)
        {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }
}
