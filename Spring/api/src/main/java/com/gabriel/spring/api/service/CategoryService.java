package com.gabriel.spring.api.service;

import com.gabriel.spring.api.domain.Category;
import com.gabriel.spring.api.repository.CategoryRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category find(final Integer id) {
        Optional<Category> optionalCategory = categoryRepository.findById(id);

        return optionalCategory.orElseThrow(() -> new ObjectNotFoundException(Category.class, Category.class.getName()));
    }
}
