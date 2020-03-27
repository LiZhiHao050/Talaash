package com.talaash.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.talaash.entity.Clue;
import com.talaash.query.ClueQuery;
import com.talaash.service.AdminClueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author LZH
 * @date 2020/3/24
 * Describe:
 */

@RestController
@RequestMapping("/adminClue")
public class AdminClueController {

    @Autowired
    private AdminClueService adminClueService;

    /**
     * 查看
     * @param clueQuery
     * @return
     */
    @RequestMapping("/listData")
    public PageInfo<Clue> clueList(@RequestBody ClueQuery clueQuery) {
        PageHelper.startPage(clueQuery.getPageNum(), clueQuery.getPageSize());

        List<Clue> clues = adminClueService.clueList(clueQuery);
        return new PageInfo<>(clues);
    }

    /**
     * 修改状态
     * @param status
     * @param id
     * @return
     */
    @RequestMapping("/setClueStatus")
    public boolean setClueStatus(@RequestParam Integer status, @RequestParam Integer id) {
        return adminClueService.setClueStatus(status, id) > 0;
    }


}
