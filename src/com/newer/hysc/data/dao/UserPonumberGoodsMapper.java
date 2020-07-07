package com.newer.hysc.data.dao;

import com.newer.hysc.data.entity.UserPonumberGoods;
import com.newer.hysc.data.entity.UserPonumberGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPonumberGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER_GOODS
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    int countByExample(UserPonumberGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER_GOODS
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    int deleteByExample(UserPonumberGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER_GOODS
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    int deleteByPrimaryKey(String ponumberGoodsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER_GOODS
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    int insert(UserPonumberGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER_GOODS
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    int insertSelective(UserPonumberGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER_GOODS
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    List<UserPonumberGoods> selectByExample(UserPonumberGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER_GOODS
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    UserPonumberGoods selectByPrimaryKey(String ponumberGoodsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER_GOODS
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    int updateByExampleSelective(@Param("record") UserPonumberGoods record, @Param("example") UserPonumberGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER_GOODS
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    int updateByExample(@Param("record") UserPonumberGoods record, @Param("example") UserPonumberGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER_GOODS
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    int updateByPrimaryKeySelective(UserPonumberGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER_GOODS
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    int updateByPrimaryKey(UserPonumberGoods record);
}