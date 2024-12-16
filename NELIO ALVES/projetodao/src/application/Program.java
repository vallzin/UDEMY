package application;


import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println();
		System.out.println("------ *** TEST 1 findById *** -----");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println();
		System.out.println("------ *** TEST 2 findByDepartment *** -----");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
			
		System.out.println();
		System.out.println("------ *** TEST 3 findAll *** -----");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
			
			
		}
		
		System.out.println("------ *** TEST  Insert *** -----");
		Seller newSeller = new Seller(null, "Greg", "gg@email.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id: " + newSeller.getId());

	}
}