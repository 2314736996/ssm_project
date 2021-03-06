package com.newer.hysc.data.dao;

import com.newer.hysc.data.entity.Information;
import com.newer.hysc.data.entity.InformationExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InformationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION
     *
     * @mbggenerated Tue Jul 07 18:48:04 CST 2020
     */
    int countByExample(InformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION
     *
     * @mbggenerated Tue Jul 07 18:48:04 CST 2020
     */
    int deleteByExample(InformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION
     *
     * @mbggenerated Tue Jul 07 18:48:04 CST 2020
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION
     *
     * @mbggenerated Tue Jul 07 18:48:04 CST 2020
     */
    int insert(Information record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION
     *
     * @mbggenerated Tue Jul 07 18:48:04 CST 2020
     */
    int insertSelective(Information record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION
     *
     * @mbggenerated Tue Jul 07 18:48:04 CST 2020
     */
    List<Information> selectByExample(InformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION
     *
     * @mbggenerated Tue Jul 07 18:48:04 CST 2020
     */
    Information selectByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION
     *
     * @mbggenerated Tue Jul 07 18:48:04 CST 2020
     */
    int updateByExampleSelective(@Param("record") Information record, @Param("example") InformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION
     *
     * @mbggenerated Tue Jul 07 18:48:04 CST 2020
     */
    int updateByExample(@Param("record") Information record, @Param("example") InformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION
     *
     * @mbggenerated Tue Jul 07 18:48:04 CST 2020
     */
    int updateByPrimaryKeySelective(Information record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORMATION
     *
     * @mbggenerated Tue Jul 07 18:48:04 CST 2020
     */
    int updateByPrimaryKey(Information record);
}