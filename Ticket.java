public abstract class Ticket{
	private long PNRNumber;
	private Flight flight;
	private Passenger passenger;
	private int seatNumber;
	protected double price;
	protected String status;

	public abstract void setPrice(double price);

	public Ticket(long PNRNumber, Flight flight, Passenger passenger, int seatNumber) {
		this.PNRNumber = PNRNumber;
		this.flight = flight;
		this.passenger = passenger;
		this.seatNumber = seatNumber;
	}

	public double getPrice() {
		return price;
	}

	public String getStatus() {
		return status;
	}
	public long getPNRNumber() {
		return PNRNumber;
	}

	public void setStatus(String status) {

		this.status = status;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public Passenger getPassenger() {
		return passenger;
	}
}
