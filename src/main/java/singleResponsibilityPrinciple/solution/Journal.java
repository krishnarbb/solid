package singleResponsibilityPrinciple.solution;

import java.util.LinkedList;
import java.util.List;

/**
 * Single Responsibility Principle , example.
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
}
