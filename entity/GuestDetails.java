package entity;

public class GuestDetails {
	private int id;
	private String name;

	public GuestDetails(int id,String name) {
		this.id=id;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
public String toString() {
	String display=id+"    "+name;
	return display;
}
	 @Override
	    public int hashCode() {
	        return id;
	    }
}
