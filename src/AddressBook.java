import java.util.*;

public class AddressBook {
	
	public LinkedList<BuddyInfo> buddies;
	
	public AddressBook() {
		this.buddies = new LinkedList<>();
	}
	
	public void addBuddy(BuddyInfo b) {
		this.buddies.add(b);
	}
	
	public void removeBuddy(BuddyInfo b) {
		this.buddies.remove(b);
	}
	
	public static void main(String[] args) {
		System.out.println("Address Book");
		
		BuddyInfo test = new BuddyInfo();
		AddressBook adr = new AddressBook();
		adr.addBuddy(test);
		adr.removeBuddy(test);
		System.out.println("yeet");
	}
	
}
