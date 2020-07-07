package com.newer.hysc.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserPonumberGoodsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table USER_PONUMBER_GOODS
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table USER_PONUMBER_GOODS
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table USER_PONUMBER_GOODS
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER_GOODS
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    public UserPonumberGoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER_GOODS
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER_GOODS
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER_GOODS
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER_GOODS
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER_GOODS
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER_GOODS
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER_GOODS
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER_GOODS
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER_GOODS
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER_GOODS
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table USER_PONUMBER_GOODS
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPonumberGoodsIdIsNull() {
            addCriterion("PONUMBER_GOODS_ID is null");
            return (Criteria) this;
        }

        public Criteria andPonumberGoodsIdIsNotNull() {
            addCriterion("PONUMBER_GOODS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPonumberGoodsIdEqualTo(String value) {
            addCriterion("PONUMBER_GOODS_ID =", value, "ponumberGoodsId");
            return (Criteria) this;
        }

        public Criteria andPonumberGoodsIdNotEqualTo(String value) {
            addCriterion("PONUMBER_GOODS_ID <>", value, "ponumberGoodsId");
            return (Criteria) this;
        }

        public Criteria andPonumberGoodsIdGreaterThan(String value) {
            addCriterion("PONUMBER_GOODS_ID >", value, "ponumberGoodsId");
            return (Criteria) this;
        }

        public Criteria andPonumberGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("PONUMBER_GOODS_ID >=", value, "ponumberGoodsId");
            return (Criteria) this;
        }

        public Criteria andPonumberGoodsIdLessThan(String value) {
            addCriterion("PONUMBER_GOODS_ID <", value, "ponumberGoodsId");
            return (Criteria) this;
        }

        public Criteria andPonumberGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("PONUMBER_GOODS_ID <=", value, "ponumberGoodsId");
            return (Criteria) this;
        }

        public Criteria andPonumberGoodsIdLike(String value) {
            addCriterion("PONUMBER_GOODS_ID like", value, "ponumberGoodsId");
            return (Criteria) this;
        }

        public Criteria andPonumberGoodsIdNotLike(String value) {
            addCriterion("PONUMBER_GOODS_ID not like", value, "ponumberGoodsId");
            return (Criteria) this;
        }

        public Criteria andPonumberGoodsIdIn(List<String> values) {
            addCriterion("PONUMBER_GOODS_ID in", values, "ponumberGoodsId");
            return (Criteria) this;
        }

        public Criteria andPonumberGoodsIdNotIn(List<String> values) {
            addCriterion("PONUMBER_GOODS_ID not in", values, "ponumberGoodsId");
            return (Criteria) this;
        }

        public Criteria andPonumberGoodsIdBetween(String value1, String value2) {
            addCriterion("PONUMBER_GOODS_ID between", value1, value2, "ponumberGoodsId");
            return (Criteria) this;
        }

        public Criteria andPonumberGoodsIdNotBetween(String value1, String value2) {
            addCriterion("PONUMBER_GOODS_ID not between", value1, value2, "ponumberGoodsId");
            return (Criteria) this;
        }

        public Criteria andPickTimeIsNull() {
            addCriterion("PICK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPickTimeIsNotNull() {
            addCriterion("PICK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPickTimeEqualTo(Date value) {
            addCriterion("PICK_TIME =", value, "pickTime");
            return (Criteria) this;
        }

        public Criteria andPickTimeNotEqualTo(Date value) {
            addCriterion("PICK_TIME <>", value, "pickTime");
            return (Criteria) this;
        }

        public Criteria andPickTimeGreaterThan(Date value) {
            addCriterion("PICK_TIME >", value, "pickTime");
            return (Criteria) this;
        }

        public Criteria andPickTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PICK_TIME >=", value, "pickTime");
            return (Criteria) this;
        }

        public Criteria andPickTimeLessThan(Date value) {
            addCriterion("PICK_TIME <", value, "pickTime");
            return (Criteria) this;
        }

        public Criteria andPickTimeLessThanOrEqualTo(Date value) {
            addCriterion("PICK_TIME <=", value, "pickTime");
            return (Criteria) this;
        }

        public Criteria andPickTimeIn(List<Date> values) {
            addCriterion("PICK_TIME in", values, "pickTime");
            return (Criteria) this;
        }

        public Criteria andPickTimeNotIn(List<Date> values) {
            addCriterion("PICK_TIME not in", values, "pickTime");
            return (Criteria) this;
        }

        public Criteria andPickTimeBetween(Date value1, Date value2) {
            addCriterion("PICK_TIME between", value1, value2, "pickTime");
            return (Criteria) this;
        }

        public Criteria andPickTimeNotBetween(Date value1, Date value2) {
            addCriterion("PICK_TIME not between", value1, value2, "pickTime");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andBuyPvIsNull() {
            addCriterion("BUY_PV is null");
            return (Criteria) this;
        }

        public Criteria andBuyPvIsNotNull() {
            addCriterion("BUY_PV is not null");
            return (Criteria) this;
        }

        public Criteria andBuyPvEqualTo(BigDecimal value) {
            addCriterion("BUY_PV =", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvNotEqualTo(BigDecimal value) {
            addCriterion("BUY_PV <>", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvGreaterThan(BigDecimal value) {
            addCriterion("BUY_PV >", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUY_PV >=", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvLessThan(BigDecimal value) {
            addCriterion("BUY_PV <", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUY_PV <=", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvIn(List<BigDecimal> values) {
            addCriterion("BUY_PV in", values, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvNotIn(List<BigDecimal> values) {
            addCriterion("BUY_PV not in", values, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUY_PV between", value1, value2, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUY_PV not between", value1, value2, "buyPv");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("ORDER_ID like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("ORDER_ID not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table USER_PONUMBER_GOODS
     *
     * @mbggenerated do_not_delete_during_merge Tue Jul 07 18:44:06 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table USER_PONUMBER_GOODS
     *
     * @mbggenerated Tue Jul 07 18:44:06 CST 2020
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}