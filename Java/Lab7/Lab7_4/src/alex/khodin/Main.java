package alex.khodin;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type text");
        char[] line = scanner.nextLine().toCharArray();
        char chBuff = line[0];
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(chBuff);
        for(char ch : line)
        {
            if(ch != chBuff)
            {
                stringBuilder.append(ch);
                chBuff = ch;
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
