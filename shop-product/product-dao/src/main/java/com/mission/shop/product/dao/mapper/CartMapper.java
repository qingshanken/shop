package com.mission.shop.product.dao.mapper;

import com.mission.shop.product.dao.model.Cart;
import com.mission.shop.product.dao.model.CartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbggenerated Thu Jul 17 19:37:59 CST 2014
     */
    int countByExample(CartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbggenerated Thu Jul 17 19:37:59 CST 2014
     */
    int deleteByExample(CartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbggenerated Thu Jul 17 19:37:59 CST 2014
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbggenerated Thu Jul 17 19:37:59 CST 2014
     */
    int insert(Cart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbggenerated Thu Jul 17 19:37:59 CST 2014
     */
    int insertSelective(Cart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbggenerated Thu Jul 17 19:37:59 CST 2014
     */
    List<Cart> selectByExample(CartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbggenerated Thu Jul 17 19:37:59 CST 2014
     */
    Cart selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbggenerated Thu Jul 17 19:37:59 CST 2014
     */
    int updateByExampleSelective(@Param("record") Cart record, @Param("example") CartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbggenerated Thu Jul 17 19:37:59 CST 2014
     */
    int updateByExample(@Param("record") Cart record, @Param("example") CartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbggenerated Thu Jul 17 19:37:59 CST 2014
     */
    int updateByPrimaryKeySelective(Cart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbggenerated Thu Jul 17 19:37:59 CST 2014
     */
    int updateByPrimaryKey(Cart record);
}