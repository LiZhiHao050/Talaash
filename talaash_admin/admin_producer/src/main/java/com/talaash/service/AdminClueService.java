package com.talaash.service;

import com.talaash.entity.Clue;
import com.talaash.entity.ClueExample;
import com.talaash.mapper.ClueMapper;
import com.talaash.query.ClueQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author LZH
 * @date 2020/3/24
 * Describe:
 */

@Service
@Transactional
public class AdminClueService {

    @Autowired
    private ClueMapper clueMapper;

    /**
     * 线索查询
     * @param clueQuery
     * @return
     */
    public List<Clue> clueList(ClueQuery clueQuery) {

        ClueExample clueExample = new ClueExample();
        ClueExample.Criteria criteria = clueExample.createCriteria();

        if (clueQuery.getProvince() != null) {
            criteria.andProvinceEqualTo(clueQuery.getProvince());
        }

        if (clueQuery.getCity() != null) {
            criteria.andCityEqualTo(clueQuery.getCity());
        }

        if (clueQuery.getCounty() != null) {
            criteria.andCountyEqualTo(clueQuery.getCounty());
        }

        if (clueQuery.getStatus() != null) {
            criteria.andStatusEqualTo(clueQuery.getStatus());
        }

        return clueMapper.selectByExample(clueExample);
    }

    /**
     * 修改线索状态
     * @param status
     * @return
     */
    public int setClueStatus(Integer status, Integer id) {
        return clueMapper.updateClueStatus(status, id);
    }

}
