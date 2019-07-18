package hotelbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
public class City {
    
    public String findHotel(HashMap<String,HashMap<String,ArrayList<String>>> hotel){
        
        Scanner sc=new Scanner(System.in);
        Set<String> keys=hotel.keySet();
        
        System.out.println("Enter the hotel you want to book :");
        
        for(String key:keys){
            System.out.println(key);
        }
        String choice=sc.nextLine();
        return choice;
    }
}
