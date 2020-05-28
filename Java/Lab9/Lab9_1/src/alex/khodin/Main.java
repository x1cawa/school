package alex.khodin;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args)
    {
        int[] num = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        Integer sum = IntStream.of(num)
                    .filter(x -> x % 2 != 0)
                    .sum();
        System.out.println("Sum: " + sum.toString());
    }
}
