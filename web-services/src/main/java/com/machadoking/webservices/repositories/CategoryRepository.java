package com.machadoking.webservices.repositories;

import com.machadoking.webservices.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
