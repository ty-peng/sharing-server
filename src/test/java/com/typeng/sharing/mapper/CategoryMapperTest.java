package com.typeng.sharing.mapper;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * @author ty-peng
 * @date 2021-03-16 19:54
 */
@SpringBootTest
@ActiveProfiles("dev")
class CategoryMapperTest {

    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    public void testSelect() {
        assertDoesNotThrow(() -> categoryMapper.selectById(1));
    }

}