package com.newer.hysc.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GoodsPackAffiliatedExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table GOODS_PACK_AFFILIATED
     *
     * @mbggenerated Tue Jul 07 18:47:53 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table GOODS_PACK_AFFILIATED
     *
     * @mbggenerated Tue Jul 07 18:47:53 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table GOODS_PACK_AFFILIATED
     *
     * @mbggenerated Tue Jul 07 18:47:53 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS_PACK_AFFILIATED
     *
     * @mbggenerated Tue Jul 07 18:47:53 CST 2020
     */
    public GoodsPackAffiliatedExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS_PACK_AFFILIATED
     *
     * @mbggenerated Tue Jul 07 18:47:53 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS_PACK_AFFILIATED
     *
     * @mbggenerated Tue Jul 07 18:47:53 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS_PACK_AFFILIATED
     *
     * @mbggenerated Tue Jul 07 18:47:53 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS_PACK_AFFILIATED
     *
     * @mbggenerated Tue Jul 07 18:47:53 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS_PACK_AFFILIATED
     *
     * @mbggenerated Tue Jul 07 18:47:53 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS_PACK_AFFILIATED
     *
     * @mbggenerated Tue Jul 07 18:47:53 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS_PACK_AFFILIATED
     *
     * @mbggenerated Tue Jul 07 18:47:53 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS_PACK_AFFILIATED
     *
     * @mbggenerated Tue Jul 07 18:47:53 CST 2020
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
     * This method corresponds to the database table GOODS_PACK_AFFILIATED
     *
     * @mbggenerated Tue Jul 07 18:47:53 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS_PACK_AFFILIATED
     *
     * @mbggenerated Tue Jul 07 18:47:53 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table GOODS_PACK_AFFILIATED
     *
     * @mbggenerated Tue Jul 07 18:47:53 CST 2020
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGoodspackidIsNull() {
            addCriterion("GOODSPACKID is null");
            return (Criteria) this;
        }

        public Criteria andGoodspackidIsNotNull() {
            addCriterion("GOODSPACKID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodspackidEqualTo(BigDecimal value) {
            addCriterion("GOODSPACKID =", value, "goodspackid");
            return (Criteria) this;
        }

        public Criteria andGoodspackidNotEqualTo(BigDecimal value) {
            addCriterion("GOODSPACKID <>", value, "goodspackid");
            return (Criteria) this;
        }

        public Criteria andGoodspackidGreaterThan(BigDecimal value) {
            addCriterion("GOODSPACKID >", value, "goodspackid");
            return (Criteria) this;
        }

        public Criteria andGoodspackidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODSPACKID >=", value, "goodspackid");
            return (Criteria) this;
        }

        public Criteria andGoodspackidLessThan(BigDecimal value) {
            addCriterion("GOODSPACKID <", value, "goodspackid");
            return (Criteria) this;
        }

        public Criteria andGoodspackidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODSPACKID <=", value, "goodspackid");
            return (Criteria) this;
        }

        public Criteria andGoodspackidIn(List<BigDecimal> values) {
            addCriterion("GOODSPACKID in", values, "goodspackid");
            return (Criteria) this;
        }

        public Criteria andGoodspackidNotIn(List<BigDecimal> values) {
            addCriterion("GOODSPACKID not in", values, "goodspackid");
            return (Criteria) this;
        }

        public Criteria andGoodspackidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODSPACKID between", value1, value2, "goodspackid");
            return (Criteria) this;
        }

        public Criteria andGoodspackidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODSPACKID not between", value1, value2, "goodspackid");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoidIsNull() {
            addCriterion("GOODSINFOID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoidIsNotNull() {
            addCriterion("GOODSINFOID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoidEqualTo(BigDecimal value) {
            addCriterion("GOODSINFOID =", value, "goodsinfoid");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoidNotEqualTo(BigDecimal value) {
            addCriterion("GOODSINFOID <>", value, "goodsinfoid");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoidGreaterThan(BigDecimal value) {
            addCriterion("GOODSINFOID >", value, "goodsinfoid");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODSINFOID >=", value, "goodsinfoid");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoidLessThan(BigDecimal value) {
            addCriterion("GOODSINFOID <", value, "goodsinfoid");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODSINFOID <=", value, "goodsinfoid");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoidIn(List<BigDecimal> values) {
            addCriterion("GOODSINFOID in", values, "goodsinfoid");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoidNotIn(List<BigDecimal> values) {
            addCriterion("GOODSINFOID not in", values, "goodsinfoid");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODSINFOID between", value1, value2, "goodsinfoid");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODSINFOID not between", value1, value2, "goodsinfoid");
            return (Criteria) this;
        }

        public Criteria andGoodsnumIsNull() {
            addCriterion("GOODSNUM is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnumIsNotNull() {
            addCriterion("GOODSNUM is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnumEqualTo(BigDecimal value) {
            addCriterion("GOODSNUM =", value, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumNotEqualTo(BigDecimal value) {
            addCriterion("GOODSNUM <>", value, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumGreaterThan(BigDecimal value) {
            addCriterion("GOODSNUM >", value, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODSNUM >=", value, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumLessThan(BigDecimal value) {
            addCriterion("GOODSNUM <", value, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODSNUM <=", value, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumIn(List<BigDecimal> values) {
            addCriterion("GOODSNUM in", values, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumNotIn(List<BigDecimal> values) {
            addCriterion("GOODSNUM not in", values, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODSNUM between", value1, value2, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODSNUM not between", value1, value2, "goodsnum");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table GOODS_PACK_AFFILIATED
     *
     * @mbggenerated do_not_delete_during_merge Tue Jul 07 18:47:53 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table GOODS_PACK_AFFILIATED
     *
     * @mbggenerated Tue Jul 07 18:47:53 CST 2020
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