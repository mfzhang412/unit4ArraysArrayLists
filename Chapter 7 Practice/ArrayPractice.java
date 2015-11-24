import java.util.Arrays;

public class ArrayPractice
{
    public static void boundsException()
    {
        int[] values = {1, 4, 9, 16, 26};
        int x = values[4];
    }
    
    public static void fill()
    {
        int[] values = new int[100];
        
        for (int i = 0; i < values.length; i++)
        {
            values[i] = i * i;
        }
                
        System.out.println(values);
        System.out.println(Arrays.toString(values));
    }
    
    public static void findMax()
    {
        int[] values = {43,67,12,77,14,9};
        int largest = values[0];
        for(int i = 1; i < values.length; i++)
        {
            if (values[i] > largest)
            {
                largest = values[i];
            }
        }
        
        System.out.println(largest);
    }
}