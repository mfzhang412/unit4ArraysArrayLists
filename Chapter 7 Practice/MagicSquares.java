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
    Scanner s = new Scanner(System.in);
    
    public void magicSqures()
    {
        int counter = 1;
        System.out.println("Enter in the 16 numbers.");
        
        for (int i = 0; i < 16; i++)
        {
            System.out.print("Number " + counter + ": ");
            for (int row = 0; row < matrix.length; row++)
            {
                for (int col = 0; col < matrix[row]; col++)
                {
                    matrix[row][col] = s.nextInt();
                }
            }
            counter++;
        }
        
    }
}