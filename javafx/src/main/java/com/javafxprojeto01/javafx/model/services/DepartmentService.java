package com.javafxprojeto01.javafx.model.services;

import com.javafxprojeto01.javafx.model.dao.DaoFactory;
import com.javafxprojeto01.javafx.model.dao.DepartmentDao;
import com.javafxprojeto01.javafx.model.entities.Department;

import java.util.List;

public class DepartmentService {

    private DepartmentDao dao = DaoFactory.createDepartmentDao();

    public List<Department> findAll() {
        return dao.findAll();
    }
}
