package com.javafxprojeto01.javafx.model.dao;

import com.javafxprojeto01.javafx.model.entities.Department;
import com.javafxprojeto01.javafx.model.entities.Seller;

import java.util.List;

public interface SellerDao {
    void insert(Seller obj);

    void update(Seller obj);

    void deleteById(Integer id);

    Seller findById(Integer id);

    List<Seller> findAll();

    List<Seller> findByDepartment(Department department);
}
