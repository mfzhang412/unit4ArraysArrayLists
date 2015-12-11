

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