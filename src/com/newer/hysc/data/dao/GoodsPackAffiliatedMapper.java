package com.newer.hysc.data.dao;

import com.newer.hysc.data.entity.GoodsPackAffiliated;
import com.newer.hysc.data.entity.GoodsPackAffiliatedExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsPackAffiliatedMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS_PACK_AFFILIATED
     *
     * @mbggenerated Tue Jul 07 18:47:53 CST 2020
     */
    int countByExample(GoodsPackAffiliatedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS_PACK_AFFILIATED
     *
     * @mbggenerated Tue Jul 07 18:47:53 CST 2020
     */
    int deleteByExample(GoodsPackAffiliatedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS_PACK_AFFILIATED
     *
     * @mbggenerated Tue Jul 07 18:47:53 CST 2020
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS_PACK_AFFILIATED
     *
     * @mbggenerated Tue Jul 07 18:47:53 CST 2020
     */
    int insert(GoodsPackAffiliated record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS_PACK_AFFILIATED
     *
     * @mbggenerated Tue Jul 07 18:47:53 CST 2020
     */
    int insertSelective(GoodsPackAffiliated record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS_PACK_AFFILIATED
     *
     * @mbggenerated Tue Jul 07 18:47:53 CST 2020
     */
    List<GoodsPackAffiliated> selectByExample(GoodsPackAffiliatedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS_PACK_AFFILIATED
     *
     * @mbggenerated Tue Jul 07 18:47:53 CST 2020
     */
    GoodsPackAffiliated selectByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS_PACK_AFFILIATED
     *
     * @mbggenerated Tue Jul 07 18:47:53 CST 2020
     */
    int updateByExampleSelective(@Param("record") GoodsPackAffiliated record, @Param("example") GoodsPackAffiliatedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS_PACK_AFFILIATED
     *
     * @mbggenerated Tue Jul 07 18:47:53 CST 2020
     */
    int updateByExample(@Param("record") GoodsPackAffiliated record, @Param("example") GoodsPackAffiliatedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS_PACK_AFFILIATED
     *
     * @mbggenerated Tue Jul 07 18:47:53 CST 2020
     */
    int updateByPrimaryKeySelective(GoodsPackAffiliated record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS_PACK_AFFILIATED
     *
     * @mbggenerated Tue Jul 07 18:47:53 CST 2020
     */
    int updateByPrimaryKey(GoodsPackAffiliated record);
}