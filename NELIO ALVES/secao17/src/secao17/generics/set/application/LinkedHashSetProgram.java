package secao17.generics.set.application;

import java.util.LinkedHashSet;
import java.util.Set;


public class LinkedHashSetProgram {

		public static void main(String[] args) {
			
			Set<String> linkedHashSet = new LinkedHashSet<>();
			
			linkedHashSet.add("TV");
			linkedHashSet.add("Notebook");
			linkedHashSet.add("Tablet");
			
			System.out.println(linkedHashSet.contains("TV"));
			
			for(String p : linkedHashSet) {
				System.out.println(p);
			}

		}

}

