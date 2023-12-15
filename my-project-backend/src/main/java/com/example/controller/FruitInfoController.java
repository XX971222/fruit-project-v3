package com.example.controller;

import com.example.entity.BaseFruitInfo;
import com.example.entity.base.Result;
import com.example.service.BaseHomePageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/fruit/info")
public class FruitInfoController {

    @Autowired
    private BaseHomePageService baseHomePageService;

    @PostMapping("/select/fruit")
    @ResponseBody
    public Result selectFruit(@RequestBody BaseFruitInfo baseFruitInfo){
        List<BaseFruitInfo> baseFruitInfoList = baseHomePageService.selectFruit(baseFruitInfo);
        return new Result<>(baseFruitInfoList);
    }

    @PostMapping("/insert/fruit")
    @ResponseBody
    public Result insertFruit(@RequestBody BaseFruitInfo baseFruitInfo){
        Integer res = baseHomePageService.insertFruit(baseFruitInfo);
        return new Result<>(res);
    }

    @PostMapping("/update/fruit")
    @ResponseBody
    public Result updateFruit(@RequestBody BaseFruitInfo baseFruitInfo){
        Integer res = baseHomePageService.updateFruit(baseFruitInfo);
        return new Result<>(res);
    }
}
