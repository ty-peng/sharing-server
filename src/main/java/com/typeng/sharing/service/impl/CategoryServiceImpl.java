package com.typeng.sharing.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.typeng.sharing.mapper.CategoryMapper;
import com.typeng.sharing.model.Category;
import com.typeng.sharing.service.CategoryService;

/**
 * @author ty-peng
 * @date 2021-03-16 18:56
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
