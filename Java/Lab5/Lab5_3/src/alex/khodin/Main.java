package alex.khodin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args)
    {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'y'));
        try
        {
            File file = new File("./src/alex/khodin/text.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = "";
            while(true)
            {
                line = reader.readLine();
                if(line == null)
                    break;
                String[] strs = line.split(" ");
                for(String str : strs)
                    if(vowels.contains(str.charAt(0)))
                        System.out.print(str + " ");
                System.out.println();
            }
        } catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
