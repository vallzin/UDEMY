package ArrayJava;

import java.util.Arrays;
import java.util.HashSet;

public class ExercicioArrayJavaImprimirArrays {
	
	public static void main(String[] args) {
		
		String[] array1 = {"A", "B", "C", "D", "E", "F"};
		String[] array2 = {"A", "G", "C", "H", "E", "I"};
		
		System.out.println("Array 1: "+Arrays.toString(array1));
		System.out.println("Array 2: "+Arrays.toString(array2));
		
		HashSet<String> itensRepetidos = new HashSet<String>();
		
		for(int i = 0; i <= array1.length -1; i++) {
			
			for(int j = 0; j <= array2.length -1; j++) {
				
				if(array1[i].equals(array2[j])) {
					
					itensRepetidos.add(array1[i]);
					
				}
				
			}
			
			
		}
		
		System.out.println("Itens: "+ itensRepetidos);
	}

}
