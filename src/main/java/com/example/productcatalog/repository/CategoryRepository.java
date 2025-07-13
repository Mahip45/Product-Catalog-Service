package com.productcatalog.productcatalog.Repository;

import com.productcatalog.productcatalog.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
