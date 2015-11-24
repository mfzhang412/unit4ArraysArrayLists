


public class PartialArray
{
    /** description of instance variable x (add comment for each instance variable) */
    private int[] values;
    private int currentSize;

    /**
     * Default constructor for objects of class PartialArray
     */
    public PartialArray()
    {
        // initialise instance variables
        this.values = new int[100];
        for (this.currentSize = 0; this.currentSize < 20; this.currentSize++)
        {
            this.values[this.currentSize] = this.currentSize * this.currentSize;
        }
    }
    
    public void remove(int pos)
    {
        for (int i = pos + 1; i < this.currentSize; i++)
        {
            this.values[i-1] = this.values[i];
        }
        this.currentSize--;
    }
    
    public void insert(int pos, int newValue)
    {
        if (this.currentSize == this.values.length)
        {
            this.grow();
        }
    
        for (int i = this.currentSize; i > pos; i--)
        {
            this.values[i] = this.values[i - 1];
        }
        this.values[pos] = newValue;
        this.currentSize++;
    }
    
    public void swap(int posA, int posB)
    {
        int temp = this.values[posA];
        this.values[posA] = this.values[posB];
        this.values[posB] = temp;
    }
    
    private void grow()
    {
        int[] newValues = new int[this.currentSize * 2];
        
        for (int i = 0; i < this.currentSize; i++)
        {
            newValues[i] = this.values[i];
        }
        
        this.values = newValues;
    }
    
    private void printer()
    {
        for (int i = 0; i < this.currentSize; i++)
        {
            System.out.print(this.values[i] + ", ");
        }
    }
    
    public static void main(String[] args)
    {
        PartialArray array = new PartialArray();
        
        array.remove(3);
        array.printer();
    }
}