package test.standard3.prob2;

import java.time.LocalDate;

public class CheckoutRecordEntry {

	private LocalDate checkoutDate;
	private LocalDate dueDate;
	private ItemType lendingItemType;
	private LendingItem lendingItem;

	public CheckoutRecordEntry(LendingItem item, LocalDate checkoutDate, LocalDate dueDate, ItemType type) {
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
		this.lendingItemType = type;
		this.lendingItem = item;
	}

	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public ItemType getLendingItemType() {
		return lendingItemType;
	}

	public LendingItem getLendingItem() {
		return lendingItem;
	}

}
