package edu.mum.cs.cs401.labs.lab05.problem1.rulesets;

import java.awt.Component;

import edu.mum.cs.cs401.labs.lab05.problem1.ui.AddrWindow;
import edu.mum.cs.cs401.labs.lab05.problem1.ui.ProfileWindow;

final public class ProfileRuleSet implements RuleSet {

	ProfileRuleSet() {

	}

	@Override
	public void applyRules(Component ob) throws RuleException {
		ProfileWindow window = (ProfileWindow) ob;
		checkNonEmptyFields(window);
		RuleSetUtil.checkEquals(window.getFavoriteRestaurantValue(), window.getFavoriteMovieValue(),
				"Favorite Restaurant must not be equal to Favorite Movie");
		RuleSetUtil.checkIsNumeric(window.getIdValue(), "ID");
		checkFirstName(window.getFirstNameValue());
		checkLastName(window.getLastNameValue());
	}

	private void checkLastName(String lastNameValue) throws RuleException {
		if (!RuleSetUtil.checkRangeaz(lastNameValue) && !RuleSetUtil.checkRangeAZ(lastNameValue)) {
			throw new RuleException("Last name should contains only characters betwen A-Z and a-z");
		}
	}

	private void checkFirstName(String firstNameValue) throws RuleException {
		if (!RuleSetUtil.checkRangeaz(firstNameValue) && !RuleSetUtil.checkRangeAZ(firstNameValue)) {
			throw new RuleException("First name should contains only characters betwen A-Z and a-z");
		}

	}

	private void checkNonEmptyFields(ProfileWindow window) throws RuleException {
		if (window.getIdValue().isEmpty() || window.getFirstNameValue().isEmpty() || window.getLastNameValue().isEmpty()
				|| window.getFavoriteMovieValue().isEmpty() || window.getFavoriteRestaurantValue().isEmpty()) {
			throw new RuleException("All fields must be non-empty");
		}
	}

}
