package com.talaash.mapper;

import com.talaash.entity.Finger;
import com.talaash.entity.FingerExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface FingerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mj_finger
     *
     * @mbg.generated Thu Mar 26 16:58:15 CST 2020
     */
    long countByExample(FingerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mj_finger
     *
     * @mbg.generated Thu Mar 26 16:58:15 CST 2020
     */
    int deleteByExample(FingerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mj_finger
     *
     * @mbg.generated Thu Mar 26 16:58:15 CST 2020
     */
    int deleteByPrimaryKey(Integer fingerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mj_finger
     *
     * @mbg.generated Thu Mar 26 16:58:15 CST 2020
     */
    int insert(Finger record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mj_finger
     *
     * @mbg.generated Thu Mar 26 16:58:15 CST 2020
     */
    int insertSelective(Finger record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mj_finger
     *
     * @mbg.generated Thu Mar 26 16:58:15 CST 2020
     */
    List<Finger> selectByExample(FingerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mj_finger
     *
     * @mbg.generated Thu Mar 26 16:58:15 CST 2020
     */
    Finger selectByPrimaryKey(Integer fingerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mj_finger
     *
     * @mbg.generated Thu Mar 26 16:58:15 CST 2020
     */
    int updateByExampleSelective(@Param("record") Finger record, @Param("example") FingerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mj_finger
     *
     * @mbg.generated Thu Mar 26 16:58:15 CST 2020
     */
    int updateByExample(@Param("record") Finger record, @Param("example") FingerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mj_finger
     *
     * @mbg.generated Thu Mar 26 16:58:15 CST 2020
     */
    int updateByPrimaryKeySelective(Finger record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mj_finger
     *
     * @mbg.generated Thu Mar 26 16:58:15 CST 2020
     */
    int updateByPrimaryKey(Finger record);
}