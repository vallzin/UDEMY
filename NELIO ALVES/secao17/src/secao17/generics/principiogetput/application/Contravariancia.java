package secao17.generics.principiogetput.application;

import java.util.ArrayList;
import java.util.List;

public class Contravariancia {

	public static void main(String[] args) {
		
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("maria");
		myObjs.add("jose");
		
		List<? super Number> myNums = myObjs;
		
		myNums.add(10);
		myNums.add(5);
		
//		Number x = nyNums.get(0); // erro de compilação

	}

}
