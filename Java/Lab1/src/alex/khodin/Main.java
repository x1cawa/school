package alex.khodin;

import javax.swing.*;
import java.io.PrintStream;
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Hello hello = new Hello();

        PrintStream out = System.out;
        Scanner scanner = new Scanner(System.in);

        out.println("Type numbers with enter or space. Type non number to calculate.");
        //1 -2 -355 6 -3 446 -70 555 5 11 -4 7 345 -13 8 10 9 35 u

        List<Integer> arr = new ArrayList<>();
        try
        {
            while(true)
            {
                Integer n = scanner.nextInt();
                arr.add(n);
            }
        } catch (InputMismatchException ex) {}

        out.println("Array:");
        printList(arr);

        out.println("Calculating...");

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        List<Integer> divided3or9 = new ArrayList<>();
        List<Integer> divided5n7 = new ArrayList<>();
        List<Integer> noSameDigits = new ArrayList<>();
        List<Integer> primes = new ArrayList<>();

        Integer max = Integer.MIN_VALUE;
        Integer min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.size(); i++)
        {
            Integer num = arr.get(i);

            //even/odd
            if(num % 2 == 0)
                even.add(num);
            else
                odd.add(num);

            //div 3
            if(num % 3 == 0)
                divided3or9.add(num);

            //div 5 and 7
            if(num % 35 == 0)
                divided5n7.add(num);

            //min/max
            if(num < min)
                min = num;
            if(num > max)
                max = num;

            //no same digits
            String strNum = Integer.toString(Math.abs(num));
            if(strNum.length() == 3)
                if(strNum.charAt(0) != strNum.charAt(1) &&
                   strNum.charAt(1) != strNum.charAt(2) &&
                   strNum.charAt(2) != strNum.charAt(0))
                    noSameDigits.add(num);

            boolean isPrime = true;
            for(int j=2; j <= num/2; j++)
            {
                Integer temp = num % j;
                if(temp == 0)
                {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime)
                primes.add(num);
        }

        out.println("Even numbers:");
        printList(even);

        out.println("Odd numbers:");
        printList(odd);

        out.print("Min: ");
        out.println(min);
        out.print("Max: ");
        out.println(max);

        out.println("Divided by 3 or 9");
        printList(divided3or9);
        out.println("Divided by 5 and 7");
        printList(divided5n7);

        out.println("Sorted by abs decrease");
        List<Integer> arrAbsSort = arr;
        arrAbsSort.sort((a, b) ->
            {
                a = Math.abs(a);
                b = Math.abs(b);
                if(a > b)
                    return -1;
                else if(a == b)
                    return 0;
                else
                    return 1;
            });
        printList(arrAbsSort);

        out.println("3 digits, not same");
        printList(noSameDigits);

        out.println("end");
	// write your code here
    }

    public static void printList(List<Integer> list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i));
            System.out.print(' ');
        }
        System.out.println();
    }
}
