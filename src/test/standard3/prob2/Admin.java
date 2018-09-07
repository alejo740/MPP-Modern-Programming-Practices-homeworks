package test.standard3.prob2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Admin {
	// Returns phone numbers (in sorted order) of the Library Members who have ever
	// checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		// implement
		return Stream.of(members).filter(x -> {
			return x.getCheckoutRecord().getCheckoutEntryList().stream().anyMatch(y -> y.getLendingItem().equals(item));
		}).map(x -> x.getPhone()).sorted().collect(Collectors.toList());
	}
}
