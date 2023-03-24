package com.typeng.sharing.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.typeng.sharing.common.Result;
import com.typeng.sharing.model.Photo;
import com.typeng.sharing.service.PhotoService;

/**
 * 图片相关接口.
 *
 * @author ty-peng
 * @date 2021-03-16 15:45
 */
@RestController
@RequestMapping("/photo")
public class PhotoController {

    private final PhotoService photoService;

    public PhotoController(PhotoService photoService) {
        this.photoService = photoService;
    }

    @GetMapping("/{id}")
    public Result<Photo> getById(@PathVariable long id) {
        Photo photo = photoService.getById(id);
        return new Result<>(photo);
    }

}
