package edu.mum.cs.cs401.labs.lab05.problem1.rulesets;

import java.awt.Component;

public interface RuleSet {
	static final String azRegex = "[a-z]+$";
	static final String AZRegex = "[A-Z]+$";
	
	public void applyRules(Component ob) throws RuleException;
}
