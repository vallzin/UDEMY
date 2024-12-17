package model.dao;

import db.DB;
import model.dao.Impl.DepartmentDaoJBDC;
import model.dao.Impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao creatDepartmentDao() {
		return new DepartmentDaoJBDC();
	}

}
