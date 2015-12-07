//A supermarket wants to reward its best customer of each day, showing the customer’s
//name on a screen in the supermarket. For that purpose, the store keeps an
//ArrayList<Customer>. In the Store class, implement methods
//public void addSale(String customerName, double amount)
//public String nameOfBestCustomer()
//to record the sale and return the name of the customer with the largest sale.
//Write a program that prompts the cashier to enter all prices and names, adds them to
//a Store object, and displays the best customer’s name. Use a price of 0 as a sentinel.
import java.util.Scanner;
import java.util.ArrayList;

public class Store
{
    ArrayList<Customer> topCustomers = new ArrayList<Customer>();
    ArrayList<Double> pay = new ArrayList<Double>();
    
    public Store()
    {
        Scanner s = new Scanner(System.in);
        String yn = "y";

        do
        {
            String customer = "";
            double payment = 0.0;
            
            System.out.print("Input the name of the customer: ");
            customer = s.nextString();
            System.out.print("Input the payment of the valued customer: ");
            payment = s.nextDouble();
            
            Store.addSale(customer, payment);
            
            System.out.print("Would you like to input another customer (y/n): ");
            yn = s.nextString();
        }
        while (yn == "y");
        
        Store.nameOfBestCustomer();
    }
    
    public void addSale(String customerName, double amount)
    {
        topCustomers.add(customerName);
        pay.add(amount);
    }
    
    public String nameOfBestCustomer()
    {
        int highestPay = 0;
        int indexCounter = 0;
        
        for (int i = 0; i < pay.size() - 1; i++)
        {
            if (pay[i] > highestPay)
            {
                highestPay = pay[i];
            }
            indexCounter++;
        }
        
        return topCustomers[highestPay];
    }
}