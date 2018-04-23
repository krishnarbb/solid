package singleResponsibilityPrinciple.violation;

import java.util.LinkedList;
import java.util.List;

/**
 * Single Responsibility principle violation, as persistence is not a function of the journal
 *
 */
public class Journal {
	String title;
	List<String> entries;
	
	public Journal(final String title) {
		this.title = title;
		entries = new LinkedList<>();
	}
	
	public void add(final String entry) {
		entries.add(entry);
	}
	
	// persistence, which is not a function of the journal 
	// this will be a violation of Single Responsibility principle.
	public void save(String fileName) {
		
	}

}
