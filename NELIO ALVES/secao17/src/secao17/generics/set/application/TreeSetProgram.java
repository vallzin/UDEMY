package secao17.generics.set.application;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetProgram {

	public static void main(String[] args) {
		
		Set<String> treeSet = new TreeSet<>();
		
		treeSet.add("Tv");
		treeSet.add("Notebook");
		treeSet.add("Tablet");
		
		System.out.println(treeSet.contains("TV"));
		
		for(String p : treeSet) {
			System.out.println(p);
		}

	}

}
