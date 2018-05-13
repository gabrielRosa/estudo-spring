package com.gabriel.spring.api.service;

import com.gabriel.spring.api.domain.Category;
import com.gabriel.spring.api.repository.CategoryRepository;
import org.hibernate.ObjectDeletedException;
import org.hibernate.ObjectNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CategoryService.class);

    @Autowired
    private CategoryRepository categoryRepository;

    public Category find(Integer id) {
        Optional<Category> optionalCategory = categoryRepository.findById(id);

        return optionalCategory.orElseThrow(() -> new ObjectNotFoundException(Category.class, Category.class.getName()));
    }

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category insert(Category category) {
        category.setId(null);

        return categoryRepository.save(category);
    }

    public Category update(Category category) {
        try {
            find(category.getId());
        } catch (ObjectNotFoundException e) {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.error("Can not PUT category, it is not found: " + category.getId(), e.fillInStackTrace());
            }

            throw e;
        }

        return categoryRepository.save(category);
    }

    public void delete(Integer id) {
        try {
            find(id);
            categoryRepository.deleteById(id);
        } catch (ObjectNotFoundException e) {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.error("Can not DELETE category, it is not found: " + id, e.fillInStackTrace());
            }

            throw e;
        } catch (DataIntegrityViolationException e) {
            String message = "Can not DELETE category, integrity violation!";
            if (LOGGER.isDebugEnabled()) {
                LOGGER.error(message, e.fillInStackTrace());
            }

            throw new ObjectDeletedException(message, Category.class, Category.class.getName());
        }
    }
}
