package com.talaash.query;

import lombok.Data;

/**
 * @author LZH
 * @date 2020/3/23
 * Describe: 分页查询类
 */

@Data
public class PageQuery {

    /**
     * 当前页
     */
    private Integer pageNum;

    /**
     * 每页显示条数
     */
    private Integer pageSize;

}
