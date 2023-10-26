package com.javafxprojeto01.javafx.model.dao;

import com.javafxprojeto01.javafx.model.entities.Department;

import java.util.List;

public interface DepartmentDao {
    void insert(Department obj);

    void update(Department obj);

    void deleteById(Integer id);

    Department findById(Integer id);

    List<Department> findAll();
}
