package secao17.generics.set.application;

import java.util.HashSet;
import java.util.Set;

public class SetProgram {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		System.out.println(set.contains("TV"));
		
		for(String p : set) {
			System.out.println(p);
		}

	}

}
