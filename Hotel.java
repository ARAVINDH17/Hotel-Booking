package hotelbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class Hotel {
    
    public String findRoom(HashMap<String,ArrayList<String>> room){
        
        Scanner sc = new Scanner(System.in);
        Set<String> keys = room.keySet();
        System.out.println("Enter the room you want to Book :");
        for(String key:keys){
            System.out.println(key);
        }
        String choice=sc.nextLine();
        return choice;
        }
    
    public void displayFacilities(String city,String hotel,String room){
        ArrayList<String> facil=new ArrayList<>();
        facil=Add_details.details.get(city).get(hotel).get(room);
        for(int i=0;i<facil.size();i++){
            System.out.println(facil.get(i));
        }
        
        
    }
    }
