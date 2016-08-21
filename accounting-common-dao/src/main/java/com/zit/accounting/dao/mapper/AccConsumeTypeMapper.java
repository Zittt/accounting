package com.zit.accounting.dao.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zit.accounting.dao.domain.AccConsumeType;
import com.zit.accounting.dao.domain.AccConsumeTypeExample;

public interface AccConsumeTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acc_consume_type
     *
     * @mbggenerated
     */
    int countByExample(AccConsumeTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acc_consume_type
     *
     * @mbggenerated
     */
    int deleteByExample(AccConsumeTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acc_consume_type
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer accConsumeTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acc_consume_type
     *
     * @mbggenerated
     */
    int insert(AccConsumeType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acc_consume_type
     *
     * @mbggenerated
     */
    int insertSelective(AccConsumeType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acc_consume_type
     *
     * @mbggenerated
     */
    List<AccConsumeType> selectByExample(AccConsumeTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acc_consume_type
     *
     * @mbggenerated
     */
    AccConsumeType selectByPrimaryKey(Integer accConsumeTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acc_consume_type
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AccConsumeType record, @Param("example") AccConsumeTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acc_consume_type
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AccConsumeType record, @Param("example") AccConsumeTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acc_consume_type
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AccConsumeType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acc_consume_type
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AccConsumeType record);
}