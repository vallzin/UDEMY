package ArrayJava;

public class ArrayJavaValoresDuplicados {

	public static void main(String[] args) {
		
		int[] arrayNum = {5,5,12,6,6,23,33,33,40};
		
		for(int i = 0; i < arrayNum.length -1; i++) {
			
			for(int j = i + 1; j < arrayNum.length; j++) {
				
				if((arrayNum[i] == arrayNum[j]) && (i != j)) {
				System.out.println("item duplicado: "+arrayNum[j]);
				}
				
			}
			
		}

	}

}
