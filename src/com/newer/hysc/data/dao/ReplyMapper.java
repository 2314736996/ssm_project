package com.newer.hysc.data.dao;

import com.newer.hysc.data.entity.Reply;
import com.newer.hysc.data.entity.ReplyExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REPLY
     *
     * @mbggenerated Tue Jul 07 18:48:37 CST 2020
     */
    int countByExample(ReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REPLY
     *
     * @mbggenerated Tue Jul 07 18:48:37 CST 2020
     */
    int deleteByExample(ReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REPLY
     *
     * @mbggenerated Tue Jul 07 18:48:37 CST 2020
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REPLY
     *
     * @mbggenerated Tue Jul 07 18:48:37 CST 2020
     */
    int insert(Reply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REPLY
     *
     * @mbggenerated Tue Jul 07 18:48:37 CST 2020
     */
    int insertSelective(Reply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REPLY
     *
     * @mbggenerated Tue Jul 07 18:48:37 CST 2020
     */
    List<Reply> selectByExample(ReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REPLY
     *
     * @mbggenerated Tue Jul 07 18:48:37 CST 2020
     */
    Reply selectByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REPLY
     *
     * @mbggenerated Tue Jul 07 18:48:37 CST 2020
     */
    int updateByExampleSelective(@Param("record") Reply record, @Param("example") ReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REPLY
     *
     * @mbggenerated Tue Jul 07 18:48:37 CST 2020
     */
    int updateByExample(@Param("record") Reply record, @Param("example") ReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REPLY
     *
     * @mbggenerated Tue Jul 07 18:48:37 CST 2020
     */
    int updateByPrimaryKeySelective(Reply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REPLY
     *
     * @mbggenerated Tue Jul 07 18:48:37 CST 2020
     */
    int updateByPrimaryKey(Reply record);
}