package com.talaash.controller;

import com.github.pagehelper.PageInfo;
import com.talaash.api.AdminArticleApi;
import com.talaash.entity.Article;
import com.talaash.query.ArticleQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author LZH
 * @date 2020/3/23
 * Describe:
 */

@CrossOrigin
@RestController
@RequestMapping("/adminArticle")
public class AdminArticleController {

    @Autowired
    private AdminArticleApi adminArticleApi;

    /**
     * 文章列表数据
     * @param articleQuery
     * @return
     */
    @RequestMapping("/listData")
    public PageInfo<Article> articleList(@RequestBody ArticleQuery articleQuery) {
        return adminArticleApi.articleList(articleQuery);
    }

    /**
     * 修改文章审核状态
     * @param status
     * @param id
     * @return
     */
    @RequestMapping("/setStatu")
    public boolean seteStatu(@RequestParam("status") Integer status, @RequestParam("id") Integer id) {
        return adminArticleApi.seteStatu(status, id);
    }

    /**
     * 修改文章删除状态
     * @param deleted
     * @param id
     * @return
     */
    @RequestMapping("/setDeleted")
    public boolean setDeleted(@RequestParam("deleted") Integer deleted, @RequestParam("id") Integer id) {
        return adminArticleApi.setDeleted(deleted, id);
    }


}
