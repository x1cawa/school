package alex.khodin;

import java.io.PrintStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        PrintStream out = System.out;
        Scanner scanner = new Scanner(System.in);
        out.println("Type words with space. Click 'enter' to calculate.");

        String line = scanner.nextLine();
        List<String> arr = Arrays.asList(line.split(" "));

        arr.sort((a, b) ->
        {
            if(a.length() > b.length())
                return -1;
            else if(a.length() == b.length())
                return 0;
            else
                return 1;
        });

        out.print("Sort by length decrease: ");
        arr.forEach( str -> out.print(str + " "));
        out.println();

        out.print("Polyndrom numbers: ");
        arr.forEach( str ->
        {
            try
            {
                Integer.parseInt(str);
                Boolean isPoly = true;
                int len = str.length();
                for(int i = 0; i < len / 2; i++)
                    if(str.charAt(i) != str.charAt(len - i - 1))
                        isPoly = false;

                if(isPoly)
                    out.print(str + " ");
            } catch (NumberFormatException ex){}
        });
        out.println();

        LocalDateTime dateGotEx = LocalDateTime.of(2020, Month.FEBRUARY, 14, 18, 36);
        LocalDateTime datePassEx = LocalDateTime.now();
        out.print("Дата получения задания: ");
        out.println(dateGotEx);
        out.print("Дата сдачи задания: ");
        out.println(datePassEx);
    }
}
