package com.example.service.impl;

import com.example.mapper.BaseHomePageMapper;
import com.example.entity.BaseFruitInfo;
import com.example.service.BaseHomePageService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseHomePageServiceImpl implements BaseHomePageService {

    @Resource
    private BaseHomePageMapper baseHomePageMapper;
    @Override
    public List<BaseFruitInfo> selectFruit(BaseFruitInfo baseFruitInfo) {
        return baseHomePageMapper.selectFruit(baseFruitInfo);
    }

    @Override
    public Integer insertFruit(BaseFruitInfo baseFruitInfo) {
        return baseHomePageMapper.insertFruit(baseFruitInfo);
    }

    @Override
    public Integer updateFruit(BaseFruitInfo baseFruitInfo) {
        return baseHomePageMapper.updateFruit(baseFruitInfo);
    }
}
