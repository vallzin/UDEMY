package application;


import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("----- *** Test 1 Department findById *** -----");
		Department dep = depDao.findById(2);
		System.out.println(dep);
		
		System.out.println();
		System.out.println("----- *** Test 2 Department findAll *** -----");
		List<Department> list = depDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		
		System.out.println();
		System.out.println("----- *** Test 3 Department insert *** -----");
		Department department = new Department(null, "Sport");
		depDao.insert(department);
		System.out.println(department);

	}
}
