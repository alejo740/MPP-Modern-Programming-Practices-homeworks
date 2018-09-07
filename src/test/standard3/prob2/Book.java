package test.standard3.prob2;

public class Book extends LendingItem {
	private String isbn;
	private String title;
	private String authorFirstName;
	private String authrLastName;

	public Book(String isbn, String title, String authorFirstName, String authrLastName) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.authorFirstName = authorFirstName;
		this.authrLastName = authrLastName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Book))
			return false;
		Book e = (Book) obj;
		return e.isbn.equals(isbn);
	}

}
