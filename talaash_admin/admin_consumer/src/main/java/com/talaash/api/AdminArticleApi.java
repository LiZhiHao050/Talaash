package com.talaash.api;

import com.github.pagehelper.PageInfo;
import com.talaash.entity.Article;
import com.talaash.query.ArticleQuery;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author LZH
 * @date 2020/3/24
 * Describe: 文章接口
 */

@FeignClient("admin-producer")
public interface AdminArticleApi {

    /**
     * 文章列表数据
     * @param articleQuery
     * @return
     */
    @RequestMapping("/listData")
    public PageInfo<Article> articleList(@RequestBody ArticleQuery articleQuery);

    /**
     * 修改文章审核状态
     * @param status
     * @param id
     * @return
     */
    @RequestMapping("/setStatu")
    public boolean seteStatu(@RequestParam("status") Integer status, @RequestParam("id") Integer id);

    /**
     * 修改文章删除状态
     * @param deleted
     * @param id
     * @return
     */
    @RequestMapping("/setDeleted")
    public boolean setDeleted(@RequestParam("deleted") Integer deleted, @RequestParam("id") Integer id);

}
