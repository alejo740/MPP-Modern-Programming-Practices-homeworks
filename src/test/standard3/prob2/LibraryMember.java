package test.standard3.prob2;

public class LibraryMember {

	private String memeberId;
	private String firstName;
	private String lastName;
	private String phone;
	private CheckoutRecord checkoutRecord;

	public LibraryMember(String memeberId, String firstName, String lastName, String phone) {
		this.memeberId = memeberId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		checkoutRecord = new CheckoutRecord();
	}

	public String getMemeberId() {
		return memeberId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhone() {
		return phone;
	}

	public CheckoutRecord getCheckoutRecord() {
		return checkoutRecord;
	}

	public void setCheckoutRecord(CheckoutRecord checkoutRecord) {
		this.checkoutRecord = checkoutRecord;
	}

}
