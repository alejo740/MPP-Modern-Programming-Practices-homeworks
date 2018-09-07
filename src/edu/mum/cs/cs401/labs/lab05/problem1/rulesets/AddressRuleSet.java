package edu.mum.cs.cs401.labs.lab05.problem1.rulesets;

import java.awt.Component;

import edu.mum.cs.cs401.labs.lab05.problem1.ui.AddrWindow;

final public class AddressRuleSet implements RuleSet {

	AddressRuleSet() {
	}

	@Override
	public void applyRules(Component ob) throws RuleException {
		AddrWindow window = (AddrWindow) ob;
		checkNonEmptyFields(window);
		RuleSetUtil.checkIsNumeric(window.getIdValue(), "ID");
		checkZipCode(window.getZipValue());
		checkState(window.getStateValue());
		RuleSetUtil.checkEquals(window.getIdValue(), window.getZipValue(), "ID must not be equal to Zip");
	}

	private void checkState(String stateValue) throws RuleException {
		if (!RuleSetUtil.checkRangeAZ(stateValue))
			throw new RuleException("State must have uppercase letters (A-Z)");

		RuleSetUtil.checkExactLenght(stateValue, 2, "State");
	}

	private void checkZipCode(String zipValue) throws RuleException {
		RuleSetUtil.checkIsNumeric(zipValue, "Zip");
		RuleSetUtil.checkExactLenght(zipValue, 5, "Zip");
	}

	private void checkNonEmptyFields(AddrWindow window) throws RuleException {
		if (window.getIdValue().isEmpty() || window.getStreetValue().isEmpty() || window.getCityValue().isEmpty()
				|| window.getStateValue().isEmpty() || window.getZipValue().isEmpty()) {
			throw new RuleException("All fields must be non-empty");
		}
	}
}
