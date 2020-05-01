package alex.khodin;

import java.io.PrintStream;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        PrintStream out = System.out;
        Scanner scanner = new Scanner(System.in);

        Matrix[] matrices = new Matrix[2];

        out.println("Input matrix size (n x n)");
        int size = scanner.nextInt();

        for(int k = 0; k < 2; k++)
        {
            out.println("Input matrix");
            int[][] matr = new int[size][size];
            for (int i = 0; i < size; i++)
                for(int j = 0; j < size; j++)
                    matr[i][j] = scanner.nextInt();
            matrices[k] = new Matrix(matr);
        }

        int nf0 = matrices[0].calcNorm(Matrix.Norm.First);
        int nf1 = matrices[1].calcNorm(Matrix.Norm.First);
        int ns0 = matrices[0].calcNorm(Matrix.Norm.Second);
        int ns1 = matrices[1].calcNorm(Matrix.Norm.Second);

        out.print("First norm: ");
        if(nf0 == nf1)
            out.println("equal " +  Integer.toString(nf0));
        else if(nf0 > nf1)
            out.println("matrix1 > matrix2 (" + Integer.toString(nf0) + " > " + Integer.toString(nf1) + ")");
        else
            out.println("matrix1 < matrix2 (" + Integer.toString(nf0) + " < " + Integer.toString(nf1) + ")");

        out.print("Second norm: ");
        if(ns0 == ns1)
            out.println("equal " +  Integer.toString(ns0));
        else if(ns0 > ns1)
            out.println("matrix1 > matrix2 (" + Integer.toString(ns0) + " > " + Integer.toString(ns1) + ")");
        else
            out.println("matrix1 < matrix2 (" + Integer.toString(ns0) + " < " + Integer.toString(ns1) + ")");
    }
}
