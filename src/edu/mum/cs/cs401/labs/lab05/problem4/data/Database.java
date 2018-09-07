package edu.mum.cs.cs401.labs.lab05.problem4.data;

import java.util.HashMap;

public class Database {
	public static HashMap<String, DtoPersonalInfo> h = new HashMap<>();
	static {
		h.put("1", new DtoPersonalInfo("1", "Bob", "1988-12-06"));
		h.put("2", new DtoPersonalInfo("2", "Alan", "1972-05-07"));
		h.put("3", new DtoPersonalInfo("3", "Dave", "1990-02-25"));
		h.put("4", new DtoPersonalInfo("4", "Perry", "1995-05-15"));
	}
}
