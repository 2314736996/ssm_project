package com.newer.hysc.data.dao;

import com.newer.hysc.data.entity.UserPair201312;
import com.newer.hysc.data.entity.UserPair201312Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPair201312Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PAIR_201312
     *
     * @mbggenerated Tue Jul 07 18:42:58 CST 2020
     */
    int countByExample(UserPair201312Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PAIR_201312
     *
     * @mbggenerated Tue Jul 07 18:42:58 CST 2020
     */
    int deleteByExample(UserPair201312Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PAIR_201312
     *
     * @mbggenerated Tue Jul 07 18:42:58 CST 2020
     */
    int deleteByPrimaryKey(String pairId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PAIR_201312
     *
     * @mbggenerated Tue Jul 07 18:42:58 CST 2020
     */
    int insert(UserPair201312 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PAIR_201312
     *
     * @mbggenerated Tue Jul 07 18:42:58 CST 2020
     */
    int insertSelective(UserPair201312 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PAIR_201312
     *
     * @mbggenerated Tue Jul 07 18:42:58 CST 2020
     */
    List<UserPair201312> selectByExample(UserPair201312Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PAIR_201312
     *
     * @mbggenerated Tue Jul 07 18:42:58 CST 2020
     */
    UserPair201312 selectByPrimaryKey(String pairId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PAIR_201312
     *
     * @mbggenerated Tue Jul 07 18:42:58 CST 2020
     */
    int updateByExampleSelective(@Param("record") UserPair201312 record, @Param("example") UserPair201312Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PAIR_201312
     *
     * @mbggenerated Tue Jul 07 18:42:58 CST 2020
     */
    int updateByExample(@Param("record") UserPair201312 record, @Param("example") UserPair201312Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PAIR_201312
     *
     * @mbggenerated Tue Jul 07 18:42:58 CST 2020
     */
    int updateByPrimaryKeySelective(UserPair201312 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PAIR_201312
     *
     * @mbggenerated Tue Jul 07 18:42:58 CST 2020
     */
    int updateByPrimaryKey(UserPair201312 record);
}