package com.talaash.query;

import com.talaash.entity.Clue;
import lombok.Data;

/**
 * @author LZH
 * @date 2020/3/24
 * Describe: 线索查询类
 */

@Data
public class ClueQuery extends Clue {

    /**
     * 当前页
     */
    private Integer pageNum;

    /**
     * 每页显示条数
     */
    private Integer pageSize;

    /**
     * 查找省
     */
    private Integer findProvince;

    /**
     * 查找市
     */
    private Integer findCity;

    /**
     * 查找县
     */
    private Integer findCounty;

}
