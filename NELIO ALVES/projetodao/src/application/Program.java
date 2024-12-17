package application;


import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
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
		
		System.out.println();
		System.out.println("------ *** TEST 4 Insert *** -----");
		Seller newSeller = new Seller(null, "Greg", "gg@email.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id: " + newSeller.getId());
		
		System.out.println();
		System.out.println("------ *** TEST 5 Update *** -----");
		seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("Updated completed");
		
		System.out.println();
		System.out.println("------ *** TEST 6 Delete *** -----");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();

	}
}
