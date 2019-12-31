package dao;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import entity.GuestDetails;
import exceptions.IncorrectIdException;
import util.GuestComparator;


public class GuestDaoImpl implements GuestDao {
 private Map<Integer,GuestDetails> store=new HashMap<>();
	@Override
	public void addGuest(GuestDetails g) {
		
		// TODO Auto-generated method stub
		store.put(g.getId(),g);
		
	}

	@Override
	public GuestDetails findGuestById(int id) {
		GuestDetails g = store.get(id);
		if(id<=0) {
			try {
				throw new IncorrectIdException("Guest not available" +id);
			} catch (IncorrectIdException e) {
				e.printStackTrace();
			}
		}
		return g;
	}

	@Override
	public Set<GuestDetails> allGuests() {
		// TODO Auto-generated method stub
		Collection<GuestDetails> guests = store.values();
		
	      Set<GuestDetails> guestSet = new HashSet<>(guests);
        return guestSet;
		
	}
	public Set<GuestDetails> allGuestInOrgerById() {

		
		Comparator<GuestDetails>comparator=new GuestComparator();
	      Set<GuestDetails> guestSet = new TreeSet<>(comparator);
        return guestSet;

}
}
