package secao17.generics.principiogetput.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrincipioGetPut {

	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4, 5);
		List<Double> myDouble = Arrays.asList(3.15, 2.55);
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDouble, myObjs);
		printList(myObjs);

	}
	
//	List<? extends...> caso de variance, List<? super...> caso de contravariance
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for(Number nb : source) {
			destiny.add(nb);
		}
	}
	
	public static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
		
	}

}
