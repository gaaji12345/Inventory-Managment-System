package com.example.InventoryManagmentSystem.repo;/*  gaajiCode
    99
    03/01/2025
    */

import com.example.InventoryManagmentSystem.enitity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo  extends JpaRepository<Category,Long> {
}
