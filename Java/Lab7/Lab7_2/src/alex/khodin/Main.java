package alex.khodin;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        HashMap<String, Integer> strCount = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type line");
        String line = scanner.nextLine();
        for(String str : line.split(" "))
        {
            if(strCount.containsKey(str))
                strCount.replace(str, strCount.get(str) + 1);
            else
                strCount.put(str, 1);
        }
        for(String key : strCount.keySet())
        {
            System.out.println(key + ": " + strCount.get(key).toString());
        }
    }
}
