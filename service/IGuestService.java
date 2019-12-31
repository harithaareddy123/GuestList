package service;

import java.util.Set;

import entity.GuestDetails;

public interface IGuestService {

	void addGuest(GuestDetails g1);

	GuestDetails findGuestById(int i);

	Set<GuestDetails> allGuests();

	Set<GuestDetails> allGuestsInOrderById();
	

}
