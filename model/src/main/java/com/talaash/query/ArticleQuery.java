package com.talaash.query;

import com.talaash.entity.Article;
import lombok.Data;

import java.util.Date;

/**
 * @author LZH
 * @date 2020/3/23
 * Describe: 文章查询类
 */

@Data
public class ArticleQuery extends Article {

    /**
     * 当前页
     */
    private Integer pageNum;

    /**
     * 每页显示条数
     */
    private Integer pageSize;

    /**
     * 文章标题
     */
    private String titleKey;

    /**
     * 创建时间大于
     */
    private Date startTime;

    /**
     * 创建时间小于
     */
    private Date endTime;

}
