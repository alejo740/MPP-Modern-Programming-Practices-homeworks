package test.standard3.prob2;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {

	private List<CheckoutRecordEntry> checkoutRecordEntries;

	public CheckoutRecord() {
		checkoutRecordEntries = new ArrayList<>();
	}

	public List<CheckoutRecordEntry> getCheckoutEntryList() {
		return checkoutRecordEntries;
	}

	public void addCheckoutEntry(CheckoutRecordEntry entry) {
		checkoutRecordEntries.add(entry);
	}

}
