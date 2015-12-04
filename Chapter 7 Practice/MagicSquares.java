//Magic squares. An n × n matrix that is filled with the numbers
//1, 2, 3, . . ., n2 is a magic square if the sum of the elements in each row,
//in each column, and in the two diagonals is the same value.
//Write a program that reads in 16 values from the keyboard and tests
//whether they form a magic square when put into a 4 × 4 array.
//You need to test two features:
//1. Does each of the numbers 1, 2, ..., 16 occur in the user input?
//2. When the numbers are put into a square, are the sums of the rows, columns,
//and diagonals equal to each other?

import java.util.Scanner;

public class MagicSquares
{
    private int[][] matrix = new int[4][4];
    private int[][] storage = new int[3][4];
    private boolean[] yesNo = new boolean[10];
    private int numberOfSame = 0;
    Scanner s = new Scanner(System.in);
    
    public void magicSqures()
    {
        System.out.println("Enter in the 16 numbers.");
        
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[row].length; col++)
            {
                
                System.out.print("Number in row " + row + " and column " + col + ": ");
                if ((s.nextInt() > 0) || (s.nextInt() < 17))
                {
                    matrix[row][col] = s.nextInt();
                }
                else
                {
                    do
                    {
                        System.out.println("Please enter a number 1-16: ");
                    }
                    while ((s.nextInt() < 1) || (s.nextInt() > 16));
                    matrix[row][col] = s.nextInt();
                }
           }
        }
        
        for (int row = 0; row < matrix.length; row++)
        {
            int total = 0;
            for (int col = 0; col < matrix[row].length; col++)
            {
                total += matrix[row][col];
            }
            storage[0][row] = total;
        }
        
        for (int row = 0; row < matrix.length; row++)
        {
            int total = 0;
            for (int col; col < matrix[row].length; col++)
            {
                total += matrix[col][row];
            }
            storage[1][row] = total;
        }
        
        for (int row = 0; row < matrix.length; row++)
        {
            int total += matrix[row][row];
        }
        storage[2][0] = total;
        storage[2][1] = total; //to fill up the last matrix for the diagonal
        
        for (int row = matrix.length; row > 0; row--)
        {
            int total += matrix[row][row];
        }
        storage[2][2] = total;
        storage[2][3] = total; // to fill up the last matrix for the diagonal
        
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                for (int yesNoCounter = 0; yesNoCounter < 10; yesNoCounter++)
                {
                    if (matrix[i][j] == matrix[i][j+1])
                    {
                        yesNo[yesNoCounter] = true;
                    }
                }
            }
        }
    }
}