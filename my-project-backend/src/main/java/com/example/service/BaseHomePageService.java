package com.example.service;

import com.example.entity.BaseFruitInfo;

import java.util.List;

public interface BaseHomePageService {
    List<BaseFruitInfo> selectFruit(BaseFruitInfo baseFruitInfo);
    Integer insertFruit(BaseFruitInfo baseFruitInfo);
    Integer updateFruit(BaseFruitInfo baseFruitInfo);

}
