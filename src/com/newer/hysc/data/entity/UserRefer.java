package com.newer.hysc.data.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UserRefer {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_REFER.REFER_LOG_ID
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    private String referLogId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_REFER.REFER_TIME
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    private Date referTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_REFER.USER_ID
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_REFER.REFER_ID
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    private String referId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_REFER.BUY_PV
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    private BigDecimal buyPv;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_REFER.BONUS_RATE
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    private BigDecimal bonusRate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_REFER.BONUS_PV
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    private BigDecimal bonusPv;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_REFER.REFER_LOG_ID
     *
     * @return the value of USER_REFER.REFER_LOG_ID
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    public String getReferLogId() {
        return referLogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_REFER.REFER_LOG_ID
     *
     * @param referLogId the value for USER_REFER.REFER_LOG_ID
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    public void setReferLogId(String referLogId) {
        this.referLogId = referLogId == null ? null : referLogId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_REFER.REFER_TIME
     *
     * @return the value of USER_REFER.REFER_TIME
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    public Date getReferTime() {
        return referTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_REFER.REFER_TIME
     *
     * @param referTime the value for USER_REFER.REFER_TIME
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    public void setReferTime(Date referTime) {
        this.referTime = referTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_REFER.USER_ID
     *
     * @return the value of USER_REFER.USER_ID
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_REFER.USER_ID
     *
     * @param userId the value for USER_REFER.USER_ID
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_REFER.REFER_ID
     *
     * @return the value of USER_REFER.REFER_ID
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    public String getReferId() {
        return referId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_REFER.REFER_ID
     *
     * @param referId the value for USER_REFER.REFER_ID
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    public void setReferId(String referId) {
        this.referId = referId == null ? null : referId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_REFER.BUY_PV
     *
     * @return the value of USER_REFER.BUY_PV
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    public BigDecimal getBuyPv() {
        return buyPv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_REFER.BUY_PV
     *
     * @param buyPv the value for USER_REFER.BUY_PV
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    public void setBuyPv(BigDecimal buyPv) {
        this.buyPv = buyPv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_REFER.BONUS_RATE
     *
     * @return the value of USER_REFER.BONUS_RATE
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    public BigDecimal getBonusRate() {
        return bonusRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_REFER.BONUS_RATE
     *
     * @param bonusRate the value for USER_REFER.BONUS_RATE
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    public void setBonusRate(BigDecimal bonusRate) {
        this.bonusRate = bonusRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_REFER.BONUS_PV
     *
     * @return the value of USER_REFER.BONUS_PV
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    public BigDecimal getBonusPv() {
        return bonusPv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_REFER.BONUS_PV
     *
     * @param bonusPv the value for USER_REFER.BONUS_PV
     *
     * @mbggenerated Tue Jul 07 18:44:38 CST 2020
     */
    public void setBonusPv(BigDecimal bonusPv) {
        this.bonusPv = bonusPv;
    }
}