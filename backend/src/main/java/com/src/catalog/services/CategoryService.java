package com.src.catalog.services;

import com.src.catalog.dto.CategoryDTO;
import com.src.catalog.entities.Category;
import com.src.catalog.repositories.CategoryRepository;
import com.src.catalog.services.exception.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<CategoryDTO> findAll() {
        List<Category> list = repository.findAll();
        return list.stream().map(c -> new CategoryDTO(c))
                .collect(Collectors.toList());
    }

    public CategoryDTO findById(Long id) {
        Category entity = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Entity not found"));
        return new CategoryDTO(entity);
    }

}
