package com.contact.service;
import java.util.Map;
import com.contact.controller.LoginModel;
import com.contact.model.*;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public interface ContactService{
	/**
	分页查询联系人数据总数
	*/
	public Map<String,Integer> getDataListCount(Contact queryModel,Integer pageSize,LoginModel login) ;
	/**
	分页查询联系人数据列表
	*/
	public Map<String,Object> getDataList(Contact queryModel,Integer page,Integer pageSize,LoginModel login) ;
	/**
	封装联系人为前台展示的数据形式
	*/
	public Map<String,Object> getContactModel(Contact model,LoginModel login);
	/**
	* 删除数据
	*/
	public void delete(Integer id);
	/**
	新增
	*/
	public String add(Contact model,LoginModel login);
	/**
	修改
	*/
	public String update(Contact model,LoginModel login);
}
