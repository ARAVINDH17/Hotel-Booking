
package hotelbook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Booking {

HashMap<String,ArrayList<String>> hotel;
	String choice;    
        
        Booking(HashMap<String,ArrayList<String>> hotel,String choice){
		
		this.hotel=hotel;
		this.choice=choice;
        }
                
                public String[] bookfacilities(ArrayList<String> totalfacilities){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of facilities you want to book: ");
		int facil=sc.nextInt();
		String[] arr=new String[facil];
		System.out.println("Enter the facilities needed to be booked: ");
		
		for(int i=0;i<facil;i++){
		    String facility=sc.next();
			arr[i]=facility;
		}
		return arr;
}
                public int generateCost(String[] facilities, int days,int l)
                {
                    int cost=0;
                    //for(int i=0;i<l;i++){
                    //System.out.println(facilities[i]+"hello");
                //}
                    for(int i=0;i<l;i++)
                    {
                        if(facilities[i].equals("wifi"))
                            cost=cost+200;
                        else if(facilities[i].equals("food"))
                            cost=cost+100;
                        else if(facilities[i].equals("tv"))
                            cost=cost+50;
                        else if(facilities[i].equals("games"))
                            cost=cost+300;
                        
                    }
                    
                    return cost*days;
                }
}     