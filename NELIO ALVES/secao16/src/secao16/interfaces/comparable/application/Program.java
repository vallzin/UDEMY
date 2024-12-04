package secao16.interfaces.comparable.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import secao16.interfaces.comparable.entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		String path = "f:\\udemy\\nelio alves\\in.csv";
		
		try(BufferedReader bfR = new BufferedReader(new FileReader(path))){
			String employeeCsv = bfR.readLine();
			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(", ");
				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				employeeCsv = bfR.readLine();
			}
			Collections.sort(list);
			for(Employee e : list) {
				System.out.println(e.getName() + ", " + e.getSalary());
			}
		}catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
			
	}

}
