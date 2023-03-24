package com.typeng.sharing.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.typeng.sharing.common.Result;
import com.typeng.sharing.model.Category;
import com.typeng.sharing.service.CategoryService;

/**
 * 分类相关接口.
 *
 * @author ty-peng
 * @date 2021-03-16 19:03
 */
@RestController
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/{id}")
    public Result<Category> getCategory(@PathVariable int id) {
        Category category = categoryService.getById(id);
        return new Result<>(category);
    }

}
