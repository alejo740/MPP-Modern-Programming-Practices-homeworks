package test.standard3.prob2;

public class CD extends LendingItem {

	private String productId;
	private String title;
	private String company;

	public CD(String productId, String title, String company) {
		super();
		this.productId = productId;
		this.title = title;
		this.company = company;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof CD))
			return false;
		CD e = (CD) obj;
		return e.productId.equals(productId);
	}
}
