package com.newer.hysc.data.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UserPonumberGoods {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_PONUMBER_GOODS.PONUMBER_GOODS_ID
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    private String ponumberGoodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_PONUMBER_GOODS.PICK_TIME
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    private Date pickTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_PONUMBER_GOODS.USER_ID
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_PONUMBER_GOODS.BUY_PV
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    private BigDecimal buyPv;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_PONUMBER_GOODS.ORDER_ID
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    private String orderId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_PONUMBER_GOODS.PONUMBER_GOODS_ID
     *
     * @return the value of USER_PONUMBER_GOODS.PONUMBER_GOODS_ID
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    public String getPonumberGoodsId() {
        return ponumberGoodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_PONUMBER_GOODS.PONUMBER_GOODS_ID
     *
     * @param ponumberGoodsId the value for USER_PONUMBER_GOODS.PONUMBER_GOODS_ID
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    public void setPonumberGoodsId(String ponumberGoodsId) {
        this.ponumberGoodsId = ponumberGoodsId == null ? null : ponumberGoodsId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_PONUMBER_GOODS.PICK_TIME
     *
     * @return the value of USER_PONUMBER_GOODS.PICK_TIME
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    public Date getPickTime() {
        return pickTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_PONUMBER_GOODS.PICK_TIME
     *
     * @param pickTime the value for USER_PONUMBER_GOODS.PICK_TIME
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    public void setPickTime(Date pickTime) {
        this.pickTime = pickTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_PONUMBER_GOODS.USER_ID
     *
     * @return the value of USER_PONUMBER_GOODS.USER_ID
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_PONUMBER_GOODS.USER_ID
     *
     * @param userId the value for USER_PONUMBER_GOODS.USER_ID
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_PONUMBER_GOODS.BUY_PV
     *
     * @return the value of USER_PONUMBER_GOODS.BUY_PV
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    public BigDecimal getBuyPv() {
        return buyPv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_PONUMBER_GOODS.BUY_PV
     *
     * @param buyPv the value for USER_PONUMBER_GOODS.BUY_PV
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    public void setBuyPv(BigDecimal buyPv) {
        this.buyPv = buyPv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_PONUMBER_GOODS.ORDER_ID
     *
     * @return the value of USER_PONUMBER_GOODS.ORDER_ID
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_PONUMBER_GOODS.ORDER_ID
     *
     * @param orderId the value for USER_PONUMBER_GOODS.ORDER_ID
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }
}