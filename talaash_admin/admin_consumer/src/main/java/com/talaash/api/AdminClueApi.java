package com.talaash.api;

import com.github.pagehelper.PageInfo;
import com.talaash.entity.Clue;
import com.talaash.query.ClueQuery;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author LZH
 * @date 2020/3/24
 * Describe: 线索接口
 */

@FeignClient("admin-producer")
public interface AdminClueApi {

    /**
     * 查看
     * @param clueQuery
     * @return
     */
    @RequestMapping("/listData")
    public PageInfo<Clue> clueList(@RequestBody ClueQuery clueQuery);

    /**
     * 修改状态
     * @param status
     * @param id
     * @return
     */
    @RequestMapping("/setClueStatus")
    public boolean setClueStatus(@RequestParam Integer status, @RequestParam Integer id);

}
