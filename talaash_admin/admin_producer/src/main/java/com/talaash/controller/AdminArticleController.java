package com.talaash.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.talaash.entity.Article;
import com.talaash.query.ArticleQuery;
import com.talaash.service.AdminArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author LZH
 * @date 2020/3/23
 * Describe:
 */

@RestController
@RequestMapping("/adminArticle")
public class AdminArticleController {

    @Autowired
    private AdminArticleService adminArticleService;

    /**
     * 文章列表数据
     * @param articleQuery
     * @return
     */
    @RequestMapping("/listData")
    public PageInfo<Article> articleList(@RequestBody ArticleQuery articleQuery) {
        PageHelper.startPage(articleQuery.getPageNum(), articleQuery.getPageSize());
        List<Article> articles = adminArticleService.articleList(articleQuery);
        return new PageInfo<>(articles);
    }

    /**
     * 修改文章审核状态
     * @param status
     * @param id
     * @return
     */
    @RequestMapping("/setStatu")
    public boolean seteStatu(@RequestParam("status") Integer status, @RequestParam("id") Integer id) {
        return adminArticleService.articleStatus(status, id) > 0;
    }

    /**
     * 修改文章删除状态
     * @param deleted
     * @param id
     * @return
     */
    @RequestMapping("/setDeleted")
    public boolean setDeleted(@RequestParam("deleted") Integer deleted, @RequestParam("id") Integer id) {
        return adminArticleService.articleDeleted(deleted, id) > 0;
    }


}
