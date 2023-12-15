package com.example.entity;

import lombok.Data;

import java.util.Date;

/**
 * @create: xx
 * @time: 2023-11-18
 */
@Data
public class BaseInfo {
    private String createBy;
    private String updateBy;
    private Date createTime;
    private Date updateTime;
    private String remark;
}
