package alex.khodin;

public class Matrix
{
    enum Norm
    {
        First,
        Second
    }

    private int[][] matrix;

    public Matrix() {}
    public Matrix(int size) { matrix = new int[size][size]; }
    public Matrix(Matrix other) { matrix = other.matrix; }

    public Matrix add(Matrix other)
    {
        if(matrix.length != other.getMatrixSize())
            throw new ArithmeticException("Sizes do not match");

        for (int i = 0; i < getMatrixSize(); i++)
            for (int j = 0; j < getMatrixSize(); j++)
                matrix[i][j] += other.get(i, j);
        return this;
    }

    public int calcNorm(Norm norm)
    {
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < getMatrixSize(); i++)
        {
            int sum = 0;
            for (int j = 0; j < getMatrixSize(); j++)
                if(norm == Norm.First)
                    sum += matrix[i][j];
                else
                    sum += matrix[j][i];
            if(sum > maxSum)
                maxSum = sum;
        }
        return maxSum;
    }

    public int get(int i, int j) { return matrix[i][j]; }
    public int[][] getMatrix() { return matrix; }
    public int getMatrixSize() { return matrix.length; }

    public Matrix multiply(Matrix other)
    {
        if(matrix.length != other.getMatrixSize())
            throw new ArithmeticException("Sizes do not match");

        int[][] res = new int[matrix.length][matrix.length];
        for(int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix.length; j++)
                res[i][j] = multiply(this, other, i, j);
        return this;
    }

    private int multiply(Matrix first, Matrix second, int row, int col)
    {
        int sum = 0;
        for (int k = 0; k < first.getMatrixSize(); k++)
            sum += first.get(row, k) * second.get(k, col);
        return sum;
    }

    public Matrix sub(Matrix other)
    {
        if(matrix.length != other.getMatrixSize())
            throw new ArithmeticException("Sizes do not match");

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix.length; j++)
                matrix[i][j] -= other.get(i, j);
        return this;
    }
}
