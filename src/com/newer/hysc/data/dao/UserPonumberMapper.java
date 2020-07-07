package com.newer.hysc.data.dao;

import com.newer.hysc.data.entity.UserPonumber;
import com.newer.hysc.data.entity.UserPonumberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPonumberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER
     *
     * @mbggenerated Tue Jul 07 18:43:53 CST 2020
     */
    int countByExample(UserPonumberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER
     *
     * @mbggenerated Tue Jul 07 18:43:53 CST 2020
     */
    int deleteByExample(UserPonumberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER
     *
     * @mbggenerated Tue Jul 07 18:43:53 CST 2020
     */
    int deleteByPrimaryKey(String ponumberId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER
     *
     * @mbggenerated Tue Jul 07 18:43:53 CST 2020
     */
    int insert(UserPonumber record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER
     *
     * @mbggenerated Tue Jul 07 18:43:53 CST 2020
     */
    int insertSelective(UserPonumber record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER
     *
     * @mbggenerated Tue Jul 07 18:43:53 CST 2020
     */
    List<UserPonumber> selectByExample(UserPonumberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER
     *
     * @mbggenerated Tue Jul 07 18:43:53 CST 2020
     */
    UserPonumber selectByPrimaryKey(String ponumberId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER
     *
     * @mbggenerated Tue Jul 07 18:43:53 CST 2020
     */
    int updateByExampleSelective(@Param("record") UserPonumber record, @Param("example") UserPonumberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER
     *
     * @mbggenerated Tue Jul 07 18:43:53 CST 2020
     */
    int updateByExample(@Param("record") UserPonumber record, @Param("example") UserPonumberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER
     *
     * @mbggenerated Tue Jul 07 18:43:53 CST 2020
     */
    int updateByPrimaryKeySelective(UserPonumber record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER
     *
     * @mbggenerated Tue Jul 07 18:43:53 CST 2020
     */
    int updateByPrimaryKey(UserPonumber record);
}