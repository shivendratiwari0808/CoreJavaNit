package mulitiTherading;

class Customer implements Runnable{
	int availableSeat=1;
	int wantedSeat;
	public Customer(int wantedSeat) {
		this.wantedSeat=wantedSeat;
	}
	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		System.out.println("Available Seat is :"+availableSeat);
		
		if(availableSeat >= wantedSeat) {
			availableSeat=availableSeat-wantedSeat;
		}else {
			System.out.println("Sorry!!"+name+"seat is not available");
		}
	}
}

public class Irctc {

	public static void main(String[] args) {
		Customer cust = new Customer(1);
		
		Thread t1= new Thread(cust,"virat");
		Thread t2= new Thread(cust,"rohit");
		
		t1.start();
		t2.start();

	}

}
