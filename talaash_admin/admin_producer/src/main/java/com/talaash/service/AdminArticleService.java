package com.talaash.service;

import com.talaash.entity.Article;
import com.talaash.entity.ArticleExample;
import com.talaash.mapper.ArticleMapper;
import com.talaash.query.ArticleQuery;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author LZH
 * @date 2020/3/23
 * Describe: 管理员文章管理
 */

@Service
@Transactional
public class AdminArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    /**
     * 管理员文章查询
     * @param articleQuery
     * @return
     */
    public List<Article> articleList(ArticleQuery articleQuery) {

        ArticleExample articleExample = new ArticleExample();
        ArticleExample.Criteria criteria = articleExample.createCriteria();

        // 文章标题模糊查询
        if (StringUtils.isNotEmpty(articleQuery.getTitleKey())) {
            criteria.andTitleLike("%" + articleQuery.getTitleKey() + "%");
        }

        // 文章创建时间大于等于
        if (articleQuery.getStartTime() != null) {
            criteria.andCreateTimeGreaterThanOrEqualTo(articleQuery.getStartTime());
        }

        // 文章创建时间小于等于
        if (articleQuery.getEndTime() != null) {
            criteria.andCreateTimeLessThanOrEqualTo(articleQuery.getEndTime());
        }

        // 文章审核状态查询
        if (articleQuery.getStatus() != null) {
            criteria.andStatusEqualTo(articleQuery.getStatus());
        }

        // 文章删除状态查询
        if (articleQuery.getDeleted() != null) {
            criteria.andDeletedEqualTo(articleQuery.getDeleted());
        }

        return articleMapper.selectByExample(articleExample);
    }

    /**
     * 修改文章审核状态
     * @param status
     * @param id
     * @return
     */
    public int articleStatus(Integer status, Integer id) {
        return articleMapper.updateArticleStatu(status, id);
    }

    /**
     * 修改文章删除状态(逻辑删除)
     * @param deleted
     * @param id
     * @return
     */
    public int articleDeleted(Integer deleted, Integer id) {
        return articleMapper.updateArticleDeleted(deleted, id);
    }


}
