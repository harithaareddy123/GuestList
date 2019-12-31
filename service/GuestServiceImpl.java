package service;


import java.util.Set;

import dao.GuestDao;
import entity.GuestDetails;
import exceptions.GuestNotAvailableException;
public class GuestServiceImpl implements IGuestService {


	private GuestDao dao;

    public  GuestServiceImpl(GuestDao dao) {
        this.dao = dao;
    }

	@Override
	public void addGuest(GuestDetails g) {
		// TODO Auto-generated method stub
		dao.addGuest(g);
		
	}

	@Override
	public GuestDetails findGuestById(int id) {
		// TODO Auto-generated method stub
		
		if(id==0) {
			
			throw new GuestNotAvailableException("Guest not available" + id);
		}
		GuestDetails g= dao.findGuestById(id);
		return g;
	}
	public Set<GuestDetails> allGuests() {
		
        Set<GuestDetails> guestSet =  dao.allGuests();
        return guestSet;
		
	}

	@Override
	public Set<GuestDetails> allGuestsInOrderById() {
		// TODO Auto-generated method stub
		 Set<GuestDetails> guestSet1=dao.allGuests();
		return guestSet1;
	}
	
}
