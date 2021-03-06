package com.zit.accounting.dao.domain;


public class AccTransaction {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acc_transaction.ACC_TRANSACTION_ID
     *
     * @mbggenerated
     */
    private Integer accTransactionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acc_transaction.CREATE_TIME
     *
     * @mbggenerated
     */
    private String createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acc_transaction.MONEY_TYPE
     *
     * @mbggenerated
     */
    private Integer moneyType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acc_transaction.SUB_TYPE
     *
     * @mbggenerated
     */
    private Integer subType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acc_transaction.AMOUNT
     *
     * @mbggenerated
     */
    private String amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acc_transaction.DESC
     *
     * @mbggenerated
     */
    private String desc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acc_transaction.ACC_TRANSACTION_ID
     *
     * @return the value of acc_transaction.ACC_TRANSACTION_ID
     *
     * @mbggenerated
     */
    public Integer getAccTransactionId() {
        return accTransactionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acc_transaction.ACC_TRANSACTION_ID
     *
     * @param accTransactionId the value for acc_transaction.ACC_TRANSACTION_ID
     *
     * @mbggenerated
     */
    public void setAccTransactionId(Integer accTransactionId) {
        this.accTransactionId = accTransactionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acc_transaction.CREATE_TIME
     *
     * @return the value of acc_transaction.CREATE_TIME
     *
     * @mbggenerated
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acc_transaction.CREATE_TIME
     *
     * @param createTime the value for acc_transaction.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acc_transaction.MONEY_TYPE
     *
     * @return the value of acc_transaction.MONEY_TYPE
     *
     * @mbggenerated
     */
    public Integer getMoneyType() {
        return moneyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acc_transaction.MONEY_TYPE
     *
     * @param moneyType the value for acc_transaction.MONEY_TYPE
     *
     * @mbggenerated
     */
    public void setMoneyType(Integer moneyType) {
        this.moneyType = moneyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acc_transaction.SUB_TYPE
     *
     * @return the value of acc_transaction.SUB_TYPE
     *
     * @mbggenerated
     */
    public Integer getSubType() {
        return subType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acc_transaction.SUB_TYPE
     *
     * @param subType the value for acc_transaction.SUB_TYPE
     *
     * @mbggenerated
     */
    public void setSubType(Integer subType) {
        this.subType = subType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acc_transaction.AMOUNT
     *
     * @return the value of acc_transaction.AMOUNT
     *
     * @mbggenerated
     */
    public String getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acc_transaction.AMOUNT
     *
     * @param amount the value for acc_transaction.AMOUNT
     *
     * @mbggenerated
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acc_transaction.DESC
     *
     * @return the value of acc_transaction.DESC
     *
     * @mbggenerated
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acc_transaction.DESC
     *
     * @param desc the value for acc_transaction.DESC
     *
     * @mbggenerated
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }
}