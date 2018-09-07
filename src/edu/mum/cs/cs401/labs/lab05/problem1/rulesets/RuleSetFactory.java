package edu.mum.cs.cs401.labs.lab05.problem1.rulesets;

import java.awt.Component;
import java.util.HashMap;

import edu.mum.cs.cs401.labs.lab05.problem1.ui.AddrWindow;
import edu.mum.cs.cs401.labs.lab05.problem1.ui.ProfileWindow;

final public class RuleSetFactory {
	private RuleSetFactory() {
	}

	static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();
	static {
		map.put(AddrWindow.class, new AddressRuleSet());
		map.put(ProfileWindow.class, new ProfileRuleSet());
	}

	public static RuleSet getRuleSet(Component c) {
		Class<? extends Component> cl = c.getClass();
		if (!map.containsKey(cl)) {
			throw new IllegalArgumentException("No RuleSet found for this Component");
		}
		return map.get(cl);
	}
}
