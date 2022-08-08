package Progress.StackQueue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class TicketGame {
    Set<String> hashSetTicket = new HashSet<String>();

	public boolean addTicket(String value) {
		return this.hashSetTicket.add(value);
	}
	
	public boolean deleteTicket(String value) {
		return this.hashSetTicket.remove(value);
	}
	
	public boolean isTicketExist(String value) {
		return this.hashSetTicket.contains(value);
	}
	
	public void deleteAllTicket() {
		this.hashSetTicket.clear();
	}
	
	public int getNumberOfTicket() {
		return this.hashSetTicket.size();
	}
	
	public String sweepStakes() {
		String result = "";
		Random random = new Random(this.hashSetTicket.size());
		int position = random.nextInt(this.hashSetTicket.size());
		result = (String) this.hashSetTicket.toArray()[position];
		return result;
	}
	
	public void printAllTickets() {
		System.out.println(Arrays.toString(this.hashSetTicket.toArray()));
	}
	public static void main(String[] args) {
		TicketGame ticket = new TicketGame();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("------------------");
			System.out.println("Menu");
			System.out.println("1. Add new sticket");
			System.out.println("2. Delete ticket");
			System.out.println("3. Check whether ticket exist");
			System.out.println("4. Delete all ticket");
			System.out.println("5. The number of tickets");
			System.out.println("6. SweepStakes");
			System.out.println("7. Print all ticket");
			System.out.println("0. To exist");
			choice = sc.nextInt();
			sc.nextLine();
			if(choice == 1 || choice == 2 || choice == 3) {
				System.out.println("Enter id of ticket: ");
				String value = sc.nextLine();
				if(choice == 1) {
					ticket.addTicket(value);
				} else if (choice == 2) {
					ticket.deleteTicket(value);
				} else if (choice == 3) {
					System.out.println("Tick is exist: " + ticket.isTicketExist(value));
				}
			} else if (choice == 4) {
				ticket.deleteAllTicket();
			} else if (choice == 5) {
				System.out.println("The number of ticket: " + ticket.getNumberOfTicket());
			} else if (choice == 6) {
				System.out.println("The reward ticket: " + ticket.sweepStakes());
			} else if (choice == 7) {
				ticket.printAllTickets();
			}
			if(choice == 0) {
				return;
			}
		} while (choice != 0);
	}

}
