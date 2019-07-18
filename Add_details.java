package hotelbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Add_details {

static HashMap<String,HashMap<String,HashMap<String,ArrayList<String>>>> details=new HashMap<>();
public void addcities(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of cities: ");
    int noofcities=sc.nextInt();
    for(int i=1;i<=noofcities;i++)
    {
        System.out.println("Enter name of City "+i+": ");
        String cityname=sc.next();
        details.put(cityname,addHotel());
    }
}

public HashMap<String,HashMap<String,ArrayList<String>>> addHotel(){
    
    HashMap<String,HashMap<String,ArrayList<String>>> theater=new HashMap<>();
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of hotels:");
    int noofhotels=sc.nextInt();
    
    for(int i=1;i<=noofhotels;i++)
    {
        System.out.println("Enter name of Hotel "+i+": ");
        theater.put(sc.next(),addRoom());
    }
    
    return theater;
}
public HashMap<String,ArrayList<String>> addRoom(){
    
    HashMap<String,ArrayList<String>> room=new HashMap<>();
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of room categories: ");
    int noofrooms=sc.nextInt();
    
    for(int i=1;i<=noofrooms;i++){
        System.out.println("Enter the room name:");
        String roomname=sc.next();
        System.out.println("Enter the number of facilities:");
        int nooffacilities=sc.nextInt();
        
        ArrayList<String> facilities=new ArrayList<>();
        
        for(int j=1;j<=nooffacilities;j++)
        {
            System.out.println("Enter facility "+j+": ");
            facilities.add(sc.next());
        }
        
        room.put(roomname,facilities);
    }
    return room;
}

    @Override
    public String toString() {
        return "HOTELS "+details; 
    }

}
