package alex.khodin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type text");
        String line = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder();
        String[] strs = line.split(" ");
        for(int i = 1; i < strs.length; i++)
            stringBuilder.append(strs[i] + " ");
        stringBuilder.append(strs[0]);
        System.out.println(stringBuilder.toString());
    }
}
