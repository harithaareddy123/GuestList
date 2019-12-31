package dao;

import java.util.Set;

import entity.GuestDetails;



public interface GuestDao {
	void addGuest(GuestDetails g);

    GuestDetails findGuestById(int id);

    Set<GuestDetails> allGuests();
}

