package hotelbook;

import java.util.Arrays;
import java.util.Scanner;

public class Customer {
    
    String name,city,hotel,room,facilities[];
    int days,cost;
    
    Customer(){
        this.name=getName();
        this.city=getCity();
        this.hotel=getHotel();
        this.room=getRoom();
        this.facilities=getFacilities();
        this.days=getDays();
        this.cost=getCost();
    }
    
    public String getName(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name :");
        String nam=sc.nextLine();
        return nam;
    }
    
    public String getCity(){
        Main m=new Main();
        String city=m.findCity(Add_details.details);
        return city;
    }
    
    public String getHotel(){
        City c=new City();
        String hotel=c.findHotel(Add_details.details.get(city));
        return hotel;
    }
    
    public String getRoom(){
        Hotel h=new Hotel();
        String room=h.findRoom(Add_details.details.get(city).get(hotel));
        System.out.println("The facilities for this room are:");
        h.displayFacilities(city,hotel,room);
        Add_details.details.get(city).get(hotel).remove(room);
        return room;
        
    }
    
    public String[] getFacilities(){
        Booking b=new Booking(Add_details.details.get(city).get(hotel),room);
        String arr[]=b.bookfacilities(Add_details.details.get(city).get(hotel).get(room));
        
        
        return arr;
    }
    
    public int getDays(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of days for your stay :");
        int daycount=sc.nextInt();
        return daycount;
    }
    
    public int getCost(){
		Booking b=new Booking(Add_details.details.get(city).get(hotel),room);
                int l=facilities.length;
		int cost=b.generateCost(facilities,days,l);
		return cost;
	}

    @Override
    public String toString() {
        return "Name: "+name+"\nCity: "+city+"\nHotel: "+hotel+"\nRoom:"+room+"\nFacilities"+Arrays.toString(facilities)+"\nCost: "+cost+"\n";
    }
    
    
}
