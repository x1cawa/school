package alex.khodin;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        PrintStream out = System.out;
        Scanner scanner = new Scanner(System.in);

        out.print("Matrix size: ");
        int n = scanner.nextInt();

        Random rand = new Random();
        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                matrix[i][j] = rand.nextInt(2 * n + 1) - n;
            }
        }
        out.println("Input matrix");
        printMatrix(matrix);

        out.println("Rotated 90");
        printMatrix(rotateMatrix90(matrix));

        out.println("Rotated 180");
        printMatrix(rotateMatrix180(matrix));

        out.println("Rotated 270");
        printMatrix(rotateMatrix270(matrix));

        out.println("Transparent matrix");
        printMatrix(transparentMatrix(matrix));
    }

    public static void printMatrix(int[][] matrix)
    {
        PrintStream out = System.out;
        for( int[] row : matrix)
        {
            for (int item : row)
                out.print(String.format("%3d ", item));
            out.println();
        }
    }

    public static int[][] transparentMatrix(int[][] matrix)
    {
        int len = matrix.length;
        int[][] outMatrix = new int[len][len];
        for(int i = 0; i < len; i++)
            for(int j = 0; j < len; j++)
                outMatrix[i][j] = matrix[j][i];
        return outMatrix;
    }

    public static int[][] rotateMatrix90(int[][] matrix)
    {
        int len = matrix.length;
        int[][] outMatrix = new int[len][len];
        for(int i = 0; i < len; i++)
            for(int j = 0; j < len; j++)
                outMatrix[i][j] =  matrix[j][len - i - 1];
        return outMatrix;
    }

    public static int[][] rotateMatrix180(int[][] matrix)
    {
        int len = matrix.length;
        int[][] outMatrix = new int[len][len];
        for(int i = 0; i < len; i++)
            for(int j = 0; j < len; j++)
                outMatrix[i][j] =  matrix[len - i - 1][len - j - 1];
        return outMatrix;
    }

    public static int[][] rotateMatrix270(int[][] matrix)
    {
        return rotateMatrix180(rotateMatrix90(matrix));
    }
}