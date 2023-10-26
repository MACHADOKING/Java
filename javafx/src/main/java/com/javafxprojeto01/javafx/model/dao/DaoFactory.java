package com.javafxprojeto01.javafx.model.dao;

import com.javafxprojeto01.javafx.db.DB;
import com.javafxprojeto01.javafx.model.dao.impl.DepartmentDaoJDBC;
import com.javafxprojeto01.javafx.model.dao.impl.SellerDaoJDBC;
import com.javafxprojeto01.javafx.model.dao.SellerDao;
import com.javafxprojeto01.javafx.model.dao.DepartmentDao;

public class DaoFactory {
    public static SellerDao createSellerDao() {
        return (SellerDao) new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao() { return (DepartmentDao) new DepartmentDaoJDBC(DB.getConnection()); }
}
