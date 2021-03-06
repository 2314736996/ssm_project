package com.newer.hysc.data.entity;

import java.math.BigDecimal;
import java.util.Date;

public class AuFunction {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AU_FUNCTION.ID
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    private BigDecimal id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AU_FUNCTION.FUNCTIONCODE
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    private String functioncode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AU_FUNCTION.FUNCTIONNAME
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    private String functionname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AU_FUNCTION.FUNCURL
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    private String funcurl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AU_FUNCTION.PARENTID
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    private BigDecimal parentid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AU_FUNCTION.CREATIONTIME
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    private Date creationtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AU_FUNCTION.ID
     *
     * @return the value of AU_FUNCTION.ID
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AU_FUNCTION.ID
     *
     * @param id the value for AU_FUNCTION.ID
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AU_FUNCTION.FUNCTIONCODE
     *
     * @return the value of AU_FUNCTION.FUNCTIONCODE
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    public String getFunctioncode() {
        return functioncode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AU_FUNCTION.FUNCTIONCODE
     *
     * @param functioncode the value for AU_FUNCTION.FUNCTIONCODE
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    public void setFunctioncode(String functioncode) {
        this.functioncode = functioncode == null ? null : functioncode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AU_FUNCTION.FUNCTIONNAME
     *
     * @return the value of AU_FUNCTION.FUNCTIONNAME
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    public String getFunctionname() {
        return functionname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AU_FUNCTION.FUNCTIONNAME
     *
     * @param functionname the value for AU_FUNCTION.FUNCTIONNAME
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    public void setFunctionname(String functionname) {
        this.functionname = functionname == null ? null : functionname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AU_FUNCTION.FUNCURL
     *
     * @return the value of AU_FUNCTION.FUNCURL
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    public String getFuncurl() {
        return funcurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AU_FUNCTION.FUNCURL
     *
     * @param funcurl the value for AU_FUNCTION.FUNCURL
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    public void setFuncurl(String funcurl) {
        this.funcurl = funcurl == null ? null : funcurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AU_FUNCTION.PARENTID
     *
     * @return the value of AU_FUNCTION.PARENTID
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    public BigDecimal getParentid() {
        return parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AU_FUNCTION.PARENTID
     *
     * @param parentid the value for AU_FUNCTION.PARENTID
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    public void setParentid(BigDecimal parentid) {
        this.parentid = parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AU_FUNCTION.CREATIONTIME
     *
     * @return the value of AU_FUNCTION.CREATIONTIME
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    public Date getCreationtime() {
        return creationtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AU_FUNCTION.CREATIONTIME
     *
     * @param creationtime the value for AU_FUNCTION.CREATIONTIME
     *
     * @mbggenerated Tue Jul 07 18:45:47 CST 2020
     */
    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }
}