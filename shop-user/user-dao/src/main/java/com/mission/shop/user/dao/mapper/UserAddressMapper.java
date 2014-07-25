package com.mission.shop.user.dao.mapper;

import com.mission.shop.user.dao.model.UserAddress;
import com.mission.shop.user.dao.model.UserAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAddressMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_address
	 * @mbggenerated  Wed Jul 23 20:01:01 CST 2014
	 */
	int countByExample(UserAddressExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_address
	 * @mbggenerated  Wed Jul 23 20:01:01 CST 2014
	 */
	int deleteByExample(UserAddressExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_address
	 * @mbggenerated  Wed Jul 23 20:01:01 CST 2014
	 */
	int deleteByPrimaryKey(Long addressId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_address
	 * @mbggenerated  Wed Jul 23 20:01:01 CST 2014
	 */
	int insert(UserAddress record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_address
	 * @mbggenerated  Wed Jul 23 20:01:01 CST 2014
	 */
	int insertSelective(UserAddress record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_address
	 * @mbggenerated  Wed Jul 23 20:01:01 CST 2014
	 */
	List<UserAddress> selectByExample(UserAddressExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_address
	 * @mbggenerated  Wed Jul 23 20:01:01 CST 2014
	 */
	UserAddress selectByPrimaryKey(Long addressId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_address
	 * @mbggenerated  Wed Jul 23 20:01:01 CST 2014
	 */
	int updateByExampleSelective(@Param("record") UserAddress record,
			@Param("example") UserAddressExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_address
	 * @mbggenerated  Wed Jul 23 20:01:01 CST 2014
	 */
	int updateByExample(@Param("record") UserAddress record,
			@Param("example") UserAddressExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_address
	 * @mbggenerated  Wed Jul 23 20:01:01 CST 2014
	 */
	int updateByPrimaryKeySelective(UserAddress record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_address
	 * @mbggenerated  Wed Jul 23 20:01:01 CST 2014
	 */
	int updateByPrimaryKey(UserAddress record);
}