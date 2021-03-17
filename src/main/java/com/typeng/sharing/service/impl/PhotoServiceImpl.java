package com.typeng.sharing.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.typeng.sharing.mapper.PhotoMapper;
import com.typeng.sharing.model.Photo;
import com.typeng.sharing.service.PhotoService;

/**
 * @author ty-peng
 * @date 2021-03-16 18:55
 */
@Service
public class PhotoServiceImpl extends ServiceImpl<PhotoMapper, Photo> implements PhotoService {}
