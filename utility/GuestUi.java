package utility;
import java.util.Collection;
import java.util.Set;

import dao.GuestDaoImpl;

import entity.GuestDetails;
import service.GuestServiceImpl;
import service.IGuestService;


public class GuestUi {
	private IGuestService Service=new GuestServiceImpl(new GuestDaoImpl());
	 public static void main(String[] args) {
	        GuestUi ui = new GuestUi();
	        ui.runUi();
	    }
	private void runUi() {
		// TODO Auto-generated method stub
		try {
			GuestDetails G1=new GuestDetails(4, "ram");
			GuestDetails G2=new GuestDetails(3,"krishna");
			GuestDetails G3=new GuestDetails(1, "sam");
			GuestDetails G4=new GuestDetails(2,"krish");
			Service.addGuest(G1);
			Service.addGuest(G2);
			Service.addGuest(G3);
			Service.addGuest(G4);
			GuestDetails fetched1=Service.findGuestById(1);
			GuestDetails fetched2=Service.findGuestById(2);
			GuestDetails fetched3=Service.findGuestById(3);
			GuestDetails fetched4=Service.findGuestById(4);
			System.out.println(fetched1.getName());
			System.out.println(fetched2.getName());
			System.out.println(fetched3.getName());
			System.out.println(fetched4.getName());
			System.out.println("*****printing all guests*****");
			Set<GuestDetails>guests=Service.allGuests();
			
			print(guests);
			Set<GuestDetails>guests1= Service.allGuestsInOrderById();
			System.out.println("ordered guest list");
			print(guests1);
		}catch(Throwable e) {
			e.printStackTrace();
            System.out.println("something went wrong");
		}
			
	}
	  void print(Collection<GuestDetails>Guests){
	        for (GuestDetails g:Guests){
	            System.out.println(g.getName());
	        }
	    }
		
	}
	

