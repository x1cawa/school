package alex.khodin;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        var out = System.out;

        out.println("Type line");
        String input = scanner.nextLine();
        //abc abcd abcde abcdef abcdefg abc abcdefgh abcdef abcd abc
        out.println("Position to change: ");
        int pos = scanner.nextInt();
        out.println("Character to change: ");
        scanner.nextLine();
        char ch = scanner.nextLine().charAt(0);

        String[] strs = input.split(" ");
        for(String str : strs)
        {
            if(pos < str.length())
                out.print(str.substring(0, pos) + ch + str.substring(pos + 1) + " ");
            else
                out.print(str + " ");
        }
    }
}
