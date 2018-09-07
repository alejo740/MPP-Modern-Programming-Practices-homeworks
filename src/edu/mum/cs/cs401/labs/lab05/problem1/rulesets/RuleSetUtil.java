package edu.mum.cs.cs401.labs.lab05.problem1.rulesets;

import edu.mum.cs.cs401.labs.lab05.problem1.ui.AddrWindow;

final public class RuleSetUtil {

	static void checkEquals(String valueA, String valueB, String errorMessage) throws RuleException {
		if (valueA.equals(valueB)) {
			throw new RuleException(errorMessage);
		}
	}

	static boolean checkRangeAZ(String value) {
		if (!value.matches(RuleSet.AZRegex)) {
			return false;
		}
		return true;
	}

	static boolean checkRangeaz(String value) {
		if (!value.matches(RuleSet.azRegex)) {
			return false;
		}
		return true;
	}

	static void checkExactLenght(String value, int maxCharacters, String fieldName) throws RuleException {
		if (value.length() != maxCharacters) {
			throw new RuleException(fieldName + " must have exactly " + maxCharacters + " characters");
		}
	}

	static void checkIsNumeric(String idValue, String fieldName) throws RuleException {
		try {
			Integer.parseInt(idValue);
		} catch (NumberFormatException e) {
			throw new RuleException(fieldName + " number must be numeric");
		}
	}
}
