package com.newer.hysc.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuFunctionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AU_FUNCTION
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AU_FUNCTION
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AU_FUNCTION
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AU_FUNCTION
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    public AuFunctionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AU_FUNCTION
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AU_FUNCTION
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AU_FUNCTION
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AU_FUNCTION
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AU_FUNCTION
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AU_FUNCTION
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AU_FUNCTION
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AU_FUNCTION
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
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
     * This method corresponds to the database table AU_FUNCTION
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AU_FUNCTION
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table AU_FUNCTION
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
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

        public Criteria andFunctioncodeIsNull() {
            addCriterion("FUNCTIONCODE is null");
            return (Criteria) this;
        }

        public Criteria andFunctioncodeIsNotNull() {
            addCriterion("FUNCTIONCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFunctioncodeEqualTo(String value) {
            addCriterion("FUNCTIONCODE =", value, "functioncode");
            return (Criteria) this;
        }

        public Criteria andFunctioncodeNotEqualTo(String value) {
            addCriterion("FUNCTIONCODE <>", value, "functioncode");
            return (Criteria) this;
        }

        public Criteria andFunctioncodeGreaterThan(String value) {
            addCriterion("FUNCTIONCODE >", value, "functioncode");
            return (Criteria) this;
        }

        public Criteria andFunctioncodeGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTIONCODE >=", value, "functioncode");
            return (Criteria) this;
        }

        public Criteria andFunctioncodeLessThan(String value) {
            addCriterion("FUNCTIONCODE <", value, "functioncode");
            return (Criteria) this;
        }

        public Criteria andFunctioncodeLessThanOrEqualTo(String value) {
            addCriterion("FUNCTIONCODE <=", value, "functioncode");
            return (Criteria) this;
        }

        public Criteria andFunctioncodeLike(String value) {
            addCriterion("FUNCTIONCODE like", value, "functioncode");
            return (Criteria) this;
        }

        public Criteria andFunctioncodeNotLike(String value) {
            addCriterion("FUNCTIONCODE not like", value, "functioncode");
            return (Criteria) this;
        }

        public Criteria andFunctioncodeIn(List<String> values) {
            addCriterion("FUNCTIONCODE in", values, "functioncode");
            return (Criteria) this;
        }

        public Criteria andFunctioncodeNotIn(List<String> values) {
            addCriterion("FUNCTIONCODE not in", values, "functioncode");
            return (Criteria) this;
        }

        public Criteria andFunctioncodeBetween(String value1, String value2) {
            addCriterion("FUNCTIONCODE between", value1, value2, "functioncode");
            return (Criteria) this;
        }

        public Criteria andFunctioncodeNotBetween(String value1, String value2) {
            addCriterion("FUNCTIONCODE not between", value1, value2, "functioncode");
            return (Criteria) this;
        }

        public Criteria andFunctionnameIsNull() {
            addCriterion("FUNCTIONNAME is null");
            return (Criteria) this;
        }

        public Criteria andFunctionnameIsNotNull() {
            addCriterion("FUNCTIONNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionnameEqualTo(String value) {
            addCriterion("FUNCTIONNAME =", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameNotEqualTo(String value) {
            addCriterion("FUNCTIONNAME <>", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameGreaterThan(String value) {
            addCriterion("FUNCTIONNAME >", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTIONNAME >=", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameLessThan(String value) {
            addCriterion("FUNCTIONNAME <", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameLessThanOrEqualTo(String value) {
            addCriterion("FUNCTIONNAME <=", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameLike(String value) {
            addCriterion("FUNCTIONNAME like", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameNotLike(String value) {
            addCriterion("FUNCTIONNAME not like", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameIn(List<String> values) {
            addCriterion("FUNCTIONNAME in", values, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameNotIn(List<String> values) {
            addCriterion("FUNCTIONNAME not in", values, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameBetween(String value1, String value2) {
            addCriterion("FUNCTIONNAME between", value1, value2, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameNotBetween(String value1, String value2) {
            addCriterion("FUNCTIONNAME not between", value1, value2, "functionname");
            return (Criteria) this;
        }

        public Criteria andFuncurlIsNull() {
            addCriterion("FUNCURL is null");
            return (Criteria) this;
        }

        public Criteria andFuncurlIsNotNull() {
            addCriterion("FUNCURL is not null");
            return (Criteria) this;
        }

        public Criteria andFuncurlEqualTo(String value) {
            addCriterion("FUNCURL =", value, "funcurl");
            return (Criteria) this;
        }

        public Criteria andFuncurlNotEqualTo(String value) {
            addCriterion("FUNCURL <>", value, "funcurl");
            return (Criteria) this;
        }

        public Criteria andFuncurlGreaterThan(String value) {
            addCriterion("FUNCURL >", value, "funcurl");
            return (Criteria) this;
        }

        public Criteria andFuncurlGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCURL >=", value, "funcurl");
            return (Criteria) this;
        }

        public Criteria andFuncurlLessThan(String value) {
            addCriterion("FUNCURL <", value, "funcurl");
            return (Criteria) this;
        }

        public Criteria andFuncurlLessThanOrEqualTo(String value) {
            addCriterion("FUNCURL <=", value, "funcurl");
            return (Criteria) this;
        }

        public Criteria andFuncurlLike(String value) {
            addCriterion("FUNCURL like", value, "funcurl");
            return (Criteria) this;
        }

        public Criteria andFuncurlNotLike(String value) {
            addCriterion("FUNCURL not like", value, "funcurl");
            return (Criteria) this;
        }

        public Criteria andFuncurlIn(List<String> values) {
            addCriterion("FUNCURL in", values, "funcurl");
            return (Criteria) this;
        }

        public Criteria andFuncurlNotIn(List<String> values) {
            addCriterion("FUNCURL not in", values, "funcurl");
            return (Criteria) this;
        }

        public Criteria andFuncurlBetween(String value1, String value2) {
            addCriterion("FUNCURL between", value1, value2, "funcurl");
            return (Criteria) this;
        }

        public Criteria andFuncurlNotBetween(String value1, String value2) {
            addCriterion("FUNCURL not between", value1, value2, "funcurl");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("PARENTID is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("PARENTID is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(BigDecimal value) {
            addCriterion("PARENTID =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(BigDecimal value) {
            addCriterion("PARENTID <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(BigDecimal value) {
            addCriterion("PARENTID >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PARENTID >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(BigDecimal value) {
            addCriterion("PARENTID <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PARENTID <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<BigDecimal> values) {
            addCriterion("PARENTID in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<BigDecimal> values) {
            addCriterion("PARENTID not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PARENTID between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PARENTID not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNull() {
            addCriterion("CREATIONTIME is null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNotNull() {
            addCriterion("CREATIONTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeEqualTo(Date value) {
            addCriterion("CREATIONTIME =", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotEqualTo(Date value) {
            addCriterion("CREATIONTIME <>", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThan(Date value) {
            addCriterion("CREATIONTIME >", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATIONTIME >=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThan(Date value) {
            addCriterion("CREATIONTIME <", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATIONTIME <=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIn(List<Date> values) {
            addCriterion("CREATIONTIME in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotIn(List<Date> values) {
            addCriterion("CREATIONTIME not in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeBetween(Date value1, Date value2) {
            addCriterion("CREATIONTIME between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATIONTIME not between", value1, value2, "creationtime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table AU_FUNCTION
     *
     * @mbggenerated do_not_delete_during_merge Tue Jul 07 18:45:47 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table AU_FUNCTION
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
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