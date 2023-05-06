package com.xudasong.springcloudTest.pojo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 分页查询基本结果参数
 * @param <T>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BasePageData<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据
     */
    private List<T> records;

    /**
     * 总数据
     */
    private long total;

    /**
     * size
     */
    private long size;

    /**
     * 当前页
     */
    private long current;

    /**
     * 总页数
     */
    private long pages;

    public BasePageData(IPage iPage){
        this.total = iPage.getTotal();
        this.size = iPage.getSize();
        this.current = iPage.getCurrent();
        this.pages = iPage.getPages();
        this.records = iPage.getRecords();
    }

}
