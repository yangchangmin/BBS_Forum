package com.bbsforum.dao;

import java.util.List;

import org.hibernate.Transaction;

import com.bbsforum.entity.Post;
import com.bbsforum.entity.User;

public interface UserDao {

	//通过邮箱地址即登录时所用的账号搜索用户，返回一个User实例
	public 	User findUserByMailAddress(String mailAddress);
	/**
	 * @param offset 要查看那一页的第一条记录下标
	 * @param PageSize 页面大小
	 * @return 返回一个页面的用户
	 */
	public List getAllUserList(int offset,int pageSize);
	/**
	 * @param i为用户的id
	 * @return 用户的所有集合
	 */
	public List getAllUserList1(int i);
	/**
	 * @param user一个user类
	 * @return 返回true或false
	 */
	public boolean updaUser(User user);
	/**
	 * @param i用户的id
	 * @return 返回一个用户信息
	 */
	public List getUser(int i);
	/**
	 * @param user User类
	 * @function 在数据库添加用户记录，实现注册功能
	 * @return 返回一个boolean类型，true 或者 false
	 * */
	public boolean addUser(User user);
	/**
	 * @param user User类
	 * @function 修改数据库数据，实现找回密码，修改个人信息等功能
	 * @return 返回一个boolean类型，true 或者 false
	 * */
	public boolean UpdateUser(User user);

}