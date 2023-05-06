package com.xudasong.springcloudTest.pojo;

import lombok.Data;

/**
 * 分页入参
 */
@Data
public class BasePageParam<T> {

    /**
     * 页码
     */
    private Integer page = 1;

    /**
     * 分页条数
     */
    private Integer size = 10;

    /**
     * 查询参数数据
     */
    private T param;

}
