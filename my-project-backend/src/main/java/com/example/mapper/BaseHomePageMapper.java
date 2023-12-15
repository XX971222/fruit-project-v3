package com.example.mapper;

import com.example.entity.BaseFruitInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BaseHomePageMapper {
    List<BaseFruitInfo> selectFruit(BaseFruitInfo baseFruitInfo);
    Integer insertFruit(BaseFruitInfo baseFruitInfo);
    Integer updateFruit(BaseFruitInfo baseFruitInfo);


}
