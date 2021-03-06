package ru.skillsad.sad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.skillsad.sad.domain.catalog.SubCategory;


public interface SubCategoryRepo extends JpaRepository<SubCategory,Long> {
    SubCategory findByName(String name);
    SubCategory getById(Long id);
}
