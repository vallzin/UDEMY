package ArrayJava;

public class ExercicioArrayJavaMedia {

	public static void main(String[] args) {
		
		double[] numArray = new double[] {1,5,45,6,8};
		
		double somaArray = 0;
		
		for(int i = 0; i < numArray.length; i++) {
			
			somaArray = somaArray + numArray[i];
			
		}
		
		double mediaArray = somaArray / numArray.length;
		
		System.out.printf("A soma do elementos do array é %s e sua média é %s", somaArray, mediaArray);
	}
	
}
