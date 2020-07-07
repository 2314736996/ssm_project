package com.newer.hysc.data.dao;

import com.newer.hysc.data.entity.UserRefer;
import com.newer.hysc.data.entity.UserReferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserReferMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_REFER
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    int countByExample(UserReferExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_REFER
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    int deleteByExample(UserReferExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_REFER
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    int deleteByPrimaryKey(String referLogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_REFER
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    int insert(UserRefer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_REFER
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    int insertSelective(UserRefer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_REFER
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    List<UserRefer> selectByExample(UserReferExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_REFER
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    UserRefer selectByPrimaryKey(String referLogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_REFER
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    int updateByExampleSelective(@Param("record") UserRefer record, @Param("example") UserReferExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_REFER
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    int updateByExample(@Param("record") UserRefer record, @Param("example") UserReferExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_REFER
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    int updateByPrimaryKeySelective(UserRefer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_REFER
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    int updateByPrimaryKey(UserRefer record);
}