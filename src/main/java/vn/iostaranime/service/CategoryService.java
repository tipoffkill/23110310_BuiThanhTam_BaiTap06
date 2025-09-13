package vn.iostaranime.service;

import vn.iostaranime.entity.Category;
import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category save(Category entity);
    void deleteById(int id);
    List<Category> search(String keyword);
    Category findById(int id);
}
