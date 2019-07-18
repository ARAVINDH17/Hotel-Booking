package hotelbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {
    
    static ArrayList<Customer> customer=new ArrayList<>();
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        Add_details a=new Add_details();
        a.addcities();
        int choice,flag=0;
        
        System.out.println(a);
        
        while(true)
        {
        System.out.println("1.Book Room\n2.Exit");
        choice=sc.nextInt();
        
        switch(choice)
        {
            case 1:
                Customer c=new Customer();
                customer.add(c);
                break;
            case 2:
                flag=1;
                break;
        }
        if(flag==1)
        {
            printChart();
            break;
        }
        }
        
    }
    
    public String findCity(HashMap<String,HashMap<String,HashMap<String,ArrayList<String>>>> cities){
       
        Scanner sc=new Scanner(System.in);
        Set<String> keys=cities.keySet();
        System.out.println("Enter the city you want to Book :");
            
            for(String key: keys){
	            System.out.println(key);
            }
            String choice=sc.next();
            return choice;
    }
    public static void printChart(){
		Add_details a = new Add_details();
		//System.out.println(a);
		for(int i=0;i<customer.size();i++){
			Customer u=customer.get(i);
			System.out.println(u);
		}
	}
}
